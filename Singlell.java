import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

class linkedlist
{
    static Node head = null; 

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }


    public void addnode(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node temp = head;

        while( temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
    }


    public void removenode()
    {
        if(head == null)
        {
            System.out.println("Deletion is snot possible");
            return;
        }

        if( head.next == null)
        {
            System.out.println("Deleted element is : " + head.data);
            head = null;
            return;
        }

        Node temp = head;

        while( temp.next.next != null)
        {
            temp = temp.next;
        }

        System.out.println("Deleted element is : " + temp.next.data );

        temp.next = null;

    }


    public void print()
    {
        if( head == null)
        {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;

        while( temp != null )
        {
            System.out.print( temp.data +  "-> ");
            temp = temp.next;
        }

        System.out.println("NULL");

    }

    public void fileprint() throws Exception
    {
        FileWriter fr = new FileWriter("ll.txt");
        BufferedWriter br = new BufferedWriter(fr);

        if( head == null)
        {
            br.write("Linked list is empty");
            br.close();
            return;
        }

        Node temp = head;

        while( temp != null )
        {
            br.write( temp.data +  "-> ");
            temp = temp.next;
        }

        br.write("NULL");

        br.close();

    }




}



public class Singlell 
{
    public static void main(String[] args) throws Exception 
    {
        linkedlist ll = new linkedlist();

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            
            

            System.out.println("1.ADD 2.DELETE 3.PRINT 4.EXIT\n");
            System.out.print("Enter option : ");
            int option = sc.nextInt();

            switch (option) {
                case 1 :
                System.out.print("Enter val : ");
                    int val = sc.nextInt();
                    ll.addnode(val);
                    System.out.println("Operation successfully done.");
                    break;

                case 2 :
                    ll.removenode();
                    System.out.println("Operation successfully done.");
                    break;

                case 3 :
                    ll.print();
                    break;

                case 4 :
                    sc.close();
                    return;
            
                default:
                    break;
            }

            ll.fileprint();

        }

    }
}
