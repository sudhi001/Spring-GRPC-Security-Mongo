package com.nullsafety.webapp.config;

import com.nullsafety.webapp.logging.LogGrpcInterceptor;
import org.springframework.context.annotation.Configuration;
import io.grpc.ServerInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;

@Configuration(proxyBeanMethods = false)
public class GlobalInterceptorConfiguration {

    @GrpcGlobalServerInterceptor
    ServerInterceptor logServerInterceptor() {
        return new LogGrpcInterceptor();
    }


}