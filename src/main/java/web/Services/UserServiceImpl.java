package web.Services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  private final UserDAO userDAO;

  public UserServiceImpl(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @Override
  public List<User> getUsers() {
    return userDAO.getUsers();
  }

  @Transactional
  @Override
  public void saveUser(User user) {
    userDAO.saveUser(user);
  }

  @Override
  public User getUserById(Long id) {
    return userDAO.getUserById(id);
  }

  @Transactional
  @Override
  public void updateUser(User user) {
    userDAO.updateUser(user);
  }

  @Transactional
  @Override
  public void deleteUser(Long id) {
    userDAO.deleteUser(id);
  }
}
