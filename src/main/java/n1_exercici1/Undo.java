package n1_exercici1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Undo {

	private static Undo instance;
	static Deque <String> stack;

	private Undo() { }
    
    public static Undo getInstance() {
        if(instance == null) {
        	stack = new ArrayDeque<>();
        	instance = new Undo();
        }
        return instance;
    }
    
    public void dataStack (String string) {
    	
    	String response = string;
    	if(response.equals("1")) {
    		stack.push("sum");
    	} else if(response.equals("2")) {
    		stack.push("sustract");
    	} else if(response.equals("3")) {
    		stack.push("multiply");
    	}else if(response.equals("4")) {
    		stack.push("divide");
    	}else if(response.equals("5")) {
    		stack.pop();
    	}else if(response.equals("6")) {
    		System.out.println(" ");
    		System.out.println("History" + "\n");
    		for (String string2 : stack) {
			System.out.println(string2);
    		}
    	}else {
    		System.out.println("Key not supported"  + "\n");
    	}
    }
}
