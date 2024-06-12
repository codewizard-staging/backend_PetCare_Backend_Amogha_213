package com.app.PetCare_Backend_Amogha.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.PetCare_Backend_Amogha.model.Manager;
import com.app.PetCare_Backend_Amogha.model.Pet;
import com.app.PetCare_Backend_Amogha.model.PetCareCenter;
import com.app.PetCare_Backend_Amogha.model.PetOwner;
import com.app.PetCare_Backend_Amogha.model.Document;
import com.app.PetCare_Backend_Amogha.model.PetService;
import com.app.PetCare_Backend_Amogha.enums.PetServiceType;
import com.app.PetCare_Backend_Amogha.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"petcare_backend_amogha\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}