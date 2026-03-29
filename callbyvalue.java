public class callbyvalue {

    public static void ubdate(int marks[]){
        for(int i =0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks [] ={55,88,62};
        ubdate(marks);

        for(int i =0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println("null");
    }
}
