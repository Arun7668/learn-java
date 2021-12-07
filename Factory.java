package com.newproject.util;

import java.util.ResourceBundle;

import com.newproject.producer.Fastproducer;
import com.newproject.producer.IProducer;
import com.newproject.producer.producer;

public interface Factory {
	public static IProducer getInstance() {
//	  IProducer producer= new Fastproducer();//Upcasting
//		IProducer producer=new producer();
//	  return producer;
		IProducer object=null;
		// Read properties file
		ResourceBundle rb=ResourceBundle.getBundle("Config");
		String Fullclassname= rb.getString("classname");
		try {
		 object=(IProducer)Class.forName(Fullclassname).getDeclaredConstructor().newInstance();
		}
		catch(Exception ex) {
			System.out.println("Exception during Object Creation");
			ex.printStackTrace();
		}
		return object;
	}

}
