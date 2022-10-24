import java.util.Objects;

public class Predators extends Mammals {

    private String foodType;

    public Predators(String name, int birtYear, String livingEnvironment, int runningSpeed, String foodType) {
        super(name, birtYear, livingEnvironment, runningSpeed);
        if(foodType == null || foodType.isEmpty() || foodType.isBlank())
            foodType = "не указано";
        this.foodType = foodType;
    }



    @Override
    public void eat() {
        System.out.println("кушать то,что добыл на охоте");

    }

    @Override
    public void sleep() {
        System.out.println("после еды нужно поспать");

    }

    @Override
    public void go() {

    }

    @Override
    public void walk() {
        System.out.println("после сна, надо пойти погулять");

    }

    public void hunt() {
        System.out.println("время охоты");

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
        Predators predators = (Predators) o;
        return Objects.equals(foodType, predators.foodType);
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
                ", runningSpeed=" + getRunningSpeed() +
                "foodType='" + getFoodType() + '\'' +
                '}';
    }
}
