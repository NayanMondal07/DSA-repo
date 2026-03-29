public class lenearsearch {
    public static int linearsearch (int arr[],int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                return i;

            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        int key = 4;
        int index=linearsearch(arr, key);
        if(index==-1){
            System.out.println("your number is not found");
        }else{
            System.out.println("your number is found");
        }
        
    }
    
}
