package java_collection_framework.bai_tap.thao_tac_xoa_trong_binary_search_tree;

import java.util.TreeMap;

public class BinarySearchTree {

    /* Lớp đại diện cho node bao gồm node con trái và phải cùng với giá trị của key */
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root của cây
    Node root;

    // Hàm dựng
    public BinarySearchTree() {
        root = null;
    }

    // Gọi phương thức deleteRec
    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    /* Hàm đệ qui để xóa phần tử khỏi mảng */
    Node deleteRec(Node root, int key) {
        /* trường hợp gốc : nếu node root null */
        if (root == null) return root;

        /* ngược lại chúng ta sẽ duyệt dọc cây  */
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);

            // nếu key có cùng giá trị với node key thì chính là node cần xóa
        else {
            // node không có hoặc chỉ có 1 node con
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node có 2 node con.
            root.key = minValue(root.right);

            // Xóa phần từ nhỏ nhất bên phải
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Gọi phương thức insert
    public void insert(int key) {
        root = insertRec(root, key);
    }

    /* Hàm đệ qui thực hiện việc chèn phần từ vào cây */
    Node insertRec(Node root, int key) {

        /* nếu cây rỗng trả về node mới */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* ngược lại sẽ thực hiện duyệt dọc cây */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* trả về cây nhị phân đã được thêm phần tử mới */
        return root;
    }

    // Phương thức gọi hàm sắp xếp
    void inorder() {
        inorderRec(root);
    }

    // hàm thực hiện việc sắp xếp và in ra cây nhị phân đã được sắp xếp
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void printPostorder(Node node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    public void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    /* Given a binary tree, print its nodes in preorder*/
    public void printPreorder(Node node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left sutree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }
}
