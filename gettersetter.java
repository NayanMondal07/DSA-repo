public class gettersetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setPen("Ball pen ");
        System.out.println(p1.getPen());
        
    }
    
}
class Pen {
   private String pen;
    private String pentip;

    String getPen(){
        return this.pen;
        
    }
    void setPen(String newpen){
        this.pen = newpen;
    }

}