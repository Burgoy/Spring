package Chapter2.sq_ch3_ex1;

public class Human {
    private String name = "Alex";
    private Cat cat;
    private Parrot parrot;

    @Override
    public String toString() {
        return "Human " +
                "name = " + name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
