package com.giffing.bucket4j.spring.boot.starter.config.filter.reactive.predicate;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import com.giffing.bucket4j.spring.boot.starter.config.filter.predicate.MethodExecutePredicate;

@Component
public class WebfluxMethodPredicate extends MethodExecutePredicate<ServerHttpRequest> {

	@Override
	public boolean test(ServerHttpRequest t) {
		return testRequestMethod(t.getMethod().name());
	}

}
