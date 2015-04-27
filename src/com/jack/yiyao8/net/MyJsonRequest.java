package com.jack.yiyao8.net;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.JsonRequest;

public class MyJsonRequest<T> extends JsonRequest<T>{

	public MyJsonRequest(int method, String url, String requestBody,
			Listener<T> listener, ErrorListener errorListener) {
		super(method, url, requestBody, listener, errorListener);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Response<T> parseNetworkResponse(NetworkResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

}
