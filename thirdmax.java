public class thirdmax {
    public static void main(String[] args) {
        int arr []= {1,2,3,4};
        long first = Integer.MIN_VALUE;
        long second =Integer.MIN_VALUE;
        long third = Integer.MIN_VALUE;
        for(int nums : arr){
            if(nums>first){
                third = second;
                second = first;
                first = nums;
                
            }
            else if (nums>second){
                third = second;
                second = nums;

            }
            else if (nums>third){
                third = nums;
            }
        }
        System.out.println("your number is second"+third);
    }
    
}
