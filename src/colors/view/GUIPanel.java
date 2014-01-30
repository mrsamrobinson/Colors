package colors.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import colors.controller.Controller;

public class GUIPanel extends JPanel
{
	private Controller baseController;
	
	private SpringLayout baseLayout;
	
	public GUIPanel(Controller baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(255, 255, 255));
		this.setLayout(baseLayout);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
