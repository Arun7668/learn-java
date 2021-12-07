package com.newproject.producer;

public class producer implements IProducer {
		// TODO Auto-generated method stub
	    @Override
		public void show() {
			notExposed(10,2);
			System.out.println("i am the show");
		}
	    @Override
		public void disp() {
			notExposed(10,5);
			System.out.println("i am the disp");
		}
		public void notExposed(int x,int y) {
			System.out.println("i am the notExposed.."+(x*y));
		}

}
