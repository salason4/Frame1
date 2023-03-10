package mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WorkFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon pain;
    ImageIcon nervous;
    ImageIcon dizzy;
    WorkFrame (){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize( 500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);


        smile = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\mouseListener\\smile emoji.PNG");
        pain = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\mouseListener\\pain Emoji.PNG");
        nervous = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\mouseListener\\nervous emoji.PNG");
        dizzy = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\How to open a new Window\\src\\mouseListener\\Dizzy Emoji.PNG");

        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(pain);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(dizzy);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(nervous);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(smile);

    }
}
