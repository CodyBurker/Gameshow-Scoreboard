/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soYouThinkYouKnowMath;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author cody
 */
public class SecondaryWindowController implements Initializable {
    //FXML hooks
    @FXML
    private GridPane mainGridPane;

    @FXML
    private ImageView mainPain;

    @FXML
    private GridPane scoresGridPane;
    
    @FXML
    private ListView slidesListView;
    
    @FXML
    private AnchorPane mainAnchorPane;
    
    @FXML
    private Text p1Name;
    
    @FXML
    private Text p2Name;
    
    @FXML
    private Text p3Name;
    
    @FXML
    private Text p4Name;
    
    @FXML
    private Text p5Name;
    
    @FXML
    private Text p6Name;

    @FXML
    private Label p1Score;
    
    @FXML
    private Label p2Score;
    
    @FXML
    private Label p3Score;
    
    @FXML
    private Label p4Score;
    
    @FXML
    private Label p5Score;
    
    @FXML
    private Label p6Score;
    
    @FXML
    private Label p1Inst;
    
    @FXML
    private Label p2Inst;
    
    @FXML
    private Label p3Inst;
    
    @FXML
    private Label p4Inst;
    
    @FXML
    private Label p5Inst;
    
    @FXML
    private Label p6Inst;
    
    ArrayList<Label> labelArray;
    ArrayList<Text> textArray;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        labelArray = new ArrayList<>();
        textArray = new ArrayList<>();
        labelArray.add(p1Score);
        labelArray.add(p2Score);
        labelArray.add(p3Score);
        labelArray.add(p4Score);
        labelArray.add(p5Score);
        labelArray.add(p6Score);
        labelArray.add(p1Inst);
        labelArray.add(p2Inst);
        labelArray.add(p3Inst);
        labelArray.add(p4Inst);
        labelArray.add(p5Inst);
        labelArray.add(p6Inst);
        textArray.add(p1Name);
        textArray.add(p2Name);
        textArray.add(p3Name);
        textArray.add(p4Name);
        textArray.add(p5Name);
        textArray.add(p6Name);
        
        
    }
    
    public void update(Game game){ // Test of sharing game object between controllers
//        p1Name.setText(game.getPlayer(1).name);
        printPlayers(game);
        printSlides(game);
        System.out.println("-----------");
        
        p1Name.setText(game.players.get(0).name);
        p2Name.setText(game.players.get(1).name);
        p3Name.setText(game.players.get(2).name);
        p4Name.setText(game.players.get(3).name);
        p5Name.setText(game.players.get(4).name);
        p6Name.setText(game.players.get(5).name);
        p1Score.setText(game.players.get(0).score + "");
        p2Score.setText(game.players.get(1).score + "");
        p3Score.setText(game.players.get(2).score + "");
        p4Score.setText(game.players.get(3).score + "");
        p5Score.setText(game.players.get(4).score + "");
        p6Score.setText(game.players.get(5).score + "");
        p1Inst.setText(game.players.get(0).institution);
        p2Inst.setText(game.players.get(1).institution);
        p3Inst.setText(game.players.get(2).institution);
        p4Inst.setText(game.players.get(3).institution);
        p5Inst.setText(game.players.get(4).institution);
        p6Inst.setText(game.players.get(5).institution);
         // Change background color
        mainGridPane.setStyle("-fx-background-color: " + game.getSecondaryColor() );
        // Change foreground color
        labelArray.stream().forEach((lbl) -> {lbl.setTextFill(Paint.valueOf(game.primaryColor));});
        textArray.stream().forEach((lbl) -> {lbl.setFill(Paint.valueOf(game.primaryColor));});
        
        
        
        mainPain.setImage(game.getCurrentSlide().getImage());
    
        
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
            System.out.println("  " + currentSlide.getSlideType().typeName);
            System.out.println("  " + currentSlide.getSlideValue());
            
        }
    }
    
    public void resizeSlide(Double width, Double height){
        mainPain.setPreserveRatio(true);
        mainPain.setFitHeight(width);
        mainPain.setFitHeight(height);
    }
    
    public double getHeight(){
        return this.mainPain.getFitHeight();
    }
    public double getWidth(){
        return this.mainPain.getFitWidth();
    }
    
    
   
    
    
    
    
}
