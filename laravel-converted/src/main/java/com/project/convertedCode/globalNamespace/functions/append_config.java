package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class append_config extends FunctionBaseRegular {

    public static append_config f = new append_config();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    public Object call(RuntimeEnv env, Object... args) {
        ReferenceContainer array = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer start = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        start.setObject(9999);
        for (ZPair zpairResult595 : ZVal.getIterable(array.getObject(), env, false)) {
            key = ZVal.assign(zpairResult595.getKey());
            value = ZVal.assign(zpairResult595.getValue());
            if (function_is_numeric.f.env(env).call(key).getBool()) {
                start.setObject(ZVal.increment(start.getObject()));
                array.arrayAccess(env, start.getObject())
                        .set(
                                Arr.runtimeStaticObject.pull(
                                        env,
                                        new RuntimeArgsWithReferences().add(0, array),
                                        array.getObject(),
                                        key));
            }
        }

        return ZVal.assign(array.getObject());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
