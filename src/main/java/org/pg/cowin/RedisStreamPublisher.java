package org.pg.cowin;

import java.util.HashMap;
import java.util.Map;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

public class RedisStreamPublisher {
	public static void main(String[] args) {

		RedisClient redisClient = RedisClient.create("redis://localhost:6379"); // change to reflect your environment
		StatefulRedisConnection<String, String> connection = redisClient.connect();
		RedisCommands<String, String> syncCommands = connection.sync();

		Map<String, String> messageBody1 = new HashMap<>();
		messageBody1.put("PID", "006");
		messageBody1.put("PNO", "917829904632");
		
		Map<String, String> messageBody2 = new HashMap<>();
		messageBody2.put("PID", "007");
		messageBody2.put("PNO", "917829904631");
		
		
		String messageId1 = syncCommands.xadd("CID:KA-002::DT:06-08-2023", messageBody1);
		String messageId2 = syncCommands.xadd("CID:KA-002::DT:06-08-2023", messageBody2);

		System.out.println(String.format("Message %s : %s posted", messageBody1, messageBody1));

		connection.close();
		redisClient.shutdown();

	}
}
