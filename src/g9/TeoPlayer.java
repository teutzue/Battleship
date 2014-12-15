
package g9;

import battleship.interfaces.BattleshipsPlayer;
import battleship.interfaces.Board;
import battleship.interfaces.Fleet;
import battleship.interfaces.Position;
import battleship.interfaces.Ship;
import java.util.Random;

/**
 *
 * @author CosticaTeodor
 */
public class TeoPlayer implements BattleshipsPlayer {
    
     private final static Random rnd = new Random();
    
    private int sizeX;
    private int sizeY;
    
    private int nextX;
    private int nextY;


    @Override
    public void startMatch(int rounds) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startRound(int round) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void placeShips(Fleet fleet, Board board)
    {
        nextX = 0;
        nextY = 0;
        sizeX = board.sizeX();
        sizeY = board.sizeY();
        for(int i = 0; i < fleet.getNumberOfShips(); ++i)
        {
            Ship s = fleet.getShip(i);
            boolean vertical = rnd.nextBoolean();
            Position pos;
            if(vertical)
            {
                int x = rnd.nextInt(sizeX);
                int y = rnd.nextInt(sizeY-(s.size()-1));// YOU CAN NOT PLACE SHIPS OUTSIDE THE BOARD because of this!
                pos = new Position(x, y);
            }
            else
            {
                int x = rnd.nextInt(sizeX-(s.size()-1));// YOU CAN NOT PLACE SHIPS OUTSIDE THE BOARD because of this!
                int y = rnd.nextInt(sizeY);
                pos = new Position(x, y);
            }
            board.placeShip(pos, s, vertical);
        }
    }

    @Override
    public void incoming(Position pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position getFireCoordinates(Fleet enemyShips) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hitFeedBack(boolean hit, Fleet enemyShips) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endRound(int round, int points, int enemyPoints) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endMatch(int won, int lost, int draw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
