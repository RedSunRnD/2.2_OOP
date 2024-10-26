public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressiveDistance;
    private String faculty;

    public String getFaculty() {
        return faculty;
    }

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

    public void printStudent() {
        System.out.println("Имя: " + getName() + "; Студент факультета " + getFaculty()  + "; Сила магии: " + getMagicPower() + "; Расстояние трансгрессии: " + getTransgressiveDistance() + ";");
        }

    public int totalScore() {
        return getMagicPower() + getTransgressiveDistance();
    }

    public static void compare(Hogwarts studentOne, Hogwarts studentTwo) {
        if (studentOne.totalScore() > studentTwo.totalScore()) {
            System.out.println(studentOne.getName() + " более сильный волшебник, чем " + studentTwo.getName() + ".");
        } else if (studentOne.totalScore() < studentTwo.totalScore()) {
            System.out.println(studentTwo.getName() + " более сильный волшебник, чем " + studentOne.getName() + ".");
        } else {
            System.out.println("Сила этих волшебников равна");
        }
        System.out.println();
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
