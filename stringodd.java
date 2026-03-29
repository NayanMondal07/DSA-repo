public class stringodd {
    public static String largeodd(String str){
        for(int i =str.length()-1;i>=0;i++){
            int digit = str.charAt(i)-'0';
            if(digit%2!=0){
                return str.substring(i, i+1);
            }

            
        }
        return "";
    }
    

    
    public static void main(String[] args) {
        String str ="4205834";
        System.out.println(largeodd(str));
    }
    
}
