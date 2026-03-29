public class stringcompress {
    public static String compressstring(String str){
        String newstr = "";
        
        for(int i =0;i<str.length()-1;i++){
             Integer count = 1;
             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;

             }
             newstr += str.charAt(i);
             if(count>1){
                newstr += count.toString();
             }
        }
        return newstr;
       
    }
       
    public static void main(String[] args) {
        String s1 = "aaaabbbbccc";
        System.out.println(compressstring(s1));
    }
    
}
