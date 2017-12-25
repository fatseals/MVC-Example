package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI extends JFrame {
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JButton btnGetInfo;
	private JButton btnCreateUser;
	private JTextField txtUsernamedisplay;
	private JTextField txtHashdisplay;
	
	public String getUsername() {
		return txtUsername.getText();
	}
	
	public String getPassword() {
		return txtPassword.getText();
	}
	
	public void setUsername(String username) {
		txtUsernamedisplay.setText(username);
	}
	
	public void setPasswordHash(String hash) {
		txtHashdisplay.setText(hash);
	}

	/**
	 * Create the frame.
	 */
	public GUI() {	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		txtUsername = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, txtUsername, 30, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtUsername, 256, SpringLayout.WEST, getContentPane());
		txtUsername.setText("username");
		springLayout.putConstraint(SpringLayout.NORTH, txtUsername, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtUsername, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtPassword, 6, SpringLayout.SOUTH, txtUsername);
		springLayout.putConstraint(SpringLayout.WEST, txtPassword, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtPassword, -202, SpringLayout.EAST, getContentPane());
		txtPassword.setText("password");
		getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		btnCreateUser = new JButton("Create user");
		springLayout.putConstraint(SpringLayout.WEST, btnCreateUser, 7, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtPassword, -6, SpringLayout.NORTH, btnCreateUser);
		springLayout.putConstraint(SpringLayout.NORTH, btnCreateUser, 62, SpringLayout.NORTH, getContentPane());
		getContentPane().add(btnCreateUser);
		
		btnGetInfo = new JButton("Get info");
		springLayout.putConstraint(SpringLayout.NORTH, btnGetInfo, 6, SpringLayout.SOUTH, btnCreateUser);
		springLayout.putConstraint(SpringLayout.WEST, btnGetInfo, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnGetInfo, 26, SpringLayout.SOUTH, btnCreateUser);
		springLayout.putConstraint(SpringLayout.EAST, btnGetInfo, -338, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnGetInfo);
		
		txtUsernamedisplay = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtUsernamedisplay, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtUsernamedisplay, -229, SpringLayout.EAST, getContentPane());
		txtUsernamedisplay.setText("userNameDisplay");
		springLayout.putConstraint(SpringLayout.NORTH, txtUsernamedisplay, 28, SpringLayout.SOUTH, btnGetInfo);
		getContentPane().add(txtUsernamedisplay);
		txtUsernamedisplay.setColumns(10);
		
		txtHashdisplay = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtHashdisplay, 165, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtHashdisplay, -76, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtUsernamedisplay, -6, SpringLayout.NORTH, txtHashdisplay);
		springLayout.putConstraint(SpringLayout.WEST, txtHashdisplay, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtHashdisplay, 424, SpringLayout.WEST, getContentPane());
		txtHashdisplay.setText("hashDisplay");
		getContentPane().add(txtHashdisplay);
		txtHashdisplay.setColumns(10);
	}
	
	public void createUserListener(ActionListener listener) {
		this.btnCreateUser.addActionListener(listener);
	}
	
	public void createGetListener(ActionListener listener) {
		this.btnGetInfo.addActionListener(listener);
	}
	
}
