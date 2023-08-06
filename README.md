# CoWin 

This project develop a basic working component of required to develop India's famous Cowin application. Objective of this application is to develop core APIs and demonstrate capabilities required and potential challenges.



## API Documentation

Following APIs would be implemented as designed part of this exercise :

[APIs to build using OpenAPI Specs](https://documenter.getpostman.com/view/28972773/2s9XxyRtkk)

![OpenAPI Documentation](./resources/image/OpenAPI.png "API Documentation")

## Use cases 

#### 1. Search for Available Slots 
	1. Input : Location, Date
	2. Output : List of available slots (Start time, End time, Centre Id, Total Slots, Available Slots)

#### 2. Reserve a slot 
	1. Input : Slot, User Info
	2. Output : Reservation Id, Status


#### 3. Admin - Add/Modify Schedule
	1. Input : Location, Date, Number of Slots
	2. Output : Status

#### 4. View Current Stats
	View total number of bookings with ability to aggregate
	
#### 5. Register a center
	Register a vaccination center with PIN, Center Id and Address


 
## Non-functional Requirements

1. Scale for 3000 requests per second

## How to Build and Run?


Code is developed using java and build using Maven. Docker containers can be built and can be run.

### Build Project

Clone porject from git (https://github.com/souravt/cowin-backend) and then build project using Maven. Java (>17) and Maven needs to be installed.

```
mvn clean install
```


### Build Docker Container

Run following command from project root folder to build docker container .

``` 
docker build . --tag cowin-api
```

### Run Container

Run following command from project root folder to build docker container :

```
docker run -p 9091:9091 --name cowin-api cowin-api 
```

Run a curl command to test :

```
curl http://localhost:9091/ping
```

One should receive a response "Pong". Bingo!

### Tasks
- [x] Setup Environment (Source Control, IDE, Build, Project Scaffolding)
- [x] Design APIs using OpenAPI
- [x] Develop working APIs for registration, search for available slots and slot booking
- [x] Build, Deploy and Run 
- [x] Build performance test suit to benchmark performance
- [] Isolate services to scale
- [] Redis and messaging integration
- [] Messaging integration
- [] Add Authentication
- [x] Logging
- [] Error handling
- [] Notification confirmation

 


