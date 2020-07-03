import java.util.HashMap;
import java.util.ArrayList;

public class UDGraph{
    int size;
    HashMap<Integer, ArrayList<Integer>> adjacentList;

    UDGraph(){
        size = 0;
        adjacentList = new HashMap<Integer, ArrayList<Integer>>();
    }

    void addVertex(int node){
        size++;
        adjacentList.put(node, new ArrayList<Integer>());
    }

    void addEdge(int node1, int node2){
        adjacentList.get(node1).add(node2);
        adjacentList.get(node2).add(node1);
    }

    void removeVertex(int node){
        adjacentList.remove(node);
        size--;
    }

    // Note to remove element by value from arraylist, we need to use new Datatype(value),
    // otherwise it treats value as index
    void removeEdge(int node1, int node2){
        adjacentList.get(node1).remove(new Integer(node2));
        adjacentList.get(node2).remove(new Integer(node1));
    }

    void showGraph(){
        System.out.println(adjacentList);
    }
}