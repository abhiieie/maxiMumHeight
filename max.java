public class maxiHeight {
public static void main(String[] args) {
      
} 

  static int findHeight (Node root) {
      int height = -1 ; 
     if (root == null) {
        return height ; 
     }
  height = max(findHeight(root.left),findHeight( root.right )) + 1 ; 

      return height ; 
  }
  static int max (int i , int j) {
    if (i > j) {
        return i ;
    }
    return j ; 
  }
}


class Node {
    int val ; 
    Node left ; 
    Node right ; 
}
