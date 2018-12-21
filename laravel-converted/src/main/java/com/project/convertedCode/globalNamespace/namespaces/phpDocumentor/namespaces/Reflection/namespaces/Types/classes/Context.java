package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
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
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/Types/Context.php

*/

public final class Context extends RuntimeClassBase {

    public Object namespace = null;

    public Object namespaceAliases = null;

    public Context(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Context.class) {
            this.__construct(env, args);
        }
    }

    public Context(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(
        index = 1,
        name = "namespaceAliases",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        ReferenceContainer namespaceAliases =
                new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == namespaceAliases.getObject()) {
            namespaceAliases.setObject(ZVal.newArray());
        }
        Object alias = null;
        ReferenceContainer fqnn = new BasicReferenceContainer(null);
        this.namespace =
                ZVal.toBool(ZVal.strictNotEqualityCheck("global", "!==", namespace))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck("default", "!==", namespace))
                        ? function_trim.f.env(env).call(toStringR(namespace, env), "\\").value()
                        : "";
        for (ZPair zpairResult939 : ZVal.getIterable(namespaceAliases.getObject(), env, false)) {
            alias = ZVal.assign(zpairResult939.getKey());
            fqnn.setObject(ZVal.assign(zpairResult939.getValue()));
            if (ZVal.strictEqualityCheck(fqnn.arrayGet(env, 0), "===", "\\")) {
                fqnn.setObject(function_substr.f.env(env).call(fqnn.getObject(), 1).value());
            }

            if (ZVal.strictEqualityCheck(
                    fqnn.arrayGet(
                            env,
                            ZVal.subtract(
                                    function_strlen.f.env(env).call(fqnn.getObject()).value(), 1)),
                    "===",
                    "\\")) {
                fqnn.setObject(function_substr.f.env(env).call(fqnn.getObject(), 0, -1).value());
            }

            namespaceAliases.arrayAccess(env, alias).set(fqnn.getObject());
        }

        this.namespaceAliases = namespaceAliases.getObject();
        return null;
    }

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.namespace);
    }

    @ConvertedMethod
    public Object getNamespaceAliases(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.namespaceAliases);
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Types\\Context";

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
                    .setName("phpDocumentor\\Reflection\\Types\\Context")
                    .setLookup(
                            Context.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("namespace", "namespaceAliases")
                    .setFilename("vendor/phpdocumentor/type-resolver/src/Types/Context.php")
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
