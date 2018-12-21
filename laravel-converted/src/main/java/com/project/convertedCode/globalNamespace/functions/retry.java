package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class retry extends FunctionBaseRegular {

    public static retry f = new retry();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "times")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    @ConvertedParameter(index = 2, name = "sleep", defaultValue = "0", defaultValueType = "number")
    public Object call(RuntimeEnv env, Object... args) {
        ReferenceContainer times = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object callback = assignParameter(args, 1, false);
        Object sleep = assignParameter(args, 2, true);
        if (null == sleep) {
            sleep = 0;
        }
        Object e = null;
        times.setObject(ZVal.decrement(times.getObject()));
        /* A php goto label was here. Goto is not supported. */
        try {
            return ZVal.assign(
                    env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value());
        } catch (ConvertedException convertedException64) {
            if (convertedException64.instanceOf(PHPException.class, "Exception")) {
                e = convertedException64.getObject();
                if (!ZVal.isTrue(times.getObject())) {
                    throw ZVal.getException(env, e);
                }

                times.setObject(ZVal.decrement(times.getObject()));
                if (ZVal.isTrue(sleep)) {
                    NamespaceGlobal.usleep.env(env).call(ZVal.multiply(sleep, 1000));
                }

                ZVal.throwRuntimeException("A php goto call was here. Goto is not supported.");
            } else {
                throw convertedException64;
            }
        }

        return null;
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
