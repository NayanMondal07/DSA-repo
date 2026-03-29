public class Backtracking1 {
    public static void recursion(int []arr,int i,int val){
        if(i==arr.length){
            return;

        }
        arr[i]=val;
        recursion(arr,i+1,val+1);
        arr[i]=arr[i]-2;

        


    }
    public static void recu(int[]arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        recursion(arr, 0, 1);
        recu(arr);
        
    }
    
}
