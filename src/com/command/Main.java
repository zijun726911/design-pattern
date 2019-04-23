package com.command;

public class Main {
	public static void main(String[] args) {
		
		
	      Stock abcStock = new Stock();
	      //命令对象包裹被处理对象，执行命令对象
	      Order buyStockOrder = new BuyStock(abcStock);
	      Order sellStockOrder = new SellStock(abcStock);
	 
	      Broker broker = new Broker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);
	 
	      broker.placeOrders();
	   }
}
