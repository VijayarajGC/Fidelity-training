class Node1
{
    int data;
    Node1 next;

    Node1(int newData)
    {
        data = newData;
        next = null;
    }
}
public class Tailinsertion
{
    static Node1 append(Node1 head, int newData)
    {
        Node1 newNode = new Node1(newData);
        if (head == null)
        {
            return newNode;
        }
        Node1 last = head;
        while (last.next != null)
        {
            last = last.next;
        }

        last.next = newNode;
        return head;
    }

    public static void printList(Node1 node)
    {
        while (node != null)
        {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }


    public static void main(String[] args)
    {
        Node1 head = new Node1(141);
        head.next = new Node1(302);
        head.next.next = new Node1(164);
        head.next.next.next = new Node1(530);
        head.next.next.next.next = new Node1(474);


        printList(head);

    }
}