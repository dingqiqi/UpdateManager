package com.lakala.appcomponent.updateManager.call;

import com.lakala.appcomponent.updateManager.util.Method;
import com.lakala.appcomponent.updateManager.callback.BaseCallBack;
import com.lakala.appcomponent.updateManager.mode.Response;
import com.lakala.appcomponent.updateManager.util.HttpUtil;
import com.lakala.appcomponent.updateManager.util.Utils;

import java.util.HashMap;
import java.util.Map;

public class StringCall extends BaseCall {

    private String content;

    public StringCall(String url, Method method, Map<String, String> head, String content) {
        super(url, method, head);
        this.content = content;

        if (heads == null) {
            heads = new HashMap<>();
        }

        heads.put("Content-Type", "application/Json; charset=UTF-8");
        heads.put("Charset", "UTF-8");
    }

    @Override
    public Response execute() {

        return HttpUtil.execute(url, Utils.getMethod(method), content, heads);
    }

    @Override
    public void execute(final BaseCallBack callBack) {

        HttpUtil.mExecutor.execute(new Runnable() {
            @Override
            public void run() {
                HttpUtil.execute(url, Utils.getMethod(method), content, heads, callBack);
            }
        });

    }
}
