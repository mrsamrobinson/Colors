package colors.view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import colors.controller.Controller;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ColorChangerPanel extends JPanel
{
	private ColorChangerFrame thisFrame;
	private Controller baseController;
	private GUIFrame appFrame;
	private GUIPanel basePanel;
	
	private JButton pressedButton;

	private JButton okayButton;

	private JButton blueButton;
	private JButton greenButton;
	private JButton redButton;
	private JButton cyanButton;
	private JButton yellowButton;
	private JButton blackButton;
	private JButton whiteButton;
	private JButton pinkButton;
	private JButton purpleButton;
	private JButton lPurpleButton;
	private JButton majentaButton;
	private JButton skyBlueButton;
	private JButton orangeButton;
	private JButton yellowOrangeButton;
	private JButton greyButton;
	private JButton previewButton;

	// private CanvasPanel canvasPanel;
	private Canvas drawingCanvas;

	private JTextField rField;
	private JTextField gField;
	private JTextField bField;

	private JLabel rLabel;
	private JLabel gLabel;
	private JLabel bLabel;

	private int rValue;
	private int gValue;
	private int bValue;

	private boolean background;

	public ColorChangerPanel(Canvas drawingCanvas, GUIFrame appFrame, ColorChangerFrame thisFrame, Controller baseController, boolean background, JButton pressedButton)
	{
		this.drawingCanvas = drawingCanvas;
		this.appFrame = appFrame;
		this.thisFrame = thisFrame;
		this.baseController = baseController;
		this.background = background;
		this.pressedButton = pressedButton;

		rValue = baseController.getBackgroundRValue();
		gValue = baseController.getBackgroundGValue();
		bValue = baseController.getBackgroundBValue();

		okayButton = new JButton("Okay");
		previewButton = new JButton();

		blueButton = new JButton();
		greenButton = new JButton();
		redButton = new JButton();
		cyanButton = new JButton();
		yellowButton = new JButton();
		blackButton = new JButton();
		whiteButton = new JButton();
		pinkButton = new JButton();
		purpleButton = new JButton();
		lPurpleButton = new JButton();
		majentaButton = new JButton();
		skyBlueButton = new JButton();
		orangeButton = new JButton();
		yellowOrangeButton = new JButton();
		greyButton = new JButton();

		rField = new JTextField(3);
		gField = new JTextField(3);
		bField = new JTextField(3);

		rLabel = new JLabel("R");
		gLabel = new JLabel("G");
		bLabel = new JLabel("B");

		appFrame.disable();

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setBackground(new Color(200, 200, 225));

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addGroup(
								groupLayout
										.createParallelGroup(Alignment.LEADING)
										.addGroup(
												groupLayout.createSequentialGroup().addGap(35).addComponent(orangeButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(17)
														.addComponent(yellowOrangeButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(14)
														.addComponent(yellowButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
										.addGroup(
												groupLayout.createSequentialGroup().addGap(35).addComponent(blackButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(17)
														.addComponent(greyButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(14)
														.addComponent(whiteButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup().addGap(270).addComponent(rLabel).addGap(53).addComponent(gLabel).addGap(46).addComponent(bLabel))
										.addGroup(groupLayout.createSequentialGroup().addGap(196).addComponent(okayButton))
										.addGroup(
												groupLayout
														.createSequentialGroup()
														.addGap(35)
														.addGroup(
																groupLayout
																		.createParallelGroup(Alignment.LEADING)
																		.addGroup(
																				groupLayout.createSequentialGroup()
																						.addComponent(purpleButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(17)
																						.addComponent(lPurpleButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(14)
																						.addComponent(blueButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				groupLayout.createSequentialGroup()
																						.addComponent(skyBlueButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(17)
																						.addComponent(cyanButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(14)
																						.addComponent(greenButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				groupLayout.createSequentialGroup().addComponent(redButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
																						.addGap(17).addComponent(majentaButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(14)
																						.addComponent(pinkButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
														.addGap(101)
														.addGroup(
																groupLayout
																		.createParallelGroup(Alignment.TRAILING, false)
																		.addGroup(
																				groupLayout.createSequentialGroup()
																						.addComponent(rField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																						.addGap(30)
																						.addComponent(gField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																						.addGap(22)
																						.addComponent(bField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		.addComponent(previewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))).addGap(51)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addGap(50)
						.addGroup(
								groupLayout
										.createParallelGroup(Alignment.LEADING)
										.addGroup(
												groupLayout
														.createSequentialGroup()
														.addGroup(
																groupLayout.createParallelGroup(Alignment.LEADING)
																		.addComponent(purpleButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
																		.addComponent(lPurpleButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
																		.addComponent(blueButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
														.addGap(18)
														.addGroup(
																groupLayout.createParallelGroup(Alignment.LEADING)
																		.addComponent(skyBlueButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
																		.addComponent(cyanButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
																		.addComponent(greenButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
														.addGap(19)
														.addGroup(
																groupLayout.createParallelGroup(Alignment.LEADING).addComponent(redButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
																		.addComponent(majentaButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
																		.addComponent(pinkButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
														.addGap(17)
														.addGroup(
																groupLayout.createParallelGroup(Alignment.LEADING)
																		.addComponent(orangeButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
																		.addComponent(yellowOrangeButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
																		.addComponent(yellowButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
														.addGap(18)
														.addGroup(
																groupLayout.createParallelGroup(Alignment.LEADING)
																		.addComponent(blackButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
																		.addComponent(greyButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
																		.addComponent(whiteButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
										.addComponent(previewButton, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
						.addGap(68)
						.addGroup(
								groupLayout.createParallelGroup(Alignment.LEADING).addComponent(rField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(gField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(bField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(9)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(rLabel).addComponent(gLabel).addComponent(bLabel)).addGap(19).addComponent(okayButton)));
		setLayout(groupLayout);
	}

	private void setupLayout()
	{

		rField.setText(Integer.toString(rValue));
		gField.setText(Integer.toString(gValue));
		bField.setText(Integer.toString(bValue));

		blueButton.setBackground(new Color(0, 0, 255));
		blueButton.setContentAreaFilled(false);
		blueButton.setOpaque(true);

		greenButton.setBackground(new Color(0, 255, 0));
		greenButton.setContentAreaFilled(false);
		greenButton.setOpaque(true);

		redButton.setBackground(new Color(255, 0, 0));
		redButton.setContentAreaFilled(false);
		redButton.setOpaque(true);

		cyanButton.setBackground(new Color(0, 255, 255));
		cyanButton.setContentAreaFilled(false);
		cyanButton.setOpaque(true);

		yellowButton.setBackground(new Color(255, 255, 0));
		yellowButton.setContentAreaFilled(false);
		yellowButton.setOpaque(true);

		blackButton.setBackground(new Color(0, 0, 0));
		blackButton.setContentAreaFilled(false);
		blackButton.setOpaque(true);

		whiteButton.setBackground(new Color(255, 255, 255));
		whiteButton.setContentAreaFilled(false);
		whiteButton.setOpaque(true);

		pinkButton.setBackground(new Color(255, 150, 150));
		pinkButton.setContentAreaFilled(false);
		pinkButton.setOpaque(true);

		purpleButton.setBackground(new Color(150, 50, 255));
		purpleButton.setContentAreaFilled(false);
		purpleButton.setOpaque(true);

		lPurpleButton.setBackground(new Color(75, 25, 255));
		lPurpleButton.setContentAreaFilled(false);
		lPurpleButton.setOpaque(true);

		majentaButton.setBackground(new Color(255, 0, 255));
		majentaButton.setContentAreaFilled(false);
		majentaButton.setOpaque(true);

		skyBlueButton.setBackground(new Color(100, 150, 255));
		skyBlueButton.setContentAreaFilled(false);
		skyBlueButton.setOpaque(true);

		orangeButton.setBackground(new Color(255, 150, 10));
		orangeButton.setContentAreaFilled(false);
		orangeButton.setOpaque(true);

		yellowOrangeButton.setBackground(new Color(255, 200, 10));
		yellowOrangeButton.setContentAreaFilled(false);
		yellowOrangeButton.setOpaque(true);

		greyButton.setBackground(new Color(100, 100, 100));
		greyButton.setContentAreaFilled(false);
		greyButton.setOpaque(true);

		previewButton.setBackground(new Color(baseController.getBackgroundRValue(), baseController.getBackgroundGValue(), baseController.getBackgroundBValue()));
		previewButton.setContentAreaFilled(false);
		previewButton.setOpaque(true);

	}

	private void setupListeners()
	{
		okayButton.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent click)
			{
				if (background)
				{
					rValue = Integer.parseInt(rField.getText());
					gValue = Integer.parseInt(gField.getText());
					bValue = Integer.parseInt(bField.getText());

					if (rValue > 255 || gValue > 255 || bValue > 255)
					{
						JOptionPane.showMessageDialog(thisFrame, "Please choose values\nbetween 0-255");
					}
					else
					{
//						pressedButton.setBorder(BorderFactory.createLineBorder(new Color(rValue, gValue, bValue)));

						baseController.setBackgroundRValue(rValue);
						baseController.setBackgroundGValue(gValue);
						baseController.setBackgroundBValue(bValue);

						drawingCanvas.setBackground(new Color(rValue, gValue, bValue));
						thisFrame.dispose();
						appFrame.enable();
						appFrame.setAlwaysOnTop(true);
						appFrame.setAlwaysOnTop(false);
					}
				}
				else
				{
					rValue = Integer.parseInt(rField.getText());
					gValue = Integer.parseInt(gField.getText());
					bValue = Integer.parseInt(bField.getText());

					if (rValue > 255 || gValue > 255 || bValue > 255)
					{
						JOptionPane.showMessageDialog(thisFrame, "Please choose values\nbetween 0-255");
					}
					else
					{
//						pressedButton.setBorder(BorderFactory.createLineBorder(new Color(rValue, gValue, bValue)));

						baseController.setDrawingRValue(rValue);
						baseController.setDrawingGValue(gValue);
						baseController.setDrawingBValue(bValue);
						
						baseController.updateDrawingColor();
						thisFrame.dispose();
						appFrame.enable();
						appFrame.setAlwaysOnTop(true);
						appFrame.setAlwaysOnTop(false);
					}
				}
			}
		});
		

	}

}
