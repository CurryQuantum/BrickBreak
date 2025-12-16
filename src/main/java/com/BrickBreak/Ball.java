package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	
	
	private int radius1 = 0;
	private int x1 = 0;
	private int y1 = 0;
	int Xvelocity = 3;
	int Yvelocity = 3;
	//constructor(s):
	public  Ball(int x, int y, int radius){
       x1 = x;
	   y1 = y;
	   radius1 = radius;
	}
	//methods:
    public void draw(Graphics g){
    g.setColor(Color.white);
    
    g.fillOval(x1, y1, radius1, radius1);

   }
   public void setX(int x2){
     x1 = x2; 
	 
   }
   public void setY(int y2){
     y1 = y2; 
   }
   public void setXVelocity(int y2){
     Xvelocity = y2; 
   }
   public void setYVelocity(int y2){
     Yvelocity = y2; 
   }
   public int getYpos(){
     return y1; 
   }
   
   public int getXpos(){
     return x1; 
   }
    public int getSize(){
     return x1; 
   }
    public void move(){
     x1 += Xvelocity;
     y1 += Yvelocity;

   }
    public void reverseY(){
    Yvelocity*=-1;
   }
    public void reverseX(){
    Xvelocity*=-1;
   }

   
}
