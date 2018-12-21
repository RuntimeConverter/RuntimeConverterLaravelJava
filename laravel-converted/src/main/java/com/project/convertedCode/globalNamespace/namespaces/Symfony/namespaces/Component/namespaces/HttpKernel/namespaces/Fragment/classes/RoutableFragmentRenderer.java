package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes;

import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes.FragmentRendererInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Fragment/RoutableFragmentRenderer.php

*/

public abstract class RoutableFragmentRenderer extends RuntimeClassBase
        implements FragmentRendererInterface {

    public Object fragmentPath = "/_fragment";

    public RoutableFragmentRenderer(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RoutableFragmentRenderer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object setFragmentPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.fragmentPath = path;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "reference",
        typeHint = "Symfony\\Component\\HttpKernel\\Controller\\ControllerReference"
    )
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 2,
        name = "absolute",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "strict",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object generateFragmentUri(RuntimeEnv env, Object... args) {
        Object reference = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object absolute = assignParameter(args, 2, true);
        if (null == absolute) {
            absolute = false;
        }
        Object strict = assignParameter(args, 3, true);
        if (null == strict) {
            strict = true;
        }
        Object path = null;
        if (ZVal.isTrue(strict)) {
            this.checkNonScalar(
                    env, toObjectR(reference).accessProp(this, env).name("attributes").value());
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(reference, "attributes", env),
                env,
                "_format")) {
            new ReferenceClassProperty(reference, "attributes", env)
                    .arrayAccess(env, "_format")
                    .set(
                            env.callMethod(
                                    request, "getRequestFormat", RoutableFragmentRenderer.class));
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(reference, "attributes", env),
                env,
                "_locale")) {
            new ReferenceClassProperty(reference, "attributes", env)
                    .arrayAccess(env, "_locale")
                    .set(env.callMethod(request, "getLocale", RoutableFragmentRenderer.class));
        }

        new ReferenceClassProperty(reference, "attributes", env)
                .arrayAccess(env, "_controller")
                .set(toObjectR(reference).accessProp(this, env).name("controller").value());
        new ReferenceClassProperty(reference, "query", env)
                .arrayAccess(env, "_path")
                .set(
                        NamespaceGlobal.http_build_query
                                .env(env)
                                .call(
                                        toObjectR(reference)
                                                .accessProp(this, env)
                                                .name("attributes")
                                                .value(),
                                        "",
                                        "&")
                                .value());
        path =
                toStringR(this.fragmentPath, env)
                        + "?"
                        + toStringR(
                                NamespaceGlobal.http_build_query
                                        .env(env)
                                        .call(
                                                toObjectR(reference)
                                                        .accessProp(this, env)
                                                        .name("query")
                                                        .value(),
                                                "",
                                                "&")
                                        .value(),
                                env);
        if (ZVal.isTrue(absolute)) {
            return ZVal.assign(
                    env.callMethod(request, "getUriForPath", RoutableFragmentRenderer.class, path));
        }

        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        request, "getBaseUrl", RoutableFragmentRenderer.class),
                                env)
                        + toStringR(path, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    private Object checkNonScalar(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult1954 : ZVal.getIterable(values, env, false)) {
            key = ZVal.assign(zpairResult1954.getKey());
            value = ZVal.assign(zpairResult1954.getValue());
            if (function_is_array.f.env(env).call(value).getBool()) {
                this.checkNonScalar(env, value);

            } else if (ZVal.toBool(!function_is_scalar.f.env(env).call(value).getBool())
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", value))) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Controller attributes cannot contain non-scalar/non-null values (value for key \"%s\" is not a scalar or null).",
                                                key)
                                        .value()));
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Fragment\\RoutableFragmentRenderer";

    @ConvertedMethod()
    public abstract Object render(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getName(RuntimeEnv env, Object... args);

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
                    .setName("Symfony\\Component\\HttpKernel\\Fragment\\RoutableFragmentRenderer")
                    .setLookup(
                            RoutableFragmentRenderer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fragmentPath")
                    .setFilename("vendor/symfony/http-kernel/Fragment/RoutableFragmentRenderer.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Fragment\\FragmentRendererInterface")
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
