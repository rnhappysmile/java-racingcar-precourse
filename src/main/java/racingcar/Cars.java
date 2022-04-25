package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final String CAR_NAME_SPLIT = ",";

    private List<Car> cars;

    public Cars(String carNames) {
        cars = new ArrayList<Car>();
        String[] divideCarNames = divideCars(carNames);
        insertCarName(divideCarNames);
    }

    private String[] divideCars(String carNames) {
        String[] divideCarNames = carNames.split(CAR_NAME_SPLIT);

        return divideCarNames;
    }

    private void insertCarName(String[] divideCarNames) {
        for (String carName : divideCarNames) {
            cars.add(new Car(carName));
        }
    }
}
