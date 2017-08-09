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
    private Button up;
    
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
        game = new Game();
        game.players.add(new Player("Player 1","Franklin"));
        secondaryWindow.loadGame(game);
        secondaryWindow.update();
        game.players.add(new Player("Cody","Franklin"));
        secondaryWindow.update();
        
    }
    
}
