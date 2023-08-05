package org.pg.cowin;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.pg.cowin.dao.ScheduledSlot;

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
		schedulers.put(getKey("KA-002", new Date()), new CenterReservationScheduler("KA-0012", "05-08-2023", 5));
	}

	public BookingStatus book(String centerId, Date timestamp, String person) {

		String key = getKey(centerId, timestamp);
		CenterReservationScheduler scheduler = schedulers.get(key);

		return scheduler.book(person);
	}

	public Collection<ScheduledSlot> getAvailability(String centerId, Date timestamp) {

		String key = getKey(centerId, timestamp);
		CenterReservationScheduler scheduler = schedulers.get(key);

		// TODO : Add all slots for the day
		Collection<ScheduledSlot> slots = new ArrayList<ScheduledSlot>();
		ScheduledSlot slot = new ScheduledSlot();
		//TODO : Fix timing
		slot.setStartTime(timestamp);
		slot.setEndTime(timestamp);
		slot.setTotalSlots(scheduler.getMaxSlots());
		slot.setTotalBooked(scheduler.getBooking().size());
		slot.setAvailable(!scheduler.isFull());
		slots.add(slot);

		return slots;
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
