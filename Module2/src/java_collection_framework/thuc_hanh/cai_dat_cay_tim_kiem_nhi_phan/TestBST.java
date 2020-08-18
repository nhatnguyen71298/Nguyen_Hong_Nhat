package java_collection_framework.thuc_hanh.cai_dat_cay_tim_kiem_nhi_phan;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(70);
        tree.insert(40);
        tree.insert(10);
        tree.insert(50);
        tree.insert(90);
        tree.insert(30);
        tree.insert(20);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
