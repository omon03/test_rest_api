package com.restapi.test.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "PHONES")
public class Phone {
	@Id
	@Column(name = "user_id")
	private Long id;

	@Column(name = "VALUE")
	private String value;

	// связь с таблицей users по ID
	@OneToOne
	@MapsId
	@JoinColumn(name = "user_id")
	private User user;
}
