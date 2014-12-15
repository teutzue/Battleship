
package g9;

import g9.TeoPlayer;
import battleship.interfaces.BattleshipsPlayer;
import tournament.player.PlayerFactory;

/**
 *
 * @author CosticaTeodor
 */
public class TeoPlayerFactory implements PlayerFactory<BattleshipsPlayer> {
    
    private static int nextID = 1;
    private final int id;

    public TeoPlayerFactory() {
        id = nextID++;
    }
    
    @Override
    public BattleshipsPlayer getNewInstance() {
        return new TeoPlayer();
    }

    @Override
    public String getID() {
        return "TEO:"+id;
    }

    @Override
    public String getName() {
        return "Teodor shooter " + id;
    }

}
