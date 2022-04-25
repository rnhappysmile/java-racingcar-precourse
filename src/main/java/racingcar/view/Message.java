package racingcar.view;

import racingcar.Car;
import racingcar.Cars;

public class Message {
    public static final String PLAY_RESULT_MESSAGE = "실행 결과";
    public static final String DRIVE_MARK = "-";
    public static final String NAME_DRIVE_SEPARATION = " : ";

    public void playResult() {
        System.out.println(PLAY_RESULT_MESSAGE);
    }

    public void roundsMessgae(Cars cars) {
        for(Car car : cars.cars) {
            StringBuilder sb = new StringBuilder();

            sb.append(car.getCarName() + NAME_DRIVE_SEPARATION + appendDrive(car.getCarPosition()));
            System.out.println(sb.toString());
        }

        System.out.println();
    }

    private String appendDrive(int driveCount) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < driveCount; i++) sb.append(DRIVE_MARK);

        return sb.toString();
    }


    public void finalWinner(String finalWinnerList) {
        System.out.println("최종 우승자: " + finalWinnerList);
    }
}
