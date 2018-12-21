package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ExactValueToken;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TokenInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayEntryToken.php

*/

public class ArrayEntryToken extends RuntimeClassBase implements TokenInterface {

    public Object key = null;

    public Object value = null;

    public ArrayEntryToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArrayEntryToken.class) {
            this.__construct(env, args);
        }
    }

    public ArrayEntryToken(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.key = this.wrapIntoExactValueToken(env, key);
        this.value = this.wrapIntoExactValueToken(env, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument")
    public Object scoreArgument(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpspec/prophecy/src/Prophecy/Argument/Token")
                        .setFile(
                                "/vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayEntryToken.php");
        Object argument = assignParameter(args, 0, false);
        Object valueScores = null;
        Object scoreEntry = null;
        Object keyScores = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(argument, Traversable.class, "Traversable"))) {
            argument = NamespaceGlobal.iterator_to_array.env(env).call(argument).value();
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(argument, ArrayAccess.class, "ArrayAccess"))) {
            argument = this.convertArrayAccessToEntry(env, argument);
        }

        if (ZVal.toBool(!function_is_array.f.env(env).call(argument).getBool())
                || ZVal.toBool(ZVal.isEmpty(argument))) {
            return ZVal.assign(false);
        }

        keyScores =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, this.key), new ZPair(1, "scoreArgument")),
                                function_array_keys.f.env(env).call(argument).value())
                        .value();
        valueScores =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, this.value), new ZPair(1, "scoreArgument")),
                                argument)
                        .value();
        scoreEntry =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Prophecy\\Argument\\Token",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "value")
                    @ConvertedParameter(index = 1, name = "key")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object value = assignParameter(args, 0, false);
                        Object key = assignParameter(args, 1, false);
                        return ZVal.assign(
                                ZVal.toBool(value) && ZVal.toBool(key)
                                        ? NamespaceGlobal.min
                                                .env(env)
                                                .call(8, ZVal.divide(ZVal.add(key, value), 2))
                                                .value()
                                        : false);
                    }
                };
        return ZVal.assign(
                NamespaceGlobal.max
                        .env(env)
                        .call(
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(scoreEntry, valueScores, keyScores)
                                        .value())
                        .value());
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
                        .call("[..., %s => %s, ...]", this.key, this.value)
                        .value());
    }

    @ConvertedMethod
    public Object getKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.key);
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object wrapIntoExactValueToken(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        value,
                                        TokenInterface.class,
                                        "Prophecy\\Argument\\Token\\TokenInterface"))
                        ? value
                        : new ExactValueToken(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object", typeHint = "ArrayAccess")
    private Object convertArrayAccessToEntry(RuntimeEnv env, Object... args) {
        ReferenceContainer _object = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object key = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.key,
                        ExactValueToken.class,
                        "Prophecy\\Argument\\Token\\ExactValueToken"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "You can only use exact value tokens to match key of ArrayAccess object"
                                                    + toStringR("\n", env)
                                                    + "But you used `%s`.",
                                            this.key)
                                    .value()));
        }

        key = env.callMethod(this.key, "getValue", ArrayEntryToken.class);
        return ZVal.assign(
                ZVal.isTrue(
                                env.callMethod(
                                        _object.getObject(),
                                        "offsetExists",
                                        ArrayEntryToken.class,
                                        key))
                        ? ZVal.newArray(new ZPair(key, _object.arrayGet(env, key)))
                        : ZVal.newArray());
    }

    public static final Object CONST_class = "Prophecy\\Argument\\Token\\ArrayEntryToken";

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
                    .setName("Prophecy\\Argument\\Token\\ArrayEntryToken")
                    .setLookup(
                            ArrayEntryToken.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("key", "value")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/Token/ArrayEntryToken.php")
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
