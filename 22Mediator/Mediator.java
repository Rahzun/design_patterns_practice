public interface Mediator {
  public void sellOffer(String stock, int shares, int collCode);
  public void buyOffer(String stock, int shares, int collCode);
  public void addColleague(Colleague colleague);
}
