package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Game {
    private Cars cars;
    private GameInfo gameInfo;

    public Game(Cars cars, GameInfo gameInfo) {
        this.cars = cars;
        this.gameInfo = gameInfo;
    }

    public void play() {
        int currentRounds = 0;

        while(gameInfo.isPlay(currentRounds).equals(GameStatus.PLAY)) {
            cars.checkGear();

            currentRounds = nextRounds(currentRounds);
        }
    }

    private int nextRounds(int currentRounds) {
        return currentRounds++;
    }
}
