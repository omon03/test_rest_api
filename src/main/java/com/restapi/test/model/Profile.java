package com.restapi.test.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "PROFILES")
public class Profile {
	@Id
	@Column(name = "user_id")
	private Long id;

	@Column(name = "CASH")
	private Long cash;

	// связь с таблицей users по ID
	@OneToOne
	@MapsId
	@JoinColumn(name = "user_id")
	private User user;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Profile profile = (Profile) o;
		return id.equals(profile.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id) * 31;
	}
}
