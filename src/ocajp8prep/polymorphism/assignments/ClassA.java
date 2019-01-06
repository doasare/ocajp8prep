package ocajp8prep.polymorphism.assignments;

public class ClassA {
    public static void main(){
        ClassA varA = new ClassA();
        ClassB varB = new ClassB();

        ClassA varA1 = varA; // ClassA assign own type
        ClassA varA2 = varB; // ClassA assign subclass
        ClassB varB1 = varB; // ClassB assign own type
        ClassB varB2 = (ClassB) varA; // ClassB downcast from superclass casting needed


    }

}
class ClassB extends ClassA{

}