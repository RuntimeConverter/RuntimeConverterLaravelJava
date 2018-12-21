package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.nativeFunctions.runtime.function_property_exists;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TokenInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Comparator.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.StringUtil;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ObjectStateToken.php

*/

public class ObjectStateToken extends RuntimeClassBase implements TokenInterface {

    public Object name = null;

    public Object value = null;

    public Object util = null;

    public Object comparatorFactory = null;

    public ObjectStateToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ObjectStateToken.class) {
            this.__construct(env, args);
        }
    }

    public ObjectStateToken(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "util",
        typeHint = "Prophecy\\Util\\StringUtil",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "comparatorFactory",
        typeHint = "Prophecy\\Comparator\\Factory",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object util = assignParameter(args, 2, true);
        if (null == util) {
            util = ZVal.getNull();
        }
        Object comparatorFactory = assignParameter(args, 3, true);
        if (null == comparatorFactory) {
            comparatorFactory = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.name = methodName;
        this.value = value;
        this.util =
                ZVal.isTrue(ternaryExpressionTemp = util)
                        ? ternaryExpressionTemp
                        : new StringUtil(env);
        this.comparatorFactory =
                ZVal.isTrue(ternaryExpressionTemp = comparatorFactory)
                        ? ternaryExpressionTemp
                        : Factory.runtimeStaticObject.getInstance(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, false);
        Object actual = null;
        Object comparator = null;
        Object failure = null;
        if (ZVal.toBool(function_is_object.f.env(env).call(argument).value())
                && ZVal.toBool(
                        function_method_exists.f.env(env).call(argument, this.name).value())) {
            actual =
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(ZVal.newArray(new ZPair(0, argument), new ZPair(1, this.name)))
                            .value();
            comparator =
                    env.callMethod(
                            this.comparatorFactory,
                            "getComparatorFor",
                            ObjectStateToken.class,
                            this.value,
                            actual);
            try {
                env.callMethod(
                        comparator, "assertEquals", ObjectStateToken.class, this.value, actual);
                return 8;
            } catch (ConvertedException convertedException115) {
                if (convertedException115.instanceOf(
                        ComparisonFailure.class,
                        "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                    failure = convertedException115.getObject();
                    return ZVal.assign(false);
                } else {
                    throw convertedException115;
                }
            }
        }

        if (ZVal.toBool(function_is_object.f.env(env).call(argument).value())
                && ZVal.toBool(
                        function_property_exists.f.env(env).call(argument, this.name).value())) {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                                    toObjectR(argument)
                                            .accessProp(this, env)
                                            .name(this.name)
                                            .value(),
                                    "===",
                                    this.value)
                            ? 8
                            : false);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object isLast(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "state(%s(), %s)",
                                this.name,
                                env.callMethod(
                                        this.util, "stringify", ObjectStateToken.class, this.value))
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\ObjectStateToken";

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
                    .setName("Prophecy\\Argument\\Token\\ObjectStateToken")
                    .setLookup(
                            ObjectStateToken.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("comparatorFactory", "name", "util", "value")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ObjectStateToken.php")
                    .addInterface("Prophecy\\Argument\\Token\\TokenInterface")
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
