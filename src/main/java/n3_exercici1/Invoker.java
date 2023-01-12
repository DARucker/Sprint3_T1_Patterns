package n3_exercici1;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	private List<IFunction> functions = new ArrayList<>();
	
	public void reciveFunctions(IFunction function) {
		functions.add(function);
	}

	public void executeFunctions() {
		functions.forEach(x -> x.execute());
		functions.clear();
	}
	
	
}
