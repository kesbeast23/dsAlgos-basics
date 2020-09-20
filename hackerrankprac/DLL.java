public class DLL {
    Node head;

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int d){
            data=d;
        }

    }
    //insert node at the front
    public void push(int d){
        Node new_node=new Node(d);

        new_node.next=head;
        new_node.prev=null;
        if(head!=null) head.prev=new_node;

        head=new_node;
    }
    //Add a node after a given node
    public void insertAfter(Node prev_Node,int d){
        if(prev_Node==null){
            System.out.println("prev node cant be null");
            return;
        }
        Node new_node= new Node(d);
        new_node.next=prev_Node.next;
        prev_Node.next= new_node;
        new_node.prev=prev_Node;

        if (new_node.next!=null) {
            new_node.next.prev=new_node;
        }


    }
    //add node at the end of the list
    public void append(int d){
        Node new_node= new Node(d);
        Node last = head;
        new_node.next=null;

        if (head==null) {
            new_node.prev=null;
            head=new_node;
            return;
        }
        while (last.next!=null) {
            last=last.next;
        }
        last.next=new_node;
        new_node.prev=last;
    }
    public static void main(String[] args) {
        
    }
}
