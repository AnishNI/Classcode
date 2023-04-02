package com.example.frames;
import java.awt.*;
import javax.swing.*;

//@SuppressWarnings("unused")
public class name extends JFrame
{
	JLabel lab0,lab1,lab2,lab3,lab4,lab5;
	JTextField txt1,txt2,txt3,txt4,txt5;
	JButton bt1,bt2,bt3,bt4;
public name()
{
	setLayout(null);
	
	//
	lab0=new JLabel("Employe Form");
	add(lab0);
	lab0.setBounds(500, 50, 200, 30);
	///
	
	
	
	lab1=new JLabel("EID:");
	add(lab1);
	lab1.setBounds(100,100,50,30);// x,y,w,h
	//
	txt1=new JTextField(20);//size to take data
	add(txt1);
	txt1.setBounds(150,100,100,30);
	
	//lab2
	lab2=new JLabel("EName:");
	add(lab2);
	lab2.setBounds(100,150,50,30);
	//
	txt2=new JTextField(20);
	add(txt2);
	txt2.setBounds(150,150,100,30);
	
	
	//lab3
	lab3=new JLabel("Salary");
	add(lab3);
	lab3.setBounds(100,200,50,30);
	//
	txt3=new JTextField(20);
	add(txt3);
	txt3.setBounds(150,200,100,30);
	//lab3
	
	lab3=new JLabel("Designation:");
	add(lab3);
	lab3.setBounds(100,250,80,30);
	//
	txt3=new JTextField(20);
	add(txt3);
	txt3.setBounds(180,250,150,30);
	
	
	//lab4
	lab4=new JLabel("E-Mail:");
	add(lab4);
	lab4.setBounds(100,300,50,30);
	//
	txt4=new JTextField(20);
	add(txt4);
	txt4.setBounds(150,300,150,30);
	
	//bt1
	bt1=new JButton("Save");
	add(bt1);
	bt1.setBounds(100,400,80,30);
	
	//bt2
		bt2=new JButton("Update");
		add(bt2);
		bt2.setBounds(200,400,80,30);
	//bt3
		//bt1
		bt3=new JButton("Delete");
		add(bt3);
		bt3.setBounds(300,400,80,30);
	

	setVisible(true);
	setSize(1000,1000);
	setLocation(400,100);
	setTitle("");
	setDefaultCloseOperation(2);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name f1=new name();
	}

}
