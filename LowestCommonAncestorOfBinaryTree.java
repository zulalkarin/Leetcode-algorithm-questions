/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    public  boolean findParents(TreeNode root, TreeNode node, Queue queue){
        
        if(root == null){
            return false;
        }
        
        if(root == node){
            queue.add(node);
            return true;
        }
        
        boolean left = findParents(root.left, node, queue); //check the node is in the left subtree
        boolean right = false;
        if (!left) { //check the node is in the right subtree
            right = findParents(root.right, node, queue);
        }

        if (left || right) {
           queue.add(root);
            
        }

        return left || right;
  

    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        TreeNode ans= null;
    
        Queue<TreeNode> queueP = new LinkedList<TreeNode>();
        Queue<TreeNode> queueQ = new LinkedList<TreeNode>();

        boolean boolP = findParents(root, p, queueP);
        boolean boolQ = findParents(root, q, queueQ);

        ArrayList<TreeNode> list = new ArrayList<>();

        while(!queueP.isEmpty()){
            list.add(queueP.poll());
        }

        while(!queueQ.isEmpty()){
            TreeNode commonRoot= queueQ.poll();
            if(list.contains(commonRoot)){
                ans =  commonRoot;
                break;
            }
                
            else
               System.out.println("There is no common root");

        }

        return ans;
        
    }
}