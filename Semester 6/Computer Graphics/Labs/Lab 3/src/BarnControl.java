
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.fixedfunc.GLMatrixFunc;
import javax.media.opengl.glu.*;

import com.sun.opengl.util.Animator;
import com.sun.opengl.util.FPSAnimator;


public class BarnControl implements GLEventListener, KeyListener {
	
	GLProfile glp;
	GLCapabilities caps;
	GLCanvas canvas;
	GLU glu;
	double xcam =30 ,ycam =30 ,zcam =30;
	double theta = 1; 
	float [] lightPosition0 = {10,30,30,1};
	boolean rotating = false;
	
	public BarnControl()
	{
		glp = GLProfile.getDefault();
        caps = new GLCapabilities(glp);
        canvas = new GLCanvas(caps);
        glu = new GLU();
        
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
		new BarnControl();  
    }

	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();	
		GLU glu = new GLU();
		gl.glClear(GL.GL_COLOR_BUFFER_BIT);
		
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity();
		glu.gluLookAt(xcam,ycam,zcam,0,0,0,0,1,0);
    	
		gl.glBegin(GL.GL_LINE_LOOP);
			gl.glVertex3f(8,10,-4);
			gl.glVertex3f(8,0,-4);
			gl.glVertex3f(-8,0,-4);
			gl.glVertex3f(-8,10,-4);
		gl.glEnd();

		gl.glBegin(GL.GL_LINE_LOOP);
			gl.glVertex3f(8,14,0);
			gl.glVertex3f(8,10,4);
			gl.glVertex3f(8,0,4);
			gl.glVertex3f(8,0,-4);
			gl.glVertex3f(8,10,-4);
		gl.glEnd();

		gl.glBegin(GL.GL_LINE_LOOP);
			gl.glVertex3f(-8,14,0);
			gl.glVertex3f(-8,10,-4);
			gl.glVertex3f(-8,0,-4);
			gl.glVertex3f(-8,0,4);
			gl.glVertex3f(-8,10,4);
		gl.glEnd();

		gl.glBegin(GL.GL_LINE_LOOP);
			gl.glVertex3f(8,10,4);
			gl.glVertex3f(8,14,0);
			gl.glVertex3f(-8,14,0);
			gl.glVertex3f(-8,10,4);
		gl.glEnd();

		gl.glBegin(GL.GL_LINE_LOOP);
			gl.glVertex3f(8,10,-4);
			gl.glVertex3f(-8,10,-4);
			gl.glVertex3f(-8,14,0);
			gl.glVertex3f(8,14,0);
		gl.glEnd();

		gl.glBegin(GL.GL_LINE_LOOP);
			gl.glVertex3f(8,0,4);
			gl.glVertex3f(-8,0,4);
			gl.glVertex3f(-8,0,-4);
			gl.glVertex3f(8,0,-4);
		gl.glEnd();
		
		gl.glColor3f(255,255,255);	
	}

	public void dispose(GLAutoDrawable drawable) {}

	public void init(GLAutoDrawable drawable) {}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width,int height) {
		GL2 gl = drawable.getGL().getGL2();
		GLU glu = new GLU();
		
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GLMatrixFunc.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45,1,1,75);
	}
	
	public void moveCam() {
		double r;
		theta += 0.005;
		if (theta > 360)
			theta = 0;
		r = sqrt(xcam*xcam + zcam*zcam);
		xcam = r*Math.cos(theta);
		zcam = r*Math.sin(theta);


	}
	
	private double sqrt(double d) {
		return 0;
	}

	public void keyPressed(KeyEvent arg0) {
		 if(arg0.getKeyCode() == KeyEvent.VK_R)
		    {
		        rotating = !rotating;
		    }
	}

	public void keyReleased(KeyEvent arg0) {}

	public void keyTyped(KeyEvent arg0) {}
	
}
