package de.rene_majewski.java.civ.config;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;

import de.rene_majewski.java.civ.App;
import de.rene_majewski.java.civ.utils.Logger;

/**
 * Contains the information about the version of the application.
 * 
 * @since 0.1.0
 * @author René Majewski
 */
public final class VersionConfig {

  /**
   * Key for the project name
   */
  public static final String PROJECT_NAME = "project.name";

  /**
   * Key for the project version.
   */
  public static final String PROJECT_VERSION = "project.version";

  /**
   * Key for the copyright notice.
   */
  public static final String COPYRIGHT = "copyright";

  /**
   * Key for the license.
   */
  public static final String LICENSE = "license";

  /**
   * Key for the build number.
   */
  public static final String BUILD_NUMBER = "build.number";

  /**
   * Key for the build branch.
   */
  public static final String BUILD_BRANCH = "build.branch";

  /**
   * Key for the build time.
   */
  public static final String BUILD_TIME = "build.time";

  /**
   * Specifies the name of the file with the version information.
   */
  public static final String PROPERTY_FILE_NAME = App.PATH_RESOURCE_CONFIG + "version.properties";

  /**
   * Stored the instance of this class.
   */
  private static VersionConfig instance;

  /**
   * Stored the properties.
   */
  private Properties props;

  /**
   * Initializes the class.
   * 
   * Loads the information from the properties file.
   */
  private VersionConfig() {
    props = new Properties();

    try {
      InputStream inp = VersionConfig.class.getClassLoader().getResourceAsStream(PROPERTY_FILE_NAME);
      if (inp != null) {
        props.load(new InputStreamReader(inp, "UTF-8"));
      }
    } catch (IOException e) {
      Logger.logException(LogManager.getLogger(VersionConfig.class.getName()), e);
    }
  }

  /**
   * Determines the instance of this class.
   * 
   * If no instance has been created yet, it will be created.
   * 
   * @return The instance of this class.
   */
  public static VersionConfig getInstance() {
    if (instance == null) {
      instance = new VersionConfig();
    }
    return instance;
  }

  /**
   * Determines the property specified by the key.
   * 
   * @param key Key whose property is to be determined.
   * 
   * @return The Determined Property. If no property was determined {@code null}
   *         is returned.
   */
  public String getProperty(String key) {
    return props.getProperty(key);
  }

  /**
   * Write the version information in the logger.
   * 
   * @param caller Class that calls this method.
   */
  public void logVersion(Class<?> caller) {
    final org.apache.logging.log4j.Logger logger = LogManager.getLogger(caller);

    if (props != null && props.size() > 0) {
      logger.info("Application '" + getProperty(PROJECT_NAME) + "' has been started:");
      logger.info("\tVersion: " + getProperty(PROJECT_VERSION));
      logger.info("\tLicense: " + getProperty(LICENSE));
      logger.info("\tBranch: " + getProperty(BUILD_BRANCH));
      logger.info("\tCommit: " + getProperty(BUILD_NUMBER));
      logger.info("\tThe project was created at: " + getProperty(BUILD_TIME));
    } else {
      logger.warn("The version information could not be loaded.");
    }
  }
}
