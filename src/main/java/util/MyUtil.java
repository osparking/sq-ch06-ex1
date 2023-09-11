package util;

import java.io.UnsupportedEncodingException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class MyUtil {
	public static Logger getLogger(String name) {
		var logger = Logger.getLogger(name);
		var handler = new ConsoleHandler();
		
		try {
			handler.setEncoding("UTF-8");
			logger.addHandler(handler);
			logger.setUseParentHandlers(false);
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		return logger;
	}
}
