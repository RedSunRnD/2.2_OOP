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

    public int totalScore() {
        int score = getNobility() + getBravery() + getHonor();
        return score;
    }

    public static void compare(Gryffindor studentOne, Gryffindor studentTwo) {
        if (studentOne.totalScore() > studentTwo.totalScore()) {
            System.out.println(studentOne.getName() + " лучший гриффиндорец, чем " + studentTwo.getName() + ".");
        } else if (studentOne.totalScore() < studentTwo.totalScore()) {
            System.out.println(studentTwo.getName() + " лучший гриффиндорец, чем " + studentOne.getName() + ".");
        } else {
            System.out.println("Эти гриффиндорцы равны по силам");
        }
        System.out.println();
    }

}
