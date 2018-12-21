package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.EnumStub;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.CutStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/ArgsStub.php

*/

public class ArgsStub extends EnumStub {

    public ArgsStub(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArgsStub.class) {
            this.__construct(env, args);
        }
    }

    public ArgsStub(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    @ConvertedParameter(index = 1, name = "function", typeHint = "string")
    @ConvertedParameter(index = 2, name = "class")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        Object function = assignParameter(args, 1, false);
        Object _pClass = assignParameter(args, 2, false);
        Object v = null;
        Object runtimeTempArrayResult215 = null;
        ReferenceContainer values = new BasicReferenceContainer(null);
        Object variadic = null;
        Object k = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        ZVal.list(
                runtimeTempArrayResult215 =
                        runtimeStaticObject.getParameters(env, function, _pClass),
                (variadic = listGet(runtimeTempArrayResult215, 0, env)),
                (params.setObject(listGet(runtimeTempArrayResult215, 1, env))));
        values.setObject(ZVal.newArray());
        for (ZPair zpairResult2175 : ZVal.getIterable(___args, env, false)) {
            k = ZVal.assign(zpairResult2175.getKey());
            v = ZVal.assign(zpairResult2175.getValue());
            values.arrayAccess(env, k)
                    .set(
                            ZVal.toBool(!function_is_scalar.f.env(env).call(v).getBool())
                                            && ZVal.toBool(
                                                    !ZVal.isTrue(
                                                            ZVal.checkInstanceType(
                                                                    v,
                                                                    Stub.class,
                                                                    "Symfony\\Component\\VarDumper\\Cloner\\Stub")))
                                    ? new CutStub(env, v)
                                    : v);
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", params.getObject())) {
            super.__construct(env, values.getObject(), false);
            return null;
        }

        if (ZVal.isLessThan(
                function_count.f.env(env).call(values.getObject()).value(),
                '<',
                function_count.f.env(env).call(params.getObject()).value())) {
            params.setObject(
                    function_array_slice
                            .f
                            .env(env)
                            .call(
                                    params.getObject(),
                                    0,
                                    function_count.f.env(env).call(values.getObject()).value())
                            .value());

        } else if (ZVal.isGreaterThan(
                function_count.f.env(env).call(values.getObject()).value(),
                '>',
                function_count.f.env(env).call(params.getObject()).value())) {
            values.arrayAppend(env)
                    .set(
                            new EnumStub(
                                    env,
                                    function_array_splice
                                            .f
                                            .env(env)
                                            .call(
                                                    values.getObject(),
                                                    function_count
                                                            .f
                                                            .env(env)
                                                            .call(params.getObject())
                                                            .value())
                                            .value(),
                                    false));
            params.arrayAppend(env).set(variadic);
        }

        if (ZVal.strictEqualityCheck(ZVal.arrayFromList("..."), "===", params.getObject())) {
            toObjectR(this).accessProp(this, env).name("dumpKeys").set(false);
            toObjectR(this)
                    .accessProp(this, env)
                    .name("value")
                    .set(
                            toObjectR(values.arrayGet(env, 0))
                                    .accessProp(this, env)
                                    .name("value")
                                    .value());

        } else {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("value")
                    .set(
                            function_array_combine
                                    .f
                                    .env(env)
                                    .call(params.getObject(), values.getObject())
                                    .value());
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\ArgsStub";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends EnumStub.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "function")
        @ConvertedParameter(index = 1, name = "class")
        private Object getParameters(RuntimeEnv env, Object... args) {
            Object function = assignParameter(args, 0, false);
            Object _pClass = assignParameter(args, 1, false);
            Object r = null;
            Object e = null;
            Object v = null;
            Object k = null;
            Object variadic = null;
            ReferenceContainer params = new BasicReferenceContainer(null);
            if (arrayActionR(
                    ArrayAction.ISSET,
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
                                    .ArgsStub
                                    .RequestStaticProperties
                                    .class,
                            "parameters"),
                    env,
                    k = toStringR(_pClass, env) + "::" + toStringR(function, env))) {
                return ZVal.assign(
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
                                                .ArgsStub
                                                .RequestStaticProperties
                                                .class,
                                        "parameters")
                                .arrayGet(env, k));
            }

            try {
                r =
                        ZVal.assign(
                                ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pClass)
                                        ? new ReflectionMethod(env, _pClass, function)
                                        : new ReflectionFunction(env, function));
            } catch (ConvertedException convertedException315) {
                if (convertedException315.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    e = convertedException315.getObject();
                    return ZVal.assign(
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()), new ZPair(1, ZVal.getNull())));
                } else {
                    throw convertedException315;
                }
            }

            variadic = "...";
            params.setObject(ZVal.newArray());
            for (ZPair zpairResult2176 :
                    ZVal.getIterable(
                            env.callMethod(r, "getParameters", ArgsStub.class), env, true)) {
                v = ZVal.assign(zpairResult2176.getValue());
                k = "$" + toStringR(toObjectR(v).accessProp(this, env).name("name").value(), env);
                if (ZVal.isTrue(env.callMethod(v, "isPassedByReference", ArgsStub.class))) {
                    k = "&" + toStringR(k, env);
                }

                if (ZVal.isTrue(env.callMethod(v, "isVariadic", ArgsStub.class))) {
                    variadic = toStringR(variadic, env) + toStringR(k, env);

                } else {
                    params.arrayAppend(env).set(k);
                }
            }

            return ZVal.assign(
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
                                            .ArgsStub
                                            .RequestStaticProperties
                                            .class,
                                    "parameters")
                            .arrayAccess(env, k)
                            .set(
                                    ZVal.newArray(
                                            new ZPair(0, variadic),
                                            new ZPair(1, params.getObject()))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object parameters = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\ArgsStub")
                    .setLookup(
                            ArgsStub.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attr",
                            "class",
                            "cut",
                            "dumpKeys",
                            "handle",
                            "position",
                            "refCount",
                            "type",
                            "value")
                    .setStaticPropertyNames("parameters")
                    .setFilename("vendor/symfony/var-dumper/Caster/ArgsStub.php")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Caster\\EnumStub")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Cloner\\Stub")
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
