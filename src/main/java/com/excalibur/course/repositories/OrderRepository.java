package com.excalibur.course.repositories;

import com.excalibur.course.entities.Order;
import com.excalibur.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}