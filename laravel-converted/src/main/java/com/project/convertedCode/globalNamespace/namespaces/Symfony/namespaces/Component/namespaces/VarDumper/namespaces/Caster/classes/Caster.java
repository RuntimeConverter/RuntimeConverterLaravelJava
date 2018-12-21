package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.__PHP_Incomplete_Class;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/Caster.php

*/

public class Caster extends RuntimeClassBase {

    public Caster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Caster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_EXCLUDE_VERBOSE = 1;

    public static final Object CONST_EXCLUDE_VIRTUAL = 2;

    public static final Object CONST_EXCLUDE_DYNAMIC = 4;

    public static final Object CONST_EXCLUDE_PUBLIC = 8;

    public static final Object CONST_EXCLUDE_PROTECTED = 16;

    public static final Object CONST_EXCLUDE_PRIVATE = 32;

    public static final Object CONST_EXCLUDE_NULL = 64;

    public static final Object CONST_EXCLUDE_EMPTY = 128;

    public static final Object CONST_EXCLUDE_NOT_IMPORTANT = 256;

    public static final Object CONST_EXCLUDE_STRICT = 512;

    public static final Object CONST_PREFIX_VIRTUAL = "\u0000~\u0000";

    public static final Object CONST_PREFIX_DYNAMIC = "\u0000+\u0000";

