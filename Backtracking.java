public class Backtracking {
    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<str.length();i++){
            char curr = str.charAt(i);
            String newstar = str.substring(0, i) + str.substring(i+1);
            permutation(newstar, ans+curr);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str,"" );
        //time complexity of the code is

        
    }
    
}
