/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproj;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Panel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mark.evans2358
 */
public class GUIPractice {
    // create private static variables for all pieces of frame including frame
    private static Frame mainFrame;
    private static FlowLayout centeredText;
    private static Panel topPanel;
    private static Panel bottomPanel;
    private static Button button1;
    private static Button button2;
    private static Label instructionLabel;
    private static Label pushedButton1;
    private static Label pushedButton2;
    private static Font labelFont;
    
    // main methodcalls GUIMaker to run GUI
    public static void main(String args[]) {
        GUIMaker();
    } // close main
    
public static void GUIMaker() {
    
// create frame
    mainFrame = new Frame("AWT Simple Demo");
    
    // creates layout structure for frame
    mainFrame.setLayout(new GridLayout(1,2));
    
    // sets dimensions of frame

    
    // centers frame
    mainFrame.setLocationRelativeTo(null);
    
    // makes frame visible
    mainFrame.setVisible(true);

    // create exit button function
    mainFrame.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
        }
    });
    
    // center panels top and bottom
    centeredText = new FlowLayout(FlowLayout.CENTER,35,35);
    topPanel = new Panel(centeredText);
    bottomPanel = new Panel(centeredText);
    
    // Set locations for top and bottom 
    mainFrame.add(topPanel, BorderLayout.NORTH);
    mainFrame.add(bottomPanel, BorderLayout.SOUTH);
    
    // create buttons 1 and 2
    button1 = new Button("Button 1");
    button2 = new Button("Button 2");
    
    // inset buttons into topPanel
    topPanel.add(button1);
    topPanel.add(button2);
    
    // adjust size of buttons
    Dimension buttonSize = new Dimension(175,55);
    button1.setSize(buttonSize);
    button2.setSize(buttonSize);
    
    // change the font size of the buttons
    Font buttonFont = new Font("",Font.PLAIN, 30);
    button1.setFont(buttonFont);
    button2.setFont(buttonFont);
    
    //create labels
    instructionLabel = new Label("Push A Button");
    pushedButton1 = new Label("You pushed Button 1");
    pushedButton2 = new Label("You pushed Button 2");
    
    // add instructionLabel to bottomPanel
    bottomPanel.add(instructionLabel);
    labelFont = new Font("",Font.PLAIN,25);
    instructionLabel.setFont(labelFont);
    pushedButton1.setFont(labelFont);
    pushedButton2.setFont(labelFont);
    
    //make label text green
    button1.setForeground(Color.RED);
    button2.setForeground(Color.BLUE);
    instructionLabel.setForeground(Color.DARK_GRAY);
    pushedButton1.setForeground(Color.RED);
    pushedButton2.setForeground(Color.BLUE);
    
    
    mainFrame.setSize(500,250);
    
    public static void eventHandlers() {
        // event handler button 1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
    }
} // close GUIMaker


} // close GUI Practice


