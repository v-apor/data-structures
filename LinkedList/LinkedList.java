public class LinkedList{
    Node head;

    public void insert(int value, LinkedList list){
        Node newNode = new Node(value);
        Node current = list.head;
        if(list.head == null){
            list.head = newNode;
        }
        else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode; 
        }
    }

    public void delete(LinkedList list){
        Node current = list.head;
        if(current == null){
            System.out.println("No items in the LL");
            return;
        }
        if(current.next == null){
            list.head = null;
        }
        else{
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
        
    }

    public void showList(LinkedList list){
        Node current = list.head;
        if(current == null){
            System.out.println("No Element in LL");
        }
        else{
            while(current.next != null){
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println(current.value);
        }
    }
}

class Node{
    Node next;
    int value;
    Node(int value){
        System.out.println("Node created w/ value " + value);
        this.value = value;
    }
}
