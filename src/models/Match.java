package models;

/**
 * The Class Match.
 *
 * @author hardik.kapoor
 */
public class Match {

    /** The match ID. */
    private Integer matchID;

    /** The season. */
    private Integer season;

    /** The city. */
    private String city;

    /** The date. */
    private String date;

    /** The team 1. */
    private Integer team1;

    /** The team 2. */
    private Integer team2;

    /** The toss winner. */
    private Integer tossWinner;

    /** The toss decision. */
    private String tossDecision;

    /** The result. */
    private String result;

    /** The winner. */
    private Integer winner;

    /**
     * Gets the match ID.
     *
     * @return the matchID
     */
    public Integer getMatchID() {
        return matchID;
    }

    /**
     * Sets the match ID.
     *
     * @param matchID the matchID to set
     */
    public void setMatchID(Integer matchID) {
        this.matchID = matchID;
    }

    /**
     * Gets the season.
     *
     * @return the season
     */
    public Integer getSeason() {
        return season;
    }

    /**
     * Sets the season.
     *
     * @param season the season to set
     */
    public void setSeason(Integer season) {
        this.season = season;
    }

    /**
     * Gets the city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date.
     *
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets the team 1.
     *
     * @return the team1
     */
    public Integer getTeam1() {
        return team1;
    }

    /**
     * Sets the team 1.
     *
     * @param team1 the team1 to set
     */
    public void setTeam1(Integer team1) {
        this.team1 = team1;
    }

    /**
     * Gets the team 2.
     *
     * @return the team2
     */
    public Integer getTeam2() {
        return team2;
    }

    /**
     * Sets the team 2.
     *
     * @param team2 the team2 to set
     */
    public void setTeam2(Integer team2) {
        this.team2 = team2;
    }

    /**
     * Gets the toss winner.
     *
     * @return the tossWinner
     */
    public Integer getTossWinner() {
        return tossWinner;
    }

    /**
     * Sets the toss winner.
     *
     * @param tossWinner the tossWinner to set
     */
    public void setTossWinner(Integer tossWinner) {
        this.tossWinner = tossWinner;
    }

    /**
     * Gets the toss decision.
     *
     * @return the tossDecision
     */
    public String getTossDecision() {
        return tossDecision;
    }

    /**
     * Sets the toss decision.
     *
     * @param tossDecision the tossDecision to set
     */
    public void setTossDecision(String tossDecision) {
        this.tossDecision = tossDecision;
    }

    /**
     * Gets the result.
     *
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the result.
     *
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Gets the winner.
     *
     * @return the winner
     */
    public Integer getWinner() {
        return winner;
    }

    /**
     * Sets the winner.
     *
     * @param winner the winner to set
     */
    public void setWinner(Integer winner) {
        this.winner = winner;
    }
}
