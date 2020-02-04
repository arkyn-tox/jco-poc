package com.arkynstudios;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoException;

public class App
{
    public static void main( String[] args )
    {
        try {
            JCoDestination destination = JCoDestinationManager.getDestination("TEST");
            System.out.println("Destination exists: " + destination.getDestinationName());
        } catch (JCoException e) {
            e.printStackTrace();
        }
    }
}
