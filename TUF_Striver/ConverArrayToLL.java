class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next= next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
/**
 * ConverArrayToLL
 */
public class ConverArrayToLL {

    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node newNode =new Node(arr[i]);
            mover.next = newNode;
            mover=mover.next;
        }
        return head;
    }

    public static void printAllNode(Node head){
        Node temp = head;
        System.out.print("Data");
        while (temp!=null){
            System.out.print("-->"+temp.data);
            temp=temp.next;
        }
        // System.out.print("-->"+temp.data);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        Node head= convertArr2LL(arr);
        System.out.println("Head -->"+head.data);
        printAllNode(head);
    }
}