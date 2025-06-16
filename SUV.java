public class SUV extends Vehicle {

    public SUV() {
        super("SUV");
    }

    @Override
    public void forward() {
        System.out.println(type + " is moving forward, conquering many places.");
    }

    @Override
    public void reverse() {
        System.out.println(type + " is backing up slowly and maintaing distances.");
    }

    //example to showcase that a function can be written to engage the four-wheel drive
    public void engageFourWheelDrive() {
        System.out.println(type + " is engaging 4x4 for off-road adventure!");
    }
}
