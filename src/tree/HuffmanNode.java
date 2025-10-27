package tree;

public class HuffmanNode<T> {

    public T item;
    public double value;

    public HuffmanNode<T> left, right;

    public HuffmanNode(T item, double value, HuffmanNode<T> left, HuffmanNode<T> right) {
        this.item = item;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public HuffmanNode(T item, double value) {
        this.item = item;
        this.value = value;
        left = null;
        right = null;
    }

    public HuffmanNode() {
        left = null;
        right = null;
    }

}
