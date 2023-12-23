package com.excalibur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excalibur.course.entities.OrderItem;
import com.excalibur.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}