package ro.pub.cs.systems.eim.practicaltest02.general;

public interface Constants {
    final public static String TAG = "[Bitcoin USD/EUR]";

    final public static boolean DEBUG = true;
    final public static String WEB_SERVICE_ADDRESS = "https://api.coindesk.com/v1/bpi/currentprice";
    final public static String JSON_EXTENSION = ".json";

    final public static String TIME = "time";
    final public static String UPDATED = "updated";
    final public static String BPI = "bpi";
    final public static String USD = "USD";
    final public static String EUR = "EUR";
    final public static String RATE = "rate_float";

    final public static int MS_TO_MIN = 60000;
    final public static int CACHE_EXPIRATION = 1;

    final public static String EMPTY_STRING = "";
}
