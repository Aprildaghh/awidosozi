package Frames;

import NameCreation.CreateName;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel {
    private JButton create_button;
    private JPanel main_panel;
    private JTextArea text_area;
    private JTextField text_field;
    private JLabel label;

    public MainPanel() {

        create_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int times = CreateName.StrToInt(text_field.getText());

                String name = CreateName.create(times);

                label.setText(name);

            }
        });
    }

    public JPanel getMain_panel() {
        return main_panel;
    }

}
