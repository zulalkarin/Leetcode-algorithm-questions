class Solution {
    public boolean isValid(String s) {
       
        Stack <Character> stack = new Stack<>();
        char c;
        
        for(int i=0; i<s.length();i++)
        {
            c=s.charAt(i);
            
            if(c=='[' || c=='{' || c=='(')
                stack.push(c);
            
            else
            {
                if(stack.size()==0)
                    return false;
                
                if(stack.peek()!= '(' && c==')') 
                    return false;
                                 
                else if(stack.peek()!= '[' && c==']')
                    return false;
                
                 else if(stack.peek()!= '{' && c=='}')
                   return false;
                
                else
                    stack.pop();                          
            }
        }
        
        return stack.size()==0;
    }
        
}     




        
