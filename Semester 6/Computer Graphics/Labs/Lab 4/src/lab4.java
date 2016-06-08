
import java.awt.*;
import java.awt.event.*;

import javax.media.opengl.*;
import javax.media.opengl.awt.*;
import javax.media.opengl.fixedfunc.*;
import javax.media.opengl.glu.*;

import com.sun.opengl.util.*;
import com.sun.opengl.util.gl2.GLUT;

public class lab4 implements GLEventListener, KeyListener {
	
	GLProfile glp;
	GLCapabilities caps;
	GLCanvas canvas;
	GLU glu;
	private static int angle = 0;
	
	public lab4()
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
		new lab4();
    }

	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();	
		GLU glu = new GLU();
		GLUT glut = new GLUT();
		gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
		gl.glRotated ( angle, 1,0, 0);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity();
    	glu.gluLookAt(30,30,30,0,0,0,0,1,0);
    	
    	gl.glEnable(GL.GL_CULL_FACE);
    	gl.glCullFace(GL.GL_BACK);
    	gl.glEnable(GL.GL_DEPTH_TEST);

    	gl.glEnable(GL2.GL_LIGHTING);
    	gl.glEnable(GL2.GL_LIGHT0);
    	float [] whiteLight = {1, 1, 1, 1};
    	float [] ambientLight = {0.1f, 0.1f, 0.1f, 1.0f}; //default
    	gl.glGetLightfv(GL2.GL_LIGHT0, GL2.GL_DIFFUSE, whiteLight,0);
    	gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_SPECULAR, whiteLight,0);
    	gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_AMBIENT, ambientLight,0);

    	float [] lightPosition = {25, 25, 25, 1};
    	gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, lightPosition,0);

    	float [] diffuse_mp = {1.0f,0.0f,0.0f,1.0f};//red
    	gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_DIFFUSE, diffuse_mp,0);
    	float[] no_rgba = {0.0f, 0.0f, 0.0f};
    	gl.glMaterialfv(GL.GL_FRONT, GLLightingFunc.GL_SPECULAR,no_rgba, 0);

    	gl.glRotated ( angle, 0,1, 0);  
    
    	 gl.glNormal3f(0, 0, 1);
    		gl.glBegin(GL2.GL_POLYGON);
    			 gl.glVertex3f(8,10,4);
    			 gl.glVertex3f(-8,10,4);
    			 gl.glVertex3f(-8,0,4);
    			 gl.glVertex3f(8,0,4);
    		gl.glEnd();

    	gl.glNormal3f(0, 0, -1);
    		gl.glBegin(GL2.GL_POLYGON);
    			gl.glVertex3f(8,10,-4);
    			gl.glVertex3f(8,0,-4);
    			gl.glVertex3f(-8,0,-4);
    			gl.glVertex3f(-8,10,-4);
    		gl.glEnd();

    	gl.glNormal3f(1, 0, 0);
    		gl.glBegin(GL2.GL_POLYGON);
    				gl.glVertex3f(8,14,0);
    				gl.glVertex3f(8,10,4);
    				gl.glVertex3f(8,0,4);
    				gl.glVertex3f(8,0,-4);
    				gl.glVertex3f(8,10,-4);
    		gl.glEnd();

    	gl.glNormal3f(-1, 0, 0);
    		gl.glBegin(GL2.GL_POLYGON);
    			gl.glVertex3f(-8,14,0);
    			gl.glVertex3f(-8,10,-4);
    			gl.glVertex3f(-8,0,-4);
    			gl.glVertex3f(-8,0,4);
    			gl.glVertex3f(-8,10,4);
    		gl.glEnd();

    	gl.glNormal3f(0, -1, 0);
    		gl.glBegin(GL2.GL_POLYGON);
    			gl.glVertex3f(8,0,4);
    			gl.glVertex3f(-8,0,4);
    			gl.glVertex3f(-8,0,-4);
    			gl.glVertex3f(8,0,-4);
    		gl.glEnd();

    	gl.glNormal3f(0, 1, 1);
    		gl.glBegin(GL2.GL_POLYGON);
    			 gl.glVertex3f(8,10,4);
    			 gl.glVertex3f(8,14,0);
    			 gl.glVertex3f(-8,14,0);
    			 gl.glVertex3f(-8,10,4);
    		gl.glEnd();

    	gl.glNormal3f(0, 1, -1);
    		gl.glBegin(GL2.GL_POLYGON);
    			gl.glVertex3f(8,10,-4);
    			gl.glVertex3f(-8,10,-4);
    			gl.glVertex3f(-8,14,0);
    			gl.glVertex3f(8,14,0);
    		gl.glEnd();
    		
        gl.glTranslatef(-10, 10, 10); 
		float n = 10;
    	//gl.glColor3f(0, 0, 1); // Blue
    	
        gl.glTranslatef(1.0f, 0.0f, 1.0f);
        float[] rgba = {0.8f, 0.8f, 0.8f};
        float [] diffuse_mp1 = {0.0f,0.0f,1.0f};//Blue
       
    	gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL2.GL_DIFFUSE, diffuse_mp1,0);
    	gl.glMaterialf(GL.GL_FRONT_AND_BACK,GLLightingFunc.GL_SHININESS,n); 
    	gl.glMaterialfv(GL.GL_FRONT, GLLightingFunc.GL_SPECULAR, rgba, 0);
    	gl.glShadeModel(GL2.GL_SMOOTH);
        glut.glutSolidSphere(5,15,15);		
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
	
	public void keyReleased(KeyEvent arg0) {}
	
	public void keyPressed(KeyEvent e) {
		 switch (e.getKeyCode()) {
			 case KeyEvent.VK_UP: angle = (angle + 10) % 360; break;		  
			 case KeyEvent.VK_DOWN: angle = (angle - 10) % 360; break;			 
			 default: break;
		 }
		
		 System.out.println("Angle: " + angle);
    }

	public void keyTyped(KeyEvent arg0) {}
	
}
