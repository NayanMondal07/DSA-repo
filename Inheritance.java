public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        
    }
    
}
class Animal{
    void eat(){
        System.out.println("Animmal is eating");
    }
}
class Dog extends Animal{
    void bark(){
    System.out.println("The dog is barking");
}
}
