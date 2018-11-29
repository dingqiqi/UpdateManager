package com.lakala.appcomponent.updateManager.build;

import com.lakala.appcomponent.updateManager.call.BaseCall;
import com.lakala.appcomponent.updateManager.call.StringCall;

public class StringBuild extends BaseBuild<StringBuild> {

    private String content;

    public StringBuild content(String content) {
        this.content = content;
        return this;
    }

    @Override
    public BaseCall build() {
        return new StringCall(url, method, heads, content);
    }
}
