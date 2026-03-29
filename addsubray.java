public class addsubray {
    public static void addsubray(int num[]){
        int curr=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i =0;i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
                int end=j;
            curr =0;
            for(int k =start;k<=end;k++){
                curr+=num[k];
            }
            System.out.print(curr);
            if(curr>maxsum){
                maxsum=curr;
            }
            }
        }
        System.out.println("your sum is "+maxsum);
    }
    public static void main(String[] args) {
        int num []={1,5,8,8};
        addsubray(num);
        
    }
    
}
