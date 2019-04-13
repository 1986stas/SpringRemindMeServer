package com.stas.osikov.remindme.server.repository;

import com.stas.osikov.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
