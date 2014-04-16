package unittest.samples;

import java.util.Stack;

public class Calc {
	
		private Stack<String> tokens;
		
		public Calc() {
				tokens = new Stack<String>();
		}
	
		public String enter(String keySequence) {
				if ("r".equalsIgnoreCase(keySequence)) {
						return result();
				}
				tokens.push(keySequence);
				return keySequence;
		}
		
		private String result() {
				if ("+".equals(tokens.peek())) {
						tokens.pop();
						return add(toDouble(tokens.pop()), toDouble(tokens.pop()));
				}
				return "?";
		}
		
		private Double toDouble(String value) {
				return Double.parseDouble(value);
		}
		
		String add(double value1, double value2) {
				return Double.toString(value1 + value2);
		}

}
