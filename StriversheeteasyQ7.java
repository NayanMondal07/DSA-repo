public class StriversheeteasyQ7 {
    public static void zeroatlast(int[]arr){
        int j = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i = j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,0,0,8,9};
        zeroatlast(arr);
        for(int nums:arr){
            System.out.print(nums+ " ");
            System.out.println();
        }
       
     
    }
    
}
