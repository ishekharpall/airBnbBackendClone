package com.shekhar.projects.airBnbProject.repository;


import com.shekhar.projects.airBnbProject.Entity.Guest;
import com.shekhar.projects.airBnbProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}