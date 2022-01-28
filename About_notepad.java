package com.learning.src.app;

import java.util.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;

import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class About_notepad extends JFrame implements ActionListener {
    Font font;
    JLabel label1;
    JLabel label2;

    About_notepad() {
        font = new Font("Normal", Font.PLAIN, 15);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("About");
        this.setSize(500, 100);
        this.setResizable(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        label1 = new JLabel("The app you are using is called Notepad. This was created from a beginner programmer. It was an project.");
        label1.setFont(font);
        label1.setBounds(0,10,500,15);
        this.add(label1);

        label2 = new JLabel("Beginner programmer: Hope you enjoy my project. It just cost me almost one month. ENJOY!");
        label2.setFont(font);
        label1.setBounds(0,40,500,15);
        this.add(label2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
