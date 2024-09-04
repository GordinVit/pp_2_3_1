package web.dao;

import web.models.User;
import java.util.List;

public interface UserDAO {
  List<User> getUsers();
  void saveUser(User user);
  User getUserById(Long id);
  void updateUser(User user);
  void deleteUser(Long id);
}
