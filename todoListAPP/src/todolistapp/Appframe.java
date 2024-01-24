package todolistapp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


public final class Appframe extends JFrame {
    private final JButton addtask;
    private final JButton Clear;
    

    TitleBar title = new TitleBar();
    Button button = new Button();
    List list = new List();
    //java.util.List<Task> list = new ArrayList<>();

    public Appframe() {
        // Initialize components
        this.add(this.title, BorderLayout.NORTH);
        this.add(this.button, BorderLayout.SOUTH);
        this.add((Component) this.list, BorderLayout.CENTER);

        // Ensure components are initialized before accessing methods
        addtask = button.getaddtaskbutton();
        Clear = button.getclearbutton();

        addlistener();

        // Set frame properties after adding components
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

     public void addlistener(){
        
        addtask.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.indexnum();
                revalidate();
                
                JButton done = task.getDoneJ();
                done.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.setStatusCompleted();
                         revalidate();
                    }
               
            });
            
            JButton remove = task.getRemoveJ();
                remove.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent e) {
                        list.remove(task);
                        list.indexnum();
                         revalidate();
                         repaint();
                    }
                });  
        }

         
            
        });
        
        Clear.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                Component[] tasklist = list.getComponents();
                for (int i = 0; 1<tasklist.length; i++){
                    if(tasklist[i] instanceof Task task ){
                        list.remove(task);
                         revalidate();
                        repaint();   
            }
            
        }
        revalidate();
        repaint();     
    }

    });
  }
} 


        

       