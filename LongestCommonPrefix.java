class Solution {
    
    
    public String findPrefix(String str1, String str2){
        int size = Math.min(str1.length(), str2.length());
            String ans ="";
           
            for(int i=0; i<size; i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    ans += str1.charAt(i);
                }
                   else
                   break;
            }            
         return ans;
        
       
    }
    public String longestCommonPrefix(String[] strs) {
        
        
        String ans="";
        
        if(strs.length > 1){
            ans = findPrefix(strs[0], strs[1]);
                if(strs.length > 2){
                    for(int i=2; i<strs.length; i++){
                    ans = findPrefix(ans, strs[i]);
                    }
                }       
                
        }
        else if(strs.length == 1){
            ans = strs[0];
        }
        else{
            return "";
        }
    
        
       return ans; 
        
    }
}
