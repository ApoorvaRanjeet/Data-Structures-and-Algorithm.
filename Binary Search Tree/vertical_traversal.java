import java.util.*;

public class vertical_traversal {
    public class TreeNode {
             int val;
            TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }
         public List<List<Integer>> verticalTraversal(TreeNode root) {
        // TreeMap to store nodes according to their horizontal distance (x) and level (y)
        Map<Integer, Map<Integer, List<Integer>>> nodes = new TreeMap<>();
        // Queue for level order traversal (BFS), storing nodes with their x and y coordinates
        Queue<Pair<TreeNode, Pair<Integer, Integer>>> todo = new LinkedList<>();
        
        // Start with the root node at (x, y) = (0, 0)
        todo.add(new Pair<>(root, new Pair<>(0, 0)));
        
        // Perform BFS
        while (!todo.isEmpty()) {
            Pair<TreeNode, Pair<Integer, Integer>> current = todo.poll();
            TreeNode node = current.getKey();
            int x = current.getValue().getKey();
            int y = current.getValue().getValue();
            
            // Check if there is a TreeMap for the current x coordinate, if not, create one
            nodes.computeIfAbsent(x, k -> new TreeMap<>())
                 .computeIfAbsent(y, k -> new ArrayList<>())
                 .add(node.val);

            // Add left and right children with updated x and y coordinates
            if (node.left != null) {
                todo.add(new Pair<>(node.left, new Pair<>(x - 1, y + 1)));
            }
            if (node.right != null) {
                todo.add(new Pair<>(node.right, new Pair<>(x + 1, y + 1)));
            }
        }

        // Prepare the output
        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, Map<Integer, List<Integer>>> entry : nodes.entrySet()) {
            List<Integer> col = new ArrayList<>();
            for (Map.Entry<Integer, List<Integer>> levelEntry : entry.getValue().entrySet()) {
                List<Integer> levelNodes = levelEntry.getValue();
                Collections.sort(levelNodes); // Sort the nodes at the same position
                col.addAll(levelNodes);
            }
            ans.add(col);
        }
        
        return ans;
    }
}
