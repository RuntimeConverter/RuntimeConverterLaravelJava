package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Exception.php

*/

public class Exception extends RuntimeException
        implements com.project.convertedCode.globalNamespace.namespaces.PHPUnit.classes.Exception {

    public Object serializableTrace = null;

    public Exception(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Exception.class) {
            this.__construct(env, args);
        }
    }

    public Exception(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "code", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, true);
        if (null == message) {
            message = "";
        }
        Object code = assignParameter(args, 1, true);
        if (null == code) {
            code = 0;
        }
        Object previous = assignParameter(args, 2, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        Object call = null;
        Object i = null;
        super.__construct(env, message, code, previous);
        this.serializableTrace = env.callMethod(this, "getTrace", Exception.class);
        for (ZPair zpairResult1139 : ZVal.getIterable(this.serializableTrace, env, false)) {
            i = ZVal.assign(zpairResult1139.getKey());
            call = ZVal.assign(zpairResult1139.getValue());
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "serializableTrace", env),
                    env,
                    i,
                    "args");
        }

        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object trace = null;
        Object string = null;
        string = TestFailure.runtimeStaticObject.exceptionToString(env, this);
        if (ZVal.isTrue(trace = Filter.runtimeStaticObject.getFilteredStacktrace(env, this))) {
            string = toStringR(string, env) + "\n" + toStringR(trace, env);
        }

        return ZVal.assign(string);
    }

    @ConvertedMethod
    public Object __sleep(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_keys
                        .f
                        .env(env)
                        .call(NamespaceGlobal.get_object_vars.env(env).call(this).value())
                        .value());
    }

    @ConvertedMethod
    public Object getSerializableTrace(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.serializableTrace);
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Exception";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Exception")
                    .setLookup(
                            Exception.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("serializableTrace")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Exception.php")
                    .addInterface("PHPUnit\\Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("RuntimeException")
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
