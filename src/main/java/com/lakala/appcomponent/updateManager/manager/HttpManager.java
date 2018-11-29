package com.lakala.appcomponent.updateManager.manager;

import com.lakala.appcomponent.updateManager.build.FormBuild;
import com.lakala.appcomponent.updateManager.build.GetBuild;
import com.lakala.appcomponent.updateManager.build.StringBuild;

public class HttpManager {

    /**
     * get请求
     *
     * @return build
     */
    public static GetBuild get() {
        return new GetBuild();
    }

    /**
     * string请求
     *
     * @return build
     */
    public static StringBuild requestString() {
        return new StringBuild();
    }

    /**
     * 表单请求
     *
     * @return build
     */
    public static FormBuild requestForm() {
        return new FormBuild();
    }

}
