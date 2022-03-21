package repositories;

import models.User;

//contracts - validate credentials and create a user
//DAO creates contracts to make an interface to define what we need for the entire system to function properly

public interface UserDAO {
    User getUserGivenUsername(String username);
    void createUser(User user);
}
