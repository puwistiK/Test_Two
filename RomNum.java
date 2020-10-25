import java.util.LinkedHashMap;
import java.util.Map;
	
	public class RomNum{
	    
	      public static String RomanNumerals(int Int) {
	    LinkedHashMap<String, Integer> romNum = new LinkedHashMap<String, Integer>();
	    romNum.put("M", 1000);
	    romNum.put("CM", 900);
	    romNum.put("D", 500);
	    romNum.put("CD", 400);
	    romNum.put("C", 100);
	    romNum.put("XC", 90);
	    romNum.put("L", 50);
	    romNum.put("XL", 40);
	    romNum.put("X", 10);
	    romNum.put("IX", 9);
	    romNum.put("V", 5);
	    romNum.put("IV", 4);
	    romNum.put("I", 1);
	    String res = "";
	    for(Map.Entry<String, Integer> entry : romNum.entrySet()){
	      int matches = Int/entry.getValue();
	      res += repeat(entry.getKey(), matches);
	      Int = Int % entry.getValue();
	    }
	    return res;
	  }
	  public static String repeat(String s, int n) {
	    if(s == null) {
	        return null;
	    }
	    final StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++) {
	        sb.append(s);
	    }
	    return sb.toString();
	  }
	  
	   
	}
