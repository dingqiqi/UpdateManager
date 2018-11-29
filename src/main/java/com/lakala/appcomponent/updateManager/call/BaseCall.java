package com.lakala.appcomponent.updateManager.call;

import com.lakala.appcomponent.updateManager.util.Method;
import com.lakala.appcomponent.updateManager.callback.BaseCallBack;
import com.lakala.appcomponent.updateManager.mode.Response;

import java.util.Map;

public abstract class BaseCall {

    String url;

    Method method;

    Map<String, String> heads;

    public BaseCall(String url, Method method, Map<String, String> heads) {
        this.url = url;
        this.method = method;
        this.heads = heads;
    }

    public abstract Response execute();

    public abstract void execute(BaseCallBack callBack);
}
