package homework10;

public class Tree { 
    static class Node {    
    int value; 
        Node left, right; 
          
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 
       
    public void insert(Node node, int value) {
        if (value < node.value){ 
        	if (node.left != null){
        		insert(node.left, value); 
        	} else { System.out.println(" Inserted " + value + " to left of " + node.value);
        	node.left = new Node(value);
        	} } else if (value > node.value) {
          if (node.right != null) {
            insert(node.right, value);
          } else {
            System.out.println("  Inserted " + value + " to right of " + node.value);
            node.right = new Node(value);
          }
        }
      }
     public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }
     
     public void traversePreOrder(Node node) {
    	    if (node != null) {
    	        System.out.print(" " + node.value);
    	        traversePreOrder(node.left);
    	        traversePreOrder(node.right);
    	    }
    	}
     
     public void traversePostOrder(Node node) {
    	    if (node != null) {
    	        traversePostOrder(node.left);
    	        traversePostOrder(node.right);
    	        System.out.print(" " + node.value);
    	    }
    	}
     
     public int numberOfNode(Node node){
		 int count = 0;
		 if(node != null){
			 count = 1;
			 count += numberOfNode(node.left);
			 count += numberOfNode(node.right);
		 }
    	 return count; 
     }
     
     public int numberOfLeaf(Node node){
    	 int count = 0;
    	 if(node != null){
    		 if ((node.left == null) && (node.right == null)) {
				count = 1;
			}else{
				count = count + numberOfLeaf(node.left) + 
						numberOfLeaf(node.right);
			}
    	 }
    	 return count;
     }
     
     public void minvalue(Node node) {
         Node current = node;
         /* loop down to find the leftmost leaf */
         while (current.left != null) {
             current = current.left;
         }
            System.out.println("\nEn küçük deðer: "+current.value);
     }
     
     public int maxDepth(Node node){
         if (node == null)
             return -1;
         else
         {
             
             int lDepth = maxDepth(node.left);
             int rDepth = maxDepth(node.right);

             if (lDepth > rDepth){
                 return (lDepth + 1);
             } else
                 return (rDepth + 1);
         }
     }
     
     public static int findHeight(Node temp){
         //Check whether tree is empty
         if(temp == null) {
              System.out.println("\nNode bulunmamaktadýr.");
             return 0;
         }
         else {
             int leftHeight = 0, rightHeight = 0;

             //Calculate the height of left subtree
             if(temp.left != null)
                 leftHeight = findHeight(temp.left);

             //Calculate the height of right subtree
             if(temp.right != null)
                 rightHeight = findHeight(temp.right);

             //Compare height of left subtree and right subtree
             //and store maximum of two in variable max
             int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;

             //Calculate the total height of tree by adding height of root
             return (max + 1 );
         }
         
     }
     
     
     public static void main(String args[]){ 
         Tree tree = new Tree();
         Node root = new Node(5);
         System.out.println("Binary Tree Example");
         System.out.println("Building tree with root value " + root.value);
         tree.insert(root, 2);
         tree.insert(root, 4);
         tree.insert(root, 8);
         tree.insert(root, 6);
         tree.insert(root, 7);
         tree.insert(root, 3);
         tree.insert(root, 9);
         
         System.out.println("\nDüðüm (Node) sayýsý: " + tree.numberOfNode(root));      
         System.out.println("\nYaprak (Leaf) sayýsý: " + tree.numberOfLeaf(root));
         System.out.println("\nÇocuk (Child) sayýsý: " + (tree.numberOfNode(root)-1));
         tree.minvalue(root);
         System.out.println("\nDerinlik (depth): " + tree.maxDepth(root));
         System.out.println("\nÝstenilen deðer yüksekliði: " + (findHeight(root)-1));
         
         
         System.out.println("\nTraversing tree in order");
         tree.traverseInOrder(root);
         
         System.out.println("\nTraversing tree post order");
         tree.traversePostOrder(root);
         
         System.out.println("\nTraversing tree pre order");
         tree.traversePreOrder(root);
     
     }
}
