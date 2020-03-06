package alpha;

import org.apache.logging.log4j.*;
public class DEmo {

	private static Logger log = LogManager.getLogger(DEmo.class.getName());
	public static void main(String[] args) {
		log.debug("her is debugging");
		log.info("log information ;;>");
		log.error("here error messag >");
		log.fatal("this log is fatal message  ");

	}

}
