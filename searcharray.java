public class searcharray {
    public static void main(String[] args) {
        int arr []={1,8,9,5};
        int key = 1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("your key is found ");

            }else{
                System.out.println("your key is not found");
            }
        }
    }
    
}
