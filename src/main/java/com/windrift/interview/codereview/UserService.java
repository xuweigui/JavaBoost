package com.windrift.interview.codereview;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class UserService {
    private String userStatusActive = "active";
    private String userStatusPending = "pending";
    private String userStatusDisabled = "disabled";
    private String userStatusDeleted = "deleted";

    private Map<User, String> allUsers;

    private boolean allUserLoaded;

    @PostConstruct
    public void printAllUsers() {
        while (true) {
            if (allUserLoaded) {
                //print all users every five minutes
                Executors.newScheduledThreadPool(1)
                        .schedule(() -> allUsers.entrySet().stream().forEach(System.out::println),
                                5, TimeUnit.MINUTES);
            } else {
                try {
                    //wait for 5 minutes
                    Thread.sleep(TimeUnit.MINUTES.toMillis(5));
                } catch (Throwable e) {
                    //ignore the exception
                }
            }
        }
    }

    @PostConstruct
    public void loadAllusers() {

        //suppose this user is read from a DB
        User user1 = new User();
        String userStatus1 = "active";

        allUsers.put(user1, userStatus1);

        //load all other users

        allUserLoaded = true;
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
        return allUsers.keySet().stream()
                .map(allUsers::get)
                .filter(Predicate.isEqual("active"))
                .collect(Collectors.toList());
    }

    private class User {
        private String userId; //primary key
        private Integer age;
        private String firstName;
        private String lastName;
   }
}