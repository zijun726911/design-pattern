package com.decorator;

public class RedShapeDecorator extends ShapeDecorator {
	 
	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);     
	   }
	 
	   @Override
	   public void draw() {
	      decoratedShape.draw();         
	      setRedBorder(decoratedShape);//添加新功能
	   }
	 
	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
	}
