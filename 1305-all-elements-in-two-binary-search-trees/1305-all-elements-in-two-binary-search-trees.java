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
    public static void addElements(TreeNode root, ArrayList<Integer>list)
    {
        if(root==null) return;
        list.add(root.val);
        addElements(root.left,list);
        addElements(root.right,list);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list=new ArrayList<>();
        addElements(root1,list);
        addElements(root2,list);
        Collections.sort(list);
        return list;
    }
}