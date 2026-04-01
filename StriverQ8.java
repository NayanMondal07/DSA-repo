public class StriverQ8 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,8,9};
        int tar = 3;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==tar){
                System.out.println("Your index is found"+i);
                return;
            }
        }
        System.out.println("Not found");
    }
    
}
