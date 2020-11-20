package com.assignment3;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
public class Conditionaltag extends SimpleTagSupport {
	private String test;

	
	
	 public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public StringWriter getSw() {
		return sw;
	}

	public void setSw(StringWriter sw) {
		this.sw = sw;
	}

	StringWriter sw = new StringWriter();
	 
	 public void doTag() throws JspException, IOException {
		 if(test!=null && test.contentEquals("true")) {
			 JspWriter out = getJspContext().getOut();
			 out.println( "On success\n" );
		 }
		 else {
			 JspWriter out = getJspContext().getOut();
			 out.println( "On failure\n" );
		 }
	 }

}
