/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> res = new LinkedList<Double>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            double sum = 0;
            for(int i = 0; i<size;i++)
            {
                TreeNode temp =  q.remove();
                 sum += temp.val;
                if(temp!=null)
                {
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                } 
                
            }
            Double average =sum/Double.valueOf(size);
            res.add(average);
            System.out.println(res);
        }
        return res;    
    }
}