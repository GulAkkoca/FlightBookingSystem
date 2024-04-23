/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbookingsystem;

import java.util.Objects;

/**
 *
 * @author Gül
 */
public abstract class  flight  {
 
private String origin;
private String destination;
private String departureData;
private  int flightNumber;

public flight(){
    
}

    public flight(String origin, String destination, String departureData, int flightNumber) {
        this.origin = origin;
        this.destination = destination;
        this.departureData = departureData;
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureData() {
        return departureData;
    }

    public void setDepartureData(String departureData) {
        this.departureData = departureData;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

   
   
public abstract boolean isDirect();
    

    
    @Override 
   public boolean equals(Object obj){
    if( obj==null)
        return false;
    else if( getClass()!=obj.getClass()){
        return false;
    }
    else{
        flight ff=(flight)obj;
       return(origin.equals(ff.origin)&&destination.equals(ff.destination)&&departureData.equals(ff.departureData)&&flightNumber==ff.flightNumber);
    }
   }
    

    @Override
    public String toString() {
        return "flight{" + "origin=" + origin + ", destination=" + destination + ", departureData=" + departureData + ", flightNumber=" + flightNumber + '}';
    }

}
