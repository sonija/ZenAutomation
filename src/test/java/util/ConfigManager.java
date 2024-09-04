package util;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;

public class ConfigManager {
    private static Configuration config;

    static {
        try {
            File configFile = new File("src/test/resources/properties/staging.properties");
            if (!configFile.exists()) {
                throw new RuntimeException("Configuration file not found: " + configFile.getAbsolutePath());
            }
            Configurations configs = new Configurations();
            config = configs.properties(configFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return config.getString(key);
    }
}