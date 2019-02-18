package it.polimi.dagsymb;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GuardEvaluatorLouvain implements IGuardEvaluator {

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
           (!reduce_VertexRDDImpl_scala_88_0_known || (reduce_VertexRDDImpl_scala_88_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_1_known || (reduce_VertexRDDImpl_scala_88_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (-(arg3))) >= (0)) &&
           ((1) <= (arg4)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || (reduce_VertexRDDImpl_scala_88_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_3_known || (reduce_VertexRDDImpl_scala_88_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || !reduce_VertexRDDImpl_scala_88_3_known || !reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_2) + (reduce_VertexRDDImpl_scala_88_3)) - (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (arg3))) >= (0)) &&
           ((2) <= (arg4)) &&
           (!count_Louvain_java_419_4_known || (count_Louvain_java_419_4) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_4_known || (reduce_VertexRDDImpl_scala_88_4) > (0)) &&
           true) {
           satisfiableGuards.add(0);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || (reduce_VertexRDDImpl_scala_88_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_1_known || (reduce_VertexRDDImpl_scala_88_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (-(arg3))) >= (0)) &&
           ((1) <= (arg4)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || (reduce_VertexRDDImpl_scala_88_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_3_known || (reduce_VertexRDDImpl_scala_88_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || !reduce_VertexRDDImpl_scala_88_3_known || !reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_2) + (reduce_VertexRDDImpl_scala_88_3)) - (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (arg3))) >= (0)) &&
           ((2) > (arg4)) &&
           true) {
           satisfiableGuards.add(1);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || (reduce_VertexRDDImpl_scala_88_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_1_known || (reduce_VertexRDDImpl_scala_88_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (-(arg3))) >= (0)) &&
           ((1) <= (arg4)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || (reduce_VertexRDDImpl_scala_88_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_3_known || (reduce_VertexRDDImpl_scala_88_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || !reduce_VertexRDDImpl_scala_88_3_known || !reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_2) + (reduce_VertexRDDImpl_scala_88_3)) - (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (arg3))) < (0)) &&
           (!count_Louvain_java_419_4_known || (count_Louvain_java_419_4) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_4_known || (reduce_VertexRDDImpl_scala_88_4) > (0)) &&
           true) {
           satisfiableGuards.add(2);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || (reduce_VertexRDDImpl_scala_88_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_1_known || (reduce_VertexRDDImpl_scala_88_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (-(arg3))) >= (0)) &&
           ((1) > (arg4)) &&
           true) {
           satisfiableGuards.add(3);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || (reduce_VertexRDDImpl_scala_88_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_1_known || (reduce_VertexRDDImpl_scala_88_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (-(arg3))) < (0)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || (reduce_VertexRDDImpl_scala_88_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_3_known || (reduce_VertexRDDImpl_scala_88_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || !reduce_VertexRDDImpl_scala_88_3_known || !reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_2) + (reduce_VertexRDDImpl_scala_88_3)) - (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (arg3))) >= (0)) &&
           ((1) <= (arg4)) &&
           (!count_Louvain_java_419_4_known || (count_Louvain_java_419_4) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_4_known || (reduce_VertexRDDImpl_scala_88_4) > (0)) &&
           true) {
           //satisfiableGuards.add(4);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || (reduce_VertexRDDImpl_scala_88_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_1_known || (reduce_VertexRDDImpl_scala_88_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (-(arg3))) < (0)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || (reduce_VertexRDDImpl_scala_88_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_3_known || (reduce_VertexRDDImpl_scala_88_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || !reduce_VertexRDDImpl_scala_88_3_known || !reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_2) + (reduce_VertexRDDImpl_scala_88_3)) - (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (arg3))) >= (0)) &&
           ((1) > (arg4)) &&
           true) {
           //satisfiableGuards.add(5);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || (reduce_VertexRDDImpl_scala_88_0) > (0)) &&
           ((0) <= (arg4)) &&
           (!count_Louvain_java_419_1_known || (count_Louvain_java_419_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_1_known || (reduce_VertexRDDImpl_scala_88_1) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (-(arg3))) < (0)) &&
           (!count_Louvain_java_419_2_known || (count_Louvain_java_419_2) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || (reduce_VertexRDDImpl_scala_88_2) > (0)) &&
           (!count_Louvain_java_419_3_known || (count_Louvain_java_419_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_3_known || (reduce_VertexRDDImpl_scala_88_3) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_2_known || !reduce_VertexRDDImpl_scala_88_3_known || !reduce_VertexRDDImpl_scala_88_0_known || !reduce_VertexRDDImpl_scala_88_1_known || (((reduce_VertexRDDImpl_scala_88_2) + (reduce_VertexRDDImpl_scala_88_3)) - (((reduce_VertexRDDImpl_scala_88_0) + (reduce_VertexRDDImpl_scala_88_1)) - (arg3))) < (0)) &&
           (!count_Louvain_java_419_4_known || (count_Louvain_java_419_4) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_4_known || (reduce_VertexRDDImpl_scala_88_4) > (0)) &&
           true) {
           satisfiableGuards.add(6);
        }

        if (
           (!count_Louvain_java_304_0_known || (count_Louvain_java_304_0) > (0)) &&
           (!count_Louvain_java_419_0_known || (count_Louvain_java_419_0) > (0)) &&
           (!reduce_VertexRDDImpl_scala_88_0_known || (reduce_VertexRDDImpl_scala_88_0) > (0)) &&
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
    private long reduce_VertexRDDImpl_scala_88_3;
    private boolean reduce_VertexRDDImpl_scala_88_3_known;
    private long reduce_VertexRDDImpl_scala_88_4;
    private boolean reduce_VertexRDDImpl_scala_88_4_known;
    private long reduce_VertexRDDImpl_scala_88_1;
    private boolean reduce_VertexRDDImpl_scala_88_1_known;
    private long reduce_VertexRDDImpl_scala_88_2;
    private boolean reduce_VertexRDDImpl_scala_88_2_known;
    private long reduce_VertexRDDImpl_scala_88_0;
    private boolean reduce_VertexRDDImpl_scala_88_0_known;

    private void extractValues(Map<String, Object> knownValues) {
        count_Louvain_java_304_0_known = (knownValues.get("count_Louvain.java:304_0") != null);
        if (knownValues.get("count_Louvain.java:304_0") != null)
            count_Louvain_java_304_0 = (long) knownValues.get("count_Louvain.java:304_0");

        if (knownValues.get("arg3") != null)
            arg3 = Integer.parseInt((String) knownValues.get("arg3"));

        count_Louvain_java_419_4_known = (knownValues.get("count_Louvain.java:419_4") != null);
        if (knownValues.get("count_Louvain.java:419_4") != null)
            count_Louvain_java_419_4 = (long) knownValues.get("count_Louvain.java:419_4");

        if (knownValues.get("arg4") != null)
            arg4 = Integer.parseInt((String) knownValues.get("arg4"));

        count_Louvain_java_419_3_known = (knownValues.get("count_Louvain.java:419_3") != null);
        if (knownValues.get("count_Louvain.java:419_3") != null)
            count_Louvain_java_419_3 = (long) knownValues.get("count_Louvain.java:419_3");

        count_Louvain_java_419_0_known = (knownValues.get("count_Louvain.java:419_0") != null);
        if (knownValues.get("count_Louvain.java:419_0") != null)
            count_Louvain_java_419_0 = (long) knownValues.get("count_Louvain.java:419_0");

        count_Louvain_java_419_2_known = (knownValues.get("count_Louvain.java:419_2") != null);
        if (knownValues.get("count_Louvain.java:419_2") != null)
            count_Louvain_java_419_2 = (long) knownValues.get("count_Louvain.java:419_2");

        count_Louvain_java_419_1_known = (knownValues.get("count_Louvain.java:419_1") != null);
        if (knownValues.get("count_Louvain.java:419_1") != null)
            count_Louvain_java_419_1 = (long) knownValues.get("count_Louvain.java:419_1");

        reduce_VertexRDDImpl_scala_88_3_known = (knownValues.get("reduce_VertexRDDImpl.scala:88_3") != null);
        if (knownValues.get("reduce_VertexRDDImpl.scala:88_3") != null)
            reduce_VertexRDDImpl_scala_88_3 = (long) knownValues.get("reduce_VertexRDDImpl.scala:88_3");

        reduce_VertexRDDImpl_scala_88_4_known = (knownValues.get("reduce_VertexRDDImpl.scala:88_4") != null);
        if (knownValues.get("reduce_VertexRDDImpl.scala:88_4") != null)
            reduce_VertexRDDImpl_scala_88_4 = (long) knownValues.get("reduce_VertexRDDImpl.scala:88_4");

        reduce_VertexRDDImpl_scala_88_1_known = (knownValues.get("reduce_VertexRDDImpl.scala:88_1") != null);
        if (knownValues.get("reduce_VertexRDDImpl.scala:88_1") != null)
            reduce_VertexRDDImpl_scala_88_1 = (long) knownValues.get("reduce_VertexRDDImpl.scala:88_1");

        reduce_VertexRDDImpl_scala_88_2_known = (knownValues.get("reduce_VertexRDDImpl.scala:88_2") != null);
        if (knownValues.get("reduce_VertexRDDImpl.scala:88_2") != null)
            reduce_VertexRDDImpl_scala_88_2 = (long) knownValues.get("reduce_VertexRDDImpl.scala:88_2");

        reduce_VertexRDDImpl_scala_88_0_known = (knownValues.get("reduce_VertexRDDImpl.scala:88_0") != null);
        if (knownValues.get("reduce_VertexRDDImpl.scala:88_0") != null)
            reduce_VertexRDDImpl_scala_88_0 = (long) knownValues.get("reduce_VertexRDDImpl.scala:88_0");

    }
}
