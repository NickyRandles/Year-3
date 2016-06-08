package lab01_part01;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import com.sun.opengl.util.*;
public class Line implements GLEventListener {

	public static void main(String[] args) {
		GLProfile glp = GLProfile.getDefault();
		GLCapabilities caps = new GLCapabilities(glp);
		GLCanvas canvas = new GLCanvas(caps);
		
		Frame frame = new Frame("AWT Window Test");
		frame.setSize(300, 300);
		frame.add(canvas);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		canvas.addGLEventListener(new Line());
		Animator animator = new FPSAnimator(canvas, 60);
		animator.add(canvas);
		animator.start();

	}

	public void display(GLAutoDrawable drawable) {
		update();
		render(drawable);
	}
	
	private void update() {
	    
	}
	
	private void render(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		double x0, y0, xf, yf, m, e, x, y;
		x0=0; y0=0;
		xf=200; yf=70;
		m= yf/xf;
		e=0;
		x=0; y=0;
		gl.glColor3f(1,  0, 0);
		gl.glBegin(GL.GL_POINTS);
		
			gl.glVertex2d(x0, y0);
			for(x = x0+1; x <= xf; x++){
				if(e+m > 0.5){
					y = y+1;
					gl.glVertex2d(x, y);
					e = e+m;
				}
			}
		gl.glEnd();
	}



	public void dispose(GLAutoDrawable drawable) {
		
	}

	public void init(GLAutoDrawable drawable) {
    	GL2 gl = drawable.getGL().getGL2();
    	gl.glMatrixMode(gl.GL_PROJECTION);
    	gl.glLoadIdentity();
    	gl.glOrtho(0, 300, 0, 300, -1, 1);
    	gl.glViewport(0, 0, 300, 300);

	}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width,
			int height) {
		
	}
	
	
}
