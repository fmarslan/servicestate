package com.fma.serverstate;

import java.io.Serializable;

public class ServerRequest implements Serializable {
	private static final long serialVersionUID = -4962575079673752617L;

	public enum Protocol implements Serializable{
		Http,Https,File,Network
	}
	public enum RequestType implements Serializable {
		Ping, Http, Telnet, Rest, Custom
	}
	
	public class URL implements Serializable{	
		private static final long serialVersionUID = -7999998634574584779L;

		private String url;
		private Long port;
		private Protocol protocol;
		
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public Long getPort() {
			return port;
		}
		public void setPort(Long port) {
			this.port = port;
		}
		public Protocol getProtocol() {
			return protocol;
		}
		public void setProtocol(Protocol protocol) {
			this.protocol = protocol;
		}
	}

	private URL url;
	private Long port;
	private RequestType requestType;
	
	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public Long getPort() {
		return port;
	}

	public void setPort(Long port) {
		this.port = port;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}


	public ServerRequest(){
		
	}
	
}