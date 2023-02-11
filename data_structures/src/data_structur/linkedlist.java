
package data_structur;

/**
 *
 * @author ziade
 * @param <T>
 */
public class linkedlist<T> {
 public class Node <T>{
 Node next;
 int data;
 
public Node(int data){
this.data= data;
}
 }   
    
    Node head;
    int size;
    int index;

    public linkedlist() {
    }
    

    public linkedlist(int size) {
        this.size = size;
    }
    
    public void add(int data){
        if (head == null){
        head = new Node(data);
        }
        Node current = head;
        while(current.next != null){
        current = current.next;
        }
        current.next = new Node(data);
    } 
    
    public void addFirst(int data){
        Node newHead =new Node(data);
        newHead.next=head;
        head = newHead;
    }
    
    public void deleteWithValue(int data){
        if (head == null){ 
            return;}
        if (head.data == data){
            head= head.next;
            return;
        }
        Node current = head;
        while (current.next !=null){
        if(current.next.data == data ){
            current.next= current.next.next;
            return;
            }
        current = current.next;
        }
    }
    
    public int size() 
    { 
        Node temp = head;  
        while (temp != null) 
        { 
            size++; 
            temp = temp.next; 
        } 
        return size; 
    } 
    
  public int get(int index) 
    { 
        Node current = head; 
        int count = 0; 
        while (current != null) 
        { 
            if (count == index) 
                return current.data; 
            count++; 
            current = current.next; 
        } 
  
        

        return 0; 
    } 

}
