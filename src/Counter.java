/**
 * Created by Deniz on 09.12.2017.
 */
public class Counter {
    String s;
    public Counter(String s){
        this.s = s;
    }
    int calculateFirst(){
        int l = s.length()-1;
        int result = 0;
        for(int i = 0; i<l;i++){
            if(i == 0){
                if(s.charAt(i) == (s.charAt(l))){
                    result += Character.getNumericValue(s.charAt(i));
                } else {
                    continue;
                }
            }else{
                if(s.charAt(i) == s.charAt(i+1)) {
                    result += Character.getNumericValue(s.charAt(i));
                }else {
                    continue;
                }

            }
        }
        return result;
    }
    int calculateSecond(){
        int l = s.length()-1;
        int step = s.length()/2;
        int result = 0;
        for(int i = 0; i<l;i++){
            if(i+step > l){
                if(s.charAt(i) == s.charAt(i-step)){
                    result += Character.getNumericValue(s.charAt(i));
                }
            }else{
                if(s.charAt(i) == s.charAt(i+step)){
                    result += Character.getNumericValue(s.charAt(i));
                }
            }
        }
        return result;
    }
}
