/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soYouThinkYouKnowMath;

/**
 *
 * @author cody
 */
public class Slide {
    private String imagePath; // Filepath to image assocaited with slide
//    private boolean isPointSlide; // 1. Regular slide with point values
//    private boolean isTitleSlide; // 2. Slide without points associated, just a title
//    private boolean isTieBreakerSlide; // 3. Slide that is a tie-breaker. Has a point value...
//    private boolean isFlashRoundSlide; // 4. Is a slide in which everyone answers
//    private boolean isFinalSlide; // 5. Final slide with point value.
    private int pointValue;
    private int slideType; // Type of slide: delineated above
    // Constructor
    Slide( String imagePath, int type){
        this.imagePath = imagePath;
        this.slideType = type;
    }
    Slide(String imagePath,int type, int pointValue){
        this.imagePath = imagePath;
        this.slideType = type;
        this.pointValue = pointValue;
    }
    
    
}
