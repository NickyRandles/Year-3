package assignment;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.fixedfunc.*;
import javax.media.opengl.glu.*;

import com.sun.opengl.util.*;


public class Assignment implements GLEventListener, ActionListener, KeyListener {
	
	GLProfile glp;
	GLCapabilities caps;
	GLCanvas canvas;
	GLU glu;
	float door_y = 90f;
	int abc = 1, bcd = 2;
	double angle = 0;
	private int wood_tex;	
	double eyeX = 20, eyeZ = 20;
	double r = 15;
	float rotate = 0f, rotateDoor = 0f, scale = 1f;
	float transY = 0f, transX = 0f, transZ = 0f;
	MenuItem item1, item2, item3;
	boolean doorOpening = false;
	float doorX = 2, doorY = 7, doorZ = 4;
	float doorOpen = 0f;
	int angleOfTheDoor = 0;
	private boolean lightOn = false, textureOn = false, rotationOn = false;
	TextureReader.Texture texture = null;
	
	public Assignment()
	{
		glp = GLProfile.getDefault();
        caps = new GLCapabilities(glp);
        canvas = new GLCanvas(caps);
        glu = new GLU();
       
        Frame frame = new Frame("House Assignment");
        frame.setSize(600, 600);
        frame.add(canvas);
        frame.setVisible(true);
        
        MenuBar menu = new MenuBar();
        frame.setMenuBar(menu);
        Menu options = new Menu("Options");
        menu.add(options);
        item1 = new MenuItem("Turn Lighting on/off");
        options.add(item1);
        item1.addActionListener(this);
        item2 = new MenuItem("Turn Texturing on/off");
        options.add(item2);
        item2.addActionListener(this);
        item3 = new MenuItem("Turn Viewer/Camera rotation on/off");
        options.add(item3);
        item3.addActionListener(this);
        options.add(item3);
        
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
		new Assignment();
    }

	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();	
		GLU glu = new GLU();
		gl.glBindTexture(GL.GL_TEXTURE_2D, wood_tex);
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
    	
    	if(lightOn){
    		gl.glDisable(GL2.GL_LIGHT0); 
    	}
    	else{
    		gl.glEnable(GL2.GL_LIGHT0);
    	}  
    	if(textureOn){
    		gl.glDisable(GL.GL_TEXTURE_2D);
    	}
    	else{
    		gl.glEnable(GL.GL_TEXTURE_2D);
    	} 
    	if(rotationOn){ 
    		angle += 0.1;
    	}
    	
