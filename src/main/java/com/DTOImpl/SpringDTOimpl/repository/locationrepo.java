package com.DTOImpl.SpringDTOimpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DTOImpl.SpringDTOimpl.model.Location;

public interface locationrepo extends JpaRepository<Location,Long> {
    
}
