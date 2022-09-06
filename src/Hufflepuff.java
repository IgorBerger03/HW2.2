public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int witchcraft, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, witchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        if (industriousness < 0 || industriousness > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name=" + name +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", industriousness='" + industriousness + '\'' +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                '}';
    }

    public void compare(Hufflepuff student2) {
        int totalPower1 = this.honesty + this.loyalty + this.industriousness;
        int totalPower2 = student2.honesty + student2.loyalty + student2.industriousness;
        if (totalPower1 > totalPower2) {
            System.out.println(this.name + " сильнее, чем " + student2.name);
        } else if (totalPower2 > totalPower1) {
            System.out.println(student2.name + " сильнее, чем " + this.name);
        } else {
            System.out.println(this.name + " имеет такую же силу, что и " + student2.name);
        }
    }
}
