package week9_miniproject;

import java.util.Objects;

public class Organization {
    class Node {
        Employeee value;
        Node left;
        Node right;

        public Node(Employeee value) {
            this.value = value;
            left = null;
            right = null;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

    private Node manager;

    public void add(Employeee employee) {
        if (manager == null) {
            manager = new Node(employee);
        } else {
            Node current = manager;
            while(current != null) {
                if (current.left == null) {
                    current.left = new Node(employee);
                    break;
                } else if (current.right == null) {
                    current.right = new Node(employee);
                    break;
                } else {
                    current = current.left;
                }
            }
        }
    }
    private Node findLowestCommonManager(Node root, Node node1, Node node2) {
        if (root == null || root == node1 || root == node2) return root;
        // Recursively check left side and right side
        Node left = findLowestCommonManager(root.left, node1, node2);
        Node right = findLowestCommonManager(root.left, node1, node2);
        // If both left and right is available, then we have found it. Return the current root.
        if (left != null && right != null) return root;

            // Otherwise let parent know that what we have currently, because the LCA is higher up the tree
        else {
            if(left!=null) return left;
            else return right;
        }
    }

}
