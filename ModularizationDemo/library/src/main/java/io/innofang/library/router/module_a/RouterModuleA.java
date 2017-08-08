package io.innofang.library.router.module_a;

import android.content.Intent;

import io.innofang.library.router.annotation.RouterParam;
import io.innofang.library.router.annotation.RouterUri;

/**
 * Author: Inno Fang
 * Time: 2017/8/8 10:17
 * Description:
 */


public interface RouterModuleA {

    @RouterUri("innofang://module_a")
    public Intent newIntentFromModuleA(@RouterParam("info") String info);

}
