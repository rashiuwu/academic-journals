import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

class TreeExample extends JFrame {
    JTextField tf;

    TreeExample() {
        setTitle("Tree Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Subjects");
        DefaultMutableTreeNode it = new DefaultMutableTreeNode("IT");
        DefaultMutableTreeNode cs = new DefaultMutableTreeNode("CS");
        root.add(it);
        root.add(cs);

        it.add(new DefaultMutableTreeNode("Java"));
        it.add(new DefaultMutableTreeNode("Python"));
        cs.add(new DefaultMutableTreeNode("C"));
        cs.add(new DefaultMutableTreeNode("C++"));

        JTree tree = new JTree(root);
        JScrollPane sp = new JScrollPane(tree);
        add(sp, "Center");

        tf = new JTextField();
        add(tf, "South");

        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                TreePath path = e.getPath();
                tf.setText(path.toString());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TreeExample();
    }
}
