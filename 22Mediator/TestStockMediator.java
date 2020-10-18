public class TestStockMediator {
  public static void main(String[] args) {
    StockMediator nyse = new StockMediator();

    GormanSlacks broker = new GormanSlacks(nyse);
    JTPoorman broker2 = new JTPoorman(nyse);

    broker.sellOffer("MSFT", 100);
    broker.sellOffer("GOOG", 50);

    broker2.buyOffer("MSFT", 100);
    broker2.sellOffer("NRG", 10);

    broker.buyOffer("NRG", 10);

    nyse.getStockOfferings();
  }
}
