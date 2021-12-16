package logging.example;

import java.io.IOException;
import java.util.logging.*;
public class Application {
    SimpleFormatter form;
    //static Logger logger = Logger.getLogger(Application.class.getClass().getName());
    private static Logger logger;

    

	public static void main(String[] args) {
		Logger logger= LoggingUtility.getLogger(Application.class);
	  //logger.setLevel(Level.INFO );
	  
		FileHandler handler;
		try {
			handler = new FileHandler("mylogs.log", true);
			logger.addHandler(handler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.severe("1-severe message");
		logger.warning("2-warning message");
		logger.info("3-java.util.logger configured successfully");
		logger.fine("4-fine message");
	}

}
