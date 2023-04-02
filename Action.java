// Implementing action for button for user use 
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;  //package for event


public class Action extends JFrame implements ActionListener
{
JLabel 	lb1,lb2,lb3;
JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7;
JTextField txtnumber1,txtnumber2,txtnumber3;

Action(){
setLayout(new FlowLayout());     //Flow Layout Manager  and dont use setbonds for flow layout

lb1=new JLabel("Enter Number 1");
add(lb1);
//
txtnumber1=new JTextField(20);
add(txtnumber1);
//

lb2=new JLabel("Enter Second  no");
add(lb2);
//
txtnumber2=new JTextField(20);
add(txtnumber2);

//
lb3=new JLabel("Answer");
add(lb3);
//
txtnumber3=new JTextField(20);
add(txtnumber3);

//JBuntton
bt1=new JButton("Addition");
add(bt1);
bt1.addActionListener(this);  // this means selfe

//

bt2=new JButton("Subtraction");
add(bt2);
bt2.addActionListener(this);  // this means selfe
//
bt3=new JButton("Multiplication");
add(bt3);
bt3.addActionListener(this);  // this means selfe
//
bt4=new JButton("Division");
add(bt4);
bt4.addActionListener(this);  // this means selfe
//

bt5=new JButton("MOD");
add(bt5);
bt5.addActionListener(this);  // this means selfe
//
bt6=new JButton("Profit Perctantage");
add(bt6);
bt6.addActionListener(this);  // this means selfe

//
bt7=new JButton("Loss Perctantage");
add(bt7);
bt7.addActionListener(this);  // this means selfe



//
setSize(500,500);
setVisible(true);
}
//
public void actionPerformed(ActionEvent e){
int a,b,c;
if(bt1 == e.getSource())
{
a=Integer.parseInt(txtnumber1.getText());
b=Integer.parseInt(txtnumber2.getText());
c=a+b;
txtnumber3.setText(String.valueOf(c));
}
//
if(bt2 == e.getSource())
{
a=Integer.parseInt(txtnumber1.getText());
b=Integer.parseInt(txtnumber2.getText());
c=a-b;
txtnumber3.setText(String.valueOf(c));
}
//
if(bt3 == e.getSource())
{
a=Integer.parseInt(txtnumber1.getText());
b=Integer.parseInt(txtnumber2.getText());
c=a*b;
txtnumber3.setText(String.valueOf(c));
}
//
if(bt4 == e.getSource())
{
double t,r;
t=Integer.parseInt(txtnumber1.getText());
r=Integer.parseInt(txtnumber2.getText());
double d=t/r;
txtnumber3.setText(String.valueOf(d));
}
//mod
if(bt5 == e.getSource())
{
a=Integer.parseInt(txtnumber1.getText());
b=Integer.parseInt(txtnumber2.getText());
c=a%b;
txtnumber3.setText(String.valueOf(c));
}
//profit percentage
if(bt6 == e.getSource())
{
int sp=Integer.parseInt(txtnumber1.getText());
int cp=Integer.parseInt(txtnumber2.getText());
int perc=(sp-cp)*100/cp;
txtnumber3.setText(String.valueOf(perc));
JOptionPane.showMessageDialog(null,"profit Percentage is "+perc+"%");
JOptionPane.showMessageDialog(null,"Here is Formula to calculate Profit Percentage" );
JOptionPane.showMessageDialog(null,"profit=Selling Price - Cost Price" );
JOptionPane.showMessageDialog(null,"where perctage=profit/cost price * 100" );
}
//Loss Percentage

if(bt7 == e.getSource())
{
int sp=Integer.parseInt(txtnumber1.getText());
int cp=Integer.parseInt(txtnumber2.getText());
int perc=(cp-sp)*100/cp;
txtnumber3.setText(String.valueOf(perc));
JOptionPane.showMessageDialog(null,"Loss Percentage is "+perc+"%");
JOptionPane.showMessageDialog(null,"Here is Formula to calculate Loss Percentage" );
JOptionPane.showMessageDialog(null,"profit=Cost Price - Selling Price" );
JOptionPane.showMessageDialog(null,"where perctage=Loss/'(divide)'"+"cost price * 100" );
}
//




}
public static void main(String[] args)
{
new Action();
}
}






























