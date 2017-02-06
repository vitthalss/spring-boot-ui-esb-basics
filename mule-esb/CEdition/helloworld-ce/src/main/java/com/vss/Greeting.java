/**
 * 
 */
package com.vss;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

/**
 * @author Vitthal Shirke
 *
 */
public class Greeting implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {

		/*
		 * eventContext.getMessage().setInvocationProperty("myProperty",
		 * "Hello World!"); return eventContext.getMessage().getPayload();
		 */
		eventContext.getMessage().getProperty("header", PropertyScope.INBOUND);
		return "Hello Mule ESB !!! : "
				+ eventContext.getMessage().getInboundProperty(
						"http.query.string");
	}
}
