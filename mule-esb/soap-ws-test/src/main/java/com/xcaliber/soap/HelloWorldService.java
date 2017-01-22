package com.xcaliber.soap;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="helloWorldService")
public interface HelloWorldService {
	
	String sayHi(@WebParam(name="input") String text);

}
