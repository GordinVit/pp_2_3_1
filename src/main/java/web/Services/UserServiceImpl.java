package web.Services;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserServiceImpl implements UserService {

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public List<User> getUsers() {
    return entityManager.createQuery("from User", User.class).getResultList();
  }

  @Transactional
  @Override
  public void saveUser(User user) {
    entityManager.persist(user);
  }

  @Transactional
  @Override
  public void updateUser(User user) {
    entityManager.merge(user);  // `merge` обновляет существующую сущность
  }

  @Override
  public User getUserById(Long id) {
    return entityManager.find(User.class, id);
  }
  @Override
  @Transactional  // Аннотация для управления транзакцией
  public void deleteUser(Long id) {
    User user = entityManager.find(User.class, id);
    if (user != null) {
      entityManager.remove(user);
    }
  }
}
