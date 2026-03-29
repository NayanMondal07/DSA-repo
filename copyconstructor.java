public class copyconstructor {
    public static void main(String[] args) {
        Student s1 = new student();
        s1.name=("Nayan ");
        s1.roll="123";
        s1.password="123456";
        s1.marks[0]=100;
        s1marks[1]=200
        s1.marks[2]=300;
        student s2 = new student(s1);
        s2.password="xyz";
        s1.marks[2]=100;
        for(int i =0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
    
}
class Student{
    String name;
    String roll;
    String password;
    int marks[];
//this is a shallow coppy constructor

    //student(s1){
    // this.name=s1.name;
      //  this.roll=s1.roll;
       // this.roll=s1.roll

   // }
    student(s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll =s1.roll;
        for(int i =0;i<marks.length;i++){
            this.marks[i]=marks[i];
        }
    }

    Student(){
        System.out.println("It is a null constructor");
    }
    Student(String name){
        this.name = name;

    }
    Student(String roll){
        this.roll = roll;
    }
}
