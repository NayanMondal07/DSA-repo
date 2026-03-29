public class Linlklist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        tail.next=newNode;
        tail=newNode;


    }

    public void addmidle(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bound");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
 

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int deletfirst(){
        
        if(size==0){
            System.out.println("your link list is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;





        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int deletlast(){
        if(size ==0){
            System.out.print("Your link list is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            return val;
        }
        Node prev = head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;

        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int search(int key ){
        Node temp = head;
        int i =0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    public static void main(String[] args) {
        Linlklist ll = new Linlklist();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();

        ll.addmidle(2, 9);
        ll.print();
        ll.deletfirst();
        ll.print();
        ll.deletlast();
        ll.print();

    }
}



