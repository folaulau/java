

import org.apache.log4j.Logger;

public class AnotherClass {
	Logger log = Logger.getLogger(AnotherClass.class);
	
	public void testMethod() {
		log.trace("Trace Message!");
		log.debug("Debug Message!");
		log.info("Info Message!");
		log.warn("Warn Message!");
		log.error("Error Message!");
		log.fatal("Fatal Message!");
	}
}
