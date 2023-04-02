package com.example.Swing;
import java.util.*;

import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
public class Code1 extends JFrame implements ActionListener {
	JLabel lb1, lb2, lb3;
	JTextField txt1, txt2, txt3;
	JButton bt1,bt2,bt3,bt4,bt5,bt6;

	//constructor
	public Code1() {
		setLayout(null);//setLayout(new FlowLayout); if u use this don't use setBounds
		lb1 = new JLabel("Number 1");
		add(lb1);
		lb1.setBounds(10, 50, 80, 30);//x,y,w,h
		txt1 = new JTextField(20);
		add(txt1);
		txt1.setBounds(80, 50, 100, 30);//x,y,w,h

		//txt2 
		lb2 = new JLabel("Number 2");
		add(lb2);
		lb2.setBounds(10, 100, 100, 30);

		txt2 = new JTextField(20);
		add(txt2);
		txt2.setBounds(80, 100, 100, 30);
		//
		lb3 = new JLabel("Answer");
		add(lb3);
		lb3.setBounds(10, 150, 100, 30);
		txt3 = new JTextField(20);
		add(txt3);
		txt3.setBounds(80, 150, 100, 30);

		//
		bt1 = new JButton("ADDITION");
		add(bt1);
		bt1.setBounds(10, 200, 100, 30);
		
		bt2=new JButton("SUBTRACTION");
		add(bt2);
		bt2.setBounds(10,250,130,30);
		
		bt3=new JButton("MULTIPLATION");
		add(bt3);
		bt3.setBounds(10,300, 130, 30);
		
		bt4=new JButton("Division");
		add(bt4);
		bt4.setBounds(10,350,130,30);
		//Action on events buttons
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());
				int c = a + b;
				txt3.setText(Integer.toString(c));
			}
		});
		//
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());
				int c = a - b;
				txt3.setText(Integer.toString(c));
			}
		});
		//
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());
				int c = a * b;
				txt3.setText(Integer.toString(c));
			}
		});
		//
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());
				int c = a / b;
				txt3.setText(Integer.toString(c));
			}
		});

		setTitle("Action page");
		setSize(500, 500);
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Code1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
