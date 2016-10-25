package com.way.framework.socket.s.sample;


import org.eclipse.jetty.websocket.WebSocket;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

final class Endpoints {
	private final Queue<Endpoint> endpoints = new ConcurrentLinkedQueue<Endpoint>();

	void broadcast(String data) {
		for (Endpoint endpoint : endpoints) {
			endpoint.onMessage(data);
		}
	}

	void offer(Endpoint endpoint) {
		endpoints.offer(endpoint);
	}

	void remove(Endpoint endpoint) {
		endpoints.remove(endpoint);
	}

	public WebSocket newEndpoint() {
		return new Endpoint(this);
	}
}