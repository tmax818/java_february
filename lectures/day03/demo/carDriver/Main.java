public class Main {

    public static void main(String[] args) {
        Driver d = new Driver();
        d.drive();
        System.out.println(d.getGas());
        d.boost();
        System.out.println(d.getGas());
        d.refuel();
        System.out.println(d.getGas());

    }
    
}
