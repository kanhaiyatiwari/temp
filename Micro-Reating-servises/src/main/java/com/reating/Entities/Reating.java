package com.reating.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity	
@Table(name="reatings")
public class Reating {
	@Id
private String reatingid;
private String userId;
private String hotelId;
private String feedback;
private int reating;
}
