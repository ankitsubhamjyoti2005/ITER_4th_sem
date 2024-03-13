////import java.util.ArrayList;
////import java.util.LinkedList;
////import java.util.List;
////
////class Graph {
////
////    private final int V;
////    private final List<List<Integer> > adj;
////
////    public Graph(int V)
////    {
////        this.V = V;
////        adj = new ArrayList<>(V);
////
////        for (int i = 0; i < V; i++)
////            adj.add(new LinkedList<>());
////    }
////
////    private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack)
////    {
////
////        if (recStack[i])
////            return true;
////
////        if (visited[i])
////            return false;
////
////        visited[i] = true;
////
////        recStack[i] = true;
////        List<Integer> children = adj.get(i);
////
////        for (Integer c : children)
////            if (isCyclicUtil(c, visited, recStack))
////                return true;
////
////        recStack[i] = false;
////
////        return false;
////    }
////
////    private void addEdge(int source, int dest)
////    {
////        adj.get(source).add(dest);
////    }
////
////    private boolean isCyclic()
////    {
////
////        boolean[] visited = new boolean[V];
////        boolean[] recStack = new boolean[V];
////
////
////        for (int i = 0; i < V; i++)
////            if (isCyclicUtil(i, visited, recStack))
////                return true;
////
////        return false;
////    }
////
////    // Driver code
////    public static void main(String[] args)
////    {
////        Graph graph = new Graph(4);
////        graph.addEdge(0, 1);
////        graph.addEdge(0, 2);
////        graph.addEdge(1, 2);
////        graph.addEdge(2, 0);
////        graph.addEdge(2, 3);
////        graph.addEdge(3, 3);
////
////
////        if (graph.isCyclic())
////            System.out.println("Graph contains cycle");
////        else
////            System.out.println("Graph doesn't " + "contain cycle");
////    }
////}
//
//
//import java.util.*;
//
//public class BINARYTREE {
//    static class Node {
//        int value;
//        Node left, right;
//
//        Node(int value) {
//            this.value = value;
//            left = null;
//            right = null;
//        }
//    }
//
//    public void insert(Node node, int value) {
//        if (value < node.value) {
//            if (node.left != null) {
//                insert(node.left, value);
//            } else {
//                node.left = new Node(value);
//            }
//        } else if (value > node.value) {
//            if (node.right != null) {
//                insert(node.right, value);
//            } else {
//                node.right = new Node(value);
//            }
//        }
//    }
//
//    public boolean detectCycle(Node node) {
//        return detectCycle(node, new HashSet<Node>());
//    }
//
//    private boolean detectCycle(Node node, HashSet<Node> visited) {
//        if (node == null) {
//            return false;
//        }
//
//        if (visited.contains(node)) {
//            return true;
//        }
//
//        visited.add(node);
//
//        boolean leftCycle = detectCycle(node.left, visited);
//        boolean rightCycle = detectCycle(node.right, visited);
//
//
//        if (leftCycle || rightCycle) {
//            return true;
//        }
//
//        return false;
//    }
//
//    public void traverseInOrder(Node node) {
//        if (node != null) {
//            traverseInOrder(node.left);
//            System.out.print(" " + node.value);
//            traverseInOrder(node.right);
//        }
//    }
//
//    public static void main(String args[]) {
//        TreeWithCycleDetection tree = new TreeWithCycleDetection();
//        Node root = new Node(5);
//        System.out.println("Binary Tree Example");
//        System.out.println("Building tree with root value " + root.value);
//        tree.insert(root, 2);
//        tree.insert(root, 4);
//        tree.insert(root, 8);
//        tree.insert(root, 6);
//        tree.insert(root, 7);
//        tree.insert(root, 3);
//        tree.insert(root, 9);
//
//        System.out.println("Traversing tree in order");
//        tree.traverseInOrder(root);
//
//        System.out.println("\nCycle detection result: " + tree.detectCycle(root));
//    }
//}
