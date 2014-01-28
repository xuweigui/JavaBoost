package com.windrift.library.policy;

import com.windrift.library.Customer;
import com.windrift.library.item.Borrowable;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 9/06/12
 * Time: 9:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class PolicyHandler {
    private static PolicyHandler INSTANCE = new PolicyHandler();
    private PolicyHandler() {

    }
    public static PolicyHandler getInstance() {
       return INSTANCE;
    }

    public boolean checkForBorrow(Customer customer, Borrowable item) {
        return true;
    }
    
    public int getKeepDays(Customer customer, Borrowable item) {
        return 12;
    }
    public float getFinePerDay (Customer customer, Borrowable item) {
        return 0.2f;
    }
}
