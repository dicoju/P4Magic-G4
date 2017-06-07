/**
 * MagicP4
 * IUT Lyon 1 - 2016
 */
package model;

import java.util.Random;

/**
 * Class EffectFactory
 *
 * @author hakkahi - IUT Lyon 1 - 2016
 *
 */
public class EffectFactory {

    /**
     * Returns a random effect chosen amongst the available effects listed
     *
     * @return an effect
     */
    public static Effect createEffect() {
        int min = 0;
        int max = 2;
        return new ChangeColorEffect();

        

    }
    
}
