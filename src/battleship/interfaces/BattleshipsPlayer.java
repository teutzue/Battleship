/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship.interfaces;

/**
 *
 * @author Tobias Grundtvig
 */
public interface BattleshipsPlayer
{
    public void startMatch(int rounds);//how many rounds are in the match
    public void startRound(int round);//round number 1..
    public void placeShips(Fleet fleet, Board board);//Ai places the ships(each) on the board ?? return from this method when it's finished
    public void incoming(Position pos);// called everytime the enemy makes a shot at your board, gives you the position where the enemy made a shot
    /*
    gets a list of enemy ships before you make a shot, then you make the shot and it returns your shot coordinates
    */ 
    public Position getFireCoordinates(Fleet enemyShips);
    public void hitFeedBack(boolean hit, Fleet enemyShips);// after you shoot, it gets you a list of enemy ships so you know how many ships are still there
    //the feedback if you hit smth or not and returns a list of existing ramining ships
    /*
    Called after each round and it'll tell you how may points you have and how many points the enemyy has
    Points calculation: board spaces - shots fired
    */
    public void endRound(int round, int points, int enemyPoints);
    /*
    How many rounds won, lost, draw
    */
    public void endMatch(int won, int lost, int draw);
}
