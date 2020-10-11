public class ScrabbleTestThreads {
  public static void main(String[] args) {
    Runnable getTiles = new GetTheTiles();
    Runnable getTilesAgain = new GetTheTiles();
    // Runnable getTilesAgain2 = new GetTheTiles();
    new Thread(getTiles).start();
    new Thread(getTilesAgain).start();
    // new Thread(getTilesAgain2).start();
  }
}