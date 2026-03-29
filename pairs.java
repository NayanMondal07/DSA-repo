public class pairs {
    public static void pairs(int number[]){
        for(int i =0;i<number.length;i++){
            int current = number[i];
            for(int j=0;j<number.length;j++){
                System.out.print("("+current+""+number[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={5,5,8,9};
        pairs(number);
    }
    
}
