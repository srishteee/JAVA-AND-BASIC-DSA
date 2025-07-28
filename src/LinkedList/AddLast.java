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
        }


    public static void main(String[] args) throws Exception {
        LinkedLists list = new LinkedLists();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();  // Output: 10 -> 20 -> 30 -> null
    }
}
