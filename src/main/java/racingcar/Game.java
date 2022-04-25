package racingcar;

import racingcar.view.Message;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Game {
    private Cars cars;
    private GameInfo gameInfo;

    public void play() {
        int currentRounds = 0;
        Message message = new Message();

        message.requestCarsName();
        this.cars = new Cars(readLine());
        message.requestGameRounds();
        this.gameInfo = new GameInfo(readLine());

        message.playResult();
        while(gameInfo.isPlay(currentRounds).equals(GameStatus.PLAY)) {
            cars.checkGear();

            message.roundsMessgae(cars);

            currentRounds = nextRounds(currentRounds);
        }

        message.finalWinner(getFinalWinnerList());
    }

    private int nextRounds(int currentRounds) {
        return currentRounds + 1;
    }

    private String getFinalWinnerList() {
        String finalWinnerList = "";

        finalWinnerList = cars.getFinalWinnerList();

        return finalWinnerList;
    }
}
