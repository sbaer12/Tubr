package com.example.tubr;

import android.location.Location;

import java.util.ArrayList;

public class User {

    private String name;
    private String email;
    private String phone;
    private ArrayList<String> classes;
    private float rating;
    private Location location;

    /*
     default constructor - sets all fields as blank until pulled from the sql database
     or added by user
     */
    public User() {
        name = "";
        email = "";
        phone = "";
        classes = new ArrayList<String>();
        rating = 0;
        location = null;
    }

     /*
    constructor taking in values for all fields.
     */
     public User (String nameIn, String emailIn, String phoneIn, ArrayList<String> classesIn,
                     Float ratingIn, Location locationIn) {
         name = nameIn;
         email = emailIn;
         phone = phoneIn;
         classes = classesIn;
         rating = ratingIn;
         location = locationIn;
     }

     /*
     loads user name for the session
      */
     public void addName(String nameIn) {
            name = nameIn;
        }

      /*
     loads user email for the session
      */
     public void addEmail (String emailIn) {
            email = emailIn;
        }

     /*
     loads user phone number for the session
     */
     public void addPhone(String phoneIn) {
            phone = phoneIn;
        }

     /*
     load the classes for the session
     */
     public void addClass(String classIn) {
            classes.add(classIn);
        }

     /*
     load the users rating for the session
     */
     public void addRating (Float ratingIn) { rating = ratingIn; }

     /*
     load the users x and y coordinate
      */
     public void addLocation (Location locationIn) {
         location = locationIn;
     }

     //getters

     /*
     get the name
     */
     public String getName() {
            return this.name;
        }

     /*
     get the email
     */
     public String getEmail() {
            return this.email;
        }

     /*
     get the phone number
     */
     public String getNumber() {
            return this.phone;
        }

     /*
     get the classes tutoring
     */
     public ArrayList<String> getClasses() {
            return this.classes;
        }

     /*
     get the rating of that user
     */
     public Float getRating() {
            return this.rating;
        }

     /*
      return the coordinates of the user in an array of size 2, x coordinate first then y
      */
     public Location getYCord() {
         return location;
     }
}
