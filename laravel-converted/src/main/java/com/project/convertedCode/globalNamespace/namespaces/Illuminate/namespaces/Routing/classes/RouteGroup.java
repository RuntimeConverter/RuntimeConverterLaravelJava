package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge_recursive;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/RouteGroup.php

*/

public class RouteGroup extends RuntimeClassBase {

    public RouteGroup(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RouteGroup(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Routing\\RouteGroup";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "new")
        @ConvertedParameter(index = 1, name = "old")
        public Object merge(RuntimeEnv env, Object... args) {
            ReferenceContainer _pNew = new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer old = new BasicReferenceContainer(assignParameter(args, 1, false));
            if (arrayActionR(ArrayAction.ISSET, _pNew, env, "domain")) {
                arrayActionR(ArrayAction.UNSET, old, env, "domain");
            }

            _pNew.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, RouteGroup.class)
                                            .method("formatAs")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(_pNew.getObject(), old.getObject())
                                            .value(),
                                    ZVal.newArray(
                                            new ZPair(
                                                    "namespace",
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, RouteGroup.class)
                                                            .method("formatNamespace")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(
                                                                    _pNew.getObject(),
                                                                    old.getObject())
                                                            .value()),
                                            new ZPair(
                                                    "prefix",
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, RouteGroup.class)
                                                            .method("formatPrefix")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(
                                                                    _pNew.getObject(),
                                                                    old.getObject())
                                                            .value()),
                                            new ZPair(
                                                    "where",
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, RouteGroup.class)
                                                            .method("formatWhere")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
                                                            .call(
                                                                    _pNew.getObject(),
                                                                    old.getObject())
                                                            .value())))
                            .value());
            return ZVal.assign(
                    function_array_merge_recursive
                            .f
                            .env(env)
                            .call(
                                    Arr.runtimeStaticObject.except(
                                            env,
                                            old.getObject(),
                                            ZVal.arrayFromList(
                                                    "namespace", "prefix", "where", "as")),
                                    _pNew.getObject())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "new")
        @ConvertedParameter(index = 1, name = "old")
        protected Object formatNamespace(RuntimeEnv env, Object... args) {
            ReferenceContainer _pNew = new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer old = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object ternaryExpressionTemp = null;
            if (arrayActionR(ArrayAction.ISSET, _pNew, env, "namespace")) {
                return ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, old, env, "namespace")
                                ? toStringR(
                                                function_trim
                                                        .f
                                                        .env(env)
                                                        .call(old.arrayGet(env, "namespace"), "\\")
                                                        .value(),
                                                env)
                                        + "\\"
                                        + toStringR(
                                                function_trim
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                _pNew.arrayGet(env, "namespace"),
                                                                "\\")
                                                        .value(),
                                                env)
                                : function_trim
                                        .f
                                        .env(env)
                                        .call(_pNew.arrayGet(env, "namespace"), "\\")
                                        .value());
            }

            return ZVal.assign(
                    ZVal.isDefined(ternaryExpressionTemp = old.arrayGet(env, "namespace"))
                            ? ternaryExpressionTemp
                            : ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "new")
        @ConvertedParameter(index = 1, name = "old")
        protected Object formatPrefix(RuntimeEnv env, Object... args) {
            ReferenceContainer _pNew = new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer old = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object ternaryExpressionTemp = null;
            old.setObject(
                    ZVal.assign(
                            ZVal.isDefined(ternaryExpressionTemp = old.arrayGet(env, "prefix"))
                                    ? ternaryExpressionTemp
                                    : ZVal.getNull()));
            return ZVal.assign(
                    arrayActionR(ArrayAction.ISSET, _pNew, env, "prefix")
                            ? toStringR(
                                            function_trim
                                                    .f
                                                    .env(env)
                                                    .call(old.getObject(), "/")
                                                    .value(),
                                            env)
                                    + "/"
                                    + toStringR(
                                            function_trim
                                                    .f
                                                    .env(env)
                                                    .call(_pNew.arrayGet(env, "prefix"), "/")
                                                    .value(),
                                            env)
                            : old.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "new")
        @ConvertedParameter(index = 1, name = "old")
        protected Object formatWhere(RuntimeEnv env, Object... args) {
            ReferenceContainer _pNew = new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer old = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object ternaryExpressionTemp = null;
            return ZVal.assign(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ZVal.isDefined(
                                                    ternaryExpressionTemp =
                                                            old.arrayGet(env, "where"))
                                            ? ternaryExpressionTemp
                                            : ZVal.newArray(),
                                    ZVal.isDefined(
                                                    ternaryExpressionTemp =
                                                            _pNew.arrayGet(env, "where"))
                                            ? ternaryExpressionTemp
                                            : ZVal.newArray())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "new")
        @ConvertedParameter(index = 1, name = "old")
        protected Object formatAs(RuntimeEnv env, Object... args) {
            ReferenceContainer _pNew = new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer old = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object ternaryExpressionTemp = null;
            if (arrayActionR(ArrayAction.ISSET, old, env, "as")) {
                _pNew.arrayAccess(env, "as")
                        .set(
                                toStringR(old.arrayGet(env, "as"), env)
                                        + toStringR(
                                                ZVal.isDefined(
                                                                ternaryExpressionTemp =
                                                                        _pNew.arrayGet(env, "as"))
                                                        ? ternaryExpressionTemp
                                                        : "",
                                                env));
            }

            return ZVal.assign(_pNew.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\RouteGroup")
                    .setLookup(
                            RouteGroup.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/Routing/RouteGroup.php")
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
