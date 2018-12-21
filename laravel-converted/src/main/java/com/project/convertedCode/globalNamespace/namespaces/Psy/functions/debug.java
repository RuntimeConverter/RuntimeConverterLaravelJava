package com.project.convertedCode.globalNamespace.namespaces.Psy.functions;

import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Shell;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/functions.php

*/

public class debug extends FunctionBaseRegular {

    public static debug f = new debug();

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "vars",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "bindTo",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object vars = assignParameter(args, 0, true);
        if (null == vars) {
            vars = ZVal.newArray();
        }
        Object bindTo = assignParameter(args, 1, true);
        if (null == bindTo) {
            bindTo = ZVal.getNull();
        }
        Object sh = null;
        env.echo("\n");
        sh = new Shell(env);
        env.callMethod(sh, "setScopeVariables", debug.class, vars);
        if (ZVal.isTrue(env.callMethod(sh, "has", debug.class, "whereami"))) {
            env.callMethod(sh, "addInput", debug.class, "whereami -n2", true);
        }

        if (function_is_string.f.env(env).call(bindTo).getBool()) {
            env.callMethod(sh, "setBoundClass", debug.class, bindTo);

        } else if (ZVal.strictNotEqualityCheck(bindTo, "!==", ZVal.getNull())) {
            env.callMethod(sh, "setBoundObject", debug.class, bindTo);
        }

        env.callMethod(sh, "run", debug.class);
        return ZVal.assign(env.callMethod(sh, "getScopeVariables", debug.class, false));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/psy/psysh/src")
                .setFile("/vendor/psy/psysh/src/functions.php");
    }
}
