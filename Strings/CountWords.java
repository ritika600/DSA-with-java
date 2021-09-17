
public class Solution {

	public static int countWords(String str) {	
		//Your code goes here
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                c++;
            }
            
        }
        if(c>0|| str.length()>0)
        return c+1;
        return c;
	}

}
