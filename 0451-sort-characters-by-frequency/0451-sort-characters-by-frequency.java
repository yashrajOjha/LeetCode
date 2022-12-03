class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //sorting the map based on the count of the keys
        List<Character> ls = new ArrayList<>(map.keySet());
        Collections.sort(ls,(a,b)->(map.get(b)-map.get(a)));
        StringBuilder sb = new StringBuilder();
        //getting the 'n' count of characters (which are already sorted using the values)
	    for (Object c : ls) {
		    for (int i = 0; i < map.get(c); i++) {
			    sb.append(c);
		    }
	    }
	    return sb.toString();
    }
}