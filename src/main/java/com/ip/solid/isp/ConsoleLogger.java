package com.ip.solid.isp;

/**
 * This class is used for to print error or display
 * related messages on console.
 */
public class ConsoleLogger {

    public void writeInfo(String msg) {
        System.out.println("Info: " + msg);
    }

    public void writeError(String msg, Exception exception) {
        System.err.println("Error: " + msg + ";" + exception);
    }
}
