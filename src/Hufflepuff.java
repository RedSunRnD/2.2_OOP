public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressiveDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressiveDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String getFaculty() {
        String faculty = "Пуффендуй";
        return faculty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void printStudent() {
        super.printStudent();
        System.out.println("Трудолюбие " + getDiligence() + "; Верность " + getLoyalty() + "; Честность " + getHonesty()  + "." );
        System.out.println();
    }

    public int totalScore() {
        int score = getDiligence() + getLoyalty() + getHonesty();
        return score;
    }

    public static void compare(Hufflepuff studentOne, Hufflepuff studentTwo) {
        if (studentOne.totalScore() > studentTwo.totalScore()) {
            System.out.println(studentOne.getName() + " лучший пуффендуец, чем " + studentTwo.getName() + ".");
        } else if (studentOne.totalScore() < studentTwo.totalScore()) {
            System.out.println(studentTwo.getName() + " лучший пуффендуец, чем " + studentOne.getName() + ".");
        } else {
            System.out.println("Эти пуффендуйцы равны по силам");
        }
        System.out.println();
    }
}
