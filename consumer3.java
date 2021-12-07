package com.newproject.consumer;

import com.newproject.producer.IProducer;
import com.newproject.util.Factory;

public class consumer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		producer p=new producer();
//		p.show();
//		p.disp();
//		p.notExposed();
//		IProducer p=new producer();
//		p.show();
//		p.disp();
		
		IProducer p= Factory.getInstance();
		p.show();
		p.disp();

	}

}
