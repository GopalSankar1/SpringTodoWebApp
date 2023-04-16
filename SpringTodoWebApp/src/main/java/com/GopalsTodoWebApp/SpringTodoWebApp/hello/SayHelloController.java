package com.GopalsTodoWebApp.SpringTodoWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {
	
	//Mapping the function to an url.
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
//		return "Hello!, what are you learning today?";
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Hello! what are you learning today?</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("Enter your todos here :)");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
		
	}
	
	@RequestMapping("say-hello-jsp")
//	@ResponseBody
//	Unlike the previous case, here we have to redirect to sayHello.jsp
//	@ResponseBody will return return only what exactly is inside the function
//	body, so we have commented the @ResponseBody annotation.
// src\main\resources\META-INF\resources\WEB-INF\jsp\sayHello.JSP is the
// location inside which we store the jsp file.
	public String sayHelloJsp() {
		return "sayHello"; 
	}
}
