package todolistapp;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

public class List extends JPanel {
    private static final int MAX_TASKS = 10;
     private final ArrayList<Task> List;

    public List() {
        GridLayout layout = new GridLayout(MAX_TASKS, 1);
        layout.setVgap(5);
        this.setLayout(layout);
        List = new ArrayList<>();
    }
    
     public void clear() {
        List.clear();
    }

    public void addTask(Task task) {
        // Add a task to the list
        this.add(task);
        // Adjust the layout based on the number of tasks
        int numRows = Math.min(MAX_TASKS, this.getComponentCount());
        ((GridLayout) this.getLayout()).setRows(numRows);
        // Revalidate and repaint to update the layout
        this.revalidate();
        this.repaint();
    }

    public void removeTask(Task task) {
        // Remove a task from the list
        this.remove(task);
        // Adjust the layout based on the number of tasks
        int numRows = Math.min(MAX_TASKS, this.getComponentCount());
        ((GridLayout) this.getLayout()).setRows(numRows);
        // Revalidate and repaint to update the layout
        this.revalidate();
        this.repaint();
    }

    public void indexnum() {
        Component[] taskComponents = this.getComponents();
        for (int i = 0; i < taskComponents.length; i++) {
            if (taskComponents[i] instanceof Task task) {
                task.writeIndexJ1(i + 1);
            }
        }
    }

    
}
