package de.rene_majewski.java.civ;

import de.rene_majewski.java.civ.windows.MainWindow;

/**
 * Main class of the application.
 *
 * @author René Majewski
 * @since 0.1.0
 */
public class App {
  /**
   * Specifies the 1st part of the directory where the resources are located.
   */
  public static final String PATH_RESOURCE = "/res/";

  /**
   * Specifies the directory in which the FXML files are located.
   */
  public static final String PATH_RESOURCE_FXML = PATH_RESOURCE + "fxml/";

  /**
   * Specifies the path where the CSS files are located.
   */
  public static final String PATH_RESOURCE_CSS = PATH_RESOURCE + "css/";

  /**
   * Specifies the directory in which the images are located.
   */
  public static final String PATH_RESOURCE_IMAGES = PATH_RESOURCE + "images/";

  /**
   * Specifies the directory in which the configuration files are located.
   */
  public static final String PATH_RESOURCE_CONFIG = PATH_RESOURCE + "config/";

  /**
   * Indicates in which phat the database resources are located.
   */
  public static final String PATH_RESOURCE_DB = PATH_RESOURCE + "db/";

  /**
   * Specifies in which phat the migration files for the database schema are
   * located.
   */
  public static final String PATH_RESOURCE_DB_MIGRATION = PATH_RESOURCE_DB + "migration";

  /**
   * Starts the app by loading and displaying the main window.
   * 
   * @param args Parameters from the command line.
   */
  public static void main(String[] args) {
    MainWindow.main(args);
  }
}
