package com.example.consumer;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface UserChannels {

	@Input("users")
	SubscribableChannel users();

	@Output("welcome")
	MessageChannel welcome();

	@Output("localevents")
	MessageChannel localEvents();

	@Output("friendsnearby")
	MessageChannel friendsNearby();

	@Input("usersbyregion_input")
	KStream<?, ?> usersByRegionInput();

	@Output("usersbyregion_output")
	KStream<?, ?> usersByRegionOutput();

}
