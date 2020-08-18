package java_collection_framework.bai_tap.thao_tac_xoa_trong_binary_search_tree;

import java_collection_framework.bai_tap.thao_tac_xoa_trong_binary_search_tree.BinarySearchTree;

public class DelBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree test=new BinarySearchTree();
        test.insert(50);
        test.insert(50);
        test.insert(30);
        test.insert(20);
        test.insert(40);
        test.insert(70);
        test.insert(60);
        test.insert(80);
        System.out.println("Inorder traversal of the given tree");
        test.inorder();

        System.out.println("nDelete 20");
        test.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        test.inorder();

        System.out.println("nDelete 30");
        test.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree");
        test.inorder();

        System.out.println("nDelete 50");
        test.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree");
        test.inorder();
    }
}
