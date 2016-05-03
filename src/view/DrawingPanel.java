package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.*;
import java.util.*;
import view.*;

public class DrawingPanel extends JPanel
{
	private DrawingController baseController;
	private ShapePanel shapePanel;
	private JButton addRectangleButton;
	private JButton addCircleButton;
	private JButton addSquareButton;
	private JButton addTriangleButton;
	private JButton addEllipseButton;
	private JButton addPolygonButton;
	private JButton clearButton;	
	private SpringLayout baseLayout;
	private ArrayList<Rectangle> rectangleList;
	
	public DrawingPanel(DrawingController baseController) 
	{
		this.baseController = baseController;
		addRectangleButton = new JButton("Add a rectangle");
		addPolygonButton = new JButton("add a polygon");
		rectangleList = new ArrayList<Rectangle>();
		shapePanel = new ShapePanel();
		baseLayout = new  SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}		
	private void setupPanel()
	{
		
		this.setLayout(baseLayout);
		this.setBackground(Color.DARK_GRAY);
		this.add(shapePanel);
		this.add(addRectangleButton);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, addRectangleButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addRectangleButton, -10, SpringLayout.SOUTH, this);
	}
	private void setupListeners()
	{
		addRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				int xPosition = (int)(Math.random() * getWidth());
				int yPosition = (int)(Math.random() * getHeight());
				int width = (int)(Math.random()* 100);
				int height = (int)(Math.random()* 100);
				rectangleList.add(new Rectangle(xPosition,yPosition,width,height));
				
				repaint();
			}
		});
		addPolygonButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		
		});
	}
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		mainGraphics.setStroke(new BasicStroke(2));
		mainGraphics.setColor(Color.BLUE);
		mainGraphics.drawRect(50, 70, 200, 20);
		
		for(Rectangle current : rectangleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random()* 256);
			int blue = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.fill(current);
		}
	}
}
