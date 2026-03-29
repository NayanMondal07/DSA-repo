public class binarysearch {
    public static int binarysearch(int num[],int target){
        int start =0;int end =num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==target){
                return mid;
            }
            else if (num[mid]<target) {
                start = mid+1;
                
            }
            else{
                end = mid-1;
            }
            


            

            
        }
        return -1;

    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int target =5;
        int result = binarysearch(num,target);
        System.out.println("your result is "+result);
    }
}
