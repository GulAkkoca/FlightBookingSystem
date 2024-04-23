/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbookingsystem;

/**
 *
 * @author Gül
 */
public class DirectFlight extends flight {
    
    private int flightDuration;

    public DirectFlight(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public DirectFlight(int flightDuration, String origin, String destination, String departureData, int flightNumber) {
        super(origin, destination, departureData, flightNumber);
        this.flightDuration = flightDuration;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        else if( getClass()!=obj.getClass()){
            return false;
        }else{
             DirectFlight df= (DirectFlight)obj;
        return ( super.equals(df) &&flightDuration==df.flightDuration);
        }
        
       
    }
    @Override
    public String toString() {
        return "DirectfFlight{" + "flightDuration=" + flightDuration + '}';
    }

    @Override
    public boolean isDirect() {
     return true;   
    }
    
}
