public interface AnimalPlay {

    public static void main(String[] args) {

        Animal sparky = new Dog();

        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFLy());
        System.out.println("Bird: " + tweety.tryToFLy());

        // dog suddenly starts to fly
        sparky.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + sparky.tryToFLy());

    }

}
