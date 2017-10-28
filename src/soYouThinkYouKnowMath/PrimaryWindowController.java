/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soYouThinkYouKnowMath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author cody
 */
public class PrimaryWindowController implements Initializable {

    Stage stage;
    SecondaryWindowController secondaryWindow;
    //@Override

    @FXML
    private TabPane tabPane;

    @FXML
    private Button p1Up;
    @FXML
    private Button p2Up;
    @FXML
    private Button p3Up;
    @FXML
    private Button p4Up;
    @FXML
    private Button p5Up;
    @FXML
    private Button p6Up;
    @FXML
    private Button p1Down;
    @FXML
    private Button p2Down;
    @FXML
    private Button p3Down;
    @FXML
    private Button p4Down;
    @FXML
    private Button p5Down;
    @FXML
    private Button p6Down;
    @FXML
    private TextField p1Name;
    @FXML
    private TextField p2Name;
    @FXML
    private TextField p3Name;
    @FXML
    private TextField p4Name;
    @FXML
    private TextField p5Name;
    @FXML
    private TextField p6Name;
    @FXML
    private ToggleButton p1Show;
    @FXML
    private ToggleButton p2Show;
    @FXML
    private ToggleButton p3Show;
    @FXML
    private ToggleButton p4Show;
    @FXML
    private ToggleButton p5Show;
    @FXML
    private ToggleButton p6Show;
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
    private TextField p1Inst;
    @FXML
    private TextField p2Inst;
    @FXML
    private TextField p3Inst;
    @FXML
    private TextField p4Inst;
    @FXML
    private TextField p5Inst;
    @FXML
    private TextField p6Inst;
    @FXML
    private Label editSlideIndicator;
    @FXML
    private ImageView previewPane;
    @FXML
    private Button editNext;
    @FXML
    private Button editPrev;
    @FXML
    private Button editInsert;
    @FXML
    private Button editDelete;
    @FXML
    private Label playSlideIndicator;
    @FXML
    private Button playPrev;
    @FXML
    private Button playNext;
    @FXML
    private Button playHide;
    
    Game game;

    public void initialize(URL url, ResourceBundle rb) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("SecondaryWindow.fxml"));
            //Load secondWindow
            Parent root = (Parent) loader.load();
            stage = new Stage();
            secondaryWindow = loader.getController();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("So You Think You Know Math");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(PrimaryWindowController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Failed to initlialize secondary window");
        }
        stage.setOnCloseRequest((WindowEvent we) -> {
            System.exit(0);
        });

        // Open into edit pane...
        SingleSelectionModel<Tab> selectionModel;
        selectionModel = tabPane.getSelectionModel();
        selectionModel.select(1);

        game = new Game();

    }

    @FXML
    private void p1UpClick(ActionEvent event) {
        game.getPlayer(1).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p2UpClick(ActionEvent event) {
        game.getPlayer(2).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p3UpClick(ActionEvent event) {
        game.getPlayer(3).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p4UpClick(ActionEvent event) {
        game.getPlayer(4).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p5UpClick(ActionEvent event) {
        game.getPlayer(5).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p6UpClick(ActionEvent event) {
        game.getPlayer(6).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p1DownClick(ActionEvent event) {
        game.getPlayer(1).score--;
        update();
    }

    @FXML
    private void p2DownClick(ActionEvent event) {
        game.getPlayer(2).score--;
        update();

    }

    @FXML
    private void p3DownClick(ActionEvent event) {
        game.getPlayer(3).score--;
        update();

    }

    @FXML
    private void p4DownClick(ActionEvent event) {
        game.getPlayer(4).score--;
        update();

    }

    @FXML
    private void p5DownClick(ActionEvent event) {
        game.getPlayer(5).score--;
        update();

    }

    @FXML
    private void p6DownClick(ActionEvent event) {
        game.getPlayer(6).score--;
        update();

    }

    @FXML
    private void p1HideClick(ActionEvent event) {

    }

    @FXML
    private void p2HideClick(ActionEvent event) {

    }

    @FXML
    private void p3HideClick(ActionEvent event) {

    }

    @FXML
    private void p4HideClick(ActionEvent event) {

    }

    @FXML
    private void p5HideClick(ActionEvent event) {

    }

    @FXML
    private void p6HideClick(ActionEvent event) {

    }

    @FXML
    private void p1NameDirty(ActionEvent event) {

        update();
    }

    @FXML
    private void p2NameDirty(ActionEvent event) {

        update();
    }

    @FXML
    private void p3NameDirty(ActionEvent event) {

        update();
    }

    @FXML
    private void p4NameDirty(ActionEvent event) {

        update();
    }

    @FXML
    private void p5NameDirty(ActionEvent event) {

        update();
    }

    @FXML
    private void p6NameDirty(ActionEvent event) {

        update();
    }

    @FXML
    private void insUpdate(ActionEvent event) {
        update();
    }


    @FXML
    private void insertSlide(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Add new slide");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("JPEG", "*.jpg"));
        File newSlideFile = fileChooser.showOpenDialog(stage);
        //FileInputStream x = new FileInputStream(newSlideFile.getAbsolutePath());
        game.addSlide(newSlideFile);
        update();
    }

    @FXML
    private void editNextClick(ActionEvent event){
        game.next();
        update();
    }
    @FXML
    private void editPrevClick(ActionEvent event){
        game.prev();
        update();
    }
    
    @FXML
    private void deleteSlide(ActionEvent evet){
        game.deleteSlide();
        update();
    }
    


    private void update() {
        // Read player names
        game.players.get(0).name = p1Name.getText();
        game.players.get(1).name = p2Name.getText();
        game.players.get(2).name = p3Name.getText();
        game.players.get(3).name = p4Name.getText();
        game.players.get(4).name = p5Name.getText();
        game.players.get(5).name = p6Name.getText();
        // Read player institutions
        game.players.get(0).institution = p1Inst.getText();
        game.players.get(1).institution = p2Inst.getText();
        game.players.get(2).institution = p3Inst.getText();
        game.players.get(3).institution = p4Inst.getText();
        game.players.get(4).institution = p5Inst.getText();
        game.players.get(5).institution = p6Inst.getText();
        // Update Score Labels
        p1Score.setText(game.getPlayer(0).getScore() + "");
        p1Score.setText(game.getPlayer(1).getScore() + "");
        p1Score.setText(game.getPlayer(2).getScore() + "");
        p1Score.setText(game.getPlayer(3).getScore() + "");
        p1Score.setText(game.getPlayer(4).getScore() + "");
        p1Score.setText(game.getPlayer(5).getScore() + "");
        
        // Update Slide# indicator label
        String indicatorText = "Slide " + (game.getCurrentSlideNumber()+1) + " of " + game.getNumberOfSlides();
        editSlideIndicator.setText(indicatorText);
        playSlideIndicator.setText(indicatorText);
        
        
        // Update point value butttons
        String upString = "+" + game.getCurrentPointValue();
        p1Up.setText(upString);
        p2Up.setText(upString);
        p3Up.setText(upString);
        p4Up.setText(upString);
        p5Up.setText(upString);
        p6Up.setText(upString);
        
        // Update Image Pane
        try{
        previewPane.setImage(game.getCurrentSlide().getImage());
        }
        catch(Exception e){}
        
        // Call secondary window update 
        secondaryWindow.update(game);
        
 }

}
