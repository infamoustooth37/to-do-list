package gui;

import javax.swing.*;
import java.awt.*;

public class ToDoListDashboard {

    public ToDoListDashboard() {
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        int frameWidth = screenWidth / 2;
        int frameHeight = screenHeight / 2;

        // Create the main frame (window)
        JFrame frame = new JFrame("Three Panel Full-Screen Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH/2); // Maximize to full screen
        frame.setSize(frameWidth, frameHeight);
        frame.setLayout(new BorderLayout());

        // Create the left panel with label "Collections"
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        leftPanel.setPreferredSize(new Dimension(frameWidth / 4, frameHeight));

        //Label creation
        JLabel leftLabel = new JLabel("Collections", JLabel.CENTER);
        leftLabel.setFont(new Font("Arial", Font.BOLD, 22));
        leftPanel.add(leftLabel, BorderLayout.NORTH);

        // Create the center panel with label "Tasks"
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        JLabel centerLabel = new JLabel("Tasks", JLabel.CENTER);
        centerLabel.setFont(new Font("Arial", Font.BOLD, 22));

        centerPanel.add(centerLabel);

        // Create the right panel with label "More Information"
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        rightPanel.setPreferredSize(new Dimension(frameWidth/4, frameHeight));

        JLabel rightLabel = new JLabel("More Information", JLabel.CENTER);
        rightLabel.setFont(new Font("Arial", Font.BOLD, 22));
        rightPanel.add(rightLabel, BorderLayout.NORTH);

        // Add the panels to the frame
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(rightPanel, BorderLayout.EAST);

        // Make the frame visible
        frame.setVisible(true);
    }
}