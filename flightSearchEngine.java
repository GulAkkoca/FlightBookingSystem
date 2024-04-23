/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbookingsystem;

import java.util.ArrayList;

/**
 *
 * @author Gül
 */
public class flightSearchEngine  {
    private ArrayList<flight> flights;
    private int size;
    private int capacity;
    
    public flightSearchEngine(){
        size=0;
        capacity=10;
        flights=new ArrayList<flight>(capacity);
    }
    public flightSearchEngine(int c){
        capacity=c;
        size=0;
           flights = new ArrayList<flight>(capacity);
    }
    public void addFlight( flight ff){
        size++;
        flights.add(ff);
    }
    
    public ArrayList<flight> searchFlights(String origin, String destination, String departureDate, boolean directOnly) {
        ArrayList<flight> result = new ArrayList<>();
        for (int i = 0; i < flights.size(); i++) {
            flight flightz = flights.get(i);
            if (flightz.getOrigin().equalsIgnoreCase(origin) && flightz.getDestination().equalsIgnoreCase(destination)
                    && flightz.getDepartureData().equalsIgnoreCase(departureDate)
                    && (!directOnly || flightz.isDirect())) {
                result.add(flightz);
               // return   flight(flightz) ;
            }
        }
        
        return result;
    }
  /*  public flight searchFlights(String origin,String destination,String departureData,boolean directOnly){
       for(int i=0; i<size; i++){
           if( flights.get(i).getOrigin().equals(origin)&&flights.get(i).getDestination().equals(destination)
                  && flights.get(i).getDepartureData().equals(departureData)){
        return new  flight(flights.get(i)) ;
                }}
      
    }*/

   
}
