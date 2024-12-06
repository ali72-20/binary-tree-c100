public class BinaryTree {
    private Node root;

    /**
     * The root is null when tree is empty
     */
    public BinaryTree(){
        root = null;
    }

    public void insert(int data){
         Node newNode = new Node(data);
         if(root == null){
             root = newNode;
             System.out.println("Inserted in root");
             return;
         }
         Node currentNode = root;
         while(true){
             if(newNode.data > currentNode.data){
                 if(currentNode.right == null){
                     currentNode.right = newNode;
                     System.out.println("Inserted in right " + currentNode.data);
                     break;
                 }
                 currentNode = currentNode.right;
             } else {
                 if(currentNode.left == null){
                     currentNode.left = newNode;
                     System.out.println("Inserted in left " + currentNode.data);
                     break;
                 }
                 currentNode = currentNode.left;
             }
        }
    }

}
