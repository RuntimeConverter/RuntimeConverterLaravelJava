package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

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
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.StringUtil;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ExactValueToken.php

*/

public class ExactValueToken extends RuntimeClassBase implements TokenInterface {

    public Object value = null;

    public Object string = null;

    public Object util = null;

    public Object comparatorFactory = null;

    public ExactValueToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExactValueToken.class) {
            this.__construct(env, args);
        }
    }

    public ExactValueToken(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "util",
        typeHint = "Prophecy\\Util\\StringUtil",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "comparatorFactory",
        typeHint = "Prophecy\\Comparator\\Factory",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object util = assignParameter(args, 1, true);
        if (null == util) {
            util = ZVal.getNull();
        }
        Object comparatorFactory = assignParameter(args, 2, true);
        if (null == comparatorFactory) {
            comparatorFactory = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
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
        Object comparator = null;
        Object failure = null;
        if (ZVal.toBool(function_is_object.f.env(env).call(argument).value())
                && ZVal.toBool(function_is_object.f.env(env).call(this.value).value())) {
            comparator =
                    env.callMethod(
                            this.comparatorFactory,
                            "getComparatorFor",
                            ExactValueToken.class,
                            argument,
                            this.value);
            try {
                env.callMethod(
                        comparator, "assertEquals", ExactValueToken.class, argument, this.value);
                return 10;
            } catch (ConvertedException convertedException114) {
                if (convertedException114.instanceOf(
                        ComparisonFailure.class,
                        "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                    failure = convertedException114.getObject();
                } else {
                    throw convertedException114;
                }
            }
        }

        if (ZVal.toBool(function_is_object.f.env(env).call(argument).value())
                ^ ZVal.toBool(function_is_object.f.env(env).call(this.value).value())) {
            if (ZVal.toBool(function_is_object.f.env(env).call(argument).value())
                    && ZVal.toBool(
                            !function_method_exists
                                    .f
                                    .env(env)
                                    .call(argument, "__toString")
                                    .getBool())) {
                return ZVal.assign(false);
            }

            if (ZVal.toBool(function_is_object.f.env(env).call(this.value).value())
                    && ZVal.toBool(
                            !function_method_exists
                                    .f
                                    .env(env)
                                    .call(this.value, "__toString")
                                    .getBool())) {
                return ZVal.assign(false);
            }

        } else if (ZVal.toBool(function_is_numeric.f.env(env).call(argument).value())
                && ZVal.toBool(function_is_numeric.f.env(env).call(this.value).value())) {

        } else if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.gettype.env(env).call(argument).value(),
                "!==",
                NamespaceGlobal.gettype.env(env).call(this.value).value())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(ZVal.equalityCheck(argument, this.value) ? 10 : false);
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    public Object isLast(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.string)) {
            this.string =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "exact(%s)",
                                    env.callMethod(
                                            this.util,
                                            "stringify",
                                            ExactValueToken.class,
                                            this.value))
                            .value();
        }

        return ZVal.assign(this.string);
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\ExactValueToken";

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
                    .setName("Prophecy\\Argument\\Token\\ExactValueToken")
                    .setLookup(
                            ExactValueToken.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("comparatorFactory", "string", "util", "value")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ExactValueToken.php")
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
