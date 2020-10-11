public class TvRemotePause extends RemoteButton{
  public TvRemotePause(EntertainmentDevice newDevice) {
    super(newDevice); 
  }

  @Override
  public void buttonNinePressed() {
    System.out.println("TV was Paused");
  }
}