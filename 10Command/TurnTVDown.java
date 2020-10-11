public class TurnTVDown implements Command {

  ElectronicDevice theDevice;

  public TurnTVDown(ElectronicDevice newDevice) {
    theDevice = newDevice;
  }

  @Override
  public void execute() {
    theDevice.volumeDown();
  }

  @Override
  public void undo() {
    theDevice.volumeUp();
  }

}