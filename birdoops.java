public class birdoops {
    public static void main(String[] args) {
        Bird b1 = new Bird ();
        b1.setname("bulull");
        System.out.println(b1.name);
    }
    
}
class Bird{
    String name;
    int year;
    String projati;
    void setname(String newname){
        name = newname;
    }
    void setyear(int newyear){
        year = newyear;
    }
    void setproati(String newprojati){
        projati = newprojati;
    }
}
