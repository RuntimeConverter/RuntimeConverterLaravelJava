package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseDescription;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/StringDescription.php

*/

public class StringDescription extends BaseDescription {

    public Object _out = null;

    public StringDescription(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringDescription.class) {
            this.__construct(env, args);
        }
    }

    public StringDescription(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "out")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, true);
        if (null == out) {
            out = "";
        }
        this._out = toStringR(out, env);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._out);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    protected Object append(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        this._out = toStringR(this._out, env) + toStringR(str, env);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\StringDescription";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseDescription.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "selfDescribing",
            typeHint = "Hamcrest\\SelfDescribing"
        )
        public Object toString(RuntimeEnv env, Object... args) {
            Object selfDescribing = assignParameter(args, 0, false);
            Object self = null;
            self =
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .classes
                            .StringDescription(env);
            return ZVal.assign(
                    toStringR(
                            env.callMethod(
                                    self,
                                    "appendDescriptionOf",
                                    StringDescription.class,
                                    selfDescribing),
                            env));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "selfDescribing",
            typeHint = "Hamcrest\\SelfDescribing"
        )
        public Object asString(RuntimeEnv env, Object... args) {
            Object selfDescribing = assignParameter(args, 0, false);
            return ZVal.assign(runtimeStaticObject.toString(env, selfDescribing));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\StringDescription")
                    .setLookup(
                            StringDescription.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_out")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/StringDescription.php")
                    .addInterface("Hamcrest\\Description")
                    .addExtendsClass("Hamcrest\\BaseDescription")
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
