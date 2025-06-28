package config;

public class ConfigReader {
    public static String getBaseUrl() {
        return System.getenv("BASE_URL");
    }

    public static String getUsername() {
        return System.getenv("LT_USERNAME");
    }

    public static String getAccessKey() {
        return System.getenv("LT_ACCESS_KEY");
    }
}