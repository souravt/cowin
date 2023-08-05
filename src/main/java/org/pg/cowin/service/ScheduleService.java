package org.pg.cowin.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.pg.cowin.dao.ScheduleKey;
import org.pg.cowin.dao.ScheduledSlot;

public class ScheduleService {
	
	public String centerId;	
	
	//Key : Date, start of slot time , Value : Number of Slots
	public Map<ScheduleKey,ScheduledSlot> slots = new HashMap<ScheduleKey,ScheduledSlot>();
	
	public Date getEarliestAvailable() {
		Date earliestDate = null;
		
		return earliestDate;		
	}
	
	public void addSlots(Date dateTime, int totalSlots) {
		
	}
	
	public void getSlots(Date dateTime, int totalSlots) {
		
	}
	
    public int reserveSlot(Date dateTime) {
		return 0;
	}
	

}
