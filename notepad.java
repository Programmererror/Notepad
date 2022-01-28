package com.learning.src.app;

import java.util.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;

import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class notepad extends JFrame implements ActionListener {

    int width = 500;
    int height = 500;

    Font font;

    JMenu file, edit, help, options, Font, font_text;

    JMenuItem word_wrap_off, word_wrap_on, new_file, save, open, exit, helping, normal, bold, About, hello;

    JMenuItem font10, font12, font14, font16, font18, font20, font22, font24, font26, font28, font30;

    JLabel label;
    JTextArea textarea;
    JButton colorbutton;
    JScrollPane scrollpane;

    String off;
    String on;

    boolean saved = false;

    int font_layout = Font.HORIZONTAL;

    JFileChooser fc = new JFileChooser();

    notepad() {
        Font font = new Font("Normal", font_layout, 20);

        this.setTitle("Tanbir Ashraf project");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setUndecorated(false);

        ImageIcon saveicon = new ImageIcon("C:\\Users\\Tanbir\\Pictures\\Save.png");
        ImageIcon exiticon = new ImageIcon("C:\\Users\\Tanbir\\Pictures\\Exit.png");
        ImageIcon openicon = new ImageIcon("C:\\Users\\Tanbir\\Pictures\\Load.png");
        ImageIcon newicon = new ImageIcon("C:\\Users\\Tanbir\\Pictures\\newicon.png");

        JMenuBar menu = new JMenuBar();
        menu.setBounds(0, 0, width, 40);
        this.add(menu);

        file = new JMenu("File");
        file.setFont(font);

        edit = new JMenu("Edit");
        edit.setFont(font);

        help = new JMenu("Help");
        help.setFont(font);

        options = new JMenu("Options");
        options.setFont(font);

        //File

        new_file = new JMenuItem("  New");
        new_file.setFont(font);
        new_file.addActionListener(this);
        new_file.setIconTextGap(20);
        new_file.setIcon(newicon);
        file.add(new_file);

        save = new JMenuItem("  Save");
        save.setIcon(saveicon);
        save.setFont(font);
        save.addActionListener(this);
        save.setIconTextGap(20);
        file.add(save);

        open = new JMenuItem("  Open");
        open.setIcon(openicon);
        open.setFont(font);
        open.addActionListener(this);
        open.setIconTextGap(20);
        file.add(open);

        exit = new JMenuItem("  Exit");
        exit.setIcon(exiticon);
        exit.setFont(font);
        exit.addActionListener(this);
        exit.setIconTextGap(20);
        file.add(exit);

        //Edit

        off = "off";
        word_wrap_off = new JMenuItem("Word Warp:" + off);
        word_wrap_off.setFont(font);
        word_wrap_off.addActionListener(this);
        edit.add(word_wrap_off);

        on = "on";
        word_wrap_on = new JMenuItem("Word Wrap:" + on);
        word_wrap_on.setFont(font);
        word_wrap_on.addActionListener(this);
        edit.add(word_wrap_on);

        Font = new JMenu("Font");
        Font.setFont(font);
        edit.add(Font);

        //Font

        font10 = new JMenuItem("10");
        font10.addActionListener(this);
        Font.add(font10);

        font12 = new JMenuItem("12");
        font12.addActionListener(this);
        Font.add(font12);

        font14 = new JMenuItem("14");
        font14.addActionListener(this);
        Font.add(font14);

        font16 = new JMenuItem("16");
        font16.addActionListener(this);
        Font.add(font16);

        font18 = new JMenuItem("18");
        font18.addActionListener(this);
        Font.add(font18);

        font20 = new JMenuItem("20");
        font20.addActionListener(this);
        Font.add(font20);

        font22 = new JMenuItem("22");
        font22.addActionListener(this);
        Font.add(font22);

        font24 = new JMenuItem("24");
        font24.addActionListener(this);
        Font.add(font24);

        font26 = new JMenuItem("26");
        font26.addActionListener(this);
        Font.add(font26);

        font28 = new JMenuItem("28");
        font28.addActionListener(this);
        Font.add(font28);

        font30 = new JMenuItem("30");
        font30.addActionListener(this);
        Font.add(font30);

        //Font layout

        font_text = new JMenu("Font style");
        font_text.setFont(font);
        edit.add(font_text);

        normal = new JMenuItem("Normal");
        normal.setFont(font);
        normal.addActionListener(this);
        font_text.add(normal);

        bold = new JMenuItem("Bold");
        bold.setFont(font);
        bold.addActionListener(this);
        font_text.add(bold);

        //Help

        helping = new JMenuItem();
        helping.setFont(font);
        helping.setText("hello");
        help.add(helping);

        //Options

        About = new JMenuItem("About");
        About.setFont(font);
        About.addActionListener(this);
        options.add(About);

        //Workspace
        textarea = new JTextArea(0, 20);
        textarea.setFont(font);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);

        scrollpane = new JScrollPane(textarea);
        scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        // colorbutton = new JButton("Color");
        // colorbutton.addActionListener(this);
        // colorbutton.setBounds(170, 0, 100, 30);
        // colorbutton.setFocusable(false);

        // JFileChooser filechooser = new JFileChooser();

        // this.add(colorbutton);
        this.setJMenuBar(menu);
        this.add(scrollpane);

        // .addMouseListener(new MouseAdapter() {
        // public void mouseClicked(MouseEvent me) {

        // }
        // });

        menu.add(file);
        menu.add(edit);
        menu.add(help);
        menu.add(options);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == new_file) {
            textarea.setText("");

        }
        if (e.getSource() == word_wrap_off) {
            if (off == "off") {
                textarea.setLineWrap(false);
                textarea.setWrapStyleWord(false);
            }
        }
        if (e.getSource() == word_wrap_on) {
            if (on == "on") {
                textarea.setLineWrap(true);
                textarea.setWrapStyleWord(true);
            }
        }

        if (e.getSource() == font10) {
            textarea.setFont(new Font("Normal", font_layout, 10));
        }
        if (e.getSource() == font12) {
            textarea.setFont(new Font("Normal", font_layout, 12));
        }
        if (e.getSource() == font14) {
            textarea.setFont(new Font("Normal", font_layout, 14));
        }
        if (e.getSource() == font16) {
            textarea.setFont(new Font("Normal", font_layout, 16));
        }
        if (e.getSource() == font18) {
            textarea.setFont(new Font("Normal", font_layout, 18));
        }
        if (e.getSource() == font20) {
            textarea.setFont(new Font("Normal", font_layout, 20));
        }
        if (e.getSource() == font22) {
            textarea.setFont(new Font("Normal", font_layout, 22));
        }
        if (e.getSource() == font24) {
            textarea.setFont(new Font("Normal", font_layout, 24));
        }
        if (e.getSource() == font26) {
            textarea.setFont(new Font("Normal", font_layout, 26));
        }
        if (e.getSource() == font28) {
            textarea.setFont(new Font("Normal", font_layout, 28));
        }
        if (e.getSource() == font30) {
            textarea.setFont(new Font("Normal", font_layout, 30));
        }

        if (e.getSource() == About) {
            new About_notepad();
        }

        if (e.getSource() == save) {
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
                    fileout.println(textarea.getText());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } finally {
                    fileout.close();
                }
            }
            saved = true;
        }
        if (e.getSource() == open) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
            fileChooser.setFileFilter(filter);

            int response = fileChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                Scanner fileIn = null;

                try {
                    fileIn = new Scanner(file);
                    if (file.isFile()) {
                        while (fileIn.hasNextLine()) {
                            String line = fileIn.nextLine() + "\n";
                            textarea.append(line);
                        }
                    }
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } finally {
                    fileIn.close();
                }
            }
        }
        if (e.getSource() == exit && saved == true) {
            System.exit(0);

        }
        if (e.getSource() == exit && saved == false){
            new assistant_window();
        }
        // if (e.getSource() == colorbutton) {
        //     JColorChooser colorchooser = new JColorChooser();
        //     Color color = colorchooser.showDialog(null, "Choose a color", Color.black);
        //     textarea.setForeground(color);
        // }
    }
    

    static int randomx() {
        Random rand = new Random();
        int x = rand.nextInt(100) + 1;
        return x;
    }

    static int randomy() {
        Random rand = new Random();
        int y = rand.nextInt(100) + 1;
        return y;
    }
}