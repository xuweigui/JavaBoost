package com.windrift.interview.codereview;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserService {
    private String userStatusActive = "active";
    private String userStatusPending = "pending";
    private String userStatusDisabled = "disabled";
    private String userStatusDeleted = "deleted";

    private Map<User, String> allUsers;

    //call this method when system starts up
    public void loadAllusers() {

        //suppose this user is read from a DB
        User user1 = new User();
        String userStatus1 = "active";

        allUsers.put(user1, userStatus1);

        //load all other users
    }

    public void login(User user) {
        if (allUsers.get(user) == userStatusActive) {
            //login successful
        } else {
            //login failed
        }
    }

    public void resetUserPassword(User user) {
        String status = allUsers.get(user);
        switch (status) {
            case userStatusActive:
                //successful
                ;
            case userStatusPending:
                //successful
                ;
            case userStatusDisabled:
                //fail
                ;
            case userStatusDeleted:
                //fail
                ;
        }
    }

    public void createUser(User newUser) {
        if (allUsers.containsKey(newUser)) {
            //fail. User already exists
        } else {
            //create the user
            allUsers.put(newUser, "active");
        }
    }


    public void disableUser(User user) {
        String status = allUsers.get(user);
        if (status.equals(userStatusActive) | status.equals(userStatusPending)) {
            allUsers.put(user, userStatusDisabled);
        } else if (status.equals(userStatusDisabled)) {
            //fail
            //user already disabled
        } else {
            //fail
            //can not disable deleted user
        }
    }

    public List<String> getAllActiveUserIds() {
        return allUsers.keySet().stream().map(allUsers::get).filter(Predicate.isEqual("active")).collect(Collectors.toList());
    }

    private class User {
        private String userId; //primary key
        private Integer age;
        private String firstName;
        private String lastName;
   }
}