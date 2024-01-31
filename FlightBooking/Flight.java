/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author mbverdaw
 */

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, 
            int capacity, double originalPrice){
        if (origin.equals(destination)){
            throw new IllegalArgumentException("\nOrigin and Destination can't be the same... Please try again");
        }
        this.flightNumber=flightNumber;
        this.origin=origin;
        this.destination=destination;
        this.departureTime=departureTime;
        this.numberOfSeatsLeft=capacity;
        this.capacity=capacity;
        this.originalPrice=originalPrice;
    }    
    
    public void setFlightNumber(int flightNumber){
        this.flightNumber=flightNumber;
    }
    
    public void setOrigin(String origin){
        this.origin=origin;
    }
    
    public void setDestination(String destination){
        this.destination=destination;
    }
    
    public void setDepartureTime(String departureTime){
        this.departureTime=departureTime;
    }
    
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft=numberOfSeatsLeft;
    }
    
    public void setOriginalPrice(double originalPrice){
        this.originalPrice=originalPrice;
    }
    
    public int getFlightNumber(){
        return this.flightNumber;
    }
    
    public String getOrigin(){
        return this.origin;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public String getDepartureTime(){
        return this.departureTime;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public int getNumberOfSeatsLeft(){
        return this.numberOfSeatsLeft;
    }
    
    public double getOriginalPrice(){
        return this.originalPrice;
    }
    
    public boolean bookASeat(){
        if (this.numberOfSeatsLeft>0){
            this.numberOfSeatsLeft--;
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return ("Flight "+this.flightNumber+", "
                +this.origin+" to "+this.destination+", "+this.departureTime+", original price: "+this.originalPrice+"$");
    }
    
}
