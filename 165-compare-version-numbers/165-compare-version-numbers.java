class Solution {
    public int compareVersion(String version1, String version2) {
     String []ver1 = version1.split("\\.");
     String []ver2 = version2.split("\\.");
     int max=Math.max(ver1.length, ver2.length);
     for(int i=0;i<max;i++){
         int val1 = i>=ver1.length?0:Integer.parseInt(ver1[i]);
         int val2 = i>=ver2.length?0:Integer.parseInt(ver2[i]);
         if(val1>val2){
             return 1;
         }
         if(val1<val2){
             return -1;
         }
     }
        return 0;
    }
}