
class LinkedList
{
  Node head;
  static class Node
  {
    int data;
    Node next;
    Node(int d)
    { 
      data=d;
      next=null;
    }
  }

  //insert an element.
  public static LinkedList insert(LinkedList list,int data)
  {
    Node new_node = new Node(data);
    new_node.next=null;

    if(list.head==null)
    {
      list.head=new_node;
    }
    else
    {
      Node last=list.head;
      while(last.next!=null)
      {
        last=last.next;
      }
      last.next=new_node;

    }
    return list;
  }

  public static void printList(LinkedList list)
  {
    Node currNode=list.head;
    System.out.println("Linked List : ");

    while(currNode!=null)
    {
      System.out.print(currNode.data + " ");
      currNode=currNode.next;
    } 

  }
}

//--------------------------------------
public class Main
{

  public static void main(String[] args) {
    
    System.out.println("Hello world!");
    LinkedList list =new LinkedList();
    
    list=LinkedList.insert(list,1);
    list=LinkedList.insert(list,2);
    list=LinkedList.insert(list,3);
    list=LinkedList.insert(list,4);
    list=LinkedList.insert(list,5);
    list=LinkedList.insert(list,6);
    list=LinkedList.insert(list,7);

    LinkedList.printList(list);
  }
}