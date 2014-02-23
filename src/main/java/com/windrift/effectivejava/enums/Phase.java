package com.windrift.effectivejava.enums;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 20/05/12
 * Time: 11:42 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Phase {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT (SOLID, LIQUID),
        FREEZE (LIQUID, SOLID),
        BOIL (LIQUID, GAS),
        CONDENSE (GAS, LIQUID),
        SUBLIME (SOLID, GAS),
        DEPOSIT (LIQUID, SOLID);

        private final Phase fromPhase;
        private final Phase toPhase;

        Transition (Phase from, Phase to) {
            fromPhase = from;
            toPhase = to;
        }

        private static final Map<Phase, Map<Phase, Transition>> m = new EnumMap<Phase, Map<Phase, Transition>>(Phase.class);
        static {
             for (Phase phase : Phase.values()) {
                 m.put(phase, new EnumMap<Phase, Transition>(Phase.class));
             }
             for (Transition trans : Transition.values()) {
                 m.get(trans.fromPhase).put(trans.toPhase, trans);
             }
        }

        public static Transition from(Phase src, Phase dst) {
           return m.get(src).get(dst);
        }

    }
    
/*  bad implementation
public enum Transition {
    MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;
    
    // Rows indexed by src-ordinal, cols by dst-ordinal
    private static final Transition[][] TRANSITIONS = {
            { null, MELT, SUBLIME },
            { FREEZE, null, BOIL },
            { DEPOSIT, CONDENSE, null }
    };
    // Returns the phase transition from one phase to another
    public static Transition from(Phase src, Phase dst) {
        return TRANSITIONS[src.ordinal()][dst.ordinal()];
    }  
       
    }
    */
    
    
    public static void main (String[] args) {
        for (Phase from : Phase.values()) {
            for (Phase to : Phase.values()) {
                System.out.printf("%s to %s is called %s\n", from, to, Transition.from(from, to) != null ? Transition.from(from, to) : "no change");
            }
        }
    }
}
