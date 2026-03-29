public class recursionpowercalculation {
    public static int recursionpower(int x,int n){
        if(n==0){
            return 1;
        }
        return x*recursionpower(x,n-1);
        
    }
    public static void main(String[] args) {
        System.out.println(recursionpower(2, 05));
        
    }
    
}
