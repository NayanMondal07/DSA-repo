public class pcheck {
    public static void main(String[] args) {
        int num = 101;
        int reverse = 0;
        while(num!=0){
            int digit = num%10;
             reverse =  reverse*10+digit;
             num = num/10;
        }
        if(num==reverse){
            System.out.println("it is a palindrom");
        }else{
            System.out.println("it is not a palindrom number");
        }
    }
    
}
