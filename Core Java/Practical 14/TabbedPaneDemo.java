import javax.swing.*;

public class TabbedPaneDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("TabbedPane Example");
        JTabbedPane tp = new JTabbedPane();

        tp.add("Tab 1", new JLabel("Content for Tab 1"));
        tp.add("Tab 2", new JLabel("Content for Tab 2"));

        f.add(tp);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
