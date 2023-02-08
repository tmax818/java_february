/**
 * Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
 */

public class Gorilla extends Mammal {


    /**
     * For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5
     */
    public void throwSomething(){
        this.setEnergyLevel(getEnergyLevel()-5);
        System.out.printf("throwSomething, energy level is now: %d%n", this.displayEnergy());
    }


    /**
     * For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
     */
    public void eatBananas(){}

    /**
     * For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
     */
    public void climb(){}

}
