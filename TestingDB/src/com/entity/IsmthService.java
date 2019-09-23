package com.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ismth_service database table.
 * 
 */
@Entity
@Table(name="ismth_service")
@NamedQuery(name="IsmthService.findAll", query="SELECT i FROM IsmthService i")
public class IsmthService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String description;

	private String response_Code;

	private String service_Code;

	private int status;

	public IsmthService() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResponse_Code() {
		return this.response_Code;
	}

	public void setResponse_Code(String response_Code) {
		this.response_Code = response_Code;
	}

	public String getService_Code() {
		return this.service_Code;
	}

	public void setService_Code(String service_Code) {
		this.service_Code = service_Code;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}