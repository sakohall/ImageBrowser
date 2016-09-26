import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class PhotoBrowser {
	
	private JFrame mainFrame;
	private JLabel statusBarLabel;
	private JToggleButton familyTB;
	private JToggleButton vacationTB;
	private JToggleButton schoolTB;

	public static void main(String[] args) {
		PhotoBrowser skl = new PhotoBrowser();
	}
	
	public PhotoBrowser() {
		setUpUI();
	}
	
	private void setUpUI() {
		//Creating the frame
		mainFrame = new JFrame("Photo Browser");
		mainFrame.setVisible(true);
		mainFrame.setSize(new Dimension(1000, 700));
		mainFrame.setMinimumSize(new Dimension(400, 400));
		
		//Creating the status bar
		statusBarLabel = new JLabel("Status Bar");
		mainFrame.getContentPane().add(statusBarLabel, BorderLayout.PAGE_END);
		
		//Creating the menubar
		JMenuBar menuBar = new JMenuBar();
		mainFrame.getContentPane().add(menuBar, BorderLayout.PAGE_START);
		
		//Creating the menus
		createFileMenu(menuBar);
		createViewMenu(menuBar);
		
		//Creating the panel
		JPanel panel = new JPanel();
		mainFrame.getContentPane().add(panel, BorderLayout.CENTER);
		
		//Creating the toolbar
		createToolBar();
	}
	
	private void createFileMenu(JMenuBar mB) {
		JMenu fileMenu = new JMenu("File");
		mB.add(fileMenu);
		
		//Creating the menu items
		JMenuItem importItem = new JMenuItem("Import");
		importItem.addActionListener(
				event -> {
					JFileChooser chooser = new JFileChooser();
					int returnVal = chooser.showOpenDialog(mainFrame);
					if(returnVal == JFileChooser.APPROVE_OPTION) {
						setStatusBarText("Choosing files not implemented");
					}
				}
				);
		
		JMenuItem deleteItem = new JMenuItem("Delete");
		deleteItem.addActionListener(
				event -> setStatusBarText("Delete not implemented")
				);
		
		JMenuItem quitItem = new JMenuItem("Quit");
		quitItem.addActionListener(
				event -> System.exit(0)
				);
		
		fileMenu.add(importItem);
		fileMenu.add(deleteItem);
		fileMenu.add(quitItem);
	}
	
	private void createViewMenu(JMenuBar mB) {
		JMenu viewMenu = new JMenu("View");
		mB.add(viewMenu);
		
		JRadioButtonMenuItem photoViewerRButton = new JRadioButtonMenuItem("Photo Viewer", true);
		photoViewerRButton.addActionListener(
				event -> setStatusBarText("Photo Viewer not implemented")
				);
		
		JRadioButtonMenuItem browserRButton = new JRadioButtonMenuItem("Browser");
		browserRButton.addActionListener(
				event -> setStatusBarText("Browser not implemented")
				);
		
		JRadioButtonMenuItem splitModeRButton = new JRadioButtonMenuItem("Split Mode");
		splitModeRButton.addActionListener(
				event -> setStatusBarText("Split Mode not implemented")
				);
		
		ButtonGroup group = new ButtonGroup();
		group.add(photoViewerRButton);
		group.add(browserRButton);
		group.add(splitModeRButton);
		viewMenu.add(photoViewerRButton);
		viewMenu.add(browserRButton);
		viewMenu.add(splitModeRButton);
	}
	
	private void createToolBar() {
		JToolBar toolBar = new JToolBar(1);
		mainFrame.getContentPane().add(toolBar, BorderLayout.WEST);
		
		familyTB = new JToggleButton("Family");
		familyTB.addActionListener(
				event -> setStatusBarText("Family not implemented")
				);
		
		vacationTB = new JToggleButton("Vacation");
		vacationTB.addActionListener(
				event -> setStatusBarText("Vacation not implemented")
				);
		
		schoolTB = new JToggleButton("School");
		schoolTB.addActionListener(
				event -> setStatusBarText("School not implemented")
				);
		
		toolBar.add(familyTB);
		toolBar.add(vacationTB);
		toolBar.add(schoolTB);	
	}
	
	private void setStatusBarText(String s) {
		statusBarLabel.setText(s);
	}
	
}