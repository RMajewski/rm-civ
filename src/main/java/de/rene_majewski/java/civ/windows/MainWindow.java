package de.rene_majewski.java.civ.windows;

import de.rene_majewski.java.civ.App;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main window of the app.
 * 
 * @author René Majewski
 * @since 0.1.0
 */
public class MainWindow extends Application {
  /**
   * Name of the FXML file for the main window.
   */
  public static final String FXML_FILE = App.PATH_RESOURCE_FXML + "MainWindow.fxml";

  /**
   * Name of the CSS file of the application.
   */
  public static final String CSS_FILE = App.PATH_RESOURCE_CSS + "app.css";

  /**
   * Initializes the main window of the application.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource(FXML_FILE));

    Scene scene = new Scene(root);
    scene.getStylesheets().add(getClass().getResource(CSS_FILE).toExternalForm());

    primaryStage.setTitle("René's Civilization Clone");
    primaryStage.setScene(scene);
    primaryStage.setMaximized(true);
    primaryStage.show();
  }

  /**
   * Release resources when the main window is closed.
   */
  @Override
  public void stop() {
  }

  /**
   * Creates and displays the main window.
   * 
   * @param args Parameters from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
