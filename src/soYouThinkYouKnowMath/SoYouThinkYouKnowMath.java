// Cody Burker
// August 2017
package soYouThinkYouKnowMath;

import java.util.Optional;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class SoYouThinkYouKnowMath extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PrimaryWindow.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        // Confirm exit before closing
        stage.setOnCloseRequest((WindowEvent we) -> {
            we.consume();
            Alert ruSure = new Alert(Alert.AlertType.CONFIRMATION);
            ruSure.setContentText("Are you sure you want to quit?");
            Optional<ButtonType> answer = ruSure.showAndWait();
            if (answer.isPresent() && answer.get() == ButtonType.OK ){
                System.out.println("Clicked okay");
                System.exit(0);
                
            }
            else if (answer.isPresent() && answer.get() == ButtonType.CANCEL){
                System.out.println("Clicked cancel");
            }
            
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
