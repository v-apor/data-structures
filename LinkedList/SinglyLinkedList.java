public class SinglyLinkedList{
    Node head;

    static class Node{
        int value;
        Node next;
        
        public Node(int data){
            this.value = data;
        }
    }

    public static SinglyLinkedList insert(SinglyLinkedList list, int data){
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(SinglyLinkedList list){
        Node curNode = list.head;
        while(curNode != null){
            System.out.println(curNode.value + " ");
            curNode = curNode.next;
        }
    }

    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(list, 14);
        list.insert(list, 61);
        printList(list);
    }
}
