public class Hybrid extends Vehicle {

    public Hybrid() {
        super("Hybrid");
    }

    @Override
    public void forward() {
        System.out.println(type + " is silently moving forward on electric power, or with engine assist.");
    }

    @Override
    public void reverse() {
        System.out.println(type + " is gently backing up, conserving energy.");
    }

    public void optimizeFuelEfficiency() {
        System.out.println(type + " is optimizing its power sources for maximum fuel efficiency.");
    }
}
