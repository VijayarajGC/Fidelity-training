class LinkedList
{
    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int x) // parameterized constructor
        {
            data = x;
            next = null;
        }
    }
    public Node insertBeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("inserted "+data);
        return head;
    }


    public void display()
    {
        System.out.println();
        Node node = head;
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
public class Headinsertion
{
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insertBeginning(383);
        ll.insertBeginning(484);
        ll.insertBeginning(392);
        ll.insertBeginning(975);
        ll.insertBeginning(321);

        ll.display();

    }
}