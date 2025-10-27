package tree;

public class HuffmanBinaryTree<T> {

    HuffmanNode<T> root;

    public HuffmanBinaryTree(HuffmanNode<T> root) {
        this.root = root;
    }

    public HuffmanBinaryTree() {
        this.root = new HuffmanNode<>();
    }



    // those print methods are stolen and not done by me
    public void printTree() {
        printTree(root, "", true);
    }
    private void printTree(HuffmanNode<T> node, String prefix, boolean isTail) {

        if (node == null)
            return;

        System.out.println(prefix + (isTail ? "└── " : "├── ") + nodeToString(node));

        if (node.left != null || node.right != null) {
            if (node.left != null)
                printTree(node.left, prefix + (isTail ? "    " : "│   "), false);
            if (node.right != null)
                printTree(node.right, prefix + (isTail ? "    " : "│   "), true);
        }
    }

    private String nodeToString(HuffmanNode<T> node) {
        if (node.item != null) {
            return node.item + " (" + node.value + ")";
        } else {
            return "(" + node.value + ")";
        }
    }

}


