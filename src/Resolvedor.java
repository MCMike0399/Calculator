import java.util.*;
public class Resolvedor {
	public static String[] crearCadena(String s) {
		String aux = "";
		int i=0;
		while(i<s.length()) {
			if(determinaSignoChar(s,i)!='-' && determinaSignoChar(s,i)!='n') {
				aux += i != 0 ? " " : ""; //patch de rodrigo ferrer xD
				aux += s.charAt(i);
				aux += s.charAt(i) == ')' ? "" : " "; //también es parche de rodrigo ferrer xD
				i++;
			}
			else {
				if(determinaSignoChar(s,i)=='-') {
					if(i!=0 && determinaSignoChar(s,i-1)=='n') {
						aux += " ";
						aux += s.charAt(i);
						aux += " ";
						i++;
					}else {
						aux+="-"; 
						i++;
						while(i<s.length() && determinaSignoChar(s,i) == 'n') {
							aux += s.charAt(i);
							i++;
						}
					}
				}else {
					while(i<s.length() && determinaSignoChar(s,i) == 'n') {
						aux += s.charAt(i);
						i++;
					}
				}
			}
		}
		String[] resp = aux.split(" ");
		return resp;
	}
	public static char determinaSignoChar(String s, int i) {
		switch(s.charAt(i)) {
			case '+':
				return '+';
			case '-':
				return '-';
			case '*':
				return '*';
			case '/':
				return '/';
			case '(':
				return '(';
			case ')':
				return ')';
			default:
				return 'n';		
		}
	}
	public static String determinaSigno(String s) {
		switch(s) {
			case "+":
				return "+";
			case "-":
				return "-";
			case "*":
				return "*";
			case "/":
				return "/";
			case "(":
				return "(";
			case ")":
				return ")";
			default:
				return "num";
					
		}
	}
	public static String convertidorPosfijo(String[] cad) {
		String res = "";
		Stack<String> p = new Stack<String>();
		int i=0;
		while(i<cad.length) {
			if(determinaSigno(cad[i]).equals("num")) {
				res += cad[i];
				res += " ";
			}
			else {
				if(determinaSigno(cad[i]).equals("(")) {
					p.push(cad[i]);
				}
				else if(determinaSigno(cad[i]).equals(")")) {
					while(!p.peek().equals("(")) {
						res += p.pop();
						res += " ";
					}
					p.pop(); //eliminamos el (
				}
				else {
					if(!p.isEmpty()) {
						if(ordenSignos(cad[i],p.peek())) {
							p.push(cad[i]);
						}
						else {
							res += p.pop();
							res += " ";
							if(!p.isEmpty()) {
								while(!ordenSignos(cad[i],p.peek())) {
									res += p.pop();
									res += " ";
								}
							}
							p.push(cad[i]);
						}
					}
					else {
						p.push(cad[i]);
					}
				}
			}
			i++;
		}
		while(!p.isEmpty()) {
			res += p.pop();
			res += " ";
		}
		
		return res;
	}
	public static boolean ordenSignos(String s, String peek) {
		if(determinaSigno(s).equals("+") && determinaSigno(peek).equals("*")) {
			return false;
		}
		else if(determinaSigno(s).equals("+") && determinaSigno(peek).equals("/")) {
			return false;
		}
		else if(determinaSigno(s).equals("-") && determinaSigno(peek).equals("*")) {
			return false;
		}
		else if(determinaSigno(s).equals("-") && determinaSigno(peek).equals("/")) {
			return false;
		}
		else if(determinaSigno(s).equals("+") && determinaSigno(peek).equals("+")) {
			return false;
		}
		else if(determinaSigno(s).equals("-") && determinaSigno(peek).equals("-")) {
			return false;
		}
		else if(determinaSigno(s).equals("*") && determinaSigno(peek).equals("*")) {
			return false;
		}
		else if(determinaSigno(s).equals("/") && determinaSigno(peek).equals("*")) {
			return false;
		}
		else if(determinaSigno(s).equals("*") && determinaSigno(peek).equals("/")) {
			return false;
		}
		else if(determinaSigno(s).equals("/") && determinaSigno(peek).equals("*")) {
			return false;
		}
		else if(determinaSigno(s).equals("+") && determinaSigno(peek).equals("-")) {
			return false;
		}
		else if(determinaSigno(s).equals("-") && determinaSigno(peek).equals("+")) {
			return false;
		}
		else {
			return true;
		}
	}
	public static String parcheDelParche(String s) { //método de rodrigo ferrer xD, me ayudó sorry
		String res = "";
		int i=0;
		
		while(i < s.length()) {
			if(s.charAt(i) == ' ') {
				while(i < s.length() && s.charAt(i) == ' ') {
					i++;
				}
				i--;
				res += " ";
			}
			else {
				res += s.charAt(i);
			}
			i++;
		}
		return res;
	}
	public static float calculaPosfijo(String s[]) {
		Stack<Float> p = new Stack<Float>();
		float n1, n2, operacion=0, num=0;
			for(int i=0; i<s.length; i++) {
				switch(s[i]) {
				case "+": 
					n1=p.pop();
					n2=p.pop();
					operacion = n2+n1;
					p.push(operacion);
					break;
				case "-":
					n1=p.pop();
					n2=p.pop();
					operacion = n2-n1;
					p.push(operacion);
					break;
				case "*":
					n1=p.pop();
					n2=p.pop();
					operacion = n2*n1;
					p.push(operacion);
					break;
				case "/":
					n1=p.pop();
					n2=p.pop();
					operacion = n2/n1;
					p.push(operacion);
					break;
				default:
					num = Float.parseFloat(s[i]);
					p.push(num);
					break;
				}
			}
		return operacion;
	}
	public static String resolver(String cadena) {
		try {
			String[] cadenaArr = crearCadena(cadena);
			String aux = parcheDelParche(convertidorPosfijo(cadenaArr));
			String[] res = aux.split(" ");
			float op = calculaPosfijo(res);
			String cad = String.valueOf(op);
			return cad;
		}catch(Exception e) {
			return "Syntax Error";
		}
		
	}
	public static void main(String[] args) {
		resolver("3+2");
	}
}
