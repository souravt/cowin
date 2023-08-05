package org.pg.cowin.dao;

import java.util.Date;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class ScheduleKey {
	private Date date;
	private String key;

	public ScheduleKey(Date date) {
		this.date = date;
		setKey();
	}

	private void setKey() {
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		this.key = dateFormat.format(this.date);
	}

	public String getKey() {
		return this.key;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduleKey other = (ScheduleKey) obj;
		return Objects.equals(key, other.key);
	}

	@Override
	public String toString() {
		return "Key [key=" + key + "]";
	}

}
