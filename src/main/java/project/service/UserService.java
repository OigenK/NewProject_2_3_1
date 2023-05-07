package project.service;

import project.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);

    public void deleteUser(Long id);

    public void updateUser(long id, User user);

    public User findById(long id);

    public List<User> getAllUsers();


}
