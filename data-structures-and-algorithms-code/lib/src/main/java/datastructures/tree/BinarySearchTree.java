package datastructures.tree;

public class BinarySearchTree extends BinaryTree{


    public void add(Node value){
        if (root == null) {
            root = value;
        } else {
            boolean stop = true;
            Node currentNode = root;
            while (stop){
                if (value.value > currentNode.value){
                    if(currentNode.rightNode != null){
                        currentNode = currentNode.getRightNode();
                    } else {
                        currentNode.setRightNode(value);
                        stop = false;
                    }
                }
                if (value.value < currentNode.value){
                    if (currentNode.leftNode != null){
                        currentNode = currentNode.getLeftNode();
                    } else {
                        currentNode.setLeftNode(value);
                        stop = false;
                    }
                }
            }
        }
    }

    public boolean contains(int value){

        if (root.value == value){
            return true;
        }

        Node currentNode = root;
        while(true){

            if (currentNode.value == value){
                return true;
            }
            if (value > currentNode.value){
                if (currentNode.getRightNode() != null){
                    currentNode = currentNode.getRightNode();
                } else {
                    return false;
                }
            }
            if (value < currentNode.value){
                if (currentNode.getLeftNode() != null){
                    currentNode = currentNode.getLeftNode();
                } else {
                    return false;
                }
            }
        }
    }
}
