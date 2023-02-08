/**
 * Create a Mammal class that has an energyLevel member variable and displayEnergy() method. The displayEnergy() method should show the animal's energy level as well as return it.
 */

public class Mammal {
    private int energyLevel = 100;

    public int displayEnergy(){
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }


    
}