public class Oddarray {
    public static void main(String[] args) {
        int [] arr = {1,5,5,2};
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        System.out.println("The odd count is"+count);
    }
    
}
