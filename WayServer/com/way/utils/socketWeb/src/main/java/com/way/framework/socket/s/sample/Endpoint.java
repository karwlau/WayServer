package com.way.framework.socket.s.sample;


import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.codehaus.jettison.json.JSONArray;
import org.eclipse.jetty.websocket.WebSocket;

class Endpoint implements WebSocket.OnTextMessage {

	protected Connection _connection;

	private Endpoints endpoints;

	private static int clientCounter = 0;
	private int clientId = clientCounter++;

	public Endpoint(Endpoints endpoints) {
		this.setEndpoints(endpoints);
	}

	@Override
	public void onClose(int code, String message) {
		System.out.println("Client disconnected");

		this.endpoints.remove(this);
	}

	@Override
	public void onOpen(Connection connection) {
		System.out.println("Client connected");
		_connection = connection;
		try {
			this._connection.sendMessage(new JSONArray().put("ClientID = " + clientId).toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		endpoints.offer(this);
	}

	@Override
	public void onMessage(final String data) {
		System.out.println("Received data: " + data);
//		this.endpoints.broadcast(data);
		try {
			this._connection.sendMessage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Endpoints getEndpoints() {
		return endpoints;
	}

	public void setEndpoints(Endpoints endpoints) {
		this.endpoints = endpoints;
	}
}
