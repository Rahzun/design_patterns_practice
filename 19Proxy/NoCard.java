public class NoCard implements ATMState {

  ATMMachine atmMachine;

  public NoCard(ATMMachine newATMMachine) {
    atmMachine = newATMMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("Card Inserted: Please Enter your PIN");
    atmMachine.setATMState(atmMachine.getHasCardState());
  }

  @Override
  public void ejectCard() {
    System.out.println("Insert Card First");
  }

  @Override
  public void insertPin(int pinEntered) {
    System.out.println("Insert Card First");
  }

  @Override
  public void requestCash(int cashToWithdraw) {
    System.out.println("Insert Card First");
  }
}
