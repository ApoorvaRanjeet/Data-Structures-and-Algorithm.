public class preorderTraversalTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    class BinaryTree {
        int index = -1;

        public Node buildTree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        System.out.println(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, 5, -1, -1, -1, 6, 8, -1, -1, 9, -1, -1};
        preorderTraversalTree outer = new preorderTraversalTree();
        BinaryTree inner = outer.new BinaryTree();
        Node tree = inner.buildTree(nodes);
        preorder(tree);
    }
}

