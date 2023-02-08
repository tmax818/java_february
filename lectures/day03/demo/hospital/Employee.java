public class Employee {

    Boolean hourly;
    int empNum;

    public void doWork(){
        System.out.println("Don't bother me I am working");
    }

    public void doWork(String activity){
        System.out.printf("I am doing %s", activity);
    }
}