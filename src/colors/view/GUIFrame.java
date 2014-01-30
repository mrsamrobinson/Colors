package colors.view;

import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import colors.controller.Controller;

public class GUIFrame extends JFrame
{
	private Controller baseController;

	private GUIPanel basePanel;
	
	private Image image;
	
	private URL imageLocation;

	public GUIFrame(Controller baseController)
	{
		this.baseController = baseController;

		basePanel = new GUIPanel(baseController);
		
//		imageLocation = getClass().getResource("colors/view/images/icon.jpg");
		
//		image = new ImageIcon(imageLocation).getImage();

		setup();
		setupListeners();
	}

	private void setup()
	{
		this.setTitle("Colors");
//		this.setIconImage(image);
		this.setContentPane(basePanel);
		this.setSize(1750, 1000);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	private void setupListeners()
	{
		this.addWindowListener(new WindowListener()
		{

			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
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
