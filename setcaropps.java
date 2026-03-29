public class setcaropps {
    public static void main(String[] args) {
        Car c1 = new Car ();
        c1.setname("blue");
        System.out.println(c1.name);
        c1.setwhell(4);
        System.out.println(c1.wheel);
    }
    
}
 class Car {
    String color;
    int wheel;
    String name;
    void setclor(String newcolor){
        color = newcolor;
    }
    void setwhell(int newwhell){
        wheel = newwhell;

    }
    void setname(String newname){
        name = newname;
    }

}
