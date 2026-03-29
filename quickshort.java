public class quickshort {
    public static void quickshort(int arr[],int low,int high){
        if(low<high){
            int pdx = partiation(arr,low,high);
            quickshort(arr,low,pdx-1);
            quickshort(arr,pdx+1,high);
        }


    }

    public static int partiation(int arr[],int low,int high){
        int privit = arr[high];
        int i = low-1;
        for( int j=low;j<high;j++){
            if(arr[j]<privit){
                i++;
                int tem = arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
            }

            
        }
        int tem = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=tem;
        return i+1;


    }
    public static void main(String[] args) {
        int arr []={5,4,3,2,1};
        quickshort(arr, 0, arr.length-1);
        System.out.println("your array os sorted");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}
