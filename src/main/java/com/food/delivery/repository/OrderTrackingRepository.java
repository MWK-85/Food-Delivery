package com.food.delivery.repository;

import com.food.delivery.domain.OrderTracking;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTrackingRepository extends JpaKeyRepository<OrderTracking, Long>, QuerydslPredicateExecutor<OrderTracking> {
}
