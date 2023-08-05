package org.pg.cowin;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CentralScheduler {

	Map<String, CenterReservationScheduler> schedulers = new HashMap<String, CenterReservationScheduler>();

	private static CentralScheduler instance = null;

	public synchronized static CentralScheduler getInstance() {
		if (instance == null) {
			instance = new CentralScheduler();
		}
		return instance;
	}

	private CentralScheduler() {
		schedulers.put(getKey("KA-001", new Date()), new CenterReservationScheduler("KA-001", "05-08-2023", 10));
		schedulers.put(getKey("KA-001", getDate("06-08-2023")),
				new CenterReservationScheduler("KA-001", "06-08-2023", 2));
		schedulers.put(getKey("KA-002", new Date()), new CenterReservationScheduler("KA-001", "05-08-2023", 20));
	}

	public BookingStatus book(String centerId, Date timestamp, String person) {

		String key = getKey(centerId, timestamp);
		System.out.println("key:" + key);
		CenterReservationScheduler scheduler = schedulers.get(key);

		return scheduler.book(person);
	}

	private String getKey(String centerId, Date timestamp) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String date = dateFormat.format(timestamp);
		return centerId + "_" + date;
	}

	private Date getDate(String stringStr) {
		try {
			return new SimpleDateFormat("dd-MM-yyyy").parse(stringStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
