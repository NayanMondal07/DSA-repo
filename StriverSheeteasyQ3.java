public class StriverSheeteasyQ3 {
    public static void main(String[] args) {
        int arr [] = {1,2,5,3,4,8,9};
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                System.out.println("Your array is not sorted");
                return;
                
            }
        }
        System.out.println("sorted");
            
        }
    }
    