    public static final Object CONST_PREFIX_PROTECTED = "\u0000*\u0000";

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\Caster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "obj")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(
            index = 2,
            name = "hasDebugInfo",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object castObject(RuntimeEnv env, Object... args) {
            Object obj = assignParameter(args, 0, false);
            Object _pClass = assignParameter(args, 1, false);
            Object hasDebugInfo = assignParameter(args, 2, true);
            if (null == hasDebugInfo) {
                hasDebugInfo = false;
            }
            Object a = null;
            ReferenceContainer prefixedKeys = new BasicReferenceContainer(null);
            Object v = null;
            ReferenceContainer keys = new BasicReferenceContainer(null);
            Object prop = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer k = new BasicReferenceContainer(null);
            ReferenceContainer publicProperties = new BasicReferenceContainer(null);
            if (ZVal.isTrue(hasDebugInfo)) {
                a = env.callMethod(obj, "__debugInfo", Caster.class);

            } else if (ZVal.isTrue(ZVal.checkInstanceType(obj, Closure.class, "Closure"))) {
                a = ZVal.newArray();

            } else {
                a = ZVal.assign(rToArrayCast(obj));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            obj, __PHP_Incomplete_Class.class, "__PHP_Incomplete_Class"))) {
                return ZVal.assign(a);
            }

            if (ZVal.isTrue(a)) {
                publicProperties = env.getInlineStatic(38, ZVal.newArray());
                i.setObject(0);
                prefixedKeys.setObject(ZVal.newArray());
                for (ZPair zpairResult2177 : ZVal.getIterable(a, env, false)) {
                    k.setObject(ZVal.assign(zpairResult2177.getKey()));
                    v = ZVal.assign(zpairResult2177.getValue());
                    if (ZVal.isTrue(
                            arrayActionR(ArrayAction.ISSET, k, env, 0)
                                    ? ZVal.strictNotEqualityCheck(
                                            "\u0000", "!==", k.arrayGet(env, 0))
                                    : ZVal.isGreaterThanOrEqualTo(70211, ">=", 70200))) {
                        if (!arrayActionR(ArrayAction.ISSET, publicProperties, env, _pClass)) {
                            for (ZPair zpairResult2178 :
                                    ZVal.getIterable(
                                            NamespaceGlobal.get_class_vars
                                                    .env(env)
                                                    .call(_pClass)
                                                    .value(),
                                            env,
                                            false)) {
                                prop = ZVal.assign(zpairResult2178.getKey());
                                v = ZVal.assign(zpairResult2178.getValue());
                                publicProperties.arrayAccess(env, _pClass, prop).set(true);
                            }
                        }

                        if (!arrayActionR(
                                ArrayAction.ISSET, publicProperties, env, _pClass, k.getObject())) {
                            prefixedKeys
                                    .arrayAccess(env, i.getObject())
                                    .set(
                                            toStringR(CONST_PREFIX_DYNAMIC, env)
                                                    + toStringR(k.getObject(), env));
                        }

                    } else if (ZVal.toBool(
                                    ZVal.toBool(arrayActionR(ArrayAction.ISSET, k, env, 16))
                                            && ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            "\u0000", "===", k.arrayGet(env, 16))))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            0,
                                            "===",
                                            function_strpos
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            k.getObject(),
                                                            "\u0000class@anonymous\u0000")
                                                    .value()))) {
                        prefixedKeys
                                .arrayAccess(env, i.getObject())
                                .set(
                                        "\u0000"
                                                + toStringR(
                                                        NamespaceGlobal.get_parent_class
                                                                .env(env)
                                                                .call(_pClass)
                                                                .value(),
                                                        env)
                                                + "@anonymous"
                                                + toStringR(
                                                        NamespaceGlobal.strrchr
                                                                .env(env)
                                                                .call(k.getObject(), "\u0000")
                                                                .value(),
                                                        env));
                    }

                    i.setObject(ZVal.increment(i.getObject()));
                }

                if (ZVal.isTrue(prefixedKeys.getObject())) {
                    keys.setObject(function_array_keys.f.env(env).call(a).value());
                    for (ZPair zpairResult2179 :
                            ZVal.getIterable(prefixedKeys.getObject(), env, false)) {
                        i.setObject(ZVal.assign(zpairResult2179.getKey()));
                        k.setObject(ZVal.assign(zpairResult2179.getValue()));
                        keys.arrayAccess(env, i.getObject()).set(k.getObject());
                    }

                    a = function_array_combine.f.env(env).call(keys.getObject(), a).value();
                }
            }

            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "a", typeHint = "array")
        @ConvertedParameter(index = 1, name = "filter")
        @ConvertedParameter(
            index = 2,
            name = "listedProperties",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 3,
            name = "count",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object filter(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object filter = assignParameter(args, 1, false);
            Object listedProperties = assignParameter(args, 2, true);
            if (null == listedProperties) {
                listedProperties = ZVal.newArray();
            }
            ReferenceContainer count =
                    assignParameterRef(runtimePassByReferenceArgs, args, 3, true);
            if (null == count.getObject()) {
                count.setObject(0);
            }
            Object v = null;
            ReferenceContainer k = new BasicReferenceContainer(null);
            Object type = null;
            count.setObject(0);
            for (ZPair zpairResult2180 : ZVal.getIterable(a.getObject(), env, false)) {
                k.setObject(ZVal.assign(zpairResult2180.getKey()));
                v = ZVal.assign(zpairResult2180.getValue());
                type = ZVal.toLong(CONST_EXCLUDE_STRICT) & ZVal.toLong(filter);
                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", v)) {
                    type =
                            ZAssignment.or(
                                    "|=",
                                    type,
                                    ZVal.toLong(CONST_EXCLUDE_NULL) & ZVal.toLong(filter));
                    type =
                            ZAssignment.or(
                                    "|=",
                                    type,
                                    ZVal.toLong(CONST_EXCLUDE_EMPTY) & ZVal.toLong(filter));

                } else if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                ZVal
                                                                                                        .strictEqualityCheck(
                                                                                                                false,
                                                                                                                "===",
                                                                                                                v))
                                                                                        || ZVal
                                                                                                .toBool(
                                                                                                        ZVal
                                                                                                                .strictEqualityCheck(
                                                                                                                        "",
                                                                                                                        "===",
                                                                                                                        v)))
                                                                        || ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                "0",
                                                                                                "===",
                                                                                                v)))
                                                        || ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        0, "===", v)))
                                        || ZVal.toBool(ZVal.strictEqualityCheck(0.0, "===", v)))
                        || ZVal.toBool(ZVal.strictEqualityCheck(ZVal.newArray(), "===", v))) {
                    type =
                            ZAssignment.or(
                                    "|=",
                                    type,
                                    ZVal.toLong(CONST_EXCLUDE_EMPTY) & ZVal.toLong(filter));
                }

                if (ZVal.toBool(ZVal.toLong(CONST_EXCLUDE_NOT_IMPORTANT) & ZVal.toLong(filter))
                        && ZVal.toBool(
                                !function_in_array
                                        .f
                                        .env(env)
                                        .call(k.getObject(), listedProperties, true)
                                        .getBool())) {
                    type = ZAssignment.or("|=", type, CONST_EXCLUDE_NOT_IMPORTANT);
                }

                if (ZVal.toBool(ZVal.toLong(CONST_EXCLUDE_VERBOSE) & ZVal.toLong(filter))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(k.getObject(), listedProperties, true)
                                        .value())) {
                    type = ZAssignment.or("|=", type, CONST_EXCLUDE_VERBOSE);
                }

                if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, k, env, 1))
                        || ZVal.toBool(
                                ZVal.strictNotEqualityCheck("\u0000", "!==", k.arrayGet(env, 0)))) {
                    type =
                            ZAssignment.or(
                                    "|=",
                                    type,
                                    ZVal.toLong(CONST_EXCLUDE_PUBLIC) & ZVal.toLong(filter));

                } else if (ZVal.strictEqualityCheck("~", "===", k.arrayGet(env, 1))) {
                    type =
                            ZAssignment.or(
                                    "|=",
                                    type,
                                    ZVal.toLong(CONST_EXCLUDE_VIRTUAL) & ZVal.toLong(filter));

                } else if (ZVal.strictEqualityCheck("+", "===", k.arrayGet(env, 1))) {
                    type =
                            ZAssignment.or(
                                    "|=",
                                    type,
                                    ZVal.toLong(CONST_EXCLUDE_DYNAMIC) & ZVal.toLong(filter));

                } else if (ZVal.strictEqualityCheck("*", "===", k.arrayGet(env, 1))) {
                    type =
                            ZAssignment.or(
                                    "|=",
                                    type,
                                    ZVal.toLong(CONST_EXCLUDE_PROTECTED) & ZVal.toLong(filter));

                } else {
                    type =
                            ZAssignment.or(
                                    "|=",
                                    type,
                                    ZVal.toLong(CONST_EXCLUDE_PRIVATE) & ZVal.toLong(filter));
                }

                if (ZVal.isTrue(
                        ZVal.isTrue(ZVal.toLong(CONST_EXCLUDE_STRICT) & ZVal.toLong(filter))
                                ? ZVal.strictEqualityCheck(type, "===", filter)
                                : type)) {
                    arrayActionR(ArrayAction.UNSET, a, env, k.getObject());
                    count.setObject(ZVal.increment(count.getObject()));
                }
            }

            return ZVal.assign(a.getObject());
        }

        public Object filter(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "__PHP_Incomplete_Class")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castPhpIncompleteClass(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            if (arrayActionR(ArrayAction.ISSET, a, env, "__PHP_Incomplete_Class_Name")) {
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("class")
                        .set(
                                toStringR(
                                                toObjectR(stub)
                                                        .accessProp(this, env)
                                                        .name("class")
                                                        .value(),
                                                env)
                                        + "("
                                        + toStringR(
                                                a.arrayGet(env, "__PHP_Incomplete_Class_Name"), env)
                                        + ")");
                arrayActionR(ArrayAction.UNSET, a, env, "__PHP_Incomplete_Class_Name");
            }

            return ZVal.assign(a.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\Caster")
                    .setLookup(
                            Caster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/var-dumper/Caster/Caster.php")
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
