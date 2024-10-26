public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressiveDistance;

    public Hogwarts(String name, int magicPower, int transgressiveDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressiveDistance = transgressiveDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressiveDistance() {
        return transgressiveDistance;
    }

    public void setTransgressiveDistance(int transgressiveDistance) {
        this.transgressiveDistance = transgressiveDistance;
    }
}
