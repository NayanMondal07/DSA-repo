public class secondsmall {
    public static void main(String[] args) {
        int arr [] = {1,4,9,10};
        int largest =0;
        int smallest =Integer.MAX_VALUE;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<largest){
                smallest = largest;
                largest = arr[i];
            }
            else if(arr[i]<smallest&& arr[i]!=smallest){
                smallest = arr[i];
            }
            

        }
        System.out.println(smallest);

    }
    
}
