package lib;

/**
 * A class containing games.
 */
public class GamesCodeWars {

    /**
     * Plays the Rock-Paper-Scissors game between two players and determines the
     * winner.
     *
     * @param p1 The choice of Player 1 (scissors, paper, or rock).
     * @param p2 The choice of Player 2 (scissors, paper, or rock).
     * @return The result of the game: "Player 1 won!" if Player 1 wins, "Player 2
     *         won!" if Player 2 wins,
     *         or "Draw!" if it's a tie.
     */
    public static String rps(String p1, String p2) {
        if ((p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock")) ||
                (p1.equals("rock") && p2.equals("scissors"))) {
            return "Player 1 won!";
        } else if ((p2.equals("scissors") && p1.equals("paper")) ||
                (p2.equals("paper") && p1.equals("rock")) ||
                (p2.equals("rock") && p1.equals("scissors"))) {
            return "Player 2 won!";
        } else {
            return "Draw!";
        }

    }

    /**
     * Determines whether an alarm should be set or not based on the employment and
     * vacation status.
     *
     * @param employed A boolean representing the employment status. True if
     *                 employed, false otherwise.
     * @param vacation A boolean representing the vacation status. True if on
     *                 vacation, false otherwise.
     * @return True if the alarm should be set, which means the person is employed
     *         and not on vacation.
     *         False if the alarm should not be set, which means the person is
     *         either not employed or on vacation.
     */
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }

}
