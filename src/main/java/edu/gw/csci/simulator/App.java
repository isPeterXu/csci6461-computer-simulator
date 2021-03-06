package edu.gw.csci.simulator;

import edu.gw.csci.simulator.gui.Simulator;
import edu.gw.csci.simulator.registers.AllRegisters;
import javafx.application.Application;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.BitSet;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String [] args){
        logger.info("Starting application...");
        Application.launch(Simulator.class, args);
    }

}