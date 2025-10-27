import tree.HuffmanBinaryTree;
import tree.HuffmanNode;

import java.util.ArrayList;
import java.util.List;

public abstract class HuffmanEncoding {

    public static <T> HuffmanBinaryTree<T> createHuffmanTree(T[] items, double[] values) {

        List<HuffmanNode<T>> nodeList = new ArrayList<>();
        for (int i = 0; i < items.length; i++)
            nodeList.add(new HuffmanNode<>(items[i], values[i]));

        while (nodeList.size() > 1) {

            HuffmanNode<T> n0 = extractSmallestNode(nodeList);
            HuffmanNode<T> n1 = extractSmallestNode(nodeList);

            HuffmanNode<T> parentN = new HuffmanNode<>(null, n0.value + n1.value, n0, n1);
            nodeList.add(parentN);
        }

        return new HuffmanBinaryTree<>(nodeList.getFirst());
    }

    private static <T> HuffmanNode<T> extractSmallestNode(List<HuffmanNode<T>> nodeList) {

        double currentSmallestValue = Integer.MAX_VALUE;
        int currentSmallestNodeIndex = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            if (nodeList.get(i).value < currentSmallestValue) {
                currentSmallestValue = nodeList.get(i).value;
                currentSmallestNodeIndex = i;
            }
        }

        HuffmanNode<T> smallestNode = nodeList.get(currentSmallestNodeIndex);
        nodeList.remove(currentSmallestNodeIndex);
        return smallestNode;
    }

}
