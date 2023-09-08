package Lab;

public class Test {
    public static void main(String[] args) {
        System.out.println("fun fun fun");
        B catwoman = new B(78);
        A bulbasaur = new A(catwoman, 59);
        System.out.println(bulbasaur.getBatman());
        System.out.println(bulbasaur.getRoadhog());
        bulbasaur.setRoadhog(6);
        System.out.println(bulbasaur.getRoadhog());
    }
}