public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressiveDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressiveDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public String getFaculty() {
        String faculty = "Гриффиндор";
        return faculty;
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
    public void printStudent() {
        super.printStudent();
        System.out.println("Благородство: " + getNobility() + "; Честь " + getHonor()  + "; Храбрость: " + getBravery() + ".");
        System.out.println();
    }

}
