package com.health_care.backend.Patient;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import com.health_care.backend.Person.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Patient {
    @Id
    private Integer id;
    private String address;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id", referencedColumnName = "id")
    @MapsId
    private Person person;
    @Autowired(required = false)
    private double weight;
    @Autowired(required = false)
    private double height;

}
