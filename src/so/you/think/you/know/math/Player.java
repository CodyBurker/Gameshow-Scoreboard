/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.you.think.you.know.math;

/**
 *
 * @author cody
 */
public class Player {
    String name;
    String institution;
    int score;
    
    Player(String name, String institution, int score){
        this.name = name;
        this.institution = institution;
        this.score = score;
    }
    String getName(){
        return this.name;
    }
    String getInstitution(){
        return this.institution;
    }
    int getScore(){
        return this.score;
    }
}
