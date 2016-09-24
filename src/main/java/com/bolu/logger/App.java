package com.bolu.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.trace("SLF4J-LOG4J测试TRACE");
        logger.debug("SLF4J-LOG4J测试DEBUG");
        logger.info("SLF4J-LOG4J测试INFO");
        logger.warn("SLF4J-LOG4J测试WARN");
        logger.error("SLF4J-LOG4J测试ERROR");
    }
}
