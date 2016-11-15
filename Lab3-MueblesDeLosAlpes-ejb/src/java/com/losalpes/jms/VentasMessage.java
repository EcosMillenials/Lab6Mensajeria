///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.losalpes.jms;
//
//import javax.annotation.Resource;
//import javax.ejb.ActivationConfigProperty;
//import javax.ejb.MessageDriven;
//import javax.ejb.MessageDrivenContext;
//import javax.jms.Message;
//import javax.jms.MessageListener;
//
///**
// *
// * @author leonardovalbuenacalderon
// */
//@MessageDriven(activationConfig = {
//    @ActivationConfigProperty(propertyName = "clientId", propertyValue = "jms/cambioDeCargoTopic"),
//    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/cambioDeCargoTopic"),
//    @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "Durable"),
//    @ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "jms/cambioDeCargoTopic"),
//    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
//})
//public class VentasMessage implements MessageListener {
//    
//    @Resource
//    private MessageDrivenContext mdc;
//    
//    public VentasMessage() {
//    }
//    
//    @Override
//    public void onMessage(Message message) {
//    }
//    
//}
