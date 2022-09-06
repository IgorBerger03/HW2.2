public class Hogwarts {
    public String name;
    public int witchcraft;
    public int transgression;

    public Hogwarts(String name, int witchcraft, int transgression) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        if(witchcraft < 0 || witchcraft > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        if (transgression < 0 || transgression > 100) {
            throw new RuntimeException("Неверное значение");
        }
            this.transgression = transgression;
    }
    public void compare(Hogwarts student2) {
        int totalPower1 = this.witchcraft + this.transgression;
        int totalPower2 = student2.witchcraft + student2.transgression;
        if (totalPower1 > totalPower2){
            System.out.println(this.name + " сильнееб чем " + student2.name);
        } else if (totalPower2 > totalPower1) {
            System.out.println(student2.name +  " сильнее, чем " + this.name);
        } else {
            System.out.println(this.name + " имеет такую же силу, что и " + student2.name);
        }

    }
}
