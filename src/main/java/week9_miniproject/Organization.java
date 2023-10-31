package week9_miniproject;

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
}
