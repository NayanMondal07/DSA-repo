public class smallest2 {
    public static int smallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;

    }
    public static void main(String[] args) {
        int arr []= {6,5,9,2};
        System.out.println("your number is "+smallest(arr));


    }
    
}
