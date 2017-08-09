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
public class Player {
    String name;
    String institution;
    int score;
    boolean show;
    
    public Player(String name, String institution, int score){
        this.name = name;
        this.institution = institution;
        this.score = score;
        this.show = false;
    }
    public     Player(String name, String institution){
        this.name = name;
        this.institution = institution;
        this.score = 0;
        this.show = false;
    }
    String getName(){
        return this.name;
    }
    void show(){
        this.show = true;
    }
    void hide(){
        this.show = false;
    }
    String getInstitution(){
        return this.institution;
    }
    int getScore(){
        return this.score;
    }
    void setScore(int score){
        this.score = score;
    }
}
