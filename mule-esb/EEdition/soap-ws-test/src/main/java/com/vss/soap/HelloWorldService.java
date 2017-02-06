package com.vss.soap;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="helloWorldService")
public interface HelloWorldService {
	
	String sayHi(@WebParam(name="input") String text);

}
