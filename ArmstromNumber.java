public class ArmstromNumber {
    public static void main(String[] args) {
        int n = 153;
        int tem = n;
        int r,sum = 0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if (tem==sum){
            System.out.println("Is a Armstrom number");
        }else {
            System.out.println("Is not a Armstrom number");
        }
    }
}

