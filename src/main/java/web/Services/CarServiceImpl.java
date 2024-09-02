package web.Services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import web.models.Car;
@Service
public class CarServiceImpl implements CarService{

  @Override
  public List<Car> getCars( int count) {
    List<Car> carList = new ArrayList<>() {{
      add(new Car(1, "Toyota", "Corolla", "Red"));
      add(new Car(2, "Honda", "Civic", "Blue"));
      add(new Car(3, "BMW", "X5", "Black"));
      add(new Car(4, "Mercedes", "C-Class", "White"));
      add(new Car(5, "Audi", "A4", "Silver"));
    }};
    return carList.stream().limit(count).toList();
  }
}
