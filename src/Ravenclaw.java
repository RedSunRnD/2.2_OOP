public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressiveDistance, int smart, int wisdom, int wittiness, int creativity) {
        super(name, magicPower, transgressiveDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public String getFaculty() {
        String faculty = "Когтевран";
        return faculty;
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

    public void printStudent() {
        super.printStudent();
        System.out.println("Интеллект " + getSmart() + "; Мудрость " + getWisdom() + "; Остроумие " + getWittiness() + "; Креативность " + getCreativity() + "." );
        System.out.println();
    }

    public int totalScore() {
        int score = getSmart() + getWittiness() + getWisdom() + getCreativity();
        return score;
    }

    public static void compare(Ravenclaw studentOne, Ravenclaw studentTwo) {
        if (studentOne.totalScore() > studentTwo.totalScore()) {
            System.out.println(studentOne.getName() + " лучший когтевранец, чем " + studentTwo.getName() + ".");
        } else if (studentOne.totalScore() < studentTwo.totalScore()) {
            System.out.println(studentTwo.getName() + " лучший когтевранец, чем " + studentOne.getName() + ".");
        } else {
            System.out.println("Эти когтевранцы равны по силам");
        }
        System.out.println();
    }
}
