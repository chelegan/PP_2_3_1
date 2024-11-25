package web.dao;
import web.entity.model.User;

import java.util.List;

public interface UserDao {
    List<User> getListOfAllUsers();
    void deleteUser(int id);
    void updateUser(User user);
    void addUser(User user);
    User getUser(int id);
}


