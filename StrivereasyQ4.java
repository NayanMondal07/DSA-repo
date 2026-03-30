public class StrivereasyQ4 {
    public static void main(String[] args) {
        int arr [] = {2,2,4,4,5,5};
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr.length-1);
    }
    
}
