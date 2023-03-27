package mycollection;

public class SortedLinkedLIst {

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public Node head;
public Node tail;

public void addNode(int data){

    Node newNode = new Node(data);

    if(head == null){
        head = newNode;
        tail = newNode;
    }else{
        tail.next = newNode;
        tail = newNode;
    }
}

public void sortList(){
    Node current = head, index = null;  
    int temp;  
      
    if(head == null) {  
        return;  
    }  else {  
        while(current != null) {  
            //Node index will point to node next to current  
            index = current.next;  
              
            while(index != null) {  
                //If current node's data is greater than index's node data, swap the data between them  
                if(current.data > index.data) {  
                    temp = current.data;  
                    current.data = index.data;  
                    index.data = temp;  
                }  
                index = index.next;  
            }  
            current = current.next;  
        }      
    }  
}  

}
    
}
