package com.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.main.General;

public class tc001 {
	@Test
	public void testexecution() throws Exception{
		DOMConfigurator.configure("log4j.xml");
	      General e = new General();
	      e.openbrowser();
	      
		
	}

}
