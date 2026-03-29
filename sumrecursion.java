public class sumrecursion {
    public static int sumrecursion(int n){
        if(n==0){
            return 1;
        }
        int sumfi=sumrecursion(n-1);
        int sumdi= n+sumfi;
        return sumdi;

    }
    
    

    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumrecursion(n));
    }
}
    

