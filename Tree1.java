import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree1 {
    JFrame f;

    Tree1() {
        f = new JFrame();

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("This PC");
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("3D Objects");
         DefaultMutableTreeNode m= new DefaultMutableTreeNode("");
 DefaultMutableTreeNode p= new DefaultMutableTreeNode("desktop");
        DefaultMutableTreeNode N= new DefaultMutableTreeNode("documents");
        
 DefaultMutableTreeNode n= new DefaultMutableTreeNode("dowmloads");
  root.add(c);
       
 root.add(m); 
 root.add(p);
 root.add(N);       
 root.add(n);

      

        JTree t = new JTree(root);
        f.add(t);

        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new Tree1();
    }
}
