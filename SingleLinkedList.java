public class SingleLinkedList {

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void insertatbeginning(int data)
    {
        Node newnode = new Node(data);

        newnode.next = head;
        head = newnode;
    }

    void insertatend(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
           head = newnode;
        }

        Node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    void insertatspecific(int pos , int data)
    {
        if(pos == 1)
        {
            insertatbeginning(data);
        }
        Node newnode = new Node(data);
        Node temp = head;

        for(int i = 0 ; i<pos-1;i++)
        {
            temp = temp.next;
        }
        newnode.next= temp.next;
        temp.next = newnode;
    }

    void deleteatbeginning()
    {
        if(head == null)
        {
            System.out.println("Node is enmpty");
        }
        head = head.next;
    }

    void deleteatend()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }

        if(head.next == null)
        {
            head = null;
        }

        Node temp = head;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }

        temp.next = null;
    }

    void deleteatspecific(int pos)
    {
        if(pos==1)
        {
            deleteatbeginning();
        }
        Node temp = head;
        for(int i = 1 ; i<pos-1;i++)
        {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    void display()
    {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data);
            if(temp.next != null)
            {
                System.out.print("-->");
            }
            temp=temp.next;
        }
    }

    public static void main(String args[])
    {
        SingleLinkedList list = new SingleLinkedList();

        list.insertatbeginning(20);
        list.insertatbeginning(10);
        list.insertatend(30);
        list.insertatend(50);
        list.insertatend(60);
        list.insertatspecific(3,40);
        //list.deleteatbeginning();
       // list.deleteatend();
        //list.deleteatspecific(3);
        list.display();
    }
}
