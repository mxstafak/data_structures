
package data_structur;

/**
 *
 * @author ziade
 */
public class BinaryTree {
    int count = 0;

    Node root;

    public BinaryTree(Node root) {
        this.root = root;

    }

    public void addNode(Node newNode, Node rootexplore) {
   
        if (rootexplore == null) {
            return;
        }
             if (rootexplore.value==newNode.value){
            count++; 
            return;
        }
   
        if (newNode.value > rootexplore.value) {
            if (rootexplore.right == null) {
                rootexplore.right = newNode;
            } else {
                addNode(newNode, rootexplore.right);
            }
         
        }
        if (newNode.value < rootexplore.value) {
            if (rootexplore.left == null) {
                rootexplore.left = newNode;
            } else {
                addNode(newNode, rootexplore.left);
            }
           
        }
     
    }  
    public int getCount(){
        return count;
    }

//    public void Search(int value, Node rootexplore) {
//        if (rootexplore == null) {
//            System.out.println("Value is not found");
//            return;
//        }
//        if (rootexplore.value == value) {
//            System.out.println("Value is founded");
//            return;
//        }
//        if (value > rootexplore.value) {
//
//            Search(value, rootexplore.right);
//
//        }
//        if (value < rootexplore.value) {
//
//            Search(value, rootexplore.left);
//        }
//
//    }
}
