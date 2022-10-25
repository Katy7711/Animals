import java.util.Objects;
public abstract class Mammals extends Animals{
    private final String livingEnvironment;
    private final int runningSpeed;

    public Mammals(String name, int birtYear, String livingEnvironment, int runningSpeed) {
        super(name, birtYear);
        this.livingEnvironment = livingEnvironment;
        this.runningSpeed = runningSpeed;
    }


    public abstract void walk();


    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return runningSpeed == mammals.runningSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, runningSpeed);
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", runningSpeed=" + getRunningSpeed() +
                '}';
    }
}
