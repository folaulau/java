package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainDate {
	
	/*
	 * doc url: https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
	 * https://www.mkyong.com/java/how-to-convert-string-to-date-java/
	 * 
	 */
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		MainDate main = new MainDate();
		Date date = main.stringToDate("12-12-2001");
		
		
		//============ Comparisons =============
		Date date1 = DateUtils.addYears(new Date(), -5);
		
		Date date2 = DateUtils.addYears(new Date(), 5);
		
		main.after(date1, date2);
		
		main.before(date1, date2);
		
	}

	/**
	 * SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy"); -> String dateInString = "7-Jun-2013";
	 * SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); -> String dateInString = "12-12-2001";
	 * SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); -> String dateInString = "07/06/2013";
	 * SimpleDateFormat formatter = new SimpleDateFormat("E, MMM dd yyyy"); -> String dateInString = "Fri, June 7 2013";
	 * SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a"); -> String dateInString = "Friday, Jun 7, 2013 12:10:56 PM";
	 * SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); -> String dateInString = "2014-10-05T15:23:01Z";
	 * 
	 * 
	 * @param strDate
	 * @return Date
	 */
	
	public Date stringToDate(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {

			date = formatter.parse(strDate);
			log.info("date: {}",date);
			log.info("date formate: {}",formatter.format(date));
			
		} catch (ParseException e) {
			log.error(e.getMessage());
		}
		return date;
	}
	
	//================================= Comparisons =============================
	
	/**
	 * 0 - equal
	 * 1 - date1 after date2
	 * 2 - date2 after date1
	 * @param date1
	 * @param date2
	 * @return int
	 */
	public int compare(Date date1, Date date2) {
		return date1.compareTo(date2);
	}
	
	public Boolean after(Date date1, Date date2) {
		if(date1.after(date2)) {
			log.info("date1, ("+date1.toString()+") is after date2, ("+date2.toString()+")");
			return true;
		}else {
			log.info("date1, ("+date1.toString()+") is before date2, ("+date2.toString()+")");
			return false;
		}
	}
	
	public Boolean before(Date date1, Date date2) {
		if(date1.before(date2)) {
			log.info("date1, ("+date1.toString()+") is before date2, ("+date2.toString()+")");
			return true;
		}else {
			log.info("date1, ("+date1.toString()+") is after date2, ("+date2.toString()+")");
			return false;
		}
	}
}
