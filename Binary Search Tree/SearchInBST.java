public class SearchInBST {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public Node search(int value) {
        return searchHelper(root, value);
    }

    private Node searchHelper(Node node, int value) {
        if (node == null || node.value == value) {
            return node;
        }

        if (value < node.value) {
            return searchHelper(node.left, value);
        } else {
            return searchHelper(node.right, value);
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        SearchInBST in = new SearchInBST();
        in.insert(4);
        in.insert(2);
        in.insert(5);
        in.insert(3);
        in.insert(1);

        Node foundNode = in.search(2);
        if (foundNode != null) {
            System.out.println("Subtree rooted at " + foundNode.value + ":");
            in.preorder(foundNode);
        } else {
            System.out.println("Value not found in the BST.");
        }
    }
}
