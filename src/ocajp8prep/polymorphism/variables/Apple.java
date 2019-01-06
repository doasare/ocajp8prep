package ocajp8prep.polymorphism.variables;

public class Apple extends Food{
    public int calories = 2;

    @Override
    public void eat(){
        System.out.println("This food is great!");
    }
    @Override
    public int getCalories (){
        return this.calories;
    }
}
