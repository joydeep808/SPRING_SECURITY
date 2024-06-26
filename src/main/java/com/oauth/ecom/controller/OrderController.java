package com.oauth.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.oauth.ecom.dto.order.OrderProcessTransectionDetails;
import com.oauth.ecom.services.order.OrderService;
import com.oauth.ecom.util.ReqRes;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
  @Autowired
  private OrderService orderService;
  @PostMapping("/buy")

  public ResponseEntity<ReqRes> createOrder(HttpServletRequest  httpServletRequest , @RequestBody OrderProcessTransectionDetails transectionId) throws Exception{
    ReqRes response = orderService.purchaseAnOrder(httpServletRequest, transectionId);
    return   response.getIsSuccess()? ResponseEntity.status(response.getStatusCode()).body(response) : ResponseEntity.status(response.getStatusCode()).body(response);
}
}
