
package marsintruders;


import android.gameengine.icadroids.objects.GameObject;
import android.gameengine.icadroids.objects.MoveableGameObject;

import java.util.ArrayList;

/**
 * Created by Sjuulius on 18-3-2015.
 */
public class Bullet extends MoveableGameObject{
    protected int x;
    protected int y;

    public Bullet (int x, int y){
        this.x = x;
        this.y = y;
        setSprite("shot");
    }

}
