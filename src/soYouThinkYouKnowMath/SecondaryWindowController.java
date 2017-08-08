/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soYouThinkYouKnowMath;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

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
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    void addPlayerView(String playerName,String playerInstitution,String playerScore){
        
        scoresGridPane.addColumn(0);
    }
    
    
    
}
