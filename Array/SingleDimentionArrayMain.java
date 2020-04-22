public class SingleDimentionArrayMain{
    
    public static void main(String[] args){
        SingleDimentionArray obj = new SingleDimentionArray(10);
        //obj.traverseArray();
        obj.insert(4, 14);
        obj.insert(5, 61);
        obj.insert(4, 14);
        obj.insert(11, 25);
        obj.search(61);
        obj.search(3);
        obj.traverseArray();
        obj.delete(4);
        obj.traverseArray();
        obj.delete(11);
    }
}