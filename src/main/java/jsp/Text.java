package jsp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

	
	
	
	
	
public static void main(String[] args) {
	String in = "gtyiu puphp lhfdgj"; 
	Pattern p = Pattern.compile("[(\\ ?)(\\.?)(\\;?)(\\!?)]");
	Matcher m = p.matcher(in);

if (m.find() == true){
	
	System.out.println(m.);
}

}
}

