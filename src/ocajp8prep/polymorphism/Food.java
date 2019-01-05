package ocajp8prep.polymorphism;

public class Food {
    public int calories = 4; //variables are not polymorphic

    public void eat(){
        System.out.println("This food is great!");
    }
    public int getCalories (){ // can be override
        return this.calories;
    }
    public static void main(String [] args){
        Food a = new Apple();
        a.eat();
        System.out.println(a.getCalories());
        System.out.println(((Apple)a).getCalories());

    }


}
