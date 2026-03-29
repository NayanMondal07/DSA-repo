public class ubdatebit {
    public static int claearbit(int n,int i){
        int bitmas = ~(1<<i);
        return n & i;
    }
    public static int setbit(int n,int i){
        int bitmas = 1<<i;
        return n|i;
    }
    public static int ubdatebit(int n,int i,int newbit){
        if(newbit ==0){
            return claearbit(10, 1);
        }else{
            return setbit(10, 1);
            
           
        }
        public static int clearlastbit(int n , int i){
            int bitmash = (~0)<<1;
            return n&i;
        
    }
    public static void int clearbitsinranhe(int n , int i,int j){
        int a =( ~0)<<i;
        int b =(1<<1)-1;
        int bitmas = a|b;
        return n|bitmas;
    }
    public static boolean ispoweroftwo(int n){
        return (n&(n-1))==0;
    }

    
    public static void main(String[] args) {
        System.out.println(ispoweroftwo(8));
  
     
        
    }
    
}
