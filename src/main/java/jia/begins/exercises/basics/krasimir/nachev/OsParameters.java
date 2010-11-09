package jia.begins.exercises.basics.krasimir.nachev;

/**
 * Description goes here...
 *
 * @author Bozhidar Batsov
 * @since 3.6
 */
class OsParameters {
    public String getOs() {
      String osName;
      osName  = System.getProperty("os.name");
      return osName;

    }

    public String getUserName() {
       String userName;
       userName = System.getProperty("user.name");
       return userName;
    }

    public String getOsVersion() {
        String osVersion = System.getProperty("os.version");
        return osVersion;
    }

}
