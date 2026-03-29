public class Nonparametreconstructor {
    public static void main(String[] args) {
        Student s1 = new student();
        Student s2 = new student("Nayan");
        Student s3 = new student("123");
        student s2 = new student(s1)
    }
    
}
class Student{
    String name;
    String roll;
    String password;

    student(){
        System.out.println("It is a non parametre constructor");
    }
    Student(String name){
        this.name= name;

    }
    Student(String roll){
        this.roll=roll;
    }
}