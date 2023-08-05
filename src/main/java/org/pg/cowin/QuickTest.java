package org.pg.cowin;

import org.pg.cowin.service.ReservationRequest;

import com.fasterxml.jackson.databind.ObjectMapper;

public class QuickTest {

	public static void main(String[] args) throws Exception {
		String s = "{\"centerId\":\"KA-001\",\"timeSlot\":\"05-08-2023 22:54:01.754\",\"personId\":\"12345\",\"requestedTime\":\"05-08-2023 22:54:01.754\",\"requestReceivedAt\":\"05-08-2023 22:54:01.754\"}";
		ObjectMapper objectMapper = new ObjectMapper();
		ReservationRequest request = objectMapper.readValue(s, ReservationRequest.class);
		System.out.println(request.getCenterId());
	}

}
