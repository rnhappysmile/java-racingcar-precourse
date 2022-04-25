package racingcar;

public class GameInfo {
    public static final int MIN_COUNT = 1;
    public static final int MAX_COUNT = Integer.MAX_VALUE;    // 요구사항에서 최대 게임수가 명시되지 않아 변경될 수 있음

    private int rounds;

    public GameInfo(String command) {
        int tempCount = stringToInteger(command);

        validateSize(tempCount);

        this.rounds = tempCount;
    }

    private int stringToInteger(String command) {
        return Integer.parseInt(command);
    }

    private void validateSize(int rounds) {
        if (MIN_COUNT > rounds || MAX_COUNT < rounds) {
            throw new IllegalArgumentException("[ERROR]");
        }
    }

    public GameStatus isPlay(int currentRounds) {
        if(currentRounds < this.rounds) return GameStatus.PLAY;

        return GameStatus.STOP;
    }
}
