package model;
import java.awt.*;
import model.bodyPart.*;

/**
 * This simplified version of the model has no adapters to play the game.
 * There is no game to play here.  Just a few ABodyPart to display via the
 * paint() method.
 * The IPaintAdapter installed by the controller will call the HangmanGame to
 * paint(...).
 */
public class HangmanGameModel {
    /**
     * A few ABodyPart to be drawn.
     */
    private ABodyPart _noose = new NoosePart(null, null);
    private ABodyPart _rightArm = new RArmPart(null);
    private ABodyPart _torso = new TorsoPart(null);

    /**
     * Paints the visible body parts on the supplied Graphics context.
     * @param g The Graphics context to draw on.
     */
    public void paint(Graphics g) {
        // FOR ILLUSTRATION ONLY:
        System.out.println("HangmanGame.paint()...");

        _noose.draw(g);
        _rightArm.draw(g);
        _torso.draw(g);
    }
}

