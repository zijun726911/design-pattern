package com.Facade;

public class ShapeMaker {
	   private Shape circle;
	   private Shape rectangle;
	   private Shape square;
	 
	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	     
	   }
	 
	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   
	}
