package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.AcceptHeaderItem;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_uasort;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderUtils;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/AcceptHeader.php

*/

public class AcceptHeader extends RuntimeClassBase {

    public Object items = ZVal.newArray();

    public Object sorted = true;

    public AcceptHeader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AcceptHeader.class) {
            this.__construct(env, args);
        }
    }

    public AcceptHeader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object item = null;
        for (ZPair zpairResult1842 : ZVal.getIterable(items, env, true)) {
            item = ZVal.assign(zpairResult1842.getValue());
            this.add(env, item);
        }

        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.implode.env(env).call(",", this.items).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object has(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "items", env),
                        env,
                        value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object get(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "items", env)
                                                .arrayGet(env, value))
                        ? ternaryExpressionTemp
                        : ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "items", env)
                                                        .arrayGet(
                                                                env,
                                                                toStringR(
                                                                                handleReturnReference(
                                                                                                function_explode
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                "/",
                                                                                                                value)
                                                                                                        .value())
                                                                                        .arrayGet(
                                                                                                env,
                                                                                                0),
                                                                                env)
                                                                        + "/*"))
                                ? ternaryExpressionTemp
                                : ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        new ReferenceClassProperty(
                                                                        this, "items", env)
                                                                .arrayGet(env, "*/*"))
                                        ? ternaryExpressionTemp
                                        : ZVal.isDefined(
                                                        ternaryExpressionTemp =
                                                                new ReferenceClassProperty(
                                                                                this, "items", env)
                                                                        .arrayGet(env, "*"))
                                                ? ternaryExpressionTemp
                                                : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "item",
        typeHint = "Symfony\\Component\\HttpFoundation\\AcceptHeaderItem"
    )
    public Object add(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "items", env)
                .arrayAccess(env, env.callMethod(item, "getValue", AcceptHeader.class))
                .set(item);
        this.sorted = false;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        this.sort(env);
        return ZVal.assign(this.items);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object filter(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-foundation")
                        .setFile("/vendor/symfony/http-foundation/AcceptHeader.php");
        Object pattern = assignParameter(args, 0, false);
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Symfony
                        .namespaces
                        .Component
                        .namespaces
                        .HttpFoundation
                        .classes
                        .AcceptHeader(
                        env,
                        function_array_filter
                                .f
                                .env(env)
                                .call(
                                        this.items,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Symfony\\Component\\HttpFoundation",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(
                                                index = 0,
                                                name = "item",
                                                typeHint =
                                                        "Symfony\\Component\\HttpFoundation\\AcceptHeaderItem"
                                            )
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object item = assignParameter(args, 0, false);
                                                Object pattern = null;
                                                pattern =
                                                        this.contextReferences.getCapturedValue(
                                                                "pattern");
                                                return ZVal.assign(
                                                        function_preg_match
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        pattern,
                                                                        env.callMethod(
                                                                                item,
                                                                                "getValue",
                                                                                AcceptHeader.class))
                                                                .value());
                                            }
                                        }.use("pattern", pattern))
                                .value()));
    }

    @ConvertedMethod
    public Object first(RuntimeEnv env, Object... args) {
        this.sort(env);
        return ZVal.assign(
                !ZVal.isEmpty(this.items)
                        ? function_reset.f.env(env).call(this.items).value()
                        : ZVal.getNull());
    }

    @ConvertedMethod
    private Object sort(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-foundation")
                        .setFile("/vendor/symfony/http-foundation/AcceptHeader.php");
        if (!ZVal.isTrue(this.sorted)) {
            function_uasort
                    .f
                    .env(env)
                    .call(
                            this.items,
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Symfony\\Component\\HttpFoundation",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(
                                    index = 0,
                                    name = "a",
                                    typeHint =
                                            "Symfony\\Component\\HttpFoundation\\AcceptHeaderItem"
                                )
                                @ConvertedParameter(
                                    index = 1,
                                    name = "b",
                                    typeHint =
                                            "Symfony\\Component\\HttpFoundation\\AcceptHeaderItem"
                                )
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object a = assignParameter(args, 0, false);
                                    Object b = assignParameter(args, 1, false);
                                    Object qA = null;
                                    Object qB = null;
                                    qA = env.callMethod(a, "getQuality", AcceptHeader.class);
                                    qB = env.callMethod(b, "getQuality", AcceptHeader.class);
                                    if (ZVal.strictEqualityCheck(qA, "===", qB)) {
                                        return ZVal.assign(
                                                ZVal.isGreaterThan(
                                                                env.callMethod(
                                                                        a,
                                                                        "getIndex",
                                                                        AcceptHeader.class),
                                                                '>',
                                                                env.callMethod(
                                                                        b,
                                                                        "getIndex",
                                                                        AcceptHeader.class))
                                                        ? 1
                                                        : -1);
                                    }

                                    return ZVal.assign(ZVal.isGreaterThan(qA, '>', qB) ? -1 : 1);
                                }
                            });
            this.sorted = true;
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\AcceptHeader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "headerValue")
        public Object fromString(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/http-foundation")
                            .setFile("/vendor/symfony/http-foundation/AcceptHeader.php");
            Object headerValue = assignParameter(args, 0, false);
            Object parts = null;
            ReferenceContainer index = new BasicReferenceContainer(null);
            index.setObject(0);
            parts = HeaderUtils.runtimeStaticObject.split(env, toStringR(headerValue, env), ",;=");
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .HttpFoundation
                            .classes
                            .AcceptHeader(
                            env,
                            function_array_map
                                    .f
                                    .env(env)
                                    .call(
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Symfony\\Component\\HttpFoundation",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "subParts")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object subParts =
                                                            assignParameter(args, 0, false);
                                                    Object item = null;
                                                    ReferenceContainer part =
                                                            new BasicReferenceContainer(null);
                                                    ReferenceContainer index =
                                                            new BasicReferenceContainer(null);
                                                    Object attributes = null;
                                                    index =
                                                            this.contextReferences
                                                                    .getReferenceContainer("index");
                                                    part.setObject(
                                                            function_array_shift
                                                                    .f
                                                                    .env(env)
                                                                    .call(subParts)
                                                                    .value());
                                                    attributes =
                                                            HeaderUtils.runtimeStaticObject.combine(
                                                                    env, subParts);
                                                    item =
                                                            new AcceptHeaderItem(
                                                                    env,
                                                                    part.arrayGet(env, 0),
                                                                    attributes);
                                                    env.callMethod(
                                                            item,
                                                            "setIndex",
                                                            AcceptHeader.class,
                                                            ZVal.postIncrement(index));
                                                    return ZVal.assign(item);
                                                }
                                            }.useRef("index", index),
                                            parts)
                                    .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\AcceptHeader")
                    .setLookup(
                            AcceptHeader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("items", "sorted")
                    .setFilename("vendor/symfony/http-foundation/AcceptHeader.php")
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
