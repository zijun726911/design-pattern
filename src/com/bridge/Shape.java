package com.bridge;

public abstract class Shape {
	   protected DrawAPI drawAPI;//�Ž�ģʽ�Ĺؼ���
	   						//��һ������ʵ�ֵĽӿڣ������๹�����������ʵ�ֵĽӿڵ�ʵ��
	   protected Shape(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();  
	}
