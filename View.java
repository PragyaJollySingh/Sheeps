import java.awt.GridLayout;

import javax.swing.*;

public class View {
	public JFrame main;
	public JButton increment; 
	public JButton decrement;
	public JLabel total;
	public JLabel current;
	public JLabel tracker;
	public JTextField forTotal;
	public JTextField forCurrent;
	
	public View(){
		main= new JFrame("Sheep Counter");
		main.setLayout(new GridLayout(0,2));
		main.setSize(500, 600);
	    total= new JLabel("total");
	    current= new JLabel("current");
	    increment= new JButton("increment");
	    decrement= new JButton("decrement");
	    tracker= new JLabel("tracker");
	    forCurrent= new JTextField();
	    forTotal= new JTextField();
	    main.add(total);
	    main.add(forTotal);
	    main.add(current);
	    main.add(forCurrent);
	    main.add(increment);
	    main.add(decrement);
	    main.add(tracker);
	    main.setVisible(true);
	}
	
	public static void main(String[] args) {
		View frame= new View();
	}
	
	

}
