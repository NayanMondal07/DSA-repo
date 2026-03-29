import java.nio.file.SecureDirectoryStream;

public class callbyvaluea {
    public static void call(int x){
        x = 10;
        System.out.println("your inside function is "+x);

    }
    public static void main(String[] args) {
        int a = 20;
        call(a);
        System.out.println(a);
        
    }
    
}
