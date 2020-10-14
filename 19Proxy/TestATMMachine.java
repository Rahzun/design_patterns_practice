public class TestATMMachine {
  public static void main(String[] args) {
    ATMMachine atmMachine = new ATMMachine();

    atmMachine.insertCard();
    atmMachine.ejectCard();
    atmMachine.insertCard();
    atmMachine.insertPin(1234);
    atmMachine.requestCash(2000);
    atmMachine.insertCard();
    atmMachine.insertPin(1234);

    GetATMData realATMMachine = new ATMMachine();
    GetATMData atmProxy = new ATMProxy();
    System.out.println("\nCurrent ATM State " + atmProxy.getATMData());
    System.out.println("\nCash in ATM Machine " + atmProxy.getCashInMachine());

    // atmProxy.setCashInMachine(5000); // not possible

    /// IMPORTANT!! not possible even for realATMMachine,
    /// as it is declared asGetATMData
    // realATMMachine.setCashInMachine(5000);
  }
}