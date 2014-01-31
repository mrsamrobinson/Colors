package colors.view;

import java.awt.Canvas;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import colors.controller.Controller;

public class ColorChangerFrame extends JFrame
{
	private ColorChangerPanel colorPanel;
	private Controller baseController;
//	private CanvasPanel canvasPanel;
	private Canvas drawingCanvas;
	private GUIFrame appFrame;
	private JButton pressedButton;
	private boolean background;
	private String current;
	
	public ColorChangerFrame(GUIFrame appFrame, Canvas drawingCanvas, Controller baseController, boolean background, String current, JButton pressedButton)
	{
		this.drawingCanvas = drawingCanvas;
		this.appFrame = appFrame;
		this.baseController = baseController;
		this.background = background;
		this.current = current;
		this.pressedButton = pressedButton;
		
		colorPanel = new ColorChangerPanel(drawingCanvas, appFrame, this, baseController, background, pressedButton);
		
		setup();
		setupListeners();
	}
	
	private void setup()
	{
		this.setContentPane(colorPanel);
		this.setSize(450, 450);
		this.setTitle(current);
		this.setLocationRelativeTo(appFrame);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
	}
	
	private void setupListeners()
	{
		this.addWindowListener(new WindowListener(){
			
			@Override
			public void windowClosing(WindowEvent e)
			{
				appFrame.enable();
			}

			@Override
			public void windowOpened(WindowEvent e)
			{

			}

			@Override
			public void windowClosed(WindowEvent e)
			{

			}

			@Override
			public void windowIconified(WindowEvent e)
			{

			}

			@Override
			public void windowDeiconified(WindowEvent e)
			{

			}

			@Override
			public void windowActivated(WindowEvent e)
			{

			}

			@Override
			public void windowDeactivated(WindowEvent e)
			{

			}
		});
	}
}
