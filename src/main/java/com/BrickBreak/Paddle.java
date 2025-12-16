package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	
	int x1 = 0;
	int y1 = 0;
	int with1 = 0;
	int height1 = 0;
	double velocity = 1;
	//constructor(s):
	public Paddle (int x, int y, int with, int height){
	x1= x;
	y1 = y;
    with1 = with;
	height1 = height;
	}

	//methods:
    public void move(){
		x1 += velocity;
		
	}
	public int getX(){
		return x1;
		
	}
	public int getY(){
		return y1;
		
	}
	public int getWidth(){
		return with1;
		
	}
	public int getHeight(){
		return height1;
		
	}
	public double getVelocity(){
		return velocity;
		
	}
	public void addVelocity(int x){
		velocity = velocity + x;
		
	}
	public void setVelocity(int x){
		velocity = x;
		
	}
	public void setX(int x2){
     x1 = x2; 
	 
   }
     public void draw(Graphics g){
    g.setColor(Color.white);
    
    g.fillRect(x1, y1, with1, height1);

   }
	
	
}
