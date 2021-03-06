package problem;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/* *
 * Base code provided by challenge @HackerRank. The challenge itself consists in editing the function decode below.
 * */
public class TreeHuffmanDecodingResult {

    // input is an array of frequencies, indexed by character code
    public static TreeHuffmanNode buildTree(int[] charFreqs) {
        PriorityQueue<TreeHuffmanNode> trees = new PriorityQueue<TreeHuffmanNode>();
        // initially, we have a forest of leaves
        // one for each non-empty character
        for (int i = 0; i < charFreqs.length; i++)
            if (charFreqs[i] > 0)
                trees.offer(new HuffmanLeaf(charFreqs[i], (char) i));

        assert trees.size() > 0;

        // loop until there is only one tree left
        while (trees.size() > 1) {
            // two trees with least frequency
            TreeHuffmanNode a = trees.poll();
            TreeHuffmanNode b = trees.poll();

            // put into new node and re-insert into queue
            trees.offer(new HuffmanTreeHuffmanNode(a, b));
        }

        return trees.poll();
    }

    public static Map<Character, String> mapA = new HashMap<Character, String>();

    public static void printCodes(TreeHuffmanNode tree, StringBuffer prefix) {
        assert tree != null;

        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf) tree;

            // print out character, frequency, and code for this leaf (which is just the prefix)
            //System.out.println(leaf.data + "\t" + leaf.frequency + "\t" + prefix);
            mapA.put(leaf.data, prefix.toString());

        } else if (tree instanceof HuffmanTreeHuffmanNode) {
            HuffmanTreeHuffmanNode node = (HuffmanTreeHuffmanNode) tree;

            // traverse left
            prefix.append('0');
            printCodes(node.left, prefix);
            prefix.deleteCharAt(prefix.length() - 1);

            // traverse right
            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String test = input.next();

        // we will assume that all our characters will have
        // code less than 256, for simplicity
        int[] charFreqs = new int[256];

        // read each character and record the frequencies
        for (char c : test.toCharArray())
            charFreqs[c]++;

        // build tree
        TreeHuffmanNode tree = buildTree(charFreqs);

        // print out results
        printCodes(tree, new StringBuffer());
        StringBuffer s = new StringBuffer();

        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            s.append(mapA.get(c));
        }

        //System.out.println(s);
        Decoding d = new Decoding();
        d.decode(s.toString(), tree);

    }
}

class Decoding {
    void decode(String s, TreeHuffmanNode root) {
        TreeHuffmanNode treeHuffmanNode = root;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0'){
                treeHuffmanNode = treeHuffmanNode.left;
            } else{
                treeHuffmanNode = treeHuffmanNode.right;
            }
            if (treeHuffmanNode.right == null && treeHuffmanNode.left == null) {
                System.out.print(treeHuffmanNode.data);
                treeHuffmanNode = root;
            }
        }
    }
}

class TreeHuffmanNode implements Comparable<TreeHuffmanNode> {
    public int frequency; // the frequency of this tree
    public char data;
    public TreeHuffmanNode left, right;

    public TreeHuffmanNode(int freq) {
        frequency = freq;
    }

    // compares on the frequency
    public int compareTo(TreeHuffmanNode tree) {
        return frequency - tree.frequency;
    }
}

class HuffmanLeaf extends TreeHuffmanNode {
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
}

class HuffmanTreeHuffmanNode extends TreeHuffmanNode {
    public HuffmanTreeHuffmanNode(TreeHuffmanNode l, TreeHuffmanNode r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }
}