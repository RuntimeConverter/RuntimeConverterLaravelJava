package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Matcher/Dumper/StaticPrefixCollection.php

*/

public class StaticPrefixCollection extends RuntimeClassBase {

    public Object prefix = null;

    public Object staticPrefixes = ZVal.newArray();

    public Object prefixes = ZVal.newArray();

    public Object items = ZVal.newArray();

    public StaticPrefixCollection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StaticPrefixCollection.class) {
            this.__construct(env, args);
        }
    }

    public StaticPrefixCollection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, true);
        if (null == prefix) {
            prefix = "/";
        }
        this.prefix = prefix;
        return null;
    }

    @ConvertedMethod
    public Object getPrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.prefix);
    }

    @ConvertedMethod
    public Object getRoutes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.items);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix", typeHint = "string")
    @ConvertedParameter(index = 1, name = "route")
    public Object addRoute(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object prefix = assignParameter(args, 0, false);
        Object route = assignParameter(args, 1, false);
        Object staticPrefix = null;
        Object item = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult213 = null;
        Object runtimeTempArrayResult212 = null;
        Object commonPrefix = null;
        Object runtimeTempArrayResult211 = null;
        Object commonStaticPrefix = null;
        Object runtimeTempArrayResult210 = null;
        Object child = null;
        ZVal.list(
                runtimeTempArrayResult210 = this.getCommonPrefix(env, prefix, prefix),
                (prefix = listGet(runtimeTempArrayResult210, 0, env)),
                (staticPrefix = listGet(runtimeTempArrayResult210, 1, env)));
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i.setObject(ZVal.subtract(function_count.f.env(env).call(this.items).value(), 1));
                ZVal.isLessThanOrEqualTo(0, "<=", i.getObject());
                i.setObject(ZVal.decrement(i.getObject()))) {
            item =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "items", env)
                                    .arrayGet(env, i.getObject()));
            ZVal.list(
                    runtimeTempArrayResult211 =
                            this.getCommonPrefix(
                                    env,
                                    prefix,
                                    new ReferenceClassProperty(this, "prefixes", env)
                                            .arrayGet(env, i.getObject())),
                    (commonPrefix = listGet(runtimeTempArrayResult211, 0, env)),
                    (commonStaticPrefix = listGet(runtimeTempArrayResult211, 1, env)));
            if (ZVal.strictEqualityCheck(this.prefix, "===", commonPrefix)) {
                if (ZVal.toBool(ZVal.strictNotEqualityCheck(this.prefix, "!==", staticPrefix))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        this.prefix,
                                        "!==",
                                        new ReferenceClassProperty(this, "staticPrefixes", env)
                                                .arrayGet(env, i.getObject())))) {
                    continue;
                }

                if (ZVal.toBool(ZVal.strictEqualityCheck(this.prefix, "===", staticPrefix))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        this.prefix,
                                        "===",
                                        new ReferenceClassProperty(this, "staticPrefixes", env)
                                                .arrayGet(env, i.getObject())))) {
                    break;
                }

                if (ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        new ReferenceClassProperty(this, "prefixes", env)
                                                .arrayGet(env, i.getObject()),
                                        "!==",
                                        new ReferenceClassProperty(this, "staticPrefixes", env)
                                                .arrayGet(env, i.getObject())))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        this.prefix,
                                        "===",
                                        new ReferenceClassProperty(this, "staticPrefixes", env)
                                                .arrayGet(env, i.getObject())))) {
                    break;
                }

                if (ZVal.toBool(ZVal.strictNotEqualityCheck(prefix, "!==", staticPrefix))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(this.prefix, "===", staticPrefix))) {
                    break;
                }

                continue;
            }

            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    item,
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Routing
                                            .namespaces
                                            .Matcher
                                            .namespaces
                                            .Dumper
                                            .classes
                                            .StaticPrefixCollection
                                            .class,
                                    "Symfony\\Component\\Routing\\Matcher\\Dumper\\StaticPrefixCollection"))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    new ReferenceClassProperty(this, "prefixes", env)
                                            .arrayGet(env, i.getObject()),
                                    "===",
                                    commonPrefix))) {
                env.callMethod(item, "addRoute", StaticPrefixCollection.class, prefix, route);

            } else {
                child =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .Routing
                                .namespaces
                                .Matcher
                                .namespaces
                                .Dumper
                                .classes
                                .StaticPrefixCollection(env, commonPrefix);
                ZVal.list(
                        runtimeTempArrayResult212 =
                                env.callMethod(
                                        child,
                                        "getCommonPrefix",
                                        StaticPrefixCollection.class,
                                        new ReferenceClassProperty(this, "prefixes", env)
                                                .arrayGet(env, i.getObject()),
                                        new ReferenceClassProperty(this, "prefixes", env)
                                                .arrayGet(env, i.getObject())),
                        (new ReferenceClassProperty(child, "prefixes", env)
                                .arrayAccess(env, 0)
                                .set(listGet(runtimeTempArrayResult212, 0, env))),
                        (new ReferenceClassProperty(child, "staticPrefixes", env)
                                .arrayAccess(env, 0)
                                .set(listGet(runtimeTempArrayResult212, 1, env))));
                ZVal.list(
                        runtimeTempArrayResult213 =
                                env.callMethod(
                                        child,
                                        "getCommonPrefix",
                                        StaticPrefixCollection.class,
                                        prefix,
                                        prefix),
                        (new ReferenceClassProperty(child, "prefixes", env)
                                .arrayAccess(env, 1)
                                .set(listGet(runtimeTempArrayResult213, 0, env))),
                        (new ReferenceClassProperty(child, "staticPrefixes", env)
                                .arrayAccess(env, 1)
                                .set(listGet(runtimeTempArrayResult213, 1, env))));
                toObjectR(child)
                        .accessProp(this, env)
                        .name("items")
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new ReferenceClassProperty(this, "items", env)
                                                        .arrayGet(env, i.getObject())),
                                        new ZPair(1, route)));
                new ReferenceClassProperty(this, "staticPrefixes", env)
                        .arrayAccess(env, i.getObject())
                        .set(commonStaticPrefix);
                new ReferenceClassProperty(this, "prefixes", env)
                        .arrayAccess(env, i.getObject())
                        .set(commonPrefix);
                new ReferenceClassProperty(this, "items", env)
                        .arrayAccess(env, i.getObject())
                        .set(child);
            }

            return null;
        }

        new ReferenceClassProperty(this, "staticPrefixes", env).arrayAppend(env).set(staticPrefix);
        new ReferenceClassProperty(this, "prefixes", env).arrayAppend(env).set(prefix);
        new ReferenceClassProperty(this, "items", env).arrayAppend(env).set(route);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "routes",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    public Object populateCollection(RuntimeEnv env, Object... args) {
        Object routes = assignParameter(args, 0, false);
        Object route = null;
        for (ZPair zpairResult2067 : ZVal.getIterable(this.items, env, true)) {
            route = ZVal.assign(zpairResult2067.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            route,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Routing
                                    .namespaces
                                    .Matcher
                                    .namespaces
                                    .Dumper
                                    .classes
                                    .StaticPrefixCollection
                                    .class,
                            "Symfony\\Component\\Routing\\Matcher\\Dumper\\StaticPrefixCollection"))) {
                env.callMethod(route, "populateCollection", StaticPrefixCollection.class, routes);

            } else {
                env.callMethod(
                        routes,
                        new RuntimeArgsWithReferences(),
                        "add",
                        StaticPrefixCollection.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(route)));
            }
        }

        return ZVal.assign(routes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix", typeHint = "string")
    @ConvertedParameter(index = 1, name = "anotherPrefix", typeHint = "string")
    private Object getCommonPrefix(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer prefix = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer anotherPrefix =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object subPattern = null;
        Object end = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer j = new BasicReferenceContainer(null);
        Object baseLength = null;
        ReferenceContainer n = new BasicReferenceContainer(null);
        Object staticLength = null;
        baseLength = function_strlen.f.env(env).call(this.prefix).value();
        end =
                NamespaceGlobal.min
                        .env(env)
                        .call(
                                function_strlen.f.env(env).call(prefix.getObject()).value(),
                                function_strlen.f.env(env).call(anotherPrefix.getObject()).value())
                        .value();
        staticLength = ZVal.getNull();
        function_set_error_handler
                .f
                .env(env)
                .call(
                        ZVal.newArray(
                                new ZPair(0, "StaticPrefixCollection"),
                                new ZPair(1, "handleError")));
        runtimeConverterBreakCount = 0;
        for (i.setObject(ZVal.assign(baseLength));
                ZVal.toBool(ZVal.isLessThan(i.getObject(), '<', end))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        prefix.arrayGet(env, i.getObject()),
                                        "===",
                                        anotherPrefix.arrayGet(env, i.getObject())));
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.strictEqualityCheck("(", "===", prefix.arrayGet(env, i.getObject()))) {
                staticLength =
                        ZVal.assign(
                                ZVal.isDefined(ternaryExpressionTemp = staticLength)
                                        ? ternaryExpressionTemp
                                        : i.getObject());
                runtimeConverterBreakCount = 0;
                for (j.setObject(ZVal.add(1, i.getObject())), n.setObject(1);
                        ZVal.toBool(ZVal.isLessThan(j.getObject(), '<', end))
                                && ZVal.toBool(ZVal.isLessThan(0, '<', n.getObject()));
                        j.setObject(ZVal.increment(j.getObject()))) {
                    if (ZVal.strictNotEqualityCheck(
                            prefix.arrayGet(env, j.getObject()),
                            "!==",
                            anotherPrefix.arrayGet(env, j.getObject()))) {
                        runtimeConverterBreakCount = 2;
                        runtimeConverterBreakCount--;
                        break;
                    }

                    if (ZVal.strictEqualityCheck("(", "===", prefix.arrayGet(env, j.getObject()))) {
                        n.setObject(ZVal.increment(n.getObject()));

                    } else if (ZVal.strictEqualityCheck(
                            ")", "===", prefix.arrayGet(env, j.getObject()))) {
                        n.setObject(ZVal.decrement(n.getObject()));

                    } else if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            "\\", "===", prefix.arrayGet(env, j.getObject())))
                            && ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            ZVal.preIncrement(j), "===", end))
                                            || ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck(
                                                            prefix.arrayGet(env, j.getObject()),
                                                            "!==",
                                                            anotherPrefix.arrayGet(
                                                                    env, j.getObject()))))) {
                        j.setObject(ZVal.decrement(j.getObject()));
                        break;
                    }
                }

                if (ZVal.isLessThan(0, '<', n.getObject())) {
                    break;
                }

                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "?",
                                                        "===",
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                prefix.arrayGet(
                                                                                        env,
                                                                                        j
                                                                                                .getObject()))
                                                                ? ternaryExpressionTemp
                                                                : ""))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "?",
                                                        "===",
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                anotherPrefix
                                                                                        .arrayGet(
                                                                                                env,
                                                                                                j
                                                                                                        .getObject()))
                                                                ? ternaryExpressionTemp
                                                                : "")))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        ZVal.isDefined(
                                                        ternaryExpressionTemp =
                                                                prefix.arrayGet(env, j.getObject()))
                                                ? ternaryExpressionTemp
                                                : "",
                                        "!==",
                                        ZVal.isDefined(
                                                        ternaryExpressionTemp =
                                                                anotherPrefix.arrayGet(
                                                                        env, j.getObject()))
                                                ? ternaryExpressionTemp
                                                : ""))) {
                    break;
                }

                subPattern =
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        prefix.getObject(),
                                        i.getObject(),
                                        ZVal.subtract(j.getObject(), i.getObject()))
                                .value();
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        prefix.getObject(),
                                                        "!==",
                                                        anotherPrefix.getObject()))
                                        && ZVal.toBool(
                                                !function_preg_match
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "/^\\(\\[[^\\]]++\\]\\+\\+\\)$/",
                                                                subPattern)
                                                        .getBool()))
                        && ZVal.toBool(
                                !function_preg_match
                                        .f
                                        .env(env)
                                        .call("{(?<!" + toStringR(subPattern, env) + ")}", "")
                                        .getBool())) {
                    break;
                }

                i.setObject(ZVal.subtract(j.getObject(), 1));

            } else if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    "\\", "===", prefix.arrayGet(env, i.getObject())))
                    && ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(ZVal.preIncrement(i), "===", end))
                                    || ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    prefix.arrayGet(env, i.getObject()),
                                                    "!==",
                                                    anotherPrefix.arrayGet(env, i.getObject()))))) {
                i.setObject(ZVal.decrement(i.getObject()));
                break;
            }
        }

        function_restore_error_handler.f.env(env).call();
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.isLessThan(i.getObject(), '<', end))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                2,
                                                "===",
                                                ZVal.toLong(
                                                                NamespaceGlobal.ord
                                                                        .env(env)
                                                                        .call(
                                                                                prefix.arrayGet(
                                                                                        env,
                                                                                        i
                                                                                                .getObject()))
                                                                        .value())
                                                        >> ZVal.toLong(6))))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .call(
                                        "//u",
                                        toStringR(prefix.getObject(), env)
                                                + " "
                                                + toStringR(anotherPrefix.getObject(), env))
                                .value())) {
            runtimeConverterBreakCount = 0;
            do {
                i.setObject(ZVal.decrement(i.getObject()));

            } while (ZVal.strictEqualityCheck(
                    2,
                    "===",
                    ZVal.toLong(
                                    NamespaceGlobal.ord
                                            .env(env)
                                            .call(prefix.arrayGet(env, i.getObject()))
                                            .value())
                            >> ZVal.toLong(6)));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                function_substr
                                        .f
                                        .env(env)
                                        .call(prefix.getObject(), 0, i.getObject())
                                        .value()),
                        new ZPair(
                                1,
                                function_substr
                                        .f
                                        .env(env)
                                        .call(
                                                prefix.getObject(),
                                                0,
                                                ZVal.isDefined(ternaryExpressionTemp = staticLength)
                                                        ? ternaryExpressionTemp
                                                        : i.getObject())
                                        .value())));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Matcher\\Dumper\\StaticPrefixCollection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        @ConvertedParameter(index = 1, name = "msg")
        public Object handleError(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            Object msg = assignParameter(args, 1, false);
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            0,
                            "===",
                            function_strpos
                                    .f
                                    .env(env)
                                    .call(
                                            msg,
                                            "preg_match(): Compilation failed: lookbehind assertion is not fixed length")
                                    .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\Matcher\\Dumper\\StaticPrefixCollection")
                    .setLookup(
                            StaticPrefixCollection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("items", "prefix", "prefixes", "staticPrefixes")
                    .setFilename("vendor/symfony/routing/Matcher/Dumper/StaticPrefixCollection.php")
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
