public class Ravenclaw extends Hogwarts{
    int smart;
    int wisdom;
    int wittiness;
    int creativity;

    public Ravenclaw(String name, int magicPower, int transgressiveDistance, int smart, int wisdom, int wittiness, int creativity) {
        super(name, magicPower, transgressiveDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
