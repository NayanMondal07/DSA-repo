public class ToString {
    String name;
    int age;
    int house;
    String girlfriend;

    public ToString(String name, int age, int house, String girlfriend) {
        this.name = name;
        this.age = age;
        this.house = house;
        this.girlfriend = girlfriend;
    }

    @Override
    public String toString() {
        return "Student details: { name: " + name +
               ", age: " + age +
               ", house: " + house +
               ", girlfriend: " + girlfriend + " }";
    }

    public static void main(String[] args) {
        ToString stu = new ToString("Nayan", 10, 65, "Dany");
        System.out.println(stu);
    }
}


    

    


    

