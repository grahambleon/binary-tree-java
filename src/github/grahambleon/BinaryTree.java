package github.grahambleon;

import java.util.Stack;
import java.util.LinkedList;

public class BinaryTree {

    private Node root;

    BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public Node insert(Node node) {
        return insert(this.getRoot(), node);
    }

    public Node insert(Node parent, Node node) {
        if (parent == null) {
            return node;
        } else {
            if (node.getData() < parent.getData()) {
                parent.left = insert(parent.left, node);
            } else {
                parent.right = insert(parent.right, node);
            }
            return parent;
        }
    }

    public Node search(char data) {
        return this.search(this.getRoot(), data);
    }

    public Node search(Node parent, char data) {
        if (parent == null || parent.getData() == data) {
            return parent;
        } else {
            if (parent.getData() > data) {
                return search(parent.left, data);
            } else {
                return search(parent.right, data);
            }
        }
    }

    public void dfsTraverse() {
        Stack<Node> stack = new Stack<Node>();
        stack.push(this.getRoot());

        Node tmp;

        while (stack.size() != 0) {
            System.out.println(stack.peek().getData());
            tmp = stack.pop();

            if (tmp.right != null) {
                stack.push(tmp.right);
            }

            if (tmp.left != null) {
                stack.push(tmp.left);
            }
        }
    }

    public void bfsTraverse() {
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(this.getRoot());

        Node tmp;

        while(queue.size() != 0) {
            System.out.println(queue.peek().getData());
            tmp = queue.remove();

            if (tmp.left != null) {
                queue.add(tmp.left);
            }

            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }
    }
}
