class Solution {
    static class Pair {
			char ch;
			int count;
			
			Pair(char ch, int count) {
				this.ch = ch;
				this.count = count;
			}
		}
		
	public static String reducedString(int k, String s) {
		
		Stack<Pair> st = new Stack<>();
		if (k == 1)
         return "";
		for (int i = 0; i < s.length(); i++) {
			
			char curr = s.charAt(i);
			
			if (st.isEmpty()) {
				st.push(new Pair(curr, 1));
			}
			else if (st.peek().ch == curr) {
				
				st.peek().count++;
				
				if (st.peek().count == k) {
					st.pop();
				}
			}
			else {
				st.push(new Pair(curr, 1));
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(Pair p : st){
		    int x=p.count;
		    while(x>0){
		        sb.append(p.ch);
		        x--;
		    }
		    
		}
		return sb.toString();
		}
	}
