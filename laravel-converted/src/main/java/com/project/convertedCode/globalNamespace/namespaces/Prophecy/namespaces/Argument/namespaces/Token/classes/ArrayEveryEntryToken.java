package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TokenInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_sum;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ExactValueToken;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayEveryEntryToken.php

*/

public class ArrayEveryEntryToken extends RuntimeClassBase implements TokenInterface {

    public Object value = null;

    public ArrayEveryEntryToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArrayEveryEntryToken.class) {
            this.__construct(env, args);
        }
    }

    public ArrayEveryEntryToken(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        value,
                        TokenInterface.class,
                        "Prophecy\\Argument\\Token\\TokenInterface"))) {
            value = new ExactValueToken(env, value);
        }

        this.value = value;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, false);
        ReferenceContainer scores = new BasicReferenceContainer(null);
        Object argumentEntry = null;
        Object key = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(argument, Traversable.class, "Traversable")))
                && ZVal.toBool(!function_is_array.f.env(env).call(argument).getBool())) {
            return ZVal.assign(false);
        }

        scores.setObject(ZVal.newArray());
        for (ZPair zpairResult942 : ZVal.getIterable(argument, env, false)) {
            key = ZVal.assign(zpairResult942.getKey());
            argumentEntry = ZVal.assign(zpairResult942.getValue());
            scores.arrayAppend(env)
                    .set(
                            env.callMethod(
                                    this.value,
                                    "scoreArgument",
                                    ArrayEveryEntryToken.class,
                                    argumentEntry));
        }

        if (ZVal.toBool(ZVal.isEmpty(scores.getObject()))
                || ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call(false, scores.getObject(), true)
                                .value())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.divide(
                        function_array_sum.f.env(env).call(scores.getObject()).value(),
                        function_count.f.env(env).call(scores.getObject()).value()));
    }

    @ConvertedMethod
    public Object isLast(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf.f.env(env).call("[%s, ..., %s]", this.value, this.value).value());
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\ArrayEveryEntryToken";

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
                    .setName("Prophecy\\Argument\\Token\\ArrayEveryEntryToken")
                    .setLookup(
                            ArrayEveryEntryToken.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("value")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayEveryEntryToken.php")
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
