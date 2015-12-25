package com.fma.serverstate;

import java.io.Serializable;

public class Server implements Serializable{
	private static final long serialVersionUID = -2121818753629404334L;
	
	private String name;
	private Integer port;
	private ServerRequest request;
	private String response;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public ServerRequest getRequest() {
		return request;
	}
	public void setRequest(ServerRequest request) {
		this.request = request;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
}
