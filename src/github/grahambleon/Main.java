package github.grahambleon;

public class Main {

    public static void main(String[] args) {
        Node aNode = new Node('A');
        Node cNode = new Node('C');
        Node mNode = new Node('M');
        Node nNode = new Node('N');
        Node pNode = new Node('P');
        Node zNode = new Node('Z');
        BinaryTree tree = new BinaryTree(mNode);

        tree.insert(tree.getRoot(), cNode);
        tree.insert(tree.getRoot(), pNode);
        tree.insert(tree.getRoot(), nNode);

        tree.insert(tree.getRoot(), aNode);
        tree.insert(tree.getRoot(), zNode);

//    tree.dfsTraverse();

        System.out.println("=======");

        tree.bfsTraverse();
    }
}