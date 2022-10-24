import java.util.Objects;

public abstract class Birds extends Animals{

    private final String livingEnvironment;

    public Birds(String name, int birtYear, String livingEnvironment) {
        super(name, birtYear);
        this.livingEnvironment = livingEnvironment;
    }


    @Override
    public abstract void eat();


    @Override
    public abstract void sleep();

    @Override
    public abstract void go();

    public abstract void hunt();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }


    @Override
    public String toString() {
        return "Birds{"  +
                "name='" + getName() + '\'' +
                ", birtYear=" + getBirtYear() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}
