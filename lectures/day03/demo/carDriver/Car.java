/**
 * Car
 * Create a car class with a gas attribute and getGas method
 */
public class Car {

    private int gas = 10;

    public int getGas() {
        return this.gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void decreaseGas(){
        this.gas--;
    }


    
}