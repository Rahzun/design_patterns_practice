public class RobotEngineer {
  private RobotBuilder robotBuilder;

  public RobotEngineer(RobotBuilder robotBuilder) {
    this.robotBuilder = robotBuilder;
  }

  public void makeRobot() {
    this.robotBuilder.buildRobotHead();
    this.robotBuilder.buildRobotTorso();
    this.robotBuilder.buildRobotArms();
    this.robotBuilder.buildRobotLegs();
  }

  public Robot getRobot() {
    return this.robotBuilder.getRobot();
  }
  
}