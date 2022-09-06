public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name=" + name +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", nobility='" + nobility + '\'' +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                '}';
    }
    public void compare(Gryffindor student2) {
        int totalPower1 = this.bravery + this.honor + this.nobility;
        int totalPower2 = student2.bravery + student2.honor + student2.nobility;
        if (totalPower1 > totalPower2) {
            System.out.println(this.name + " сильнее, чем " + student2.name);
        } else if (totalPower2 > totalPower1) {
            System.out.println(this.name + " сильнее, чем " + student2.name);
        } else {
            System.out.println(this.name + " имеет такую же силу, что и " + student2.name);
        }
    }
}
