/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soYouThinkYouKnowMath;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author cody
 */
public class Slide implements java.io.Serializable{
    transient private Image slideImage;
    private int pointValue;
    private SlideType slideType;
//    private boolean isPointSlide; // 1. Regular slide with point values
//    private boolean isTitleSlide; // 2. Slide without points associated, just a title
//    private boolean isTieBreakerSlide; // 3. Slide that is a tie-breaker. Has a point value...
//    private boolean isFlashRoundSlide; // 4. Is a slide in which everyone answers
//    private boolean isFinalSlide; // 5. Final slide with point value.

    // Constructor
//    Slide( File slideFile, int type){
//        this.slideType = type;
//        this.pointValue = 0;
//        try{
//        this.slideImage = new Image(new FileInputStream(slideFile.getAbsolutePath()));
//        
//        }
//        catch(Exception e){}
//        slideTypes.add(new SlideType(true,1,"Regular"));
//        slideTypes.add(new SlideType(false,-1,"Title"));
//        slideTypes.add(new SlideType(true,1,"Tie-Breaker"));
//        slideTypes.add(new SlideType(true,1,"Flash Round"));
//        slideTypes.add(new SlideType(true,1,"Final Slide"));
//    }
    Slide(File imagePath,SlideType type, int pointValue){
        this.slideType = type;
        this.pointValue = pointValue;
        try{
        this.slideImage = new Image(new FileInputStream(imagePath.getAbsolutePath()));
        
        }
        catch(Exception e){}
    }
    
    
    SlideType getSlideType(){
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
    void setSlideType(SlideType slideType){
        this.slideType = slideType;
    }
    void setSlidePointValue(int pointValue){
        this.pointValue = pointValue;
    }
    
}
