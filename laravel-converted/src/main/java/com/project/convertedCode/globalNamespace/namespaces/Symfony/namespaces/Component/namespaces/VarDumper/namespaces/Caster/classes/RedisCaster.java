package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.EnumStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.exceptions.missingDefinitions.ClassNotFoundDuringConversion;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ClassStub;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/RedisCaster.php

*/

public class RedisCaster extends RuntimeClassBase {

    public RedisCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RedisCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\RedisCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "Redis")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castRedis(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object connected = null;
            Object ser = null;
            Object prefix = null;
            Object retry = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            if (!ZVal.isTrue(connected = env.callMethod(c, "isConnected", RedisCaster.class))) {
                return ZVal.assign(
                        ZVal.add(
                                a,
                                ZVal.newArray(
                                        new ZPair(
                                                toStringR(prefix, env) + "isConnected",
                                                connected))));
            }

            ser =
                    env.callMethod(
                            c,
                            "getOption",
                            RedisCaster.class,
                            ClassConstantUtils.getConstantValueByClass(
                                    env, ZVal.resolveClassAlias(env, "Redis"), "OPT_SERIALIZER"));
            retry =
                    ZVal.assign(
                            function_defined.f.env(env).call("Redis::OPT_SCAN").getBool()
                                    ? env.callMethod(
                                            c,
                                            "getOption",
                                            RedisCaster.class,
                                            ClassConstantUtils.getConstantValueByClass(
                                                    env,
                                                    ZVal.resolveClassAlias(env, "Redis"),
                                                    "OPT_SCAN"))
                                    : 0);
            return ZVal.assign(
                    ZVal.add(
                            a,
                            ZVal.newArray(
                                    new ZPair(toStringR(prefix, env) + "isConnected", connected),
                                    new ZPair(
                                            toStringR(prefix, env) + "host",
                                            env.callMethod(c, "getHost", RedisCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "port",
                                            env.callMethod(c, "getPort", RedisCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "auth",
                                            env.callMethod(c, "getAuth", RedisCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "dbNum",
                                            env.callMethod(c, "getDbNum", RedisCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "timeout",
                                            env.callMethod(c, "getTimeout", RedisCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "persistentId",
                                            env.callMethod(
                                                    c, "getPersistentID", RedisCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "options",
                                            new EnumStub(
                                                    env,
                                                    ZVal.newArray(
                                                            new ZPair(
                                                                    "READ_TIMEOUT",
                                                                    env.callMethod(
                                                                            c,
                                                                            "getOption",
                                                                            RedisCaster.class,
                                                                            ClassConstantUtils
                                                                                    .getConstantValueByClass(
                                                                                            env,
                                                                                            ZVal
                                                                                                    .resolveClassAlias(
                                                                                                            env,
                                                                                                            "Redis"),
                                                                                            "OPT_READ_TIMEOUT"))),
                                                            new ZPair(
                                                                    "SERIALIZER",
                                                                    arrayActionR(
                                                                                    ArrayAction
                                                                                            .ISSET,
                                                                                    env
                                                                                            .getRequestStaticPropertiesReference(
                                                                                                    com.project
                                                                                                            .convertedCode
                                                                                                            .globalNamespace
                                                                                                            .namespaces
                                                                                                            .Symfony
                                                                                                            .namespaces
                                                                                                            .Component
                                                                                                            .namespaces
                                                                                                            .VarDumper
                                                                                                            .namespaces
                                                                                                            .Caster
                                                                                                            .classes
                                                                                                            .RedisCaster
                                                                                                            .RequestStaticProperties
                                                                                                            .class,
                                                                                                    "serializer"),
                                                                                    env,
                                                                                    ser)
                                                                            ? new ConstStub(
                                                                                    env,
                                                                                    env.getRequestStaticPropertiesReference(
                                                                                                    com.project
                                                                                                            .convertedCode
                                                                                                            .globalNamespace
                                                                                                            .namespaces
                                                                                                            .Symfony
                                                                                                            .namespaces
                                                                                                            .Component
                                                                                                            .namespaces
                                                                                                            .VarDumper
                                                                                                            .namespaces
                                                                                                            .Caster
                                                                                                            .classes
                                                                                                            .RedisCaster
                                                                                                            .RequestStaticProperties
                                                                                                            .class,
                                                                                                    "serializer")
                                                                                            .arrayGet(
                                                                                                    env,
                                                                                                    ser),
                                                                                    ser)
                                                                            : ser),
                                                            new ZPair(
                                                                    "PREFIX",
                                                                    env.callMethod(
                                                                            c,
                                                                            "getOption",
                                                                            RedisCaster.class,
                                                                            ClassConstantUtils
                                                                                    .getConstantValueByClass(
                                                                                            env,
                                                                                            ZVal
                                                                                                    .resolveClassAlias(
                                                                                                            env,
                                                                                                            "Redis"),
                                                                                            "OPT_PREFIX"))),
                                                            new ZPair(
                                                                    "SCAN",
                                                                    new ConstStub(
                                                                            env,
                                                                            ZVal.isTrue(retry)
                                                                                    ? "RETRY"
                                                                                    : "NORETRY",
                                                                            retry))))))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "RedisArray")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castRedisArray(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object prefix = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            return ZVal.assign(
                    ZVal.add(
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "hosts",
                                            env.callMethod(c, "_hosts", RedisCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "function",
                                            ClassStub.runtimeStaticObject.wrapCallable(
                                                    env,
                                                    env.callMethod(
                                                            c, "_function", RedisCaster.class))))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object serializer =
                ZVal.newArray(
                        new ZPair(ClassNotFoundDuringConversion.throwException("Redis"), "NONE"),
                        new ZPair(ClassNotFoundDuringConversion.throwException("Redis"), "PHP"),
                        new ZPair(2, "IGBINARY"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\RedisCaster")
                    .setLookup(
                            RedisCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("serializer")
                    .setFilename("vendor/symfony/var-dumper/Caster/RedisCaster.php")
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
