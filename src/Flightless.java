import java.util.Objects;

public class Flightless extends Birds{


    private final String movementType;

    public Flightless(String name, int birtYear, String livingEnvironment, String movementType) {
        super(name, birtYear, livingEnvironment);
        this.movementType = movementType;
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

    @Override
    public void hunt() {

    }

    public void walk () {

    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }


    @Override
    public String toString() {
        return "Flightless{" +
                "name='" + getName() + '\'' +
                ", birtYear=" + getBirtYear() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", movementType='" + getMovementType() + '\'' +
                '}';
    }
}
