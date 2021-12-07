package com.newproject.producer;

public class Fastproducer implements IProducer{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(" iam fast show");
		iamNotExposed();
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("i am fast disp ");
		iamNotExposed() ;
		
	}
	public void iamNotExposed() {
		System.out.println("i Am Not Exposed");
	}

}
