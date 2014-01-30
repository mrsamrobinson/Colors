package colors.controller;

import colors.view.GUIFrame;

public class Controller
{
	private GUIFrame appFrame;
	
	public Controller()
	{
		
	}
	
	public void start()
	{
		appFrame = new GUIFrame(this);
	}
}
