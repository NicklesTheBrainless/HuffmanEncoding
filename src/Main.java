void main() {

    // example inputs
    String[] items = {"A", "B", "C", "D", "E", "F", "G"};
    double[] values = {0.25, 0.21, 0.18, 0.14, 0.09, 0.07, 0.06};

    var tree = HuffmanEncoding.createHuffmanTree(items, values);
    tree.printTree();
}
