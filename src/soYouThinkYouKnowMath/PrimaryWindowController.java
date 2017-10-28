/*
 * To change this license header, choose License Headers load Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template load the editor.
 */
package soYouThinkYouKnowMath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
import javafx.stage.FileChooser.ExtensionFilter;
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
    @FXML
    private ChoiceBox slideType;
    @FXML
    private TextField slideValue;
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

        // Initialize SlideType choicebox'
        //ObservableList slideTypes = new  ObservableList (game.slideTypes);
        slideType.setItems(FXCollections.observableArrayList(game.slideTypes));

    }

    @FXML
    private void p1UpClick(ActionEvent event) {
        game.getPlayer(0).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p2UpClick(ActionEvent event) {
        game.getPlayer(1).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p3UpClick(ActionEvent event) {
        game.getPlayer(2).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p4UpClick(ActionEvent event) {
        game.getPlayer(3).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p5UpClick(ActionEvent event) {
        game.getPlayer(4).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p6UpClick(ActionEvent event) {
        game.getPlayer(5).score += game.getCurrentPointValue();
        update();
    }

    @FXML
    private void p1DownClick(ActionEvent event) {
        game.getPlayer(0).score--;
        update();
    }

    @FXML
    private void p2DownClick(ActionEvent event) {
        game.getPlayer(1).score--;
        update();

    }

    @FXML
    private void p3DownClick(ActionEvent event) {
        game.getPlayer(2).score--;
        update();

    }

    @FXML
    private void p4DownClick(ActionEvent event) {
        game.getPlayer(3).score--;
        update();

    }

    @FXML
    private void p5DownClick(ActionEvent event) {
        game.getPlayer(4).score--;
        update();

    }

    @FXML
    private void p6DownClick(ActionEvent event) {
        game.getPlayer(5).score--;
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
        try {
            FileInputStream x = new FileInputStream(newSlideFile.getAbsolutePath());
        } catch (Exception e) {

        }
        game.addSlide(newSlideFile);
        update();
    }

    @FXML
    private void editNextClick(ActionEvent event) {
        game.next();
        update();
    }

    @FXML
    private void editPrevClick(ActionEvent event) {
        game.prev();
        update();
    }

    @FXML
    private void deleteSlide(ActionEvent event) {
        game.deleteSlide();
        update();
    }

    @FXML
    private void setSlideType(ActionEvent event) {
        int selectedIndex = slideType.getSelectionModel().getSelectedIndex();
        game.getCurrentSlide().setSlideType(game.slideTypes.get(selectedIndex));
        update();
//game.getCurrentSlide().setSlideType(type);
    }

    @FXML
    private void setSlideValue(ActionEvent event) {
        try {
            int tmpSlideValue = Integer.parseInt(slideValue.getText());
            game.getCurrentSlide().setSlidePointValue(tmpSlideValue);
        } catch (Exception e) {

        }
        update();
    }

    @FXML
    private void save(ActionEvent event) {
        try {
            FileChooser saveChooser = new FileChooser();
            saveChooser.setTitle("Save Game");
            saveChooser.getExtensionFilters().add(new ExtensionFilter(".gam", "*.gam"));
            File save = saveChooser.showSaveDialog(stage);
            FileOutputStream fileOut = new FileOutputStream(save);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(game);
            out.close();
            fileOut.close();
            System.out.println("I tried, okay?");
        } catch (Exception x) {
            System.out.println("Well...nope. " + x.toString());
        }
    }

    @FXML
    private void load(ActionEvent event) {
        try {
            FileChooser saveChooser = new FileChooser();
            saveChooser.setTitle("Load Game");
            saveChooser.getExtensionFilters().add(new ExtensionFilter(".gam", "*.gam"));
            File load = saveChooser.showOpenDialog(stage);
            FileInputStream fileIn = new FileInputStream(load);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            game = (Game) in.readObject();
            in.close();
            fileIn.close();
        } catch (Exception e) {
            System.out.println("Nope. " + e.toString());
            for(StackTraceElement x:e.getStackTrace()){
                System.out.println(x);
            }
        }
        game.goToTop();
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
        p1Score.setText(game.players.get(0).score + "");
        p2Score.setText(game.players.get(1).score + "");
        p3Score.setText(game.players.get(2).score + "");
        p4Score.setText(game.players.get(3).score + "");
        p5Score.setText(game.players.get(4).score + "");
        p6Score.setText(game.players.get(5).score + "");

        // Update Slide# indicator label
        String indicatorText = "Slide " + (game.getCurrentSlideNumber() + 1) + " of " + game.getNumberOfSlides();
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
        
        
        
        // Update slide value to match current slide
        
        
        // Update SlideType to match current slide
        slideType.setValue(game.getCurrentSlide().getSlideType().typeName);
        if (game.getCurrentSlide().getSlideType().hasPoints) {
            slideValue.setText(game.getCurrentSlide().getSlideValue() + "");
            slideValue.setEditable(true);
        } else {
            slideValue.setText("No points...");
            slideValue.setEditable(false);
        }
        // Update Image Pane
        try {
            previewPane.setImage(game.getCurrentSlide().getImage());
        } catch (Exception e) {
        }

        // Call secondary window update 
        secondaryWindow.update(game);

    }

}
