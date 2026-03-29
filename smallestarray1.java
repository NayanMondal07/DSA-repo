public class smallestarray1 {
    public static void main(String[] args) {
        int  []arr={1,5,6,8};
        int smallest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("your smallest number is "+smallest);
    }
    
}
