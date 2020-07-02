package ru.Umarov.dz32;

public class task1 {

    public static int getLeafOfTree(TreeNode node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafOfTree(node.left) + getLeafOfTree(node.right);
    }

    public static void main(String[] args) {
        TreeNode rootNode = createTree();
        System.out.println("Number of leaf nodes in binary tree :" + getLeafOfTree(rootNode));
    }

    public static TreeNode createTree() {
        TreeNode rootNode = new TreeNode(50);
        TreeNode node20 = new TreeNode(20);
        TreeNode node60 = new TreeNode(60);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node55 = new TreeNode(55);
        TreeNode node70 = new TreeNode(70);
        TreeNode node5 = new TreeNode(5);
        TreeNode node75 = new TreeNode(75);

        rootNode.left = node20;
        rootNode.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node55;
        node60.right = node70;

        node5.left = node5;
        node75.right = node75;
        return rootNode;
    }
}

