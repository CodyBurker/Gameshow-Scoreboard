/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.you.think.you.know.math;

import java.util.List;
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
    int currentSlide; // Current slide displaying with a 1-index.
    Game(){ // New game defaults to gold,blue, first slide, with a single blank slide
        this.primaryColor = Color.GOLD;
        this.secondaryColor = Color.BLUE;
        this.currentSlide = 1;
        slides.add(new Slide("",2));
    }
    void addSlide(Slide newSlide){ // To add a new slide object
        slides.add(newSlide);
    }
    void deleteSlide(int slideNumber){ // delete a certain slide from 1-index
        slides.remove(slideNumber -1);
    }
    Slide getSlide(int slideNumber){ // Get a certain slide from 1-index
        return slides.get(slideNumber - 1);
    }
    void addPlayer(String name, String institution){ // Add a new player with a zero score
        players.add(new Player(name,institution,0));
    }
    Player getPlayer(int playerNumber){ // Get a player from 1-index
        return players.get(playerNumber - 1);
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
}