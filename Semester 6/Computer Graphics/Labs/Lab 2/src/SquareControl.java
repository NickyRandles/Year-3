import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.fixedfunc.GLMatrixFunc;

import com.sun.opengl.util.Animator;
import com.sun.opengl.util.FPSAnimator;

public class SquareControl implements GLEventListener, KeyListener {
	
	Square square = new Square(100,100,200,100,200,200,100,200);
	boolean rotating = false;
	boolean scaling = false;
	boolean enlarge = true;
	double theta = 1;
	double sx = 1.01, sy = 1.01;
	GLProfile glp;
	GLCapabilities caps;
	GLCanvas canvas;
	
	public SquareControl()
	{
		glp = GLProfile.getDefault();
        	caps = new GLCapabilities(glp);
        	canvas = new GLCanvas(caps);
        
        	Frame frame = new Frame("AWT Window Test");
        	frame.setSize(300, 300);
        	frame.add(canvas);
        	frame.setVisible(true);

        	frame.addWindowListener(new WindowAdapter() {
            		public void windowClosing(WindowEvent e) {
                	System.exit(0);
            		}
        	});

        	canvas.addGLEventListener(this);
        	canvas.addKeyListener(this);
        	canvas.requestFocus();
        	Animator animator = new FPSAnimator(canvas,60);
        	animator.add(canvas);
        	animator.start();
	}
	
	public static void main(String[] args) {
		new SquareControl();
	}
	
	public void update()
	{
		if (rotating){
			square.rotate(theta);
		}
		if (scaling){
			square.scale(sx, sy);
		}
	}

	public void display(GLAutoDrawable drawable) {
		update();
		GL2 gl = drawable.getGL().getGL2();
		gl.glClear(GL.GL_COLOR_BUFFER_BIT);
		gl.glColor3f(1, 0, 0);
		gl.glBegin(GL.GL_LINE_LOOP);
        		gl.glVertex2d(square.vertices[0][0], square.vertices[0][1]);
        		gl.glVertex2d(square.vertices[1][0], square.vertices[1][1]);
        		gl.glVertex2d(square.vertices[2][0], square.vertices[2][1]);
        		gl.glVertex2d(square.vertices[3][0], square.vertices[3][1]);
        	gl.glEnd();	
	}

	public void dispose(GLAutoDrawable drawable) {
		
	}

	public void init(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
    		gl.glMatrixMode(GLMatrixFunc.GL_PROJECTION);
    		gl.glLoadIdentity();
    		gl.glOrtho(0, 300, 0, 300, -1, 1);
    		gl.glViewport(0, 0, 300, 300);	
	}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
	
	}

	public void keyPressed(KeyEvent e) {	
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			square.translate(4, 0);
		else if (e.getKeyCode() == KeyEvent.VK_LEFT)
			square.translate(-4, 0);
		else if (e.getKeyCode() == KeyEvent.VK_UP)
			square.translate(0, 4);
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
			square.translate(0, -4);

		else if(e.getKeyCode() == KeyEvent.VK_R){
			rotating = true;
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			scaling = true;
		}	
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_Z){
			rotating = false;
		}	
	}

	public void keyTyped(KeyEvent arg0) {}
	
}

