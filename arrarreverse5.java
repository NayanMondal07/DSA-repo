public class arrarreverse5 {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        int temp;
        for(int i =0;i<arr.length/2;i++){
             int tem = arr[i];
             arr[i]=arr[arr.length-i-1] ;
             arr[arr.length-i-1]= temp;


        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    
}
