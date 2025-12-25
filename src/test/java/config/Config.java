package config;

import java.io.InputStream;
import java.util.Properties;

public class Config {

    private static Properties properties = new Properties();

    static {
        loadProperties();
    }

    private static void loadProperties() {
        try {
            InputStream input = Config.class
                    .getClassLoader()
                    .getResourceAsStream("application.properties");
            properties = new Properties();
            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Failed load properties");
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
