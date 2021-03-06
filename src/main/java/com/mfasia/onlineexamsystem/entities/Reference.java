package com.mfasia.onlineexamsystem.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "reference")
@Data
public class Reference implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long refId;

	@ManyToOne()
	@JoinColumn(name = "course_id")
	private Course courses;

	@Column
	private String referenceHeader;

	/*@JsonIgnore
	@OneToMany(mappedBy = "ref")
	private List<QuestionerDefination> questionerDefinations;*/

}
