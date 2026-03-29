public class decrease {
    public static void decreserecursion(int n ){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decreserecursion(n-1);
        
        }

    
    public static void main(String[] args) {
        int n = 5;
        decreserecursion(n);

    }
}
    

