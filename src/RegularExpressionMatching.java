public class RegularExpressionMatching {
    public boolean isMatch(String s, String p){
        Boolean memo = new Boolean([s.length()][p.length()]);
        return isMatch(s,p,0,0, memo);
    }
    private isMatch (String s, String p, int sIndex,pIndex,Boolean[] [] memo){
        if(sIndex == s.length()&& pIndex == p.length() ){
            return true;
        }
        boolean charactersMatch = s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '.';
        boolean nextOneStar = pIndex + 1 < p.length() && p.charAt((pIndex +1)) == '*';

        final boolean isMatch;
        if(charactersMatch) {
            if (nextOneStar) {

            } else{

            }
        }else { //CHARACTES DON'T MATCH
            if (nextOneStar){
                isMatch = isMatch(s,p sIndex, pIndex +2,memo);
            } else{
                isMatch =false
            }
        }
    }
}
/* p = a.*
s = ada
i -s
j-p

 */