package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.PromiseInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Promise/ReturnArgumentPromise.php

*/

public class ReturnArgumentPromise extends RuntimeClassBase implements PromiseInterface {

    public Object index = null;

    public ReturnArgumentPromise(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReturnArgumentPromise.class) {
            this.__construct(env, args);
        }
    }

    public ReturnArgumentPromise(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index", defaultValue = "0", defaultValueType = "number")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, true);
        if (null == index) {
            index = 0;
        }
        if (ZVal.toBool(!function_is_int.f.env(env).call(index).getBool())
                || ZVal.toBool(ZVal.isLessThan(index, '<', 0))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Zero-based index expected as argument to ReturnArgumentPromise, but got %s.",
                                            index)
                                    .value()));
        }

        this.index = index;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    @ConvertedParameter(index = 1, name = "object", typeHint = "Prophecy\\Prophecy\\ObjectProphecy")
    @ConvertedParameter(index = 2, name = "method", typeHint = "Prophecy\\Prophecy\\MethodProphecy")
    public Object execute(RuntimeEnv env, Object... args) {
        ReferenceContainer ___args = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object _object = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, false);
        return ZVal.assign(
                ZVal.isGreaterThan(
                                function_count.f.env(env).call(___args.getObject()).value(),
                                '>',
                                this.index)
                        ? ___args.arrayGet(env, this.index)
                        : ZVal.getNull());
    }

    public static final Object CONST_class = "Prophecy\\Promise\\ReturnArgumentPromise";

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
                    .setName("Prophecy\\Promise\\ReturnArgumentPromise")
                    .setLookup(
                            ReturnArgumentPromise.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("index")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Promise/ReturnArgumentPromise.php")
                    .addInterface("Prophecy\\Promise\\PromiseInterface")
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
