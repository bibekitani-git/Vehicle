public class Vehicle {
    protected String type;

    public Vehicle(String type) {
        this.type = type;
    }
    //forward function
    public void forward() {
        System.out.println(type + " is moving forward.");
    }
    //reverse function
    public void reverse() {
        System.out.println(type + " is moving in reverse.");
    }

    public String getType() {
        return type;
    }
}
