package com.ashwin.ngobeta;

import java.util.List;

public interface UserService {
    User createUser(String firstName, String lastName, String email, String password, String role);
    User getUserById(Long userId);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(Long userId);
}