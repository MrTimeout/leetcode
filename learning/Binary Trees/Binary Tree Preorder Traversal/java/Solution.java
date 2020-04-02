
import java.util.List;
import java.util.Random;

public class Solution {

  public static void main(final String... args) {
    Soluti0n.preorderTraversal(TreeNode.builder().value(2).left(null).right(null).build());
  }

  private static class Soluti0n {

    public static List<Integer> preorderTraversal(TreeNode root) {
      return null;
    }

  }

  private static class TreeNode {

    private int value;

    private TreeNode left;

    private TreeNode right;

    private TreeNode(Builder builder) {
      this.value = builder.value;
      this.left = builder.left;
      this.right = builder.right;
    }

    public int getValue() {
      return this.value;
    }

    public TreeNode getLeft() {
      return this.left;
    }

    public TreeNode getRight() {
      return this.right;
    }

    public static Builder builder() {
      return new Builder();
    }

    private static class Builder {

      private int value;

      private TreeNode left;

      private TreeNode right;

      private Builder() {

      }

      public Builder value(int value) {
        this.value = value;
        return this;
      }

      public Builder left(TreeNode treeNode) {
        this.left = treeNode;
        return this;
      }

      public Builder right(TreeNode treeNode) {
        this.right = treeNode;
        return this;
      }

      public TreeNode build() {
        return new TreeNode(this);
      }

    }

  }

  private static class TreeNodeFactory {

    private static final Random random = new Random();

    public static TreeNode getTreeNode(int amountOfNodes) {
      
    }

  }

}