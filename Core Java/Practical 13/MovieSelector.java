import javax.swing.*;
import java.awt.event.*;

class MovieSelector extends JFrame implements ActionListener {
    JComboBox<String> combo;
    JTextArea details;

    MovieSelector() {
        setTitle("Movie Selector");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        String movies[] = {"Inception", "Titanic", "Avengers"};
        combo = new JComboBox<>(movies);
        combo.setBounds(100, 30, 200, 30);
        combo.addActionListener(this);
        add(combo);

        details = new JTextArea();
        details.setBounds(50, 80, 300, 150);
        details.setEditable(false);
        add(details);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String movie = (String) combo.getSelectedItem();
        if (movie.equals("Inception")) {
            details.setText("Director: Christopher Nolan\nActor: Leonardo DiCaprio\nActress: Marion Cotillard\nReview: Mind-bending thriller.");
        } else if (movie.equals("Titanic")) {
            details.setText("Director: James Cameron\nActor: Leonardo DiCaprio\nActress: Kate Winslet\nReview: Epic romance and tragedy.");
        } else if (movie.equals("Avengers")) {
            details.setText("Director: Joss Whedon\nActor: Robert Downey Jr.\nActress: Scarlett Johansson\nReview: Action-packed superhero film.");
        }
    }

    public static void main(String[] args) {
        new MovieSelector();
    }
}
