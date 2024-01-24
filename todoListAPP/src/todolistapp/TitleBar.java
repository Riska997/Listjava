package todolistapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel {
    
    private final JLabel titleText;

    public TitleBar() {
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(new Color(138, 43, 146));

        titleText = new JLabel("TO-DO LIST APP");
        titleText.setPreferredSize(new Dimension(200, 80));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleText);
    }
}
