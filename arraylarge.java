public class arraylarge {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int larger=arr[0];
        for (int i = 1 ; i<0arr.length ; i++){
            if (arr[i]>larger){
                larger = arr[i];
            }
        }
System.out.println("The largest number in a array "+larger);

    }
    
}
