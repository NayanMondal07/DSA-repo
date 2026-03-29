public class multilevelinheriantance {
    public static void main(String[] args) {
        Dod.type1();
        Dog.legs = 4;
        System.out.println(dog.legs);
    }
    
}
// this is an example of multiple in heritance 
class Animal{
    String name;
    void bread(){
        System.out.println("this is typre of fish");
    }
    void dance(){
        System.out.println("Animal cannot dance");
    }
    class Mamal extends Animal{
        int legs;
        void type(){
            System.out.println("this can be of many type");
        }
    }
    class Dog extends Mamal{
        int type;
        void type1(){
            System.out.println("this is a type of doberman");
        }
    }
}
