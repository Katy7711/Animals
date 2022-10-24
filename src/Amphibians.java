import java.util.Objects;

public class Amphibians extends Animals{

    private final String livingEnvironment;


    public Amphibians(String name, int birtYear, String livingEnvironment) {
        super(name, birtYear);
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

    public void hunt() {

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "name='" + getName() + '\'' +
                ", birtYear=" + getBirtYear() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                '}';
    }
}