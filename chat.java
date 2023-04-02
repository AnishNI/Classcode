//Project CBW 
package com.example.chat;
import java.awt.*;
import javax.swing.*;
public class chat extends JFrame
{
	JTextField txt1;
	JButton bt1;
	
public chat()
{
	setLayout(null);
	txt1=new JTextField(20);
	add(txt1);
	txt1.setBounds(10,430,400,30);//x,y,w,h
	
	//Button
	bt1=new JButton("Send");
	add(bt1);
	bt1.setBounds(400,430,100,30);
	
	
	
	
	
	
	
	
	
	
	
	
	setSize(500,500);
	setTitle("ChatBot Web");//CBW
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new chat();
	}

}
