package br.com.achimid.loadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class LoadBalancer {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancer.class, args);
	}

}