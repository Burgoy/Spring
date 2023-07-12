package Chapter2.sq_ch3_ex1;

public class Women {
    private String name;
    private Cat cat;


    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Women" +
                "name = " + name;
    }
}
