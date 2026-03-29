public class multilevelinheritance {
    public static void main(String[] args) {
        Puppy p1 = new Puppy();
        p1.bark();
        p1.puppyname;
        p1.Puppyage;
        
    }
    class Dog{
        void bark(){
            System.out.println("Your dog can bark easily");
        }
    }
    class Puppy extends Dog{
        void puppyname{
            System.out.print("your puppy is a multilevel in heretance of dod his name is dogy don")
        }
    }
    class Puppyage extends Puppy{
        void Puppyage{
            System.out.println("Your pyppy age is almost 3months ")
        }
    }
    
}
