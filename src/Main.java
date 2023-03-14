import Frames.MainPanel;
import NameCreation.CreateName;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Main {
    public static void main(String[] args)
    {

        JFrame main_frame = new JFrame();
        main_frame.setBounds(800, 500, 200, 300);
        MainPanel panel = new MainPanel();

        panel.getMain_panel().setBorder(new EmptyBorder(20, 10, 20, 10));

        main_frame.setContentPane(panel.getMain_panel());

        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.pack();
        main_frame.setVisible(true);

    }
}