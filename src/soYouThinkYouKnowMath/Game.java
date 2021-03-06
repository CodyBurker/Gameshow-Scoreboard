/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soYouThinkYouKnowMath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 *
 * @author cody
 */
public class Game implements java.io.Serializable{
    List<Slide> slides; // List of slide objects
    List<Player> players; // List of player objects
    String primaryColor; //Main color of game display
    String secondaryColor; // Secondary color of game display
    private int currentSlide; // Current slide displaying
    ArrayList<SlideType> slideTypes = new ArrayList<>();
    Game(){ // New game defaults to black/white, first slide, with a single blank slide
        this.primaryColor = "#000000";// black
        this.secondaryColor = "#ffffff";// white
        this.currentSlide = 0;
        slides = new ArrayList<>();
        slides = new ArrayList<>();
        players = new ArrayList<>();
        players.add(new Player("Player 1","Institution 1",0));
        players.add(new Player("Player 2","Institution 1",0));
        players.add(new Player("Player 3","Institution 1",0));
        players.add(new Player("Player 4","Institution 1",0));
        players.add(new Player("Player 5","Institution 1",0));
        players.add(new Player("Player 6","Institution 1",0));
        
        // Slide types intialization
        slideTypes.add(new SlideType(true,1,"Regular"));
        slideTypes.add(new SlideType(false,-1,"Title"));
        slideTypes.add(new SlideType(true,1,"Tie-Breaker"));
        slideTypes.add(new SlideType(true,1,"Flash Round"));
        slideTypes.add(new SlideType(true,1,"Final Slide"));
        
        // Add dummy slide
        slides.add(new Slide(new File(""),slideTypes.get(0),1));
        
        
    }
    void addSlide(File slidePath){ // To add a new slide object
        try{
        Slide newSlide = new Slide(slidePath,slideTypes.get(0),1);
        slides.add(++currentSlide, newSlide);
        }
        catch(Exception e){}
        
        
    }
    Slide getCurrentSlide(){
        return slides.get(currentSlide);
    }
    int getCurrentSlideNumber(){
        return currentSlide;
    }
    public void next(){
        if (currentSlide < this.getNumberOfSlides()-1)
            currentSlide++;
    }
    public void prev(){
        if (currentSlide > 0)
            currentSlide--;
    }    
    public int getCurrentPointValue(){
        return this.getCurrentSlide().getSlideValue();
    }
    void deleteSlide(){
        if(this.getNumberOfSlides() > 1){
            slides.remove(currentSlide); //Remove the currentslide
            this.prev(); // Go back a slide
        }
        
        
    }
    Slide getSlide(int slideNumber){ // Get a certain slide from 1-index
        return slides.get(slideNumber);
    }
    void newPlayer(String name, String institution){ // Add a new player with a zero score
        Player newPlayer = new Player(name, institution,0);
        boolean x = players.add(newPlayer);
    }
    Player getPlayer(int playerNumber){ // Get a player from 1-index
        return players.get(playerNumber);
    }
    int getNumberOfPlayers(){ // Get number of players in a game
        return players.size();
    }
    int getNumberOfSlides(){ // Return how many slides the game currently has
        return slides.size();
    }
    String getPrimaryColor(){ // Get the primary color
        return this.primaryColor;
    }
    void setPrimaryColor(String primaryColor){ // Set the primary color
        this.primaryColor = primaryColor;
    }
    String getSecondaryColor(){ // Get the secondary color
        return this.secondaryColor;
    }
    void setSecondaryColor(String secondaryColor){ // Set the secondary color
        this.secondaryColor = secondaryColor;
    }
    int advanceSlide(){ // Method to advance slide in game object. Logic needs built out here some more.
        if (this.currentSlide<slides.size()){
            this.currentSlide++;
        }
        return this.currentSlide;
    }
    int goBackSlide(){ // go back a slide. Needs a lot of more logic 
        if (this.currentSlide>slides.size()){
            this.currentSlide--;
        }
        return this.currentSlide;
    }
    public void goToTop(){
        this.currentSlide = 0;
    }
    List<Player> getPlayerList(){
        return this.players;
    }
    
    
    
}