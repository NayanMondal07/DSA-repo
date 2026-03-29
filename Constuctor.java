public class Constuctor {
    public static void main(String[] args) {
        Student s1 = new Student("Nayan Mondal");
        System.out.println(s1.name);
        
    }
    
}
class Student{
    String name ;
    int mobilenumber;
    Student(String name){
        this.name = name;

    }
}
