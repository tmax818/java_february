
/**
 * Tesla
 */
public class Tesla {

    private String color;
    private int doors;
    private int batteryCharge = 10;
    private static String CEO = "Elon Musk";
    private static int NUMBER_OF_CARS = 0;

    public Tesla(String color, int doors){
        this.doors = doors;
        this.color = color;
        NUMBER_OF_CARS++;
    }
    
    public Tesla(String color){
        this.doors = 4;
        this.color = color;
        NUMBER_OF_CARS++;
    }
    
    public Tesla(){
        this.doors = 4;
        this.color = "black";
        NUMBER_OF_CARS++;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void Drive(){
        this.batteryCharge--;
        System.out.printf("I am driving my %s Tesla!%n", color);
        System.out.printf("The remaining charge is: %d%n", this.batteryCharge);
    }


    public static String getCEO(){
        return CEO;
    }

    public static int getCARS(){
        return NUMBER_OF_CARS;
    }
 


}