
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jTest {
	static Logger log = LogManager.getLogger(GenericsTest.class);
	public static void main(String[] args) {
		new AnotherClass().testMethod();
		
		log.log(Level.FATAL, "Error has occured.");
	}

}
