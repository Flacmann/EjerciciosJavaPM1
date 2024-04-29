package bolita;

import java.awt.Canvas;
import java.awt.Graphics;


/**
 *
 * @author Flacman
 */
public class Bolita extends Canvas {

    int moverX, moverY;

    public Bolita() {
        this.setSize(400, 200);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(moverX, moverY, 30, 30);
    }

    public int getMoverX() {
        return moverX;
    }

    public void setMoverX(int moverX) {
        this.moverX = moverX;
    }

    public int getMoverY() {
        return moverY;
    }

    public void setMoverY(int movery) {
        this.moverY = movery;
    }

}
