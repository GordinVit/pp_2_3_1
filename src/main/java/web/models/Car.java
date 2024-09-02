package web.models;

import java.util.Objects;

public class Car {
  private long id;
  private String brand;
  private String model;
  private String color;

  public Car() {
  }

  public Car(long id, String brand, String model, String color) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.color = color;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Car{" +
        "id=" + id +
        ", brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", color='" + color + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return id == car.id && Objects.equals(brand, car.brand) && Objects.equals(
        model, car.model) && Objects.equals(color, car.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, brand, model, color);
  }
}
