import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree {
    JFrame f;

    Tree() {
        f = new JFrame();

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("cm");
        DefaultMutableTreeNode e = new DefaultMutableTreeNode("ej");
        root.add(c);
        root.add(e);
        DefaultMutableTreeNode d = new DefaultMutableTreeNode("firstyear");
        c.add(d);

        JTree t = new JTree(root);
        f.add(new JScrollPane(t));

        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new Tree();
    }
}
