package org.pg.cowin.dao;

import java.util.Collection;
import java.util.Date;

import org.pg.cowin.CentralScheduler;
import org.springframework.stereotype.Service;

@Service
public class AvailabilityImpl implements AvailabilityRepository{
	
	CentralScheduler scheduler = CentralScheduler.getInstance();

	@Override
	public Collection<ScheduledSlot> findAvailability(String vaxCenterId, Date vaxDate, Date requestReceivedAt) {
		
		Collection<ScheduledSlot> slots = scheduler.getAvailability(vaxCenterId, requestReceivedAt);
		return slots;
	}

	@Override
	public void addSlots(String vaxCenterId, Date vaxDate, int additionalSlots) {
		scheduler.addSlots(vaxCenterId, vaxDate, additionalSlots);

	}

}
