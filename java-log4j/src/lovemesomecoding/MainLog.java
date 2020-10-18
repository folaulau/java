package lovemesomecoding;

import org.apache.log4j.PropertyConfigurator;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MainLog {

    static Logger log = Logger.getLogger(MainLog.class);

    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");

        log.trace("Trace Message Logged !!!");
        log.debug("Debug Message Logged !!!");
        log.info("Info Message Logged !!!");
        log.error("Error Message Logged !!!");
        log.fatal("Fatal Message Logged !!!");

    }

}
