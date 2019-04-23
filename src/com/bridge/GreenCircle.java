package com.bridge;

import java.util.function.Function;

public class GreenCircle implements DrawAPI {
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: green, radius: "
	         + radius +", x: " +x+", "+ y +"]");
	   }
	   
	   
	   public static void main(String[] args) {
		   
		   Function<Integer,String> t=i->"a"+i;
		  System.out.println(t.apply(1));
	}
	   
	}


@FunctionalInterface
interface T{
	String convert(int i);
}