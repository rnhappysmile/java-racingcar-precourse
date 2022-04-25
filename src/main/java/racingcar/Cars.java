package racingcar;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Cars {
    private final String CAR_NAME_SPLIT = ",";

    public List<Car> cars;

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

    public void checkGear() {
        cars.forEach((car) -> car.checkGear());
    }
}
