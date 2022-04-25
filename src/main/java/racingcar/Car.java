package racingcar;

public class Car {
    private static final int CAR_NAME_SIZE = 5;

    private String carName = "";
    private int carPosition = 0;

    public Car(String carName) {
        validateEmpty(carName);
        validateSize(carName);
        this.carName = carName;
    }

    private void validateEmpty(String carName) {
        if (carName == null || carName.isEmpty()) {
            throw new IllegalArgumentException("[ERROR]");
        }
    }

    private void validateSize(String carName) {
        if (carName.length() > CAR_NAME_SIZE) {
            throw new IllegalArgumentException("[ERROR]");
        }
    }
}
