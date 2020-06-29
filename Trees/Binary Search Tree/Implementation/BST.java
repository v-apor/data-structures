public class BST{
    Node root;

    BST(){
        root = null;
    }

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    // insert
    public void insert(int value){
        if(root == null){
            Node n = new Node(value);
            root = n;
        }
        else{
            Node tmp = root;
            while(true){
                if(value >= tmp.value){
                    if(tmp.right == null){
                        tmp.right = new Node(value);
                        break;
                    }
                    else{
                        tmp = tmp.right;
                    }
                }
                else{
                    if(tmp.left == null){
                        tmp.left = new Node(value);
                        break;
                    }
                    else{
                        tmp = tmp.left;
                    }
                }
            }
            tmp = null;
        }
    }

    // find/lookup
    public boolean contains(int value){
        if(root == null){
            return false;
        }
        else{
            Node tmp = root;
            while(tmp != null){
                if(tmp.value == value){
                    return true;
                }
                if(value >= tmp.value){
                    tmp = tmp.right;
                }
                else{
                    tmp = tmp.left;
                }
            }
            return false;
        }
    }

}