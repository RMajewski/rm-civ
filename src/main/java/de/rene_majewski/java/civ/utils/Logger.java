package de.rene_majewski.java.civ.utils;

/**
 * Class with helper methods to log data more easily.
 * 
 * @since 0.1.0
 * @author René Majewski
 */
public class Logger {
  /**
   * Logs an error with trace of the error.
   * 
   * @param logger    Logger to be used for logging.
   * 
   * @param exception Error to be logged.
   */
  public static void logException(org.apache.logging.log4j.Logger logger, Exception exception) {
    StringBuffer buffer = new StringBuffer("The following error has occurred: ");
    buffer.append(exception.getMessage());
    buffer.append("\n");

    for (StackTraceElement el : exception.getStackTrace()) {
      buffer.append(el.toString());
      buffer.append("\n");
    }

    logger.error(buffer.toString());
  }
}
