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
	public void addTriangle()
	{
		int [] xPoints = new int[3];
		xPoints[0] = (int)(Math.random() * 150);
		xPoints[1] = (int)(Math.random() * 250);
		xPoints[2] = (int)(Math.random() * 350);
		
		int [] yPoints = {(int)(Math.random() * 250), (int)(Math.random() * 450), (int)(Math.random() * 250)};
		Polygon triangle = new Polygon(xPoints,yPoints, 3);
		triangleList.add(triangle);
		
	}
	public void addPolygon()
	{
		int numberOfSides = (int)(Math.random() * 9) +3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int[numberOfSides];
		for(int side = 0; side < numberOfSides; side ++)
		{
			xPoints [side] = (int)(Math.random() * 2000);
			yPoints [side] = (int)(Math.random() * 2000);
		}
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
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
			mainGraphics.setStroke(new BasicStroke(penSize));
			mainGraphics.draw(currentTriangle);
		}
		for(Polygon current : polygonList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random()* 256);
			int blue = (int)(Math.random() * 256);
			int penSize = (int)(Math.random() * 10);
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.setStroke(new BasicStroke(penSize));
			mainGraphics.draw(current);
		}
	}
	
}
