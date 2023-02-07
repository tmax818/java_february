public class Main {

    public static void main(String[] args) {
        Tesla tesla1 = new Tesla("black", 2);
        Tesla tesla2 = new Tesla("white");
        Tesla tesla3 = new Tesla();
        tesla1.setColor("yellow");
        tesla3.Drive();
        tesla2.Drive();
        System.out.println(Tesla.getCEO());
        System.out.println(Tesla.getCARS());
        // System.out.println(tesla1.getColor());
        // System.out.println(tesla2.getColor());

    }
    
}
