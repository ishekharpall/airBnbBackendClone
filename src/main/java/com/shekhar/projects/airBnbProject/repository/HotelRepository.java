package com.shekhar.projects.airBnbProject.repository;


import com.shekhar.projects.airBnbProject.Entity.Hotel;
import com.shekhar.projects.airBnbProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByOwner(User user);
}
