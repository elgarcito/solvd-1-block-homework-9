package com.solvd.hardwarestore.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AutoCloseableNoResource implements AutoCloseable{
    private static final Logger LOGGER= LogManager.getLogger(AutoCloseableNoResource.class);

    @Override
    public void close() throws Exception{
        LOGGER.info("Resource accessed. Closing the resource");
    }
}
