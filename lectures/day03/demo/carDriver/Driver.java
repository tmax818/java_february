import javax.sound.sampled.SourceDataLine;

/**
 * Now create a driver class that extends the car class. The driver can choose to drive, use boosters, or refuel. Each method should print the action to the console, followed by the remaining amount of gas.

Driving should decrease gas by 1
Using boosters should decrease gas by 3
Refueling should increase gas by 2
 */

public class Driver extends Car {


    // public void drive(){
    //     this.decreaseGas();
    //     System.out.println(this.getGas());
    // }

    public void drive(){
        this.setGas(getGas() - 1);

    }
    
    public void boost(){
        this.setGas(getGas() - 3);

    }

    public void refuel(){
        this.setGas(getGas() + 2);
    }
    
}
