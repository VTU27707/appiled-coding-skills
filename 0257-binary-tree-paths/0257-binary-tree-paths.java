class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            buildPaths(root, new StringBuilder(), result);
        }
        return result;
    }

    private void buildPaths(TreeNode node, StringBuilder currentPath, List<String> result) {
        int lengthBefore = currentPath.length();

        if (lengthBefore > 0) {
            currentPath.append("->");
        }
        currentPath.append(node.val);
        if (node.left == null && node.right == null) {
            result.add(currentPath.toString());
        } else {
            if (node.left != null) {
                buildPaths(node.left, currentPath, result);
            }
            if (node.right != null) {
                buildPaths(node.right, currentPath, result);
            }
        }
        currentPath.setLength(lengthBefore);
    }
}