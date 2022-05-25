package problem;

import java.util.Scanner;

import static problem.TreePreorderTraversalResult.insert;

public class BinarySearchTreeLowestCommonAncestorResult {

    public static Node lca(Node root, int v1, int v2) {
        if(root == null || root.data == v1 || root.data == v2) {
            return root;
        }
        if (root.data > v1 && root.data > v2){
            return lca(root.left, v1, v2);
        } else if(root.data < v1 && root.data < v2){
            return lca(root.right, v1, v2);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }
}
