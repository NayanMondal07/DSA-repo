public class Opps {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        
       banaccount bnp = new banaccount();
       bnp.username ="Nayan Mondal";
       bnp.bankaccountnumber = "nayan";

        
    }
    
}
class banaccount{
    public String username;
    private String bankaccountnumber;
    public void bankaccountnumber(String pwd){
        bankaccountnumber = pwd;
    }
}
class Pen{
    String color;
    int pentip;

    void setcolor(String newcolor){
        color = newcolor;
    }
    void setpentip(int newpentip){
        pentip = newpentip;
    }
}
