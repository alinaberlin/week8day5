package week9_miniproject;

public class Organization {
    class Node{
        Employeee value;
        Node left;
        Node right;

        public Node(Employeee value) {
            this.value = value;
            left  = null;
            right = null;
        }
    }

}
