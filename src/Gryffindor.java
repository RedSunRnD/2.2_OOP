public class Gryffindor extends Hogwarts {
    int nobility;
    int honor;
    int bravery;

    public Gryffindor(String name, int magicPower, int transgressiveDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressiveDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
