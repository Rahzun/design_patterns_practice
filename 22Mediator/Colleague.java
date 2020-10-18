public abstract class Colleague {
  private Mediator mediator;
  private int colleagueCode;

  public Colleague(Mediator newMediator) {
    mediator = newMediator;

    /// Add `this` to Colleague
    mediator.addColleague(this);
  }

  public void sellOffer(String stock, int shares) {
    mediator.sellOffer(stock, shares, this.colleagueCode);
  }

  public void buyOffer(String stock, int shares) {
    mediator.buyOffer(stock, shares, this.colleagueCode);
  }

  public void setCollCode(int collCode) {
    colleagueCode = collCode;
  }
}
