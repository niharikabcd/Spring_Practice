package com.DTOImpl.SpringDTOimpl.model;

import lombok.Data;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="Email")
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "location_id")
    private Location location;
}
