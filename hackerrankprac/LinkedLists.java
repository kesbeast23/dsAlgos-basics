/**
 * LinkedLists
 */
public class LinkedLists {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
    //prepend
    public void prepend(int d){
        if(head==null){
            head= new Node(d);
        }
        Node new_node = new Node(d);
        new_node.next=head;
        head=new_node;
    }
    //insert after
    public void insertafter(Node prevNode,int d){
        if (prevNode== null) {
            System.out.println("prev node cant be null");
        }
        Node newNode= new Node(d);
        newNode.next=prevNode.next;
        prevNode.next=newNode;

    
    }
    //insert atlast
    public void insertatlast(int d){
        if (head==null) {
            head= new Node(d);
            return;
        }
        Node newNode = new Node(d);
        newNode.next=null;
        Node last =head;
        while (last.next!=null) {
            last=last.next;
        }
        last.next=newNode;
        return;
    }
    //delete with Data
    public void deletewithData(int d){
        if(head==null) return;
        if(head.data==d) head=head.next;

        Node current=head;
        while (current.next!=null) {
            if (current.next.data==d) {
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }
    }
    public void deletelist(){
        head=null;
    }
    public void printlist(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args) {
        LinkedLists llist = new LinkedLists();
        llist.head=new Node(1);
        Node second= new Node(2);
        Node third = new Node(3);

        llist.head.next=second;
        second.next=third;
        llist.deletewithData(3);
        llist.printlist();
    }
}