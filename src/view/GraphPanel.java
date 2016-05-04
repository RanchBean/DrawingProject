package view;
import java.awt.*;

public class GraphPanel extends JPanel
{
 private int[] graphSource;
 public GraphPanel()
 {
	 graphSource = new int[]{2,4,213,10,20,12,75};
	 setuPanel();
 }
 private void setupPanel()
 {
	 this.setBackground(Color.LIGHT_GRAY);
 }
 @Override
 proctected void  paintComponenet(Graphics currentGraphics)
 {
	 super.paintCompenet(currentGraphics);
	 Graphics2D mainGraphics = (Graphics2D) currentGraphcis
 }
}
