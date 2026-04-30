class SearchBST {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    public static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(10);
        System.out.println(search(root, 4)); 
    }
}