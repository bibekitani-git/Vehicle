public class SportsCar extends Vehicle {

    public SportsCar() {
        super("Sports Car");
    }

    @Override
    public void forward() {
        System.out.println(type + " is accelerating forward with insane speed!");
    }

    @Override
    public void reverse() {
        System.out.println(type + " is reversing into a parking spot on its own.");
    }
}
