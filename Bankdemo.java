package bankdemo;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.awt.event.*;
import java.io.File.*;
import java.io.*; 
public class Bankdemo {
    public static void main(String[] args) {
        transaction t=new transaction(); //Creating an object for transaction
        String filename = "serial.ser";
        try
        {
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(t); //serializing the transaction object.
            out.close(); 
            file.close(); 
            System.out.println("Object has been serialized"); 
        } 
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        }
    }   
}
