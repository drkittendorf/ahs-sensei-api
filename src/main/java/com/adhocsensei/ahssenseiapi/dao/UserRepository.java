package com.adhocsensei.ahssenseiapi.dao;

import com.adhocsensei.ahssenseiapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
