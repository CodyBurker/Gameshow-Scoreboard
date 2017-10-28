/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soYouThinkYouKnowMath;

import java.io.File;
import java.io.FileInputStream;
import javafx.scene.image.Image;

/**
 *
 * @author cody
 */
public class Slide {
    private Image slideImage;
    private int slideType; // Type of slide: delineated above
    private int pointValue;
//    private boolean isPointSlide; // 1. Regular slide with point values
//    private boolean isTitleSlide; // 2. Slide without points associated, just a title
//    private boolean isTieBreakerSlide; // 3. Slide that is a tie-breaker. Has a point value...
//    private boolean isFlashRoundSlide; // 4. Is a slide in which everyone answers
//    private boolean isFinalSlide; // 5. Final slide with point value.


    // Constructor
    Slide( File slideFile, int type){
        this.slideType = type;
        this.pointValue = 0;
        try{
        this.slideImage = new Image(new FileInputStream(slideFile.getAbsolutePath()));
        
        }
        catch(Exception e){}
        
    }
    Slide(File imagePath,int type, int pointValue){
        this.slideType = type;
        this.pointValue = pointValue;
        try{
        this.slideImage = new Image(new FileInputStream(imagePath.getAbsolutePath()));
        
        }
        catch(Exception e){}
    }
    int getSlideType(){
        return this.slideType;
    }
    int getSlideValue(){
        return this.pointValue;
    }
    Image getImage(){
        return this.slideImage;
    }
    void setImage(Image newImage){
        this.slideImage = newImage;
    }
    void setSlideType(int slideType){
        this.slideType = slideType;
    }
    void setSlidePointValue(int pointValue){
        this.pointValue = pointValue;
    }
    
}
