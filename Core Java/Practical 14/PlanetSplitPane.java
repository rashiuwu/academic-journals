import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class PlanetSplitPane extends JFrame {
    JLabel imageLabel;
    public PlanetSplitPane() {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
        JList<String> planetList = new JList<>(planets);
        JScrollPane listScroll = new JScrollPane(planetList);
        imageLabel = new JLabel("Select a planet", JLabel.CENTER);
        imageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, listScroll, imageLabel);
        splitPane.setDividerLocation(150);
        add(splitPane);
        planetList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selected = planetList.getSelectedValue();
                ImageIcon icon = new ImageIcon("images/" + selected.toLowerCase() + ".jpg");
                imageLabel.setIcon(icon);
                imageLabel.setText("");
            }
        });
        setTitle("Planets SplitPane Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PlanetSplitPane();
    }
}
