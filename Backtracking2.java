public class Backtracking2 {
    public static void Back(String str,String ans,int i){
        if(i==str.length()){
            System.out.print(ans);
            return;
        }
        Back(str, ans+str.charAt(i), i+1);
        Back(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str ="abc";
        Back(str," ", 0);
        
    }
    
}
