import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GUI extends JFrame
   implements ActionListener {

   JButton squareButton, rectangleButton, circleButton, undoButton;
   Command square = new Square();
   Command rectangle = new Rectangle();
   Command circle = new Circle();
   Command undo = new Undo();
   
   public GUI() {
      super("Undo Commands");
      JPanel jp = new JPanel();
      getContentPane().add(jp);
      jp.setLayout(new BorderLayout());
      JPanel bp = new JPanel();
      bp.setLayout(new GridLayout(1, 4));
      jp.add("South", bp);
      paintPanel cp = new paintPanel();
      jp.add("Center", cp);

      squareButton = new JButton("Square");
      rectangleButton = new JButton("Rectangle");
      circleButton = new JButton("Circle");
      undoButton = new JButton("Undo");

      bp.add(squareButton);
      bp.add(rectangleButton);
      bp.add(circleButton);
      bp.add(undoButton);
      setSize(new Dimension(400, 400));
      setVisible(true);
     

   }
   public void actionPerformed(ActionEvent e) {
      
   }

   static public void main(String argv[]) {
      new GUI();
   }
   //============================
   public class paintPanel extends JPanel {
      public void paint(Graphics g) {
       Dimension sz = getSize();
       g.setColor(Color.lightGray );
       g.fillRect (0, 0, sz.width , sz.height );
    }
   }
}
