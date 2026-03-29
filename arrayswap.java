public class arrayswap {
    public static void main(String[] args) {
        int [] arr = {1,2,9,3};
        System.out.println("before swapping two number"+arr[0]+"After swapping the number"+arr[2]);
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2]= temp;
        System.out.println("After swaping the array "+arr[0]+"After swapping the array "+arr[2]);
    }

    
    
}
