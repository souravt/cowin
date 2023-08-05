package org.pg.cowin.dao;

import java.util.Collection;
import java.util.Date;


public interface AvailabilityRepository {

	public Collection<ScheduledSlot> findAvailability(String vaxCenterId, Date vaxDate, Date requestReceivedAt);
	
	public void addSlots(String vaxCenterId, Date vaxDate, int additionalSlots);

}
