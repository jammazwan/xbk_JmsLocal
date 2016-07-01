package jammazwan.xbk;

import org.apache.camel.builder.RouteBuilder;

public class XbkRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("jms:hi").log("\n\n THIS IS JMS \n ${body}\n\n").to("mock:hi");
	}
}
