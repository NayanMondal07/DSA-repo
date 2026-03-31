public class StrivereasyQ5 {
    public static void leftrotate(int[]arr){
        int n = arr.length;
        int tem= arr[0];
        for(int i = 1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=tem;

    }
    public static void main(String[] args) {
        int arr [] = {1,5,9,5};
        leftrotate(arr);
        for(int nums:arr){
            System.out.print(nums+" ");

        }
        

    }
    
}
