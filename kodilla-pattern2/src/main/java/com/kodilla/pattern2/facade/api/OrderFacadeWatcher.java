package com.kodilla.pattern2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class OrderFacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacadeWatcher.class);

    @Before("execution(* com.kodilla.pattern2.facade.api.OrderFacade.processOrder(..))"+"&& target(object) && args(order, userId)")
            public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + " Args items: " +
                order.getItems().toString()
                /*order.getItems().stream()
                        .map(o -> o.getProductId().toString())
                        .collect(Collectors.joining(", "))*/
                + ", userId" + userId.toString());
    }
}