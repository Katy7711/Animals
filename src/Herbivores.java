import java.util.Objects;

public class Herbivores extends Mammals {

    private String foodType;


    public Herbivores(String name, int birtYear, String livingEnvironment, int runningSpeed, String foodType) {
        super(name, birtYear, livingEnvironment, runningSpeed);
        if(foodType == null || foodType.isEmpty() || foodType.isBlank())
            foodType = "не указано";
        this.foodType = foodType;
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
    public void walk() {

    }


    public void graze () {

    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(foodType, that.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "name='" + getName() + '\'' +
                ", birtYear=" + getBirtYear() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", runningSpeed=" + getRunningSpeed() + " км/ч, " +
                " foodType='" + getFoodType() + '\'' +
                '}';
    }
}
