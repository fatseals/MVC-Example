package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;

public class Controller {

	private GUI gui;
	private Data data;
	
	public Controller(Data data, GUI gui) {
		this.data = data;
		this.gui = gui;
		
		this.gui.createGetListener(new GetListener());
		this.gui.createUserListener(new UserListener());
	}
	
	private String hashIt(String input) {
		try{
			//THIS IS COPY PASTED. DONT USE ME
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        byte[] hash = digest.digest(input.getBytes("UTF-8"));
	        StringBuffer hexString = new StringBuffer();

	        for (int i = 0; i < hash.length; i++) {
	            String hex = Integer.toHexString(0xff & hash[i]);
	            if(hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }

	        return hexString.toString();
	    } catch(Exception ex){
	       throw new RuntimeException(ex);
	    }
	}
	
	private class UserListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			data.table.put(gui.getUsername(), hashIt(gui.getPassword()));
		}
		
	}
	
	private class GetListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			gui.setUsername(gui.getUsername());
			gui.setPasswordHash(data.table.get(gui.getUsername()));
		}
		
	}
	
}
