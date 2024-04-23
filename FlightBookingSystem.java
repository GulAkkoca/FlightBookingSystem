/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flightbookingsystem;

import java.util.ArrayList;

/**
 *
 * @author Gül
 */
public class FlightBookingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        flightSearchEngine flightSearchEngines = new flightSearchEngine();

        // Adding sample flights
        flightSearchEngines.addFlight(new DirectFlight(12, "asd"," ase"," wes",1005));
        flightSearchEngines.addFlight(new DirectFlight(2,"London", "Paris", "2024-04-10", 1002));
        flightSearchEngines.addFlight(new ConnectingFlight( "paris",2020,15,"london"," münih","2024-05-15",300));
        
        // Searching for flights
        ArrayList<flight> foundFlights = flightSearchEngines.searchFlights("London", "Paris", "2024-04-10", true);

        // Printing out the details of found flights
        if (foundFlights.isEmpty()) {
            System.out.println("No flights found.");
        } else {
            System.out.println("Found flights:");
            for (int i = 0; i < foundFlights.size(); i++) {
                System.out.println(foundFlights.toString());
            }
        }
    }
    }
    

