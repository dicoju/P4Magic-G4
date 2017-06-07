package model;

import static model.EffectFactory.createEffect;

/**
 *
 * @author julien
 */
public class DisparitionColoneEffet extends Effect {
    
    @Override
     /**
     * @param int line  Ligne où le joueur joue son jeton
     * @param int column  Colonne où le joueur joue son jeton
     * @param Game game  Partie en cours
     * Cet effet fait disparaitre toute la colone où est joué le jeton
     */   
    public void playEffect(int line, int column, Game game) {
        
        int i;
        for(i = 0; i < 10; i++){
            game.getBoard().getTileIJ(i, column).setStatus(-1);
        }
        game.getBoard().getTileIJ(line, column).setEffect(createEffect());
    }
}
