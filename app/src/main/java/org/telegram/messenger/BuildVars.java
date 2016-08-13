package org.telegram.messenger;

public class BuildVars
{
  public static String APP_HASH;
  public static int APP_ID;
  public static String BING_SEARCH_KEY;
  public static int BUILD_VERSION;
  public static String BUILD_VERSION_STRING;
  public static boolean DEBUG_VERSION = "me.swineson.moegram.messenger".endsWith("debug");
  public static String FOURSQUARE_API_ID;
  public static String FOURSQUARE_API_KEY;
  public static String FOURSQUARE_API_VERSION;
  public static String GCM_SENDER_ID;
  public static String HOCKEY_APP_HASH;
  public static String HOCKEY_APP_HASH_DEBUG;
  public static String SEND_LOGS_EMAIL;

  static
  {
    BUILD_VERSION = 767;
    BUILD_VERSION_STRING = "3.7";
    APP_ID = 11985;
    APP_HASH = "740c9d6b105902c5efc43fa3fc749305";
    HOCKEY_APP_HASH = "5d41402abc4b2a76b9719d911017c592";
    HOCKEY_APP_HASH_DEBUG = "5d41402abc4b2a76b9719d911017c592";
    GCM_SENDER_ID = "760348033672";
    SEND_LOGS_EMAIL = "jamesswineson@gmail.com";
    BING_SEARCH_KEY = "9XLD6AiEwwDjYfJ/vNrdzE9q8icUyrmwGK0LE2ven2U=";
    FOURSQUARE_API_KEY = "F4JBULWN4WJ1YVKZJODMVJRZBGPTRA31I5IIC2HJQQNU0VNG";
    FOURSQUARE_API_ID = "TKHG2AT5U53YXVTD4Z4AMSVQD3Z3YCOTJ4CUSILYVICSQTPE";
    FOURSQUARE_API_VERSION = "20150326";
  }
}

/* Location:           E:\Reverse Engineering centre\Moegram\classes-dex2jar.jar
 * Qualified Name:     org.telegram.messenger.BuildVars
 * JD-Core Version:    0.6.0
 */