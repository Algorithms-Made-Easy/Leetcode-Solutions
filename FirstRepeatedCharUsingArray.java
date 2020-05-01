class FirstRepeatedCharUsingArray {
    public int firstRepeatedChar(String s) {
        int[] val=new int[26];
        for(char c:s.toCharArray()){
            val[c-'a']++;
        }
        
        for(int i=0;i<s.length();i++){
            if(val[s.charAt(i)-'a']==1){
                return i;
            }
        }
        
        return -1;
    }
}