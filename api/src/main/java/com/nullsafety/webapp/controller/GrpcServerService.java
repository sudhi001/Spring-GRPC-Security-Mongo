package com.nullsafety.webapp.controller;

import com.nullsafety.webapp.entity.Message;
import com.nullsafety.webapp.service.MessageService;
import io.grpc.stub.StreamObserver;
import com.nullsafety.general.lib.HelloReply;
import com.nullsafety.general.lib.HelloRequest;
import com.nullsafety.general.lib.SimpleGrpc;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;


@GrpcService
public class GrpcServerService extends SimpleGrpc.SimpleImplBase {

    @Autowired
    MessageService messageService;

    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello ==> " + req.getName()).build();
        Message message= new Message();
        message.setMessage("hello");
        message.setName(req.getName());
        messageService.save(message);
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}