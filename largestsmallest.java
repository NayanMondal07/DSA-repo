public class largestsmallest {
    public static void main(String[] args) {
        int []arr={1,5,10,8};
        int largest =arr[0];
        for(int i =0;i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }


        }
        System.out.println("the largest number in the array is is "+largest);
    }
    
}
