public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int witchcraft, int transgression,
                     int smart, int wise, int witty, int creativity) {
        super(name, witchcraft, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        if (smart < 0 || smart > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        if (wise < 0 || wise > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        if (witty < 0 || witty > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (creativity < 0 || creativity > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name=" + name +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                ", smart='" + smart + '\'' +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                '}';
    }

    public void compare(Ravenclaw student2) {
        int totalPower1 = this.smart + this.wise + this.witty + this.creativity;
        int totalPower2 = student2.smart + student2.wise + student2.witty + student2.creativity;
        if (totalPower1 > totalPower2) {
            System.out.println(this.name + " сильнее, чем " + student2.name);
        } else if (totalPower2 > totalPower1) {
            System.out.println(student2.name + " сильнее, чем " + this.name);
        } else {
            System.out.println(this.name + " имеет такую же силу, что и " + student2.name);
        }
    }
}
