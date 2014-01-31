package colors.controller;

import javax.swing.JOptionPane;

import colors.view.GUIFrame;

public class Controller
{
	public GUIFrame appFrame;
	
	public int backgroundRValue;
	
	public int backgroundGValue;
	
	public int bakcgroundBValue;
	
	public int drawingRValue;
	
	public int drawingGValue;
	
	public int drawingBValue;
	
	public Controller()
	{
		backgroundRValue = 255;
		backgroundGValue = 255;
		bakcgroundBValue = 255;
		drawingRValue = 0;
		drawingGValue = 0;
		drawingBValue = 0;
	}
	
	public int getBackgroundRValue()
	{
		return backgroundRValue;
	}

	public void setBackgroundRValue(int rValue)
	{
		this.backgroundRValue = rValue;
	}

	public int getBackgroundGValue()
	{
		return backgroundGValue;
	}

	public void setBackgroundGValue(int gValue)
	{
		this.backgroundGValue = gValue;
	}

	public int getBackgroundBValue()
	{
		return bakcgroundBValue;
	}

	public void setBackgroundBValue(int bValue)
	{
		this.bakcgroundBValue = bValue;
	}

	public int getDrawingRValue()
	{
		return drawingRValue;
	}

	public void setDrawingRValue(int drawingRValue)
	{
		this.drawingRValue = drawingRValue;
	}

	public int getDrawingGValue()
	{
		return drawingGValue;
	}

	public void setDrawingGValue(int drawingGValue)
	{
		this.drawingGValue = drawingGValue;
	}

	public int getDrawingBValue()
	{
		return drawingBValue;
	}

	public void setDrawingBValue(int drawingBValue)
	{
		this.drawingBValue = drawingBValue;
	}

	public void start()
	{
		appFrame = new GUIFrame(this);
	}
	
	public void updateDrawingColor()
	{
		
	}
	
	
}
