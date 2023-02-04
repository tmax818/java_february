package lectures.day02.demos;

class Tesla {

    String owner;
    int wheels;
    private static String CEO = "Elon Musk";
    private static int NUMBER_OF_TESLAS = 0;

    public int numWheels(){
        return this.wheels;
    }

    public static int getNumOfCars(){
        return NUMBER_OF_TESLAS;
    }

 
}

