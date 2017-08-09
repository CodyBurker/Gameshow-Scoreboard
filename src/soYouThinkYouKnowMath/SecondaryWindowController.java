/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soYouThinkYouKnowMath;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author cody
 */
public class SecondaryWindowController implements Initializable {
    //FXML hooks
    @FXML
    private GridPane MainGridPane;

    @FXML
    private ImageView ImageView;

    @FXML
    private GridPane scoresGridPane;
    
    
    @FXML
    private Text p1Name;

    @FXML
    private Label p1Int;

    @FXML
    private Label p1Score;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void update(Game game){ // Test of sharing game object between controllers
//        p1Name.setText(game.getPlayer(1).name);
        printPlayers(game);
        printSlides(game);
        System.out.println("-----------");
    
        
    }
    public void printPlayers(Game game){
        System.out.println(game.getNumberOfPlayers() + " Players:");
        for (Player currentPlayer: game.getPlayerList()){
            System.out.println("    " + currentPlayer.name + " " + currentPlayer.score);
        }
    }
    public void printSlides(Game game){
        System.out.println(game.getNumberOfSlides() + " Slides:");
        for (Slide currentSlide: game.slides){
            System.out.println("  " + currentSlide.getImagePath());
            System.out.println("  " + currentSlide.getSlideType());
            System.out.println("  " + currentSlide.getSlideValue());
            
        }
    }
   
    
    
    
    
}
