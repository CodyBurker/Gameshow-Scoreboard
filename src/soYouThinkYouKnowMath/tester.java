/*
To test custom methods - Player Slide Game
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
        diag("Player name",game.getPlayer(1).name);
        diag("Image Path",game.getSlide(1).getImagePath());
        diag("Current Slide",game.currentSlide);
        diag("Primary Color",game.primaryColor.toString());
        diag("Number of players",game.getNumberOfPlayers());
        diag("Number of slides",game.getNumberOfSlides());
        diag("Adding Slide");
        game.slides.add(new Slide("2",1));
        diag("Number of slides",game.getNumberOfSlides());
        diag("Adding player");
        game.players.add(new Player("Cody","Franklin"));
        diag("Number of players",game.getNumberOfPlayers());
    }
    static void diag(String before, String after){
        System.out.println(before + ": " + after);
    }
    
    static void diag(String before, int after){
        System.out.println(before + Integer.toString(after));
    }
    static void diag(String single){
        System.out.println(single);
    }
}
