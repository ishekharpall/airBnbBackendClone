package com.shekhar.projects.airBnbProject.repository;


import com.shekhar.projects.airBnbProject.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
