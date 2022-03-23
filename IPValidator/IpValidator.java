import java.util.regex.*;
public class IpValidator {
	public static boolean isValid(String ip) {
		String[] ipArr = ip.split("\\.");
		String regex = "[0-9]+";
		Pattern p = Pattern.compile(regex);
		
		for(int i=0;i<4;i++) {
			Matcher m = p.matcher(ipArr[i]);	
			if(!m.matches()) {
				return false;
			}
		}
		
		if(ipArr.length!=4 || ipArr[3].equals("0") || ipArr[3].equals("255") ) {
					return false;
		}
		for(int i=0;i<3;i++) {
			if(Integer.parseInt(ipArr[i])<0 || Integer.parseInt(ipArr[i])>255) return false;
		}
		return true;
	}
}
