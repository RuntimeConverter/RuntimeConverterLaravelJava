package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/ExceptionWrapper.php

*/

public class ExceptionWrapper extends Exception {

    public Object className = null;

    public Object previous = null;

    public ExceptionWrapper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExceptionWrapper.class) {
            this.__construct(env, args);
        }
    }

    public ExceptionWrapper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object t = assignParameter(args, 0, false);
        super.__construct(
                env,
                env.callMethod(t, "getMessage", ExceptionWrapper.class),
                ZVal.toLong(env.callMethod(t, "getCode", ExceptionWrapper.class)));
        this.setOriginalException(env, t);
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

        if (ZVal.isTrue(this.previous)) {
            string = toStringR(string, env) + "\nCaused by\n" + toStringR(this.previous, env);
        }

        return ZVal.assign(string);
    }

    @ConvertedMethod
    public Object getClassName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.className);
    }

    @ConvertedMethod
    public Object getPreviousWrapped(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.previous);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    public Object setClassName(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        this.className = className;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
    public Object setOriginalException(RuntimeEnv env, Object... args) {
        Object t = assignParameter(args, 0, false);
        Object call = null;
        Object i = null;
        this.originalException(env, t);
        this.className = function_get_class.f.env(env).call(t).value();
        toObjectR(this)
                .accessProp(this, env)
                .name("file")
                .set(env.callMethod(t, "getFile", ExceptionWrapper.class));
        toObjectR(this)
                .accessProp(this, env)
                .name("line")
                .set(env.callMethod(t, "getLine", ExceptionWrapper.class));
        toObjectR(this)
                .accessProp(this, env)
                .name("serializableTrace")
                .set(env.callMethod(t, "getTrace", ExceptionWrapper.class));
        for (ZPair zpairResult1140 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("serializableTrace").value(),
                        env,
                        false)) {
            i = ZVal.assign(zpairResult1140.getKey());
            call = ZVal.assign(zpairResult1140.getValue());
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "serializableTrace", env),
                    env,
                    i,
                    "args");
        }

        if (ZVal.isTrue(env.callMethod(t, "getPrevious", ExceptionWrapper.class))) {
            this.previous =
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .classes
                            .ExceptionWrapper(
                            env, env.callMethod(t, "getPrevious", ExceptionWrapper.class));
        }

        return null;
    }

    @ConvertedMethod
    public Object getOriginalException(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.originalException(env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exceptionToStore",
        typeHint = "Throwable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object originalException(RuntimeEnv env, Object... args) {
        Object exceptionToStore = assignParameter(args, 0, true);
        if (null == exceptionToStore) {
            exceptionToStore = ZVal.getNull();
        }
        Object instanceId = null;
        ReferenceContainer originalExceptions = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        originalExceptions = env.getInlineStatic(20, null);
        instanceId = NamespaceGlobal.spl_object_hash.env(env).call(this).value();
        if (ZVal.isTrue(exceptionToStore)) {
            originalExceptions.arrayAccess(env, instanceId).set(exceptionToStore);
        }

        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = originalExceptions.arrayGet(env, instanceId))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\ExceptionWrapper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Exception.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\ExceptionWrapper")
                    .setLookup(
                            ExceptionWrapper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("className", "previous", "serializableTrace")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/ExceptionWrapper.php")
                    .addInterface("PHPUnit\\Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("PHPUnit\\Framework\\Exception")
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
