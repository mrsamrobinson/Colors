package colors.view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import colors.controller.Controller;

public class GUIPanel extends JPanel
{
	private Controller baseController;
	private GUIFrame appFrame;
	private ColorChangerFrame colorChangerFrame;

	private SpringLayout baseLayout;
	private Canvas drawingCanvas;
	// private CanvasPanel canvasPanel;
	private JButton changeBackgroundButton;
	private JButton changeDrawingColorButton;

	public GUIPanel(Controller baseController, GUIFrame appFrame)
	{
		this.baseController = baseController;
		this.appFrame = appFrame;
		drawingCanvas = new Canvas();
		// canvasPanel = new CanvasPanel(baseController);
		baseLayout = new SpringLayout();
		changeBackgroundButton = new JButton("Background");
		changeDrawingColorButton = new JButton("Drawing");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setBackground(new Color(200, 200, 250));
		this.setLayout(baseLayout);
		this.setSize(1750, 1000);
		// this.add(canvasPanel);
		this.add(drawingCanvas);
		drawingCanvas.setSize(1000, 750);
		drawingCanvas.setBackground(new Color(baseController.getBackgroundRValue(), baseController.getBackgroundGValue(), baseController.getBackgroundBValue()));
		this.add(changeBackgroundButton);
		this.add(changeDrawingColorButton);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, drawingCanvas, 124, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, drawingCanvas, 124, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, drawingCanvas, -39, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, drawingCanvas, -39, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, changeBackgroundButton, -6, SpringLayout.NORTH, drawingCanvas);
		baseLayout.putConstraint(SpringLayout.EAST, changeBackgroundButton, -40, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, drawingCanvas, -728, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, drawingCanvas, 105, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, drawingCanvas, -21, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, drawingCanvas, -33, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, changeDrawingColorButton, 0, SpringLayout.NORTH, changeBackgroundButton);
		baseLayout.putConstraint(SpringLayout.EAST, changeDrawingColorButton, -6, SpringLayout.WEST, changeBackgroundButton);
	}

	private void setupListeners()
	{
		changeBackgroundButton.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent click)
			{
				boolean background = true;
				String current = "Background Color";
				colorChangerFrame = new ColorChangerFrame(appFrame, drawingCanvas, baseController, background, current, changeBackgroundButton);
			}
		});

		changeDrawingColorButton.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent click)
			{
				boolean background = false;
				String current = "Drawing Color";
				colorChangerFrame = new ColorChangerFrame(appFrame, drawingCanvas, baseController, background, current, changeDrawingColorButton);
			}
		});
	}
}
