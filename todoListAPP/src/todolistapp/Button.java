package todolistapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Button extends JPanel {
    private final JButton addTaskButton;
    private final JButton clearButton;
    
    List list = new List();

    Border emptyBorder = BorderFactory.createEmptyBorder();

    public Button() {
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.MAGENTA);

        addTaskButton = new JButton("ADD TASK");
        addTaskButton.setBorder(emptyBorder);
        addTaskButton.setFont(new Font("Sans-serif", Font.BOLD, 20));
        this.add(addTaskButton);

        this.add(Box.createHorizontalStrut(20));

        clearButton = new JButton("CLEAR ALL TASKS");
        clearButton.setBorder(emptyBorder);
        clearButton.setFont(new Font("Sans-serif", Font.BOLD, 20));
        this.add(clearButton);

        addListeners();
    }

    private void addListeners() {
    addTaskButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            Task task = new Task();            
            // Create a new task
            // Set the properties of the task
            task.setName("New Task");
            task.setCompleted(false);
            
            // Add the new task to the task list
            list.add(task);
            
            
        }
    });

        clearButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Clear all tasks from the task list
        list.clear();
      
    }
});

    }

    public JButton getaddtaskbutton() {
        return this.addTaskButton;
    }

    public JButton getclearbutton() {
        return this.clearButton;
    }

}
