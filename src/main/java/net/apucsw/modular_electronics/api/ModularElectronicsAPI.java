package net.apucsw.modular_electronics.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModularElectronicsAPI {
    private ModularElectronicsAPI() {}

    public static final String API_VERSION = "0.1.0";
    public static final String MODULAR_ELECTRONICS_MODID = "modular_electronics";

    //public static boolean debug = false;

    public static final Logger logger = LogManager.getLogger(MODULAR_ELECTRONICS_MODID + "_api");
}
