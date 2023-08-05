# CoWin 

## Use cases 

### 1. Search Available Slots 
	1. Input : Location, Date
	2. Output : List of available slots (Start time, End time, Centre Id, Total Slots, Available Slots)

### 2. Reserve a slot 
	1. Input : Slot, User Info
	2. Output : Reservation Id, TTL)

### 3. Complete Booking
	1. Input : Reservation Id, User Info
	2. Output : Confirmation Id

### 4. Admin - Add/Modify Schedule
	1. Input : Location, Date, Number of Slots
	2. Output : Status

### 5. View Current Stats
	View total number of bookings with ability to aggregate

## Data Model

<PIN>_<Center>_<Date>_<Start Time>_<Slot>

<Slot>_<Center>_<DateTime>_<Reserved By>
 
## Non-functional Requirements

1. High level of concurrency
2. Number of transactions 
3. Scaling