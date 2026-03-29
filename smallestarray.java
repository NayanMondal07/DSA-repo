public class smallestarray {
    public static void main(String[] args) {
        int [] arr = {45,32,99,88,44};
        int smallest = arr[0];
        for(int i =1;i<arr.length;i++){
            if (arr[i]<smallest){
                smallest=arr[i];
            }
        }
System.out.println("your smallest array is "+smallest);

    }
    
}
