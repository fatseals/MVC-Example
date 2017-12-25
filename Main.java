package main;

public class Main {

	public static void main(String[] args) {
		GUI gui = new GUI();
		
		Data data = new Data();
		
		Controller controller = new Controller(data, gui);
		
		gui.setVisible(true);
	}
	
}
