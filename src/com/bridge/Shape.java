package com.bridge;

public abstract class Shape {
	   protected DrawAPI drawAPI;//桥接模式的关键，
	   						//放一个具体实现的接口，其子类构造器放入具体实现的接口的实现
	   protected Shape(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();  
	}
