package com.app;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.xml.XMLLayout;




public class SampleApp {
	private static Logger log=Logger.getLogger(SampleApp.class);
	
	public static void main(String[] args) throws Exception {
		//Layout layout =new SimpleLayout();
		//Layout layout =new HTMLLayout();
		//Layout layout =new XMLLayout();
		//Layout layout =new PatternLayout("%d{dd-MM-yy hh:mm:ss:SS}%C-%M[%p]%l%m");
		//Appender app=new ConsoleAppender(layout);
		
		//log.addAppender(app);
		log.debug("WELCOME");
		log.warn("boject not use");
		log.info("ok fine");
		log.error("ok !fail");
		
	}

}
