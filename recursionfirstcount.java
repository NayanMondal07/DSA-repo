public class recursionfirstcount {
    public static int firstoccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {5,4,9,8,4,5};
        System.out.println(firstoccurance(arr, 5, 0));
    }
    
}
