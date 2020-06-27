public class LinkedList{
    Node head;
    Node tail;

    private class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
    }
}
    //addFirst
    public void addFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }

    //addLast
    public void addLast(int value) {
        var node = new Node(value);
        if(head == null){
            head = tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }
    //deleteFirst
    public void deleteFirst(){
        if(head == null){
            System.out.println("List Already empty");
        }
        else{
            Node tmp = head;
            head = tmp.next;
            tmp = null;
        }
    }
    //deleteLast
    public void deleteLast(){
        if(head == null){
            System.out.println("List Already empty");
        }
        else if(head == tail){
            head = tail = null;
        }
        else{
            Node tmp = head;
            while(tmp.next.next != null){
                tmp = tmp.next;
            }
            tail = tmp;
            tail.next = null;
        }
    }
    //contains
    public boolean contains(int value){
        Node tmp = head;
        while(tmp != null){
            if(tmp.value == value){
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    //size
    public int size(){
        Node tmp = head;
        int size = 0;
        while(tmp != null){
            size++;
            tmp = tmp.next;
        }
        return size;
    }

    //indexOf
    public int indexOf(int value){
        Node tmp = head;
        for(int i=0; i<size(); i++){
            if(tmp.value == value){
                return i;
            }
            tmp = tmp.next;
        }
        return -1;
    }

    //showElements
    public void showElements(){
        Node tmp = head;
        if(head == null){
            System.out.println("Empty");
            return;
        }
        while(tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}