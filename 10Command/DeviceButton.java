// This Invoker DeviceButton doesn't know anything (what device or command is being used)
public class DeviceButton {
  Command theCommand;

  public DeviceButton(Command newCommand) {
    theCommand = newCommand;
  }

  public void press() {
    theCommand.execute();
  }

  public void pressUndo() {
    theCommand.undo();
  }
}