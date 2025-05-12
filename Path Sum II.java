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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();

        if (root == null) return allPaths;

        pathsum(root, targetSum, 0, currentPath, allPaths);
        return allPaths;
    }

    private void pathsum(TreeNode root, int targetSum, int currentSum,
        List<Integer> currentPath, List<List<Integer>> allPaths) {
        if (root == null) return;

        currentPath.add(root.val);
        currentSum += root.val;

        if (root.left == null && root.right == null) {
            if (currentSum == targetSum) {
                allPaths.add(new ArrayList<>(currentPath));
            }
        } else {
            pathsum(root.left, targetSum, currentSum, currentPath, allPaths);
            pathsum(root.right, targetSum, currentSum, currentPath, allPaths);
        }

        // Backtrack
        currentPath.remove(currentPath.size() - 1);
    }
}
