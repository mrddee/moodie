package com.example.rui.location;

/**
 * Created by rui on 7/21/16.
 */
public class Restaurant
{
    private String name;
    private String address;
    private String phoneNumber;
    private double distance;
    private String city;
    private String imageURL;
    private String reviewSnippet;
    private String state;
    private String ratingURL;


    public Restaurant( String name , String phoneNumber,String address,
                       double distance, String reviewSnippet,String imageURL, String city, String state, String ratingURL)
    {
        this.name = name;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.phoneNumber = phoneNumber;
        this.distance = distance;
        this.reviewSnippet =reviewSnippet;
        this.imageURL = imageURL;
        this.city =city;
        this.state = state;
        this.ratingURL=ratingURL;
    }

    public String getAddress() {return address + '\n' + city + ", " + state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getDistance() {
        // convert meters to miles
        distance = distance / 1609.34;
        return distance;
    }

    public String getCity() {
        return city;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getReviewSnippet() {
        return reviewSnippet;
    }
    public String getRatingURL() {
        return ratingURL;
    }


    public String getName()
    {
        return  name;
    }
    public String getState()
    {
        return state;
    }
    public String toString()
    {
        return
                this.getPhoneNumber()+'\n'+
                this.getAddress() +'\n'+
                this.getCity()+", "+this.getState()+'\n'+
                this.getReviewSnippet();
    }
}
