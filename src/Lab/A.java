package Lab;

public class A {
    private B roadhog;
    private int batman;

    public A(B obj, int batman) {
        this.roadhog = obj;
        this.batman = batman;
    }

    public void setBatman(int batman) {
        this.batman = batman;
    }

    public int getBatman() {
        return this.batman;
    }

    public void setRoadhog(int batman) {
        this.roadhog.setZelda(batman);
    }

    public int getRoadhog() {
        return this.roadhog.getZelda();
    }
}
