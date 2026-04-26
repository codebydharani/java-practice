class DiameterTree {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    static int diameter = 0;
    public static int height(Node root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }
    public static int getDiameter(Node root) {
        height(root);
        return diameter;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println("Diameter: " + getDiameter(root));
    }
}