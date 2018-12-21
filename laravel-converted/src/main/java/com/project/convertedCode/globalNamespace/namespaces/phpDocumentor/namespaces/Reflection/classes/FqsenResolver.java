package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes;

import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Context;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.Fqsen;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/FqsenResolver.php

*/

public class FqsenResolver extends RuntimeClassBase {

    public FqsenResolver(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FqsenResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fqsen")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object resolve(RuntimeEnv env, Object... args) {
        Object fqsen = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(context, "===", ZVal.getNull())) {
            context = new Context(env, "");
        }

        if (ZVal.isTrue(this.isFqsen(env, fqsen))) {
            return ZVal.assign(new Fqsen(env, fqsen));
        }

        return ZVal.assign(this.resolvePartialStructuralElementName(env, fqsen, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object isFqsen(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(type, CONST_OPERATOR_NAMESPACE).value(),
                        "===",
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "phpDocumentor\\Reflection\\Types\\Context"
    )
    private Object resolvePartialStructuralElementName(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        ReferenceContainer namespaceAliases = new BasicReferenceContainer(null);
        Object namespace = null;
        ReferenceContainer typeParts = new BasicReferenceContainer(null);
        typeParts.setObject(
                function_explode.f.env(env).call(CONST_OPERATOR_NAMESPACE, type, 2).value());
        namespaceAliases.setObject(
                env.callMethod(context, "getNamespaceAliases", FqsenResolver.class));
        if (!arrayActionR(ArrayAction.ISSET, namespaceAliases, env, typeParts.arrayGet(env, 0))) {
            namespace = env.callMethod(context, "getNamespace", FqsenResolver.class);
            if (ZVal.strictNotEqualityCheck("", "!==", namespace)) {
                namespace = toStringR(namespace, env) + toStringR(CONST_OPERATOR_NAMESPACE, env);
            }

            return ZVal.assign(
                    new Fqsen(
                            env,
                            toStringR(CONST_OPERATOR_NAMESPACE, env)
                                    + toStringR(namespace, env)
                                    + toStringR(type, env)));
        }

        typeParts
                .arrayAccess(env, 0)
                .set(namespaceAliases.arrayGet(env, typeParts.arrayGet(env, 0)));
        return ZVal.assign(
                new Fqsen(
                        env,
                        toStringR(CONST_OPERATOR_NAMESPACE, env)
                                + toStringR(
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(
                                                        CONST_OPERATOR_NAMESPACE,
                                                        typeParts.getObject())
                                                .value(),
                                        env)));
    }

    public static final Object CONST_OPERATOR_NAMESPACE = "\\";

    public static final Object CONST_class = "phpDocumentor\\Reflection\\FqsenResolver";

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
                    .setName("phpDocumentor\\Reflection\\FqsenResolver")
                    .setLookup(
                            FqsenResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpdocumentor/type-resolver/src/FqsenResolver.php")
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
