package com.covid.vaccination.Repository;

import com.covid.vaccination.Entity.CurrentDoctorSession;
import com.covid.vaccination.Entity.CurrentUserSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;
@Repository
public interface DoctorSessionRepo extends JpaRepository<CurrentDoctorSession, Id> {

    Optional<CurrentDoctorSession> findById(Integer id);
    Optional<CurrentDoctorSession> findByUuid(String uuid);

}
