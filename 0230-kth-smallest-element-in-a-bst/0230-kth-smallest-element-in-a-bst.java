class Solution {
    int count = 0;
    int ans = -1;
    public int kthSmallest(TreeNode root, int k) {
        this.count = k;
        inorder(root);
        return ans;
    }
    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        count--;
        if (count == 0) {
            ans = root.val;
            return;
        }
        inorder(root.right);
    }
}