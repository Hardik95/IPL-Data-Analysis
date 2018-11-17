package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class IPLConstants.
 */
public class IPLConstants {

    /** The Constant MATCHES_CSV. */
    public static final String MATCHES_CSV = "/resources/matches.csv";

    /** The Constant DELIVERIES_CSV. */
    public static final String DELIVERIES_CSV = "/resources/deliveries.csv";

    /** The Constant SUNRISERS_HYDERABAD. */
    public static final String SUNRISERS_HYDERABAD = "Sunrisers Hyderabad";

    /** The Constant CHENNAI_SUPER_KINGS. */
    public static final String CHENNAI_SUPER_KINGS = "Chennai Super Kings";

    /** The Constant DECCAN_CHARGERS. */
    public static final String DECCAN_CHARGERS = "Deccan Chargers";

    /** The Constant DELHI_DAREDEVILS. */
    public static final String DELHI_DAREDEVILS = "Delhi Daredevils";

    /** The Constant GUJARAT_LIONS. */
    public static final String GUJARAT_LIONS = "Gujarat Lions";

    /** The Constant KINGS_XI_PUNJAB. */
    public static final String KINGS_XI_PUNJAB = "Kings XI Punjab";

    /** The Constant KOCHI_TUSKERS_KERALA. */
    public static final String KOCHI_TUSKERS_KERALA = "Kochi Tuskers Kerala";

    /** The Constant KOLKATA_KNIGHT_RIDERS. */
    public static final String KOLKATA_KNIGHT_RIDERS = "Kolkata Knight Riders";

    /** The Constant MUMBAI_INDIANS. */
    public static final String MUMBAI_INDIANS = "Mumbai Indians";

    /** The Constant PUNE_WARRIORS. */
    public static final String PUNE_WARRIORS = "Pune Warriors";

    /** The Constant RAJASTHAN_ROYALS. */
    public static final String RAJASTHAN_ROYALS = "Rajasthan Royals";

    /** The Constant ROYAL_CHALLENGERS_BANGALORE. */
    public static final String ROYAL_CHALLENGERS_BANGALORE = "Royal Challengers Bangalore";

    /** The Constant RISING_PUNE_SUPERGIANT. */
    public static final String RISING_PUNE_SUPERGIANT = "Rising Pune Supergiant";

    /** The Constant RISING_PUNE_SUPERGIANTS. */
    public static final String RISING_PUNE_SUPERGIANTS = "Rising Pune Supergiants";

    /** The Constant teams. */
    public static final Map<String, Integer> teams = new HashMap<>();

    static {
        teams.put(SUNRISERS_HYDERABAD, 1);
        teams.put(CHENNAI_SUPER_KINGS, 2);
        teams.put(DECCAN_CHARGERS, 3);
        teams.put(DELHI_DAREDEVILS, 4);
        teams.put(GUJARAT_LIONS, 5);
        teams.put(KINGS_XI_PUNJAB, 6);
        teams.put(KOCHI_TUSKERS_KERALA, 7);
        teams.put(KOLKATA_KNIGHT_RIDERS, 8);
        teams.put(MUMBAI_INDIANS, 9);
        teams.put(PUNE_WARRIORS, 10);
        teams.put(RAJASTHAN_ROYALS, 11);
        teams.put(ROYAL_CHALLENGERS_BANGALORE, 12);
        teams.put(RISING_PUNE_SUPERGIANT, 13);
        teams.put(RISING_PUNE_SUPERGIANTS, 14);
    }

    public static final Map<Integer, String> teamsByID = new HashMap<>();

    static {
        teamsByID.put(1, SUNRISERS_HYDERABAD);
        teamsByID.put(2, CHENNAI_SUPER_KINGS);
        teamsByID.put(3, DECCAN_CHARGERS);
        teamsByID.put(4, DELHI_DAREDEVILS);
        teamsByID.put(5, GUJARAT_LIONS);
        teamsByID.put(6, KINGS_XI_PUNJAB);
        teamsByID.put(7, KOCHI_TUSKERS_KERALA);
        teamsByID.put(8, KOLKATA_KNIGHT_RIDERS);
        teamsByID.put(9, MUMBAI_INDIANS);
        teamsByID.put(10, PUNE_WARRIORS);
        teamsByID.put(11, RAJASTHAN_ROYALS);
        teamsByID.put(12, ROYAL_CHALLENGERS_BANGALORE);
        teamsByID.put(13, RISING_PUNE_SUPERGIANT);
        teamsByID.put(14, RISING_PUNE_SUPERGIANTS);
    }
}
