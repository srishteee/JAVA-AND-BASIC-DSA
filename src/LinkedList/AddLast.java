package LinkedList;

public class AddLast {
    public static class Node {
        int data ;
       Node next;

    }
    public static class LinkedLists{
        Node head ;
        Node tail;
        int size ;

        void addLast(int val){
            Node temp = new Node(); // new node
            temp.data = val;
            temp.next=null;
            if(size==0){

                head=tail=temp;

            } else{

                tail.next=temp;  // take old one into new
                tail=temp;

            }
            size++;
        }
        public int size (){
        return size ;
        }
        public void display(){
Node temp = head ;
while(temp !=null){
    System.out.println(temp.data+ " ");
    temp = temp.next;
}
            System.out.println();
        }

        public void removeFirst(){

            if(size==0){
                System.out.println("empty list");
            } else if (size==1) {
                head=tail=null;
                size=0;
            } else {
                head=head.next;
                size--;
            }

        }
        // this method gives the head
        public int getFirst(){
if(size==0){
    System.out.println("list is empty");
    return -1;
} else{
return head.data;
}
        }

        // this method gives the tail
        public int getLast(){
            if(size==0){
                System.out.println("list is empty");
                return -1;
            } else{
           return tail.data;
            }
        }
        // this methods gives the value where it is like where we want the data from
        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("invalid arguments");
                return -1;
            } else {
                Node temp = head;
   for(int i=0;i<idx;i++){
temp=temp.next;
   }
   return temp.data;
            }
        }
        }


    public static void main(String[] args) throws Exception {
        LinkedLists list = new LinkedLists();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();  // Output: 10 -> 20 -> 30 -> null
    }
}
