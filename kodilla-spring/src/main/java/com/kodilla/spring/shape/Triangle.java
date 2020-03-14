package com.kodilla.spring.shape;

import org.springframework.stereotype.Component;

@Component//kalsa oznaczona tą adnotacją ma być użyta przez Springa do stworzenia obiektu i umieszczenia go w kontenerze
public class Triangle implements Shape{
  @Override
  public String getShapeName(){
      return "This is a triangle.";
  }
}
