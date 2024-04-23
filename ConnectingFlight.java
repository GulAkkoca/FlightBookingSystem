/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbookingsystem;

/**
 *
 * @author Gül
 */
public class ConnectingFlight extends flight {
 private String layoverCity;
 private int layoverDuration;
 private int totalDuration;

    

    public ConnectingFlight(String layoverCity, int layoverDuration, int totalDuration, String origin, String destination, String departureData, int flightNumber) {
        super(origin, destination, departureData, flightNumber);
        this.layoverCity = layoverCity;
        this.layoverDuration = layoverDuration;
        this.totalDuration = totalDuration;
    }

   

    public String getLayoverCity() {
        return layoverCity;
    }

    public void setLayoverCity(String layoverCity) {
        this.layoverCity = layoverCity;
    }

    public int getLayoverDuration() {
        return layoverDuration;
    }

    public void setLayoverDuration(int layoverDuration) {
        this.layoverDuration = layoverDuration;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        else if( getClass()!=obj.getClass()){
            return false;
        }
        else{
            ConnectingFlight cf= (ConnectingFlight)obj;
            return ( super.equals(cf)&&layoverCity.equals(cf.layoverCity));
        }
    }
    public boolean isDirect(){
        return false;
    }
    @Override
    public String toString() {
        return "ConnectingFlight{" + "layoverCity=" + layoverCity + ", layoverDuration=" + layoverDuration + ", totalDuration=" + totalDuration + '}';
    }
 
   
    
    
}
