package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class thirdParty {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public void disp ()
    {
        System.out.println("inside thirdP");
        logger.trace("We've just greeted the user(trace)!");
        logger.debug("We've just greeted the user(debug)!");
        logger.info("We've just greeted the user(info)!");
        logger.warn("We've just greeted the user(warn)!");
        logger.error("We've just greeted the user(error)!");
        logger.fatal("We've just greeted the user(fatal)!");
    }
}
