
/**
 * Tesla
 */
public class Tesla {

    private String color;
    private int doors;

    public Tesla(String color, int doors){
        this.doors = doors;
        this.color = color;
    }

    public Tesla(String color){
        this.doors = 4;
        this.color = color;
    }

    public Tesla(){
        this.doors = 4;
        this.color = "black";
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
        System.out.printf("I am driving my %s Tesla!%n", color);
    }


}