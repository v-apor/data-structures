class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }

    void insert(int newData){
        if(newData < data){
            if(left == null) left = new Node(newData);
            else left.insert(newData);
        }
        else{
            if(right == null) right = new Node(newData);
            else right.insert(newData);
        }
    }

    boolean contains(int newData){
        if(data == newData) return true;
        else if(newData < data){
            if(left == null) return false;
            else return left.contains(newData);
        }
        else{
            if(right == null) return false;
            else return right.contains(newData);
        }
    }

    void printInOrder(){
        if(left != null) left.printInOrder();
        System.out.println(data);
        if(right != null) right.printInOrder();
    }
}

class BST{
    public static void main(String[] args){
        Node treeObj = new Node(14);
        treeObj.insert(3);
        treeObj.insert(11);
        treeObj.insert(61);
        treeObj.insert(75);
        treeObj.printInOrder();
    }
}