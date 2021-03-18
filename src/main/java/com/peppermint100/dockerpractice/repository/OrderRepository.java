package com.peppermint100.dockerpractice.repository;


import com.peppermint100.dockerpractice.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByCoffeeName(String coffeeName);
}
