package com.projet_S2.clienEtudient.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.projet_S2.clienEtudient.model.Prof;

@Component
//@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionProf {
	
	private Prof message;

	public Prof getMessage() {
		return message;
	}

	public void setMessage(Prof message) {
		this.message = message;
	}

}
