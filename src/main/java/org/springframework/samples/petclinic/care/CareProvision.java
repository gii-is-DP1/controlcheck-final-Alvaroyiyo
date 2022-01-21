package org.springframework.samples.petclinic.care;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Visit;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class CareProvision extends BaseEntity{   
	   
	@Min(0)
	double duration;
	
	@ManyToOne(optional = true)
	Visit visit;
	
	@ManyToOne
	@NotNull
	Care care;
}
