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

    public void requestCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
    }

    public void requestGameRounds() {
        System.out.println("시도할 회수는 몇회인가요");
    }
}
