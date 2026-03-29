public class Reversearray2 {
    public static void reverse(int number[]){
        int first = 0;int last = number.length-1;
        while(first<last){
            int tem = number[last];
            number[last]=number[first];
            number[first]= tem;
            first++;
            last--;

        }
    }
    public static void main(String[] args) {
        int number []={1,5,8,9,10};
        reverse(number);
        for(int i =0;i<number.length;i++){
            System.out.println(number[i]+" ");
        }
        System.out.println();

    }
    
}
