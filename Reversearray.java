public class Reversearray {
    public static void Reversearray(int arr[]){
        int start =0;int last = arr.length-1;
        while (start<last) {
            int temp = arr[last];
            arr[last]=arr[start];
            arr [start]=temp;
            start++;
            last--;
            
        }
    }
    public static void main (String[]args){
        int arr []={6,8,5,9};
        Reversearray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println("the numbers aree "+arr[i]+" ");
        }
        System.out.println();

    }
    
}
