public class Expander {
	
	public static void main(String[] args) {
		
	}
	
	private String x;
	private String y;
	private int n;
	private String ans;
	
	public Expander() {
		x = "";
		y = "";
		n = 0;
		ans = "1";
	}
	
	public Expander(String x, String y, int n) {
		x = x;
		y = y;
		n = n;
		ans = "1";
	}
	
	public String expand(String x, String y, int n) {
		ans = "";
		int r = 0;
		
		int e = n;
		
		if (n == 0) {
			return "" + 1;
		}
		
		else {
			if (bothVar(x, y) == true) {
				for (int i = 0; i < e + 1; i++) {
					ans = ans + "" + (fac(n) / (fac(r) * fac(n-r))) + "(" + x + ")^" + (n - r) + " (" + y + ")^" + r + " + ";
					r++;
				}
				
				ans = ans.substring(0, ans.length() - 3);
			}
			
			else if (varNum(x, y) == true) {
				for (int i = 0; i < e + 1; i++) {
					ans = ans + "" + (fac(n) / (fac(r) * fac(n-r))) * (int)Math.pow(Integer.parseInt(y), r) + "" + x + "^" + (n - r) 						  + " + ";
					r++;
				}
				
				ans = ans.substring(0, ans.length() - 3);
				
				ans = ans.replace("1" + x + "^0", "1");
				ans = ans.replace("1" + x, x);
				ans = ans.replace(x + "^0", "");
				ans = ans.replace(x + "^1", x);
				ans = ans.replace("+ -", "- ");
				
				//ans = ans.substring(0, ans.indexOf("+ 0"));
			}
			
			else if (numVar(x, y) == true) {
				for (int i = 0; i < e + 1; i++) {
					ans = ans + "" + (fac(n) / (fac(r) * fac(n-r))) * (int)Math.pow(Integer.parseInt(x), r) + "" + y + "^" + (n - r) 						  + " + ";
					r++;
				}
							
				ans = ans.substring(0, ans.length() - 3);
							
				ans = ans.replace("1" + y + "^0", "1");
				ans = ans.replace("1" + y, y);
				ans = ans.replace(y + "^0", "");
				ans = ans.replace(y + "^1", y);
				ans = ans.replace("+ -", "- ");
				
				//ans = ans.substring(0, ans.indexOf("+ 0"));
			}
			
			else if (numNum(x, y) == true) {
				for (int i = 0; i < e + 1; i++) {
					ans = "" + (int)Math.pow((Integer.parseInt(x) + Integer.parseInt(y)), n);
				}
			}
			
		}
		
		return ans;
	}
	
	
	public boolean bothVar(String x, String y) {
		boolean bothVar = false;
		int check = 0;
		
		try {
			int a = Integer.parseInt(x);
			
		} catch (NumberFormatException e) {
			check++;
		}	
		
		try {
			int b = Integer.parseInt(y);
		} catch (NumberFormatException e) {
			check++;
		}
		
		if (check == 2) {
			bothVar = true;
		}
		
		return bothVar;
	}
	
	public boolean varNum(String x, String y) {
		boolean varNum = false;
		int check = 0;
		
		try {
			int a = Integer.parseInt(x);
			
		} catch (NumberFormatException e) {
			check = 1;
		}
		
		try {
			int b = Integer.parseInt(y);
		} catch (NumberFormatException e) {
			check = 2;
		}
		
		if (check == 1) {
			varNum = true;
		} else if (check == 2) {
			varNum = false;
		}
		
		return varNum;
	}
	
	public boolean numVar(String x, String y) {
		boolean numVar = false;
		int check = 0;
		
		try {
			int a = Integer.parseInt(x);
			
		} catch (NumberFormatException e) {
			check = 1;
		}
		
		try {
			int b = Integer.parseInt(y);
		} catch (NumberFormatException e) {
			check = 2;
		}
		
		if (check == 2) {
			numVar = true;
		} else if (check == 1) {
			numVar = false;
		}
		
		return numVar;
	}
	
	public boolean numNum(String x, String y) {
		boolean numNum = false;
		int check = 0;
		
		try {
			int a = Integer.parseInt(x);
			
		} catch (NumberFormatException e) {
			check = 1;
		}
		
		try {
			int b = Integer.parseInt(y);
		} catch (NumberFormatException e) {
			check = 2;
		}
		
		if (check == 0) {
			numNum = true;
		}
		
		return numNum;
	}
	
	public int fac(int x) {
		int ans = 1;
		
		for (int i = x; i > 1; i--) {
			ans = ans * i;
		}
		
		return ans;
	}
}