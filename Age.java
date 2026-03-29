import java.util.Scanner;

public class Age {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre your age");
        int age = scanner.nextInt();
        if (age<=13){
            System.out.println("Is a child");

        }else if(age<=20){
            System.out.println("Is a teen ager");
        } else if(age<=60){
            System.out.println("Is a Adult");
        }else if (age>=60){
            System.out.print("Is a senior person");

        }

    }
}
