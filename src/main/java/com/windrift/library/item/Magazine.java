package com.windrift.library.item;

import com.windrift.library.item.Borrowable;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 9/06/12
 * Time: 9:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class Magazine implements Borrowable {
    @Override
    public boolean borrow() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean returnBack() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean renew() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
