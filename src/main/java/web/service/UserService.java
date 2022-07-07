package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User getByID (long id);
    void edit(User user);
    void delete(User user);
}
