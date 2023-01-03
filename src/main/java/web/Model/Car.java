package web.Model;

public class Car {

    private int id;
    private String modelName;
    private int price;

    public Car() {
    }



    public Car(int id, String modelName, int price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
