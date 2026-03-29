public class dividandconc {
    public static int dividand(int[] arr,int tar ,int si,int ei){
        int mid = (ei+si)/2;
        if(tar==arr[mid]){
            return mid;
        }
        if(si<=arr[mid]){
            if(tar<=si && tar<=arr[mid]){
                return dividand(arr, tar, si, ei);
                
            }else{
                return dividand(arr, tar, mid+1, ei);
            }

            
        }
        if(arr[mid]<=tar && tar<=ei){
            return dividand(arr, tar, mid+1, ei);
        }else{
            return dividand(arr, tar, si, mid-1);
        }

    }
    public static void main(String[] args) {
        int arr []={4,5,6,7,0,1,2};
        int tar = 0;
        int tard= dividand(arr, tar, 0, arr.length-1);
        System.out.println(tard);
        
    }
    
}
