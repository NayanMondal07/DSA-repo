public class Striverarrayeasyqs2 {
    // second lasrgest
    public static void main(String[] args) {
        int arr []={5,7,8,9};
        int largest = arr[0];
        int second = Integer.MAX_VALUE;
        for(int i =1;i<arr.length;i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];

            }
            else if(arr[i]<largest && arr[i]!=largest){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
    
}
