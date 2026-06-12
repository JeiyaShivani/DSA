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
			//when stack is empty and we need to push
			if (st.isEmpty()) {
				st.push(new Pair(curr, 1));
			}
			else if (st.peek().ch == curr) {
				
				st.peek().count++;
				
				if (st.peek().count == k) {
					st.pop();
				}
			}
			//when stack isnt empty and top character is different "aaba"-- here if in stack we have [ (a,2) , (b,1) ] now 
				//this statement would be required to add the next pair which is [ (a,2) , (b,1) , (a,1)]
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
