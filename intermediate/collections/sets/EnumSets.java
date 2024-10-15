package intermediate.collections.sets;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * EnumSet is one of the specialized implementations of the Set interface for use with the enumeration type.
 * You can check out more information about it at: https://www.geeksforgeeks.org/enumset-class-java/
 */
public class EnumSets {

    enum SoccerTeams {
        REAL_MADRID,
        BARCELONA,
        BAYERN_MUNCHEN,
        BORUSSIA_DORTMUND,
        JUVENTUS,
        MILAN,
        PARIS_SAINT_GERMAN,
        MONACO
    }

    enum Games {
        FC_25,
        READ_DEAD_REDEMPTION,
        GHOST_RECON_WILDLANDS,
        BATTLEFIELD_IV,
        NO_MANS_SKY,
        STARFIELD,
        DIABLO_IV,
    }

    public static void main(String[] args) {
        /* Creating an EnumSet with the Games enum values */
        EnumSet<Games> e = EnumSet.allOf(Games.class);

        System.out.println("\nInitial state of EnumSet created using allOf() method: " + e);

        /* Creating an Iterator on games */
        Iterator<Games> i = e.iterator();

        System.out.println("\nIterating over Games enum using iterator + while loop: ");

        while (i.hasNext()) {
            System.out.println(i.next() + ", ");
        }

        /* Iterating with for loop */
        System.out.println("\nIterating over Games enum using for loop: ");

        for (Games g : e) {
            System.out.println(g + ", ");
        }

        /* Creating an EnumSet without the Games enum values */
        EnumSet<Games> g = EnumSet.noneOf(Games.class);

        System.out.println("\nInitial state of EnumSet created using noneOf() method: " + g);

        /* Adding game from e EnumSet to g */
        g.add(Games.BATTLEFIELD_IV);

        System.out.println("\nAdd game from 'e' to 'g' EnumSet: " + g);

        /* Adding all games from e EnumSet to g */
        g.addAll(e);

        System.out.println("\nAdd all games from 'e' to 'g' EnumSet: " + g);


        /* Creating multiple sets */
        EnumSet<SoccerTeams> e1, e2, e3, e4, e5, e6, e7;

        e1 = EnumSet.of(SoccerTeams.REAL_MADRID, SoccerTeams.BARCELONA);

        e2 = EnumSet.of(SoccerTeams.BAYERN_MUNCHEN, SoccerTeams.BORUSSIA_DORTMUND);

        e3 = EnumSet.of(SoccerTeams.JUVENTUS, SoccerTeams.MILAN);

        e4 = EnumSet.of(SoccerTeams.PARIS_SAINT_GERMAN, SoccerTeams.MONACO);

        e5 = EnumSet.complementOf(e1);

        e6 = EnumSet.allOf(SoccerTeams.class);

        e7 = EnumSet.range(SoccerTeams.BAYERN_MUNCHEN, SoccerTeams.MILAN);

        System.out.println("\ne1: " + e1);

        System.out.println("e2: " + e2);

        System.out.println("e3: " + e3);

        System.out.println("e4: " + e4);

        System.out.println("e5: " + e5);

        System.out.println("e6: " + e6);

        System.out.println("e7: " + e7);

    }
}