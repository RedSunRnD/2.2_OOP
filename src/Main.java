public class Main {
    public static void main(String[] args) {
                Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 100, 100, 100, 100, 100);
                Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 58, 22, 67, 45, 98);
                Gryffindor ronaldWeasley = new Gryffindor("Рон Уизли", 12, 65, 47, 41, 23);
                Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 25, 65, 87, 47, 65, 22, 78);
                Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 41, 25, 35, 77, 12, 33, 66);
                Slytherin gregoreGoyle = new Slytherin("Грегори Гойл", 44, 66, 55, 22, 33, 11, 78);
                Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит",32, 65 ,47, 82, 33);
                Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 65, 47, 89, 23, 44);
                Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 54, 89, 63, 91, 75);
                Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 65, 47, 56, 32, 14, 12);
                Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 78, 23, 65, 51, 25, 98);
                Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 65, 74, 85, 25, 31, 140);
                harryPotter.printStudent();
                dracoMalfoy.printStudent();
                zachariasSmith.printStudent();
                choChang.printStudent();
                Gryffindor.compare(ronaldWeasley,hermioneGranger);
                Slytherin.compare(grahamMontague,gregoreGoyle);
                Hufflepuff.compare(cedricDiggory,justinFinchFletchley);
                Ravenclaw.compare(padmaPatil,marcusBelby);
                Hogwarts.compare(harryPotter,dracoMalfoy);
    }
}