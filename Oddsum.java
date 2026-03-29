public class Oddsum {
    public static int oddsum(int n){
    int sum =0;
    for(int i  = 1; i<=2;i+=2){
        sum +=i;
    }
    return sum;

    
}
public static void main(String[] args) {
    int n = 10;
System.out.println("your number is "+oddsum(n));
}
}