/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soYouThinkYouKnowMath;

import java.io.File;
import java.io.FileInputStream;
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
public class Game {
    List<Slide> slides; // List of slide objects
    List<Player> players; // List of player objects
    Color primaryColor; //Main color of game display
    Color secondaryColor; // Secondary color of game display
    private int currentSlide; // Current slide displaying with a 1-index.
    Game(){ // New game defaults to gold,blue, first slide, with a single blank slide
        this.primaryColor = Color.GOLD;
        this.secondaryColor = Color.BLUE;
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
        slides.add(new Slide(new File(""),1,1));
    }
    void addSlide(File slidePath){ // To add a new slide object
        try{
        Slide newSlide = new Slide(slidePath,1);
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
    Color getPrimaryColor(){ // Get the primary color
        return this.primaryColor;
    }
    void setPrimaryColor(Color primaryColor){ // Set the primary color
        this.primaryColor = primaryColor;
    }
    Color getSecondaryColor(){ // Get the secondary color
        return this.secondaryColor;
    }
    void setSecondaryColor(Color secondaryColor){ // Set the secondary color
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
    List<Player> getPlayerList(){
        return this.players;
    }
}