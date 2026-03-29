public class largearray {
    public static void main(String[] args) {
        int [] arr = {12,45,55,90,55};
        int larger = arr[0];
        for(int i = 1; i<=arr.length;i++){
            if (arr[i]>larger){
                larger = arr[i];
            }
        }
        System.out.println("the largest number is "+larger);

    }
    
}
