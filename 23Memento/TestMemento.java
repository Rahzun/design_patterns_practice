import java.awt.event.*;
import javax.swing.*;

public class TestMemento extends JFrame {
  public static void main(String[] args) {
    new TestMemento();
  }

  private JButton saveButton, undoButton, redoButton;
  private JTextArea theArticle = new JTextArea(40, 60);

  CareTaker careTaker = new CareTaker();

  Originator originator = new Originator();

  int savedFiles = 0, currentArticle = 0;

  public TestMemento() {
    this.setSize(750, 780);
    this.setTitle("Memento Design Pattern");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel1 = new JPanel();
    panel1.add(new JLabel("Article"));
    panel1.add(theArticle);

    ButtonListener saveListener = new ButtonListener();
    ButtonListener undoListener = new ButtonListener();
    ButtonListener redoListener = new ButtonListener();

    saveButton = new JButton("Save");
    saveButton.addActionListener(saveListener);

    undoButton = new JButton("Undo");
    undoButton.addActionListener(undoListener);

    redoButton = new JButton("Redo");
    redoButton.addActionListener(redoListener);

    panel1.add(saveButton);
    panel1.add(undoButton);
    panel1.add(redoButton);

    this.add(panel1);
    this.setVisible(true);
  }

  class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == saveButton) {

        String textInTextArea = theArticle.getText();

        originator.set(textInTextArea);

        careTaker.addMemento(originator.storeInMemento());

        savedFiles++;
        currentArticle++;

        System.out.println("Save Files " + savedFiles);

        undoButton.setEnabled(true);

      } else if (e.getSource() == undoButton) {
        if (currentArticle >= 1) {
          currentArticle--;
          String textBoxString = originator.restoreFromMemento(careTaker.getMemento(currentArticle));
          theArticle.setText(textBoxString);
          redoButton.setEnabled(true);
        } else {
          undoButton.setEnabled(false);
        }
      } else if (e.getSource() == redoButton) {
        if ((savedFiles-1) > currentArticle) {
          currentArticle++;
          String textBoxString = originator.restoreFromMemento(careTaker.getMemento(currentArticle));
          theArticle.setText(textBoxString);
          undoButton.setEnabled(true);
        } else {
          redoButton.setEnabled(false);
        }
      }
    }
  }

}
