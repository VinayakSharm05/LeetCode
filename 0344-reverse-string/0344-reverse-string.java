class Solution {
    public void reverseString(char[] s) {
       int n=s.length;
       char[] a=new char[n];
          for(int i=0;i<s.length;i++){
            a[i]=s[i];
          } 
          for(int i=0;i<n;i++){
            s[i]=a[n-1-i];
          }
    }
}