package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.InvalidApplicationNameException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/ApplicationName.php

*/

public class ApplicationName extends RuntimeClassBase {

    public Object name = null;

    public ApplicationName(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ApplicationName.class) {
            this.__construct(env, args);
        }
    }

    public ApplicationName(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.ensureIsString(env, name);
        this.ensureValidFormat(env, name);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PharIo\\Manifest\\ApplicationName")
    public Object isEqual(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        this.name,
                        "===",
                        toObjectR(name).accessProp(this, env).name("name").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object ensureValidFormat(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!function_preg_match.f.env(env).call("#\\w/\\w#", name).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidApplicationNameException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Format of name \"%s\" is not valid - expected: vendor/packagename",
                                            name)
                                    .value(),
                            InvalidApplicationNameException.CONST_InvalidFormat));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object ensureIsString(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!function_is_string.f.env(env).call(name).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidApplicationNameException(
                            env,
                            "Name must be a string",
                            InvalidApplicationNameException.CONST_NotAString));
        }

        return null;
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ApplicationName";

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
                    .setName("PharIo\\Manifest\\ApplicationName")
                    .setLookup(
                            ApplicationName.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("name")
                    .setFilename("vendor/phar-io/manifest/src/values/ApplicationName.php")
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
