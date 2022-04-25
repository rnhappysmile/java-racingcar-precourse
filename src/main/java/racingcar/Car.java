package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Car {
    public static final int CAR_NAME_SIZE = 5;
    public static final int MIN_PICK_NUMBER = 0;
    public static final int MAX_PICK_NUMBER = 9;
    public static final int CHECK_CAR_DRIVE = 4;
    public static final int CAR_POSITION_PLUS = 1;
    private static final String ERROR_MESSAGE = "[ERROR]";

    private String carName = "";
    private int carPosition = 0;

    public Car(String carName) {
        validateEmpty(carName);
        validateSize(carName);
        this.carName = carName;
    }

    private void validateEmpty(String carName) {
        if (carName == null || carName.isEmpty()) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    private void validateSize(String carName) {
        if (carName.length() > CAR_NAME_SIZE) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    public int checkGear() {
        int count = pickNumberInRange(MIN_PICK_NUMBER, MAX_PICK_NUMBER);

        if (CHECK_CAR_DRIVE <= count) setCarPosition(getCarPosition() + CAR_POSITION_PLUS);

        return this.carPosition;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarPosition() {
        return carPosition;
    }

    public void setCarPosition(int carPosition) {
        this.carPosition = carPosition;
    }
}
