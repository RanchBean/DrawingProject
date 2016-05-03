package view;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Rectangle> squareList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	public ShapePanel()
	{
		rectangleList = new ArrayList<Rectangle>();
		squareList = new ArrayList<Rectangle>();
		ellipseList = new ArrayList<Ellipse2D>(); 
		circleList = new ArrayList<Ellipse2D>();
		triangleList = new ArrayList<Polygon>(); 
		polygonList = new ArrayList<Polygon>(); 
	}
	private void drawShapeList(Graphics2D mainGraphics, ArrayList shapes)
	{
		for(Object current : shapes)
		{
			
		}
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		for(Polygon currentTriangle : triangleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random()* 256);
			int blue = (int)(Math.random() * 256);
			int penSize = (int)(Math.random() * 10) + 3;
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.setStroke(new BasicStroke(stroke));
			mainGraphics.draw(currentTriangle);
		}
		for(Polygon current : polygonList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random()* 256);
			int blue = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.setStroke(new BasicStroke(stroke));
			mainGraphics.draw(current);
		}
	}
	
}
