class Solution {
    public boolean validPalindrome(String s) 
    {
        
         int r=0;
         int l = s.length()-1;
        
         while(r<l)
         {
             if(s.charAt(r)!=s.charAt(l))
             {
                 return isPal(s,r+1,l) || isPal(s,r, l-1);
                
             }
             r++;l--;
                        
         }
         return true;
        
    }
   
    private boolean isPal(String s, int r,int l)
     {
        
         while(r<l)
         {
             if(s.charAt(r)!=s.charAt(l)) return false;
             r++;l--;
         }
         return true;
        
     }
}