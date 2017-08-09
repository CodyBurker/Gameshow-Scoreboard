/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soYouThinkYouKnowMath;

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
import javafx.scene.paint.Color;
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
    private TextField p1Institution;
    @FXML
    private TextField p2Institution;
    @FXML
    private TextField p3Institution;
    @FXML
    private TextField p4Institution;
    @FXML
    private TextField p5Institution;
    @FXML
    private TextField p6Institution;
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
        game.players.add(new Player("Player 1", "Franklin"));
        secondaryWindow.loadGame(game);
        secondaryWindow.update();
        game.players.add(new Player("Cody", "Franklin"));
        game.slides.add(new Slide("/imagePath", 1));
        secondaryWindow.update();

    }
    @FXML
    private void p1UpClick(ActionEvent event){
    }
    @FXML
    private void p2UpClick(ActionEvent event){
        
    }
    @FXML
    private void p3UpClick(ActionEvent event){
        
    }
    @FXML
    private void p4UpClick(ActionEvent event){
        
    }
    @FXML
    private void p5UpClick(ActionEvent event){
        
    }
    @FXML
    private void p6UpClick(ActionEvent event){
        
    }

}
