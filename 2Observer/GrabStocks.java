public class GrabStocks {
	public static void main(String[] args){
		
		StockGrabber stockGrabber = new StockGrabber();

		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.00);

		StockObserver observer2 = new StockObserver(stockGrabber);

		stockGrabber.setIBMPrice(200.00);
		stockGrabber.setAAPLPrice(700.60);
		stockGrabber.setGOOGPrice(750.00);

		stockGrabber.unregister(observer1);
		stockGrabber.setIBMPrice(200.00);
		stockGrabber.setAAPLPrice(700.60);
		stockGrabber.setGOOGPrice(750.00);
	}

}