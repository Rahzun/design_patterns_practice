public class TestTheRemote {
  public static void main(String[] args) {
    RemoteButton theTV = new TvRemoteMute(new TvDevice(1, 200));
    RemoteButton theTV2 = new TvRemotePause(new TvDevice(1, 200));
    // RemoteButton theDVD = new DVDRemote(new DVDDevice(1, 1));

    System.out.println("Test TV with Mute");
    theTV.buttonFivePressed();
    theTV.buttonSixPressed();
    theTV.buttonNinePressed();

    System.out.println("\nTest TV with Pause");

    theTV2.buttonFivePressed();
    theTV2.buttonSixPressed();
    theTV2.buttonSixPressed();
    theTV2.buttonSixPressed();
    theTV2.buttonSixPressed();
    theTV2.buttonNinePressed();
    theTV2.deviceFeedback();
  }
}