    	float [] lightPosition = {25, 25, 25, 1};
    	gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, lightPosition,0);

		eyeX = r * (Math.sin(angle));
		eyeZ = r * (Math.cos(angle));
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity();
		glu.gluLookAt(eyeX, 15, eyeZ, 0, 0, 0, 0, 1, 0);
		gl.glRotatef(rotate, 0.0f, 1.0f, 0.0f);
		gl.glScalef(scale, scale, scale);
		gl.glTranslatef(transX,transY,transZ);
    	gl.glRotated ( angle, 0, 1, 0);  
    
        wood_tex = loadTexture("wall1.png",gl);
	    gl.glNormal3f(0, 0, 1);
		    gl.glBegin(GL2.GL_POLYGON);
		         gl.glTexCoord2f(0.0f, 0.0f);
			     gl.glVertex3f(-2,10,4);
			     gl.glTexCoord2f(1.0f, 0.0f);
			     gl.glVertex3f(-8,10,4);
			     gl.glTexCoord2f(1.0f, 1.0f);
			     gl.glVertex3f(-8,0,4);
			     gl.glTexCoord2f(0.0f, 1.0f);
			     gl.glVertex3f(-2,0,4);
		    gl.glEnd();
 		    
	    wood_tex = loadTexture("wall1.png",gl);
	    gl.glNormal3f(0, 0, 1);
		    gl.glBegin(GL2.GL_POLYGON);
		         gl.glTexCoord2f(0.0f, 0.0f);
			     gl.glVertex3f(8,10,4);
			     gl.glTexCoord2f(1.0f, 0.0f);
			     gl.glVertex3f(2,10,4);
			     gl.glTexCoord2f(1.0f, 1.0f);
			     gl.glVertex3f(2,0,4);
			     gl.glTexCoord2f(0.0f, 1.0f);
			     gl.glVertex3f(8,0,4);
		    gl.glEnd();
	 		
	    wood_tex = loadTexture("topwall.png",gl);
	    gl.glNormal3f(0, 0, 1);
		    gl.glBegin(GL2.GL_POLYGON);
		         gl.glTexCoord2f(0.0f, 0.0f);
			     gl.glVertex3f(2,10,4);
			     gl.glTexCoord2f(1.0f, 0.0f);
			     gl.glVertex3f(-2,10,4);
			     gl.glTexCoord2f(1.0f, 1.0f);
			     gl.glVertex3f(-2,7,4);
			     gl.glTexCoord2f(0.0f, 1.0f);
			     gl.glVertex3f(2,7,4);
		    gl.glEnd();
	 	 		   
		wood_tex = loadTexture("door.png",gl);
		gl.glPushMatrix();
			gl.glTranslatef(doorX, doorY, doorZ);	  
			gl.glRotatef (doorOpen, 0 , 1 ,0);
			gl.glTranslatef(-doorX, -doorY, -doorZ);
			drawDoor(drawable, doorX, doorY, doorZ);	  
 	  	gl.glPopMatrix();
 		
		wood_tex = loadTexture("wall2.png",gl);
		gl.glNormal3f(0, 0, -1);
			gl.glBegin(GL2.GL_POLYGON);
			    gl.glTexCoord2f(0.0f, 0.0f);
				gl.glVertex3f(8,10,-4);
				gl.glTexCoord2f(1.0f, 0.0f);
				gl.glVertex3f(8,0,-4);
				gl.glTexCoord2f(1.0f, 1.0f);
				gl.glVertex3f(-8,0,-4);
				gl.glTexCoord2f(0.0f, 1.0f);
				gl.glVertex3f(-8,10,-4);
			gl.glEnd();

     	wood_tex = loadTexture("walls2.png",gl);
   		gl.glNormal3f(1, 0, 0);
			gl.glBegin(GL2.GL_POLYGON);
			        gl.glTexCoord2f(0.0f, 0.0f);
					gl.glVertex3f(8,14,0);
					gl.glTexCoord2f(1.0f, 0.0f);
					gl.glVertex3f(8,10,4);
					gl.glTexCoord2f(1.0f, 1.0f);
					gl.glVertex3f(8,0,4);
					gl.glTexCoord2f(0.0f, 1.0f);
					gl.glVertex3f(8,0,-4);
					gl.glTexCoord2f(1.0f, 0.0f);
					gl.glVertex3f(8,10,-4);
			gl.glEnd();

   		wood_tex = loadTexture("walls2.png",gl);
    	gl.glNormal3f(-1, 0, 0);
    		gl.glBegin(GL2.GL_POLYGON);
    		    gl.glTexCoord2f(0.0f, 0.0f);
    			gl.glVertex3f(-8,14,0);
    			gl.glVertex3f(-8,10,-4);
    			gl.glTexCoord2f(1.0f, 1.0f);
    			gl.glVertex3f(-8,0,-4);
    			gl.glTexCoord2f(0.0f, 1.0f);
    			gl.glVertex3f(-8,0,4);
    			gl.glTexCoord2f(1.0f, 0.0f);
    			gl.glVertex3f(-8,10,4);
    		gl.glEnd();

     	wood_tex = loadTexture("wood_tex1.png",gl);
    	gl.glNormal3f(0, -1, 0);
    		gl.glBegin(GL2.GL_POLYGON);
    		    gl.glTexCoord2f(0.0f, 0.0f);
    			gl.glVertex3f(8,0,4);
    			gl.glTexCoord2f(1.0f, 0.0f);
    			gl.glVertex3f(-8,0,4);
    			gl.glTexCoord2f(1.0f, 1.0f);
    			gl.glVertex3f(-8,0,-4);
    			gl.glTexCoord2f(0.0f, 1.0f);
    			gl.glVertex3f(8,0,-4);
    		gl.glEnd();

		wood_tex = loadTexture("roof1.png",gl);
    	gl.glNormal3f(0, 1, 1);
    		gl.glBegin(GL2.GL_POLYGON);
    		     gl.glTexCoord2f(0.0f, 0.0f);
    			 gl.glVertex3f(8,10,4);
    			 gl.glTexCoord2f(1.0f, 0.0f);
    			 gl.glVertex3f(8,14,0);
    			 gl.glTexCoord2f(1.0f, 1.0f);
    			 gl.glVertex3f(-8,14,0);
    			 gl.glTexCoord2f(0.0f, 1.0f);
    			 gl.glVertex3f(-8,10,4);
    		gl.glEnd();

		wood_tex = loadTexture("roof1.png",gl);
		gl.glNormal3f(0, 1, -1);
    		gl.glBegin(GL2.GL_POLYGON);
    		    gl.glTexCoord2f(0.0f, 0.0f);
    			gl.glVertex3f(8,10,-4);
    			gl.glTexCoord2f(1.0f, 0.0f);
    			gl.glVertex3f(-8,10,-4);
    			gl.glTexCoord2f(1.0f, 1.0f);
    			gl.glVertex3f(-8,14,0);
    			gl.glTexCoord2f(0.0f, 1.0f);
    			gl.glVertex3f(8,14,0);
    		gl.glEnd();
    		
    		addlight(drawable);   	
	}

	private void addlight(GLAutoDrawable drawable) {}
	
	public void update(GLAutoDrawable drawable) {
		if(!doorOpening && angleOfTheDoor > 0){
			angleOfTheDoor -= 1;
	    }
	    if(doorOpening && angleOfTheDoor < 90){
	    	angleOfTheDoor += 1;
	    }
	}

	public void dispose(GLAutoDrawable drawable) {}

	public void init(GLAutoDrawable gLDrawable) {}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width,int height) {
		GL2 gl = drawable.getGL().getGL2();
		gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GLMatrixFunc.GL_PROJECTION);
        gl.glLoadIdentity();
    	gl.glOrthof(-10.0f, 10.0f, -10.0f, 15.0f, 50.0f, -30.0f);	
	}
	
	public void drawDoor(GLAutoDrawable drawable , float xDoor, float yDoor,float zDoor){
		GL2 gl = drawable.getGL().getGL2();
		gl.glNormal3f(0, 0, 1);
			gl.glBegin(GL2.GL_POLYGON);
			     gl.glTexCoord2f(0.0f, 0.0f);
				 gl.glVertex3f(xDoor,yDoor,zDoor);
				 gl.glTexCoord2f(1.0f, 0.0f);
				 gl.glVertex3f(-xDoor,yDoor,zDoor);
				 gl.glTexCoord2f(1.0f, 1.0f);
				 gl.glVertex3f(-xDoor,yDoor-7,zDoor);
				 gl.glTexCoord2f(0.0f, 1.0f);
				 gl.glVertex3f(xDoor,yDoor-7,zDoor);
			gl.glEnd();
	}
	
	private void makeRGBTexture(GL gl, GLU glu, TextureReader.Texture img, int target, boolean mipmapped) {   
			if (mipmapped) {
				glu.gluBuild2DMipmaps(target, GL.GL_RGB8, img.getWidth(), 
				img.getHeight(), GL.GL_RGB, GL.GL_UNSIGNED_BYTE, img.getPixels());
			} 
			else {
				gl.glTexImage2D(target, 0, GL.GL_RGB, img.getWidth(), 
				img.getHeight(), 0, GL.GL_RGB, GL.GL_UNSIGNED_BYTE, img.getPixels());
			}
	 }

    private int genTexture(GL gl) {
        final int[] tmp = new int[1];
        //glGenTextures generates an unused integer id for the texture were about
    	//to create, we can use this to reference the texture in future
        gl.glGenTextures(1, tmp, 0);
        return tmp[0];
    }
    
    private int loadTexture(String filename, GL gl)
    {
    	int tex_id = genTexture(gl);//create an unused id for the texture
    	//we must inform openGL that this texture should become the current texture
    	//so subsequent texture functions will apply it, like the ones below
        gl.glBindTexture(GL.GL_TEXTURE_2D, tex_id);
        //read in the image
        try {
            texture = TextureReader.readTexture(filename);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        //make an openGL texture from the image
        makeRGBTexture(gl, glu, texture, GL.GL_TEXTURE_2D, false);
        /*glTexParameteri is used to set various propertiers of the texturing procedure
    	all texture properties are set by glTexParameteri
        
        Each pixel in the rendered image corresponds to a small area on the surface of an object and
    	hence a small area of the texture map. If the object is far away from the viewer a single pixel
    	may be representative of a number of texels. If the object is close to the viewer a single texel 
    	may be representative of a number of pixels. This is called minification and magnification.
    	So openGL must either take the large area of the texture map and squash it into the smaller pixel
    	area or take the small texel area and magnify it so it fits into the larger pixel area.
    	The following function calls tell openGL how to do this
    	
    	GL_NEAREST and GL_LINEAR are two techniqes used for magnification/minification.
    	GL_NEAREST is faster but GL_LINEAR normally yields better results*/
        
        gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
        gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
        
        /* when using the 2D texture defined above, if the s texture coordinate goes outside of the
    	texture range (0->1) then clamp it, that is if its greater than 1 set it to one
    	if it is less than zeros set it to zero. Other option-> GL_REPEAT repeats the texure again
    	outside of the map bounds (0->1)*/

    	gl.glTexParameteri(GL.GL_TEXTURE_2D,GL.GL_TEXTURE_WRAP_S, GL2.GL_CLAMP);
    	
    	gl.glTexParameteri(GL.GL_TEXTURE_2D,GL.GL_TEXTURE_WRAP_T, GL2.GL_CLAMP);
        return tex_id;
    	
    }
	    
	public void keyReleased(KeyEvent arg0) {}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			angle += 0.05;
			eyeX = r * Math.sin(angle);
			eyeZ = r * Math.cos(angle);

		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			angle -= 0.05;

			eyeX = r * Math.sin(angle);
			eyeZ = r * Math.cos(angle);
		}

		if (e.getKeyCode() == KeyEvent.VK_R) {

			rotate += 0.5f;

		}

		if (e.getKeyCode() == KeyEvent.VK_S) {

			scale += 0.01f;

		}
		if (e.getKeyCode() == KeyEvent.VK_W) {

			scale -= 0.01f;

		}
		if (e.getKeyCode() == KeyEvent.VK_X) {

			transX += 0.1;

		}
		if (e.getKeyCode() == KeyEvent.VK_Y) {

			transY += 0.1;

		}
		if (e.getKeyCode() == KeyEvent.VK_Z) {

			transZ += 0.1;

		}
		if (e.getKeyCode() == KeyEvent.VK_O) {
			if (doorOpen <= 45){
				doorOpen += 1f;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_C) {
			if (doorOpen >= 0){
				doorOpen -= 1;
			}
		}
    }
	
	public void keyTyped(KeyEvent arg0) {}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == item1){
			lightOn = !lightOn;
		}
		if (e.getSource() == item2){
			
			textureOn = !textureOn;

		}
		if (e.getSource() == item3){	
            rotationOn = !rotationOn;
		}
	}	
}
