package com.floorplanner.dispatch.http;

import net.customware.gwt.dispatch.shared.Action;
import net.customware.gwt.dispatch.shared.Result;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.Response;

public interface HTTPAction<R extends Result> extends Action<R> {

    RequestBuilder prepareRequest();

    R prepareResult(Response response);

}
