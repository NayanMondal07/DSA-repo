public class Averagearray {
    public static void main(String[] args) {
        int [] arr = {1,8,9,5,4,8,6};
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            count+=arr[i];

        }
        double average = (double)count/arr.length;
        System.out.println("Your average number is "+average);
    }
    
}
