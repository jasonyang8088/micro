package com.zxxk.zyk.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="b_subject")
public class Subject {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  Long id;
	
	private Byte stage;		//1：小学  2：初中  3：高中
	
	private Byte status;  //1 :正常  -1：失效
	
	@Column(length=6)
	private String subjectName;
	
	@OneToMany(mappedBy="subject")
	@JsonIgnore
	private List<Version> versions;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getStage() {
		return stage;
	}

	public void setStage(Byte stage) {
		this.stage = stage;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Version> getVersions() {
		return versions;
	}

	public void setVersions(List<Version> versions) {
		this.versions = versions;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

}
