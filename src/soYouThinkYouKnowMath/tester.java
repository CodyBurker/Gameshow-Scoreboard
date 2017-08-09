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
public class tester {
    public static void main(String[] args) {
        System.out.println("Testing custom classes Game, Player, and Slide.");
        Game game = new Game();
        game.slides.add(new Slide("/testPath2",1));
        game.players.add(new Player("Cody","Franklin"));
        System.out.println("Player Name: " + game.getPlayer(1).name);
        System.out.println("Image Path: " + game.getSlide(1).getImagePath());
    }
    
}
