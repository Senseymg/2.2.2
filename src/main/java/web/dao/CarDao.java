package web.dao;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDao {


    private List<Car> car;
    {
        car = new ArrayList<>();
        car.add(new Car(1,"Vaz 1999",869));
        car.add(new Car(2,"Volga Syber",3400));
        car.add(new Car(3,"Audi 100",8000));
        car.add(new Car(4,"Mazda 3",2600));
        car.add(new Car(5,"BMW X5",1600));
    }
    public Car show(int id){

        return car.stream().filter(car->car.getId()==id).findAny().orElse(null);
    }
    public List<Car> index(){
        List<Car> allCarToShow;
        allCarToShow=car;
        return allCarToShow;
    }
    public List<Car> showCarCount (int numberOfCars){
        if(numberOfCars >= 5){ return car; }else{
        List<Car> showCarCountList = new ArrayList<>();
        for(int i=0;i<numberOfCars;i++){
            showCarCountList.add(car.get(i));
        }
        return showCarCountList;}
    }

}
