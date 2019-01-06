package ocajp8prep.polymorphism.dynamic_binding;

//always calls instance of override method resolved at runtime
public class Animal {
    public static void main(String [] args){
        Animal myAnimal = new SongBird();
        myAnimal.move(); // will print Bird Moved called from instance type
//        myAnimal.sing(); this will not compile
        ((SongBird) myAnimal).sing(); // need to be cast to instance type
        // method sing is not in Animal class

    }
    public void move(){
        System.out.println("Animal Moved!");
    }
}
class Bird extends Animal{
    public void move(){
        System.out.println("Bird Moved!");

    }
}
class Fish extends Animal{
    public void move(){
        System.out.println("Fish Moved!");

    }
}
class SongBird extends Bird{
    public void sing(){
        System.out.println("Song Bird Sings!");

    }
}