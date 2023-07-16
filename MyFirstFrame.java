/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import static java.awt.Color.BLUE;
import javax.swing.JFrame;

/**
 *
 * @author cynthia
 */
//1.Extend the JFrame class and import javax.swing from the JFrame class
public class MyFirstFrame extends JFrame{
    
    //2.Create a consructor:
    public MyFirstFrame(){
        //Construct the frame:
        setTitle("My first GUI");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(BLUE);
        setVisible(true);
    }
}
