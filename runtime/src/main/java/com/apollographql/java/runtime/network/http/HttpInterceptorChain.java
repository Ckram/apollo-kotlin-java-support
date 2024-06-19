package com.apollographql.java.runtime.network.http;

import com.apollographql.apollo3.api.http.HttpRequest;
import org.jetbrains.annotations.NotNull;

public interface HttpInterceptorChain {
  void proceed(@NotNull HttpRequest request, @NotNull HttpCallback callback);
}
