
//public class App {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	
import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Main {
	
    public static boolean isValidDate(String date) {
    	
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        
        format.setLenient(false);
        try {
            Date parsedDate = format.parse(date);
            
            return true;
            
        } catch (ParseException e) {
        	
            return false;
        }
    }

    public static void main(String[] args) {
    	
        String[] dates = {
        		
            "01/15/2010", "1/15/2010", "1-15-2010", "1/15/00", "02/29/2016", "02/29/2015"
        };

        for (String date : dates) {
        	
            if (isValidDate(date)) {
            	
                System.out.println(date + " est valide");
                
            } else {
            	
                System.out.println(date + " n'est pas valide");
            }
        }
    }
}