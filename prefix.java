public class prefix {
    public static void main(String[] args) {
        int arr [] ={1,8,9,6};
        int []prefix= new int [arr.length];
         prefix[0]=arr[0];
         for(int i =0;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
         }
         System.out.println("prefix sum :");
         for(int sum:prefix){
            System.out.println(sum+" ");
         }
    }
  
    
}
