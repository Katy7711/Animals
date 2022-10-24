import java.util.Objects;

public abstract class Animals {

    private String name;
    private final int birtYear;

    public Animals(String name, int birtYear) {
        if(name == null || name.isEmpty() || name.isBlank())
            name = "default";
        this.name = name;
        this.birtYear = birtYear;
    }


    public abstract void eat();

    public abstract void sleep();
    public abstract void go();


    public String getName() {
        return name;
    }

    public int getBirtYear() {
        return birtYear;
    }


    public void setName(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return birtYear == animals.birtYear && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birtYear);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + getName() + '\'' +
                ", birtYear=" + getBirtYear() +
                '}';
    }
}
