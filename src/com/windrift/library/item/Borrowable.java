package com.windrift.library.item;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 9/06/12
 * Time: 9:38 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Borrowable {
    public boolean borrow ();
    public boolean returnBack ();
    public boolean renew();
}
