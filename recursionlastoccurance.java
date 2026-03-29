public class recursionlastoccurance {
    public static int lastoccurance(int arr[],int i,int key){
        if(i==arr.length){
            return -1;

        }
        int isfound = lastoccurance(arr, i+1,key);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,6,7};
        System.out.println(lastoccurance(arr, 0, 6));
    }
    
}
