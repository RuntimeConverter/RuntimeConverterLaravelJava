package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/HigherOrderMessage.php

*/

public class HigherOrderMessage extends RuntimeClassBase {

    public Object mock = null;

    public Object method = null;

    public HigherOrderMessage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HigherOrderMessage.class) {
            this.__construct(env, args);
        }
    }

    public HigherOrderMessage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mock", typeHint = "Mockery\\MockInterface")
    @ConvertedParameter(index = 1, name = "method")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mock = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        this.mock = mock;
        this.method = method;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer ___args = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object expectation = null;
        if (ZVal.strictEqualityCheck(this.method, "===", "shouldNotHaveReceived")) {
            return ZVal.assign(
                    env.callMethod(
                            this.mock,
                            new RuntimeArgsWithReferences().add(0, method).add(1, ___args),
                            toStringR(this.method, env),
                            HigherOrderMessage.class,
                            method.getObject(),
                            ___args.getObject()));
        }

        expectation =
                env.callMethod(
                        this.mock,
                        new RuntimeArgsWithReferences().add(0, method),
                        toStringR(this.method, env),
                        HigherOrderMessage.class,
                        method.getObject());
        return ZVal.assign(
                env.callMethod(
                        expectation, "withArgs", HigherOrderMessage.class, ___args.getObject()));
    }

    public static final Object CONST_class = "Mockery\\HigherOrderMessage";

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
                    .setName("Mockery\\HigherOrderMessage")
                    .setLookup(
                            HigherOrderMessage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("method", "mock")
                    .setFilename("vendor/mockery/mockery/library/Mockery/HigherOrderMessage.php")
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
