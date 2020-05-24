public class Animal {

    public Flys flyingType;

    public String tryToFLy() {
        return flyingType.fly();
    }

    public void setFlyingAbility (Flys newFlyType) {
        flyingType = newFlyType;
    }

}
