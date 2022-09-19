package org.collins.rest.restPrac12.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_sequence")

public class DbSequence {
	
	@Id
	private String id;
	private int seq;
	
	public long getSeq() {
		return this.seq;
	}
	
}
