//Main class
public class Main {
    public static void main(String[] args) {
        Vehicle mySUV = new SUV();
        Vehicle mySportsCar = new SportsCar();
        Vehicle myHybrid = new Hybrid();

        System.out.println("--- SUV Actions ---");
        mySUV.forward();
        mySUV.reverse();


        System.out.println("\n--- Sports Car Actions ---");
        mySportsCar.forward();
        mySportsCar.reverse();

        System.out.println("\n--- Hybrid Actions ---");
        myHybrid.forward();
        myHybrid.reverse();
    }
}
