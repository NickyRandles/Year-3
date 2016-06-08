
public class Square {
	
	public double [][] vertices = new double[4][2]; 
	
	
	public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
	    vertices[0][0]=x1;
	    vertices[0][1]=y1;
	    vertices[1][0]=x2;
	    vertices[1][1]=y2;
	    vertices[2][0]=x3;
	    vertices[2][1]=y3;
	    vertices[3][0]=x4;
	    vertices[3][1]=y4;
	}
	
	public double area()
	{
		return (vertices[1][0]-vertices[0][0])*(vertices[1][0]-vertices[0][0])+(vertices[1][1]-vertices[0][1])*(vertices[1][1]-vertices[0][1]);
	}
	
	public void translate(double tx, double ty)
	{
		for(int i=0;i<vertices.length;i++)
		{
			vertices[i][0]+=tx;
			vertices[i][1]+=ty;
		}
	}
	public void rotate(double theta)
	{
	    double x = (vertices[0][0]+vertices[2][0])/2;
	    double y = (vertices[0][1]+vertices[2][1])/2;
	    double oldX;
	    int i;
	    
	    for(i = 0; i < 4; i++){
	        oldX = vertices[i][0];
	        vertices[i][0] = x + (vertices[i][0]-x)*Math.cos(theta*0.0174532925199)-(vertices[i][1]- y)*Math.sin(theta*0.0174532925199);
	        vertices[i][1] = y + (oldX-x)*Math.sin(theta*0.0174532925199)+(vertices[i][1]-y)*Math.cos(theta*0.0174532925199);
	    }
	}
	
	public void scale(double sx, double sy)
	{
		vertices[0][0]+=1;
	    vertices[0][1]+=1;
	    vertices[1][0]+=2;
	    vertices[1][1]+=1;
	    vertices[2][0]+=2;
	    vertices[2][1]+=2;
	    vertices[3][0]+=1;
	    vertices[3][1]+=2;
	}

}
