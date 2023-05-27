/**
 * Write a function that takes in a sorted array (ascending order) of unique integers and constructs a Binary Search Tree with Minimum Height.
 *
 * Challenge definition taken from Cracking the coding interview book.
 *
 * For this problem, we'll assume the following Tree Node:
 *
 * public class Node {
 *   public int value;
 *   public Node left;
 *   public Node right;
 *
 *   public Node(int value) {
 *     this.value = value;
 *   }
 * }
 *
 * By definition, Binary Search Tree means that all values smaller than the root value should be on the left side while all values bigger/bigger or equal than it
 * should be on the right. To guarantee that the tree will have minimum height, the amount of elements from the left side should resemble the right side
 * as close as possible.
 *
 * Achieving a solution that satisfied all the requirements above requires us to get the middle element of the passed array as a root node, then split it to two
 * halves:
 *
 * - the left child of the root node should be in the middle of the left half (startIndex, midIndex - 1)
 * - the right child should be in the middle of the right half (midIndex + 1, endIndex)
 *
 * So we should call the same method (recursively) but with the correct sub-arrays for both left and right, to proceed downwards until
 * there are no mo elements and null is returned. As long as there are elements, each call should build a sub-tree that would be linked to the parent as we
 * propagate upwards.
 **/
public class Main {

  public static Node build(int[] values) {
    if (values.length == 0) {
      return null;
    }

    return build(values, 0, values.length - 1);
  }

  private static Node build(int[] values, int start, int end) {
    if (start > end) {
      return null;
    }

    int mid = (start + end) / 2;
    Node root = new Node(values[mid]);

    root.left = build(values, start, mid - 1);
    root.right = build(values, mid + 1, end);

    return root;
  }
}
