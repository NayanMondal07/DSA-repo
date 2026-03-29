public class mergeshort2 {
    public static void mergeshort(int arr [],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeshort(arr, si, mid);
        mergeshort(arr, mid+1, ei);
        mergee(arr,si,mid,ei);


    }
    public static void mergee(int arr[],int si,int mid,int ei){
        int temp []=new int [ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0;k<temp.length;k++){
            arr[si+k]=temp[k];
        }

    }
   
    public static void main(String[] args) {
        int arr []={5,4,3,8,7};
        mergeshort(arr,0,arr.length-1);
        System.out.println("soeted array");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        
    
        
        
    }
}
    

