public class Main {
    public static void main(String[] args) {
        Gryffindor studentGarry = new Gryffindor("Гарри Поттер", 100, 80,
                56, 95, 68);
        Gryffindor studentHermione = new Gryffindor("Гермиона Грейнджер", 100, 90,
                60, 70, 50);
        Hufflepuff studentZacharias = new Hufflepuff("Захария Смит", 89, 56, 78,
                77, 56);
        Hufflepuff studentCedric = new Hufflepuff("Седрик Диггори", 90, 88, 70,
                70, 60);
        Ravenclaw studentCho = new Ravenclaw("Чжоу Чанг", 70, 72, 82,
                70, 50, 70);
        Ravenclaw studentPadma = new Ravenclaw("Падма Патил", 68, 78, 98,
                75, 65, 56);
        Slytherin studentDraco = new Slytherin("Драко Малфой", 83, 75, 78,
                76, 89, 56, 60);
        Slytherin studentGregory = new Slytherin("Грегори Гойл", 85, 70, 68,
                63, 80, 59, 55);
        System.out.println(studentHermione);
        System.out.println(studentZacharias);
        System.out.println(studentPadma);
        System.out.println(studentDraco);
        studentGarry.compare(studentHermione);
        studentCedric.compare(studentZacharias);
        studentCedric.compare(studentGarry);


    }
}