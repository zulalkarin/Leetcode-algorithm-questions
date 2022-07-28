class Solution {
    public int romanToInt(String s) {
        
     	 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
     map.put('I', 1);
     map.put('V', 5);
     map.put('X', 10);
     map.put('L', 50);
     map.put('C', 100);
     map.put('D', 500);
     map.put('M', 1000);


        
        
        int ans = 0;
        
        
        
        if(s.length() >1 ){
             for (int i = 0; i < s.length() - 1; i++) {
			if ( map.get(s.charAt(i)) >=  map.get(s.charAt(i + 1))) {
				ans += map.get( s.charAt(i));
				if (i == s.length() - 2) {
					ans += map.get( s.charAt(s.length() - 1));

				}
			}
			if ( map.get( s.charAt(i)) < map.get( s.charAt(i + 1))) {
				ans += ( map.get( s.charAt(i + 1)) - map.get( s.charAt(i)));
				i++;
				if (i == s.length() - 2) {
					ans += map.get( s.charAt(i+1));

				}
				
			}

		}
            
        }
        
        else if(s.length() ==1){
            ans += map.get(s.charAt(0));
        }
        
        else
            ans =0;
       
		return ans;
        
    }
}