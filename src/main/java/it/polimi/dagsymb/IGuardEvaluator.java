package it.polimi.dagsymb;
import java.util.List;
import java.util.Map;

public interface IGuardEvaluator {
	
	public List<Integer> evaluateGuards(Map<String, Object> knownValues);

}
