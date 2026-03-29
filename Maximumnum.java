public class Maximumnum {
    public static void main(String[] args) {
        int [] number = {1,2,6,9,5};
        int max =  number[0];
        for(int i = 1;i<number.length;i++){
            if(number[i]>max){
                 max= number[i];
                 System.out.println("the maximum value of the nuber is "+max);
            }
        }

    }
    
}
