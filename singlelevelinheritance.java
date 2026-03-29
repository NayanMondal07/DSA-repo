public class singlelevelinheritance {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.bark();
        
    }
}
class Animal{
    void bark(){
        System.out.println("ypur dog can barak");
    }
    class Dog extends Animal{
        void legs(){
            System.out.println("your dog have four legs ");

        }
    }

}
