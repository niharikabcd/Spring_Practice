package com.DTOImpl.SpringDTOimpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DTOImpl.SpringDTOimpl.model.Users;

public interface userrepo extends JpaRepository<Users,Long> {

}
