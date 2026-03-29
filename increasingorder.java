public class increasingorder {
    public static void increasingorder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        increasingorder(n-1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        increasingorder(n);

    }
    
}
