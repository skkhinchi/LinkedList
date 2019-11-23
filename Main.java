
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
  //Print All Nodes on SequeSequence 
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
  public static LinkedList deleteByKey(LinkedList list, int key) 
    { 
        Node currNode = list.head, prev = null; 
        if (currNode != null && currNode.data == key) { 
            list.head = currNode.next; 
            System.out.println(key + " found and deleted"); 
  
            return list; 
        } 
  
        while (currNode != null && currNode.data != key) { 
           
            prev = currNode; 
            currNode = currNode.next; 
        } 
  
         
        if (currNode != null) { 
            
            prev.next = currNode.next; 
  
            
            System.out.println(key + " found and deleted"); 
        } 
  
        if (currNode == null) { 
           
            System.out.println(key + " not found"); 
        } 
  
       
        return list; 
    }
} 






//--------------------------------------
public class Main
{

  public static void main (String[] args) {
    
    System.out.println("Hello world!");
    LinkedList list =new LinkedList();
    
    list=LinkedList.insert(list,1);
    list=LinkedList.insert(list,2);
    list=LinkedList.insert(list,3);
    list=LinkedList.insert(list,4);
    list=LinkedList.insert(list,5);
    list=LinkedList.insert(list,6);
    list=LinkedList.insert(list,7);
    LinkedList.deleteByKey(list, 4); 

    LinkedList.printList(list);
    System.out.println();
    LinkedList.deleteByKey(list, 10); 
  }
}
