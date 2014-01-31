package colors.view;

import java.awt.Color;

import javax.swing.JPanel;

import colors.controller.Controller;

public class CanvasPanel extends JPanel
{
	private Controller baseController;
	
	public CanvasPanel(Controller baseController)
	{
		this.baseController = baseController;
		
		setupPanel();
		setCanvasBackground();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	public void setCanvasBackground()
	{
		this.setBackground(new Color(baseController.getBackgroundRValue(), baseController.getBackgroundGValue(), baseController.getBackgroundBValue()));
	}
	
	private void setupListeners()
	{
		
	}
	
}
