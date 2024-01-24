package todolistapp;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel {
    private final JLabel index;
    private final JTextField taskname;
    private final JButton done;
    private final JButton remove;
    private boolean completed;

    public Task() {
        GridLayout layoutTask = new GridLayout(1, 4);
        layoutTask.setHgap(5);

        this.setBackground(new Color(230, 230, 250));
        this.setLayout(layoutTask);

        index = new JLabel("");
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(new Color(255, 1, 255));
        this.add(index);

        taskname = new JTextField("ENTER TASK");
        taskname.setBorder(BorderFactory.createEmptyBorder());
        taskname.setBackground(new Color(255, 20, 255));
        this.add(taskname);

        done = new JButton("DONE");
        this.add(done);

        remove = new JButton("REMOVE");
        this.add(remove);
    }

    public void writeIndexJ1(int n) {
        this.index.setText(String.valueOf(n));
        this.revalidate();
    }

    public JButton getDoneJ() {
        return this.done;
    }

    public JButton getRemoveJ() {
        return this.remove;
    }

    public void setStatusCompleted() {
        this.taskname.setBackground(Color.green);
        this.index.setBackground(Color.green);
        this.remove.setBackground(Color.green);
        this.done.setBackground(Color.green);
        this.setBackground(Color.green);
        revalidate();
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
