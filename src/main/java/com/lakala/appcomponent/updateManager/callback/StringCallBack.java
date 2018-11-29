package com.lakala.appcomponent.updateManager.callback;

import com.lakala.appcomponent.updateManager.util.FileUtil;

import java.io.InputStream;

public abstract class StringCallBack extends BaseCallBack<String> {

    @Override
    public String onParse(InputStream stream, int total) {
        return FileUtil.streamToString(stream);
    }
}
