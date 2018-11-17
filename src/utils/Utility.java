package utils;

import static java.util.stream.Collectors.toMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

import models.Delivery;
import models.Match;

/**
 * The Class Utility.
 */
public class Utility {

    /** The log. */
    private Logger LOG = Logger.getLogger("IPL Utility");

    /** The matches. */
    public static Map<String, Match> matches;

    /** The deliveries. */
    public static List<Delivery> deliveries;

    /**
     * Load data.
     */
    public void loadData() {
        loadMatches();
        loadDeliveries();
    }

    /**
     * Load matches.
     */
    public void loadMatches() {
        matches = new HashMap<>();
        File matchesFile = new File(getClass().getResource(IPLConstants.MATCHES_CSV).getFile());
        Scanner scanner;
        try {
            scanner = new Scanner(matchesFile);
            scanner.nextLine();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] matchValues = line.split(",");
                matches.put(matchValues[0], populateMatch(matchValues));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Populate match.
     *
     * @param values the values
     * @return the match
     */
    private Match populateMatch(String[] values) {
        Match match = new Match();
        try {
        match.setMatchID(Integer.parseInt(values[0]));
        match.setSeason(Integer.parseInt(values[1]));
        match.setCity(values[2]);
        match.setDate(values[3]);
        match.setTeam1(IPLConstants.teams.get(values[4]));
        match.setTeam2(IPLConstants.teams.get(values[5]));
        match.setTossWinner(IPLConstants.teams.get(values[6]));
        match.setTossDecision(values[7]);
        match.setResult(values[8]);
            if (values.length == 10) {
                match.setWinner(IPLConstants.teams.get(values[9]));
            }
        } catch (Exception e) {
            LOG.info("Exception during populating Match from file - " + Arrays.toString(values));
            e.printStackTrace();
        }
        return match;
    }

    /**
     * Load deliveries.
     */
    public void loadDeliveries() {
        deliveries = new ArrayList<>();
        File deliveriesFile = new File(getClass().getResource(IPLConstants.DELIVERIES_CSV).getFile());
        Scanner scanner;
        try {
            scanner = new Scanner(deliveriesFile);
            scanner.nextLine();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                deliveries.add(populateDeliveries(values));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Populate deliveries.
     *
     * @param values the values
     * @return the delivery
     */
    private Delivery populateDeliveries(String[] values) {
        Delivery delivery = new Delivery();

        delivery.setMatch(matches.get(values[0]));
        delivery.setInning(Integer.parseInt(values[1]));
        delivery.setBattingTeam(IPLConstants.teams.get(values[2]));
        delivery.setBowlingTeam(IPLConstants.teams.get(values[3]));
        delivery.setOver(Integer.parseInt(values[4]));
        delivery.setBall(Integer.parseInt(values[5]));
        delivery.setBatsman(values[6]);
        delivery.setBowler(values[7]);
        delivery.setWideRuns(Integer.parseInt(values[8]));
        delivery.setByeRuns(Integer.parseInt(values[9]));
        delivery.setLegByeRuns(Integer.parseInt(values[10]));
        delivery.setNoBallRuns(Integer.parseInt(values[11]));
        delivery.setPenaltyRuns(Integer.parseInt(values[12]));
        delivery.setBatsmanRuns(Integer.parseInt(values[13]));
        delivery.setExtraRuns(Integer.parseInt(values[14]));
        delivery.setTotalRuns(Integer.parseInt(values[15]));

        return delivery;
    }

    /**
     * Sort map by value.
     *
     * @param <T> the generic type
     * @param map the map
     * @return the map
     */
    public <T> Map<T, Integer> sortMapByValue(Map<T, Integer> map) {
        return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(
            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

    /**
     * Checks if is four.
     *
     * @param delivery the delivery
     * @return true, if is four
     */
    public boolean isFour(Delivery delivery) {
        return (delivery.getBatsmanRuns() == 4)
            || (delivery.getWideRuns() == 4)
                || (delivery.getNoBallRuns() == 4)
                || (delivery.getByeRuns() == 4)
                || (delivery.getLegByeRuns() == 4);
    }

    /**
     * Checks if is six.
     *
     * @param delivery the delivery
     * @return true, if is six
     */
    public boolean isSix(Delivery delivery) {
        return (delivery.getBatsmanRuns() == 6) || (delivery.getNoBallRuns() == 6);
    }
}
