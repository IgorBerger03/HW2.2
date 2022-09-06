public class Slytherin extends Hogwarts {
    private  int cunning;
    private  int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, int witchcraft, int transgression, int cunning,
                     int determination, int ambition, int resourcefulness, int power) {
        super(name, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (cunning < 0 || cunning > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0 || power > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.power = power;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name=" + name +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                ", cunning='" + cunning + '\'' +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                '}';
    }

    public void compare(Slytherin student2) {
        int totalPower1 = this.power + this.cunning + this.determination + this.resourcefulness;
        int totalPower2 = student2.power + student2.cunning + student2.determination + student2.resourcefulness;
        if (totalPower1 > totalPower2) {
            System.out.println(this.name + " сильнее, чем " + student2.name);
        } else if (totalPower2 > totalPower1) {
            System.out.println(student2.name + " сильнее, чем " + this.name);
        } else {
            System.out.println(this.name + " имеет такую же силу, что и " + student2.name);
        }
    }
}
