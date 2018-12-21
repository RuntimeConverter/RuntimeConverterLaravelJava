package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.Pass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/ConstantsPass.php

*/

public class ConstantsPass extends RuntimeClassBase implements Pass {

    public ConstantsPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ConstantsPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(
        index = 1,
        name = "config",
        typeHint = "Mockery\\Generator\\MockConfiguration"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object constantsCode = null;
        Object constant = null;
        Object i = null;
        ReferenceContainer cm = new BasicReferenceContainer(null);
        Object value = null;
        cm.setObject(env.callMethod(config, "getConstantsMap", ConstantsPass.class));
        if (ZVal.isEmpty(cm.getObject())) {
            return ZVal.assign(code);
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                cm,
                env,
                env.callMethod(config, "getName", ConstantsPass.class))) {
            return ZVal.assign(code);
        }

        cm.setObject(
                ZVal.assign(
                        cm.arrayGet(env, env.callMethod(config, "getName", ConstantsPass.class))));
        constantsCode = "";
        for (ZPair zpairResult712 : ZVal.getIterable(cm.getObject(), env, false)) {
            constant = ZVal.assign(zpairResult712.getKey());
            value = ZVal.assign(zpairResult712.getValue());
            constantsCode =
                    toStringR(constantsCode, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("\n    const %s = '%s';\n", constant, value)
                                            .value(),
                                    env);
        }

        i = NamespaceGlobal.strrpos.env(env).call(code, "}").value();
        code = NamespaceGlobal.substr_replace.env(env).call(code, constantsCode, i).value();
        code = toStringR(code, env) + "}\n";
        return ZVal.assign(code);
    }

    public static final Object CONST_class =
            "Mockery\\Generator\\StringManipulation\\Pass\\ConstantsPass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Generator\\StringManipulation\\Pass\\ConstantsPass")
                    .setLookup(
                            ConstantsPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/ConstantsPass.php")
                    .addInterface("Mockery\\Generator\\StringManipulation\\Pass\\Pass")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
