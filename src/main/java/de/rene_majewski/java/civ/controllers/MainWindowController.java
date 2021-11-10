package de.rene_majewski.java.civ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Controller for the main window.
 * 
 * @author René Majewski
 * @since 0.1.0
 */
public class MainWindowController implements Initializable {
  /**
   * The client area.
   */
  @FXML
  private BorderPane bpClient;

  /**
   * The status bar.
   */
  @FXML
  private HBox hbStatus;

  /**
   * Menu entry for File > Quit.
   */
  @FXML
  private MenuItem menuItemFileClose;

  /**
   * Initializes the main window.
   * 
   * @param location
   * 
   * @param resources
   */
  @FXML
  public void initialize(final URL location, final ResourceBundle resources) {

  }

  /**
   * Responds to the click of a menu item.
   * 
   * @param event eventDates of the event.
   */
  @FXML
  public void onMenuClick(final ActionEvent event) {
    final Object source = event.getSource();

    if (source == menuItemFileClose) {
      Stage stage = (Stage) bpClient.getScene().getWindow();
      stage.close();
    }
  }
}
