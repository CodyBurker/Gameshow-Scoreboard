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
public class SlideType {
    boolean hasPoints;
    int pointValue;
    String typeName;
    SlideType(boolean hasPoints, int pointValue, String typeName){
        this.hasPoints = hasPoints;
        this.pointValue = pointValue;
        this.typeName = typeName;
    }
    public String toString(){
        return this.typeName;
    }
}
