package Chapter2.sq_ch3_ex1;

public class Cat {
    private String name;

    @Override
    public String toString() {
        return "Cat " +
                "name = " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
