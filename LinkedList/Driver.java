public class Driver{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        //System.out.println(list.head);
        list.insert(14, list);
        list.insert(61, list);
        list.insert(75, list);
        list.showList(list);
        list.delete(list);
        list.delete(list);
        list.showList(list);
    }
}