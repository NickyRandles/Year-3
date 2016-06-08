package jogl_first;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import com.sun.opengl.util.Animator;
import com.sun.opengl.util.FPSAnimator;


public class SimpleScene implements GLEventListener {

    private double theta = 0;
    private double s = 0;
    private double c = 0;

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

        canvas.addGLEventListener(new SimpleScene());

        Animator animator = new FPSAnimator(canvas,60);
        animator.add(canvas);
        animator.start();
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        update();
        render(drawable);
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
    }

    @Override
    public void init(GLAutoDrawable drawable) {
    	GL2 gl = drawable.getGL().getGL2();
    	gl.glMatrixMode(gl.GL_PROJECTION);
    	gl.glLoadIdentity();
    	//gl.glOrtho(0, 300, 0, 300, -1, 1);
    	//gl.glViewport(0, 0, 300, 300);
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int w, int h) {
    }

    private void update() {
        theta += 0.01;
        s = Math.sin(theta);
        c = Math.cos(theta);
    }

    private void render(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);

        // draw a triangle filling the window
        gl.glBegin(GL.GL_TRIANGLES);
	        gl.glColor3f(1, 0, 0);
	        gl.glVertex2d(-c, -c);
	        gl.glColor3f(0, 1, 0);
	        gl.glVertex2d(0, c);
	        gl.glColor3f(0, 0, 1);
	        gl.glVertex2d(s, -s);
        gl.glEnd();
        
        /*gl.glBegin(GL.GL_POINTS);
        	gl.glColor3f(1, 0, 0);
        	gl.glVertex2d(10, 10);
        gl.glEnd();*/
        	
    }
}
