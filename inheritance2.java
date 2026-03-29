public class inheritance2 {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
    }
    
}
class Animal{
    String name;
    void eat(){
        System.out.println("You can eat properly");
    }
    void breadth(){
        System.out.println("you canbreat properly");
    }
    class fish extends Animal{
        int fins;
        void swim(){
            System.out.println("it can swim easily");
        }
    }
}
//it is a single level inheriantance