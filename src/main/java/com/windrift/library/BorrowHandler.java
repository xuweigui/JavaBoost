package com.windrift.library;

import com.windrift.library.item.Borrowable;
import com.windrift.library.policy.PolicyHandler;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 9/06/12
 * Time: 9:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class BorrowHandler {
    public boolean borrow (Customer customer, Borrowable ... items) {
        for (Borrowable item : items) {
            PolicyHandler policyHandler = PolicyHandler.getInstance();
            if (policyHandler.checkForBorrow(customer, item)) {
                policyHandler.getKeepDays(customer, item);
                item.borrow();
                //
            }

        }
        return true;
    }

    public boolean renew (Customer customer, Borrowable ... items) {
       return true;
    }

    public boolean returnBack (Customer customer, Borrowable... items) {
        return true;
    }

}
