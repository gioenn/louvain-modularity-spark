package it.polimi.dagsymb;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GuardEvaluatorLouvainNoReduce implements IGuardEvaluator {

    private List<Integer> satisfiableGuards;

    @Override
    public List<Integer> evaluateGuards(Map<String, Object> knownValues) {
        satisfiableGuards = new ArrayList<>();

        extractValues(knownValues);

        evaluateActualGuards();

        return satisfiableGuards;
    }

    private void evaluateActualGuards() {
        //path condition evaluation
        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!count_Louvain_java_435_0_known || (count_Louvain_java_435_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!count_Louvain_java_435_1_known || (count_Louvain_java_435_1) > (0)) &&
           (!count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (-(arg3))) >= (0)) &&
           ((1) <= (arg4)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!count_Louvain_java_435_2_known || (count_Louvain_java_435_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!count_Louvain_java_435_3_known || (count_Louvain_java_435_3) > (0)) &&
           (!count_Louvain_java_435_2_known || !count_Louvain_java_435_3_known || !count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_2) + (count_Louvain_java_435_3)) - (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (arg3))) >= (0)) &&
           ((2) <= (arg4)) &&
           (!count_Louvain_java_419_4_known || (count_Louvain_java_419_4) > (0)) &&
           (!count_Louvain_java_435_4_known || (count_Louvain_java_435_4) > (0)) &&
           true) {
           satisfiableGuards.add(0);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!count_Louvain_java_435_0_known || (count_Louvain_java_435_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!count_Louvain_java_435_1_known || (count_Louvain_java_435_1) > (0)) &&
           (!count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (-(arg3))) >= (0)) &&
           ((1) <= (arg4)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!count_Louvain_java_435_2_known || (count_Louvain_java_435_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!count_Louvain_java_435_3_known || (count_Louvain_java_435_3) > (0)) &&
           (!count_Louvain_java_435_2_known || !count_Louvain_java_435_3_known || !count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_2) + (count_Louvain_java_435_3)) - (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (arg3))) >= (0)) &&
           ((2) > (arg4)) &&
           true) {
           satisfiableGuards.add(1);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!count_Louvain_java_435_0_known || (count_Louvain_java_435_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!count_Louvain_java_435_1_known || (count_Louvain_java_435_1) > (0)) &&
           (!count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (-(arg3))) >= (0)) &&
           ((1) <= (arg4)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!count_Louvain_java_435_2_known || (count_Louvain_java_435_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!count_Louvain_java_435_3_known || (count_Louvain_java_435_3) > (0)) &&
           (!count_Louvain_java_435_2_known || !count_Louvain_java_435_3_known || !count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_2) + (count_Louvain_java_435_3)) - (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (arg3))) < (0)) &&
           (!count_Louvain_java_419_4_known || (count_Louvain_java_419_4) > (0)) &&
           (!count_Louvain_java_435_4_known || (count_Louvain_java_435_4) > (0)) &&
           true) {
           satisfiableGuards.add(2);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!count_Louvain_java_435_0_known || (count_Louvain_java_435_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!count_Louvain_java_435_1_known || (count_Louvain_java_435_1) > (0)) &&
           (!count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (-(arg3))) >= (0)) &&
           ((1) > (arg4)) &&
           true) {
           satisfiableGuards.add(3);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!count_Louvain_java_435_0_known || (count_Louvain_java_435_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!count_Louvain_java_435_1_known || (count_Louvain_java_435_1) > (0)) &&
           (!count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (-(arg3))) < (0)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!count_Louvain_java_435_2_known || (count_Louvain_java_435_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!count_Louvain_java_435_3_known || (count_Louvain_java_435_3) > (0)) &&
           (!count_Louvain_java_435_2_known || !count_Louvain_java_435_3_known || !count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_2) + (count_Louvain_java_435_3)) - (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (arg3))) >= (0)) &&
           ((1) <= (arg4)) &&
           (!count_Louvain_java_419_4_known || (count_Louvain_java_419_4) > (0)) &&
           (!count_Louvain_java_435_4_known || (count_Louvain_java_435_4) > (0)) &&
           true) {
           //satisfiableGuards.add(4);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!count_Louvain_java_435_0_known || (count_Louvain_java_435_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!count_Louvain_java_435_1_known || (count_Louvain_java_435_1) > (0)) &&
           (!count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (-(arg3))) < (0)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!count_Louvain_java_435_2_known || (count_Louvain_java_435_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!count_Louvain_java_435_3_known || (count_Louvain_java_435_3) > (0)) &&
           (!count_Louvain_java_435_2_known || !count_Louvain_java_435_3_known || !count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_2) + (count_Louvain_java_435_3)) - (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (arg3))) >= (0)) &&
           ((1) > (arg4)) &&
           true) {
           //satisfiableGuards.add(5);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!count_Louvain_java_435_0_known || (count_Louvain_java_435_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!count_Louvain_java_435_1_known || (count_Louvain_java_435_1) > (0)) &&
           (!count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (-(arg3))) < (0)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!count_Louvain_java_435_2_known || (count_Louvain_java_435_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!count_Louvain_java_435_3_known || (count_Louvain_java_435_3) > (0)) &&
           (!count_Louvain_java_435_2_known || !count_Louvain_java_435_3_known || !count_Louvain_java_435_0_known || !count_Louvain_java_435_1_known || (((count_Louvain_java_435_2) + (count_Louvain_java_435_3)) - (((count_Louvain_java_435_0) + (count_Louvain_java_435_1)) - (arg3))) < (0)) &&
           (!count_Louvain_java_419_4_known || (count_Louvain_java_419_4) > (0)) &&
           (!count_Louvain_java_435_4_known || (count_Louvain_java_435_4) > (0)) &&
           true) {
           satisfiableGuards.add(6);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!count_Louvain_java_435_0_known || (count_Louvain_java_435_0) > (0)) &&
           ((0) > (arg4)) &&
           true) {
           satisfiableGuards.add(7);
        }

    }

    private long count_Louvain_java_304_0;
    private boolean count_Louvain_java_304_0_known;
    private int arg3;
    private long count_Louvain_java_419_4;
    private boolean count_Louvain_java_419_4_known;
    private int arg4;
    private long count_Louvain_java_419_3;
    private boolean count_Louvain_java_419_3_known;
    private long count_Louvain_java_419_0;
    private boolean count_Louvain_java_419_0_known;
    private long count_Louvain_java_419_2;
    private boolean count_Louvain_java_419_2_known;
    private long count_Louvain_java_419_1;
    private boolean count_Louvain_java_419_1_known;
    private long count_Louvain_java_435_3;
    private boolean count_Louvain_java_435_3_known;
    private long count_Louvain_java_435_4;
    private boolean count_Louvain_java_435_4_known;
    private long count_Louvain_java_435_1;
    private boolean count_Louvain_java_435_1_known;
    private long count_Louvain_java_435_2;
    private boolean count_Louvain_java_435_2_known;
    private long count_Louvain_java_435_0;
    private boolean count_Louvain_java_435_0_known;

    private void extractValues(Map<String, Object> knownValues) {
        count_Louvain_java_304_0_known = (knownValues.get("count_Louvain_java_304_0") != null);
        if (knownValues.get("count_Louvain_java_304_0") != null)
            count_Louvain_java_304_0 = (long) knownValues.get("count_Louvain_java_304_0");

        if (knownValues.get("arg3") != null)
            arg3 = Integer.parseInt((String) knownValues.get("arg3"));

        count_Louvain_java_419_4_known = (knownValues.get("count_Louvain_java_419_4") != null);
        if (knownValues.get("count_Louvain_java_419_4") != null)
            count_Louvain_java_419_4 = (long) knownValues.get("count_Louvain_java_419_4");

        if (knownValues.get("arg4") != null)
            arg4 = Integer.parseInt((String) knownValues.get("arg4"));

        count_Louvain_java_419_3_known = (knownValues.get("count_Louvain_java_419_3") != null);
        if (knownValues.get("count_Louvain_java_419_3") != null)
            count_Louvain_java_419_3 = (long) knownValues.get("count_Louvain_java_419_3");

        count_Louvain_java_419_0_known = (knownValues.get("count_Louvain_java_419_0") != null);
        if (knownValues.get("count_Louvain_java_419_0") != null)
            count_Louvain_java_419_0 = (long) knownValues.get("count_Louvain_java_419_0");

        count_Louvain_java_419_2_known = (knownValues.get("count_Louvain_java_419_2") != null);
        if (knownValues.get("count_Louvain_java_419_2") != null)
            count_Louvain_java_419_2 = (long) knownValues.get("count_Louvain_java_419_2");

        count_Louvain_java_419_1_known = (knownValues.get("count_Louvain_java_419_1") != null);
        if (knownValues.get("count_Louvain_java_419_1") != null)
            count_Louvain_java_419_1 = (long) knownValues.get("count_Louvain_java_419_1");

        count_Louvain_java_435_3_known = (knownValues.get("count_Louvain_java_435_3") != null);
        if (knownValues.get("count_Louvain_java_435_3") != null)
            count_Louvain_java_435_3 = (long) knownValues.get("count_Louvain_java_435_3");

        count_Louvain_java_435_4_known = (knownValues.get("count_Louvain_java_435_4") != null);
        if (knownValues.get("count_Louvain_java_435_4") != null)
            count_Louvain_java_435_4 = (long) knownValues.get("count_Louvain_java_435_4");

        count_Louvain_java_435_1_known = (knownValues.get("count_Louvain_java_435_1") != null);
        if (knownValues.get("count_Louvain_java_435_1") != null)
            count_Louvain_java_435_1 = (long) knownValues.get("count_Louvain_java_435_1");

        count_Louvain_java_435_2_known = (knownValues.get("count_Louvain_java_435_2") != null);
        if (knownValues.get("count_Louvain_java_435_2") != null)
            count_Louvain_java_435_2 = (long) knownValues.get("count_Louvain_java_435_2");

        count_Louvain_java_435_0_known = (knownValues.get("count_Louvain_java_435_0") != null);
        if (knownValues.get("count_Louvain_java_435_0") != null)
            count_Louvain_java_435_0 = (long) knownValues.get("count_Louvain_java_435_0");

    }
}
