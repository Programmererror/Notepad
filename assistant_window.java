package com.learning.src.app;

import java.util.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;

import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class assistant_window extends JFrame implements ActionListener {
    JLabel label;
    JButton button1;
    JButton button2;
    Font font;

    notepad notepad;

    boolean saved = false;

    assistant_window() {
        font = new Font("Normal", Font.PLAIN, 20);

        this.setTitle("Option");
        this.setBounds(600, 300, 300, 100);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(true);
        this.setUndecorated(true);

        label = new JLabel("Do you want to save your file?");
        label.setBounds(0, 0, 200, 10);
        label.setVisible(true);
        label.setFont(font);
        this.add(label);

        button1 = new JButton("Save");
        button1.addActionListener(this);
        this.add(button1);

        button2 = new JButton("Don't save");
        button2.addActionListener(this);
        this.add(button2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            JFileChooser filechooser = new JFileChooser();
            filechooser.setCurrentDirectory(new File("."));

            FileNameExtensionFilter exfilter = new FileNameExtensionFilter("Text Files", ".txt");
            filechooser.setFileFilter(exfilter);

            int response = filechooser.showSaveDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file;
                PrintWriter fileout = null;

                file = new File(filechooser.getSelectedFile().getAbsolutePath());

                try {
                    fileout = new PrintWriter(file);
                    // fileout.println(notepad.textarea.getText());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } finally {
                    fileout.close();
                }

            }
            saved = true;
        }
        if (e.getSource() == button2) {
            System.exit(0);
        }
    }
}