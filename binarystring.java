public class binarystring {
    public static void stringbinary(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        stringbinary( n-1,0,str+0);

        if(lastplace==0){
            stringbinary((n-1),1,str+1);
        }
        
        
       
        
    }
    public static void main(String[] args) {
        stringbinary(3, 0, "");


        
    }
    
    
}
