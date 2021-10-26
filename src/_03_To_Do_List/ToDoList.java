package _03_To_Do_List;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements MouseListener {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	public static void main(String[] args) {
		new ToDoList().run();
		
		
	}
	public void run() {
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		button.addMouseListener(this);
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		button4.addMouseListener(this);
		button5.addMouseListener(this);
		button.setText("Add Task");
		button2.setText("View Task");
		button3.setText("Remove Task");
		button4.setText("Save List");
		button5.setText("Load List");
		frame.addMouseListener(this);
		frame.setVisible(true);
		frame.setSize(500,500);
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
Copyright Roshan Sood 2021//Copyright Roshan Sood 2021