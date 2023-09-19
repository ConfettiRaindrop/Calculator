import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

import java.awt.Dimension;
import java.awt.GridLayout;

import javafx.

public class UserFace extends JPanel{
    public UserFace() {
        super(new GridLayout(1, 0));

        JTable table = new JTable(new MyTableModel());
        table.setPreferredScrollableViewportSize(new Dimension(300, 600));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("worldOfLife");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        UserFace newContentPane = new UserFace();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
    
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              createAndShowGUI();
            }
          });
    }

    //future Camila look at this: https://careerkarma.com/blog/javafx-vs-java-swing/
    
}