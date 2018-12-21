package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Context.php

*/

public class Context extends RuntimeClassBase {

    public Object scopeVariables = ZVal.newArray();

    public Object commandScopeVariables = ZVal.newArray();

    public Object returnValue = null;

    public Object lastException = null;

    public Object lastStdout = null;

    public Object boundObject = null;

    public Object boundClass = null;

    public Context(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Context(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object get(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object name = assignParameter(args, 0, false);
        SwitchEnumType76 switchVariable76 =
                ZVal.getEnum(
                        name,
                        SwitchEnumType76.DEFAULT_CASE,
                        SwitchEnumType76.STRING__,
                        "_",
                        SwitchEnumType76.STRING__e,
                        "_e",
                        SwitchEnumType76.STRING___out,
                        "__out",
                        SwitchEnumType76.STRING_this,
                        "this",
                        SwitchEnumType76.STRING___function,
                        "__function",
                        SwitchEnumType76.STRING___method,
                        "__method",
                        SwitchEnumType76.STRING___class,
                        "__class",
                        SwitchEnumType76.STRING___namespace,
                        "__namespace",
                        SwitchEnumType76.STRING___file,
                        "__file",
                        SwitchEnumType76.STRING___line,
                        "__line",
                        SwitchEnumType76.STRING___dir,
                        "__dir");
        switch (switchVariable76) {
            case STRING__:
                return ZVal.assign(this.returnValue);
            case STRING__e:
                if (ZVal.isset(this.lastException)) {
                    return ZVal.assign(this.lastException);
                }

                break;
            case STRING___out:
                if (ZVal.isset(this.lastStdout)) {
                    return ZVal.assign(this.lastStdout);
                }

                break;
            case STRING_this:
                if (ZVal.isset(this.boundObject)) {
                    return ZVal.assign(this.boundObject);
                }

                break;
            case STRING___function:
            case STRING___method:
            case STRING___class:
            case STRING___namespace:
            case STRING___file:
            case STRING___line:
            case STRING___dir:
                if (function_array_key_exists
                        .f
                        .env(env)
                        .call(name, this.commandScopeVariables)
                        .getBool()) {
                    return ZVal.assign(
                            new ReferenceClassProperty(this, "commandScopeVariables", env)
                                    .arrayGet(env, name));
                }

                break;
            case DEFAULT_CASE:
                if (function_array_key_exists
                        .f
                        .env(env)
                        .call(name, this.scopeVariables)
                        .getBool()) {
                    return ZVal.assign(
                            new ReferenceClassProperty(this, "scopeVariables", env)
                                    .arrayGet(env, name));
                }

                break;
        }
        ;
        throw ZVal.getException(
                env,
                new InvalidArgumentException(env, "Unknown variable: $" + toStringR(name, env)));
    }

    @ConvertedMethod
    public Object getAll(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(this.scopeVariables, this.getSpecialVariables(env))
                        .value());
    }

    @ConvertedMethod
    public Object getSpecialVariables(RuntimeEnv env, Object... args) {
        ReferenceContainer vars = new BasicReferenceContainer(null);
        vars.setObject(ZVal.newArray(new ZPair("_", this.returnValue)));
        if (ZVal.isset(this.lastException)) {
            vars.arrayAccess(env, "_e").set(this.lastException);
        }

        if (ZVal.isset(this.lastStdout)) {
            vars.arrayAccess(env, "__out").set(this.lastStdout);
        }

        if (ZVal.isset(this.boundObject)) {
            vars.arrayAccess(env, "this").set(this.boundObject);
        }

        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(vars.getObject(), this.commandScopeVariables)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "vars", typeHint = "array")
    public Object setAll(RuntimeEnv env, Object... args) {
        ReferenceContainer vars = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object key = null;
        for (ZPair zpairResult1391 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Psy
                                                .classes
                                                .Context
                                                .RequestStaticProperties
                                                .class)
                                .specialNames,
                        env,
                        true)) {
            key = ZVal.assign(zpairResult1391.getValue());
            arrayActionR(ArrayAction.UNSET, vars, env, key);
        }

        for (ZPair zpairResult1392 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Psy
                                                .classes
                                                .Context
                                                .RequestStaticProperties
                                                .class)
                                .commandScopeNames,
                        env,
                        true)) {
            key = ZVal.assign(zpairResult1392.getValue());
            arrayActionR(ArrayAction.UNSET, vars, env, key);
        }

        this.scopeVariables = vars.getObject();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setReturnValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.returnValue = value;
        return null;
    }

    @ConvertedMethod
    public Object getReturnValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.returnValue);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    public Object setLastException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        this.lastException = e;
        return null;
    }

    @ConvertedMethod
    public Object getLastException(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.lastException)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "No most-recent exception"));
        }

        return ZVal.assign(this.lastException);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lastStdout")
    public Object setLastStdout(RuntimeEnv env, Object... args) {
        Object lastStdout = assignParameter(args, 0, false);
        this.lastStdout = lastStdout;
        return null;
    }

    @ConvertedMethod
    public Object getLastStdout(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.lastStdout)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "No most-recent output"));
        }

        return ZVal.assign(this.lastStdout);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "boundObject")
    public Object setBoundObject(RuntimeEnv env, Object... args) {
        Object boundObject = assignParameter(args, 0, false);
        this.boundObject =
                function_is_object.f.env(env).call(boundObject).getBool()
                        ? boundObject
                        : ZVal.getNull();
        this.boundClass = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object getBoundObject(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.boundObject);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "boundClass")
    public Object setBoundClass(RuntimeEnv env, Object... args) {
        Object boundClass = assignParameter(args, 0, false);
        this.boundClass =
                ZVal.toBool(function_is_string.f.env(env).call(boundClass).value())
                                && ZVal.toBool(ZVal.strictNotEqualityCheck(boundClass, "!==", ""))
                        ? boundClass
                        : ZVal.getNull();
        this.boundObject = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object getBoundClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.boundClass);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commandScopeVariables", typeHint = "array")
    public Object setCommandScopeVariables(RuntimeEnv env, Object... args) {
        Object commandScopeVariables = assignParameter(args, 0, false);
        ReferenceContainer vars = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        vars.setObject(ZVal.newArray());
        for (ZPair zpairResult1393 : ZVal.getIterable(commandScopeVariables, env, false)) {
            key = ZVal.assign(zpairResult1393.getKey());
            value = ZVal.assign(zpairResult1393.getValue());
            if (ZVal.toBool(function_is_scalar.f.env(env).call(value).value())
                    && ZVal.toBool(
                            function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            key,
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Psy
                                                                    .classes
                                                                    .Context
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .commandScopeNames)
                                    .value())) {
                vars.arrayAccess(env, key).set(value);
            }
        }

        this.commandScopeVariables = vars.getObject();
        return null;
    }

    @ConvertedMethod
    public Object getCommandScopeVariables(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.commandScopeVariables);
    }

    @ConvertedMethod
    public Object getUnusedCommandScopeVariableNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_diff
                        .f
                        .env(env)
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Psy
                                                        .classes
                                                        .Context
                                                        .RequestStaticProperties
                                                        .class)
                                        .commandScopeNames,
                                function_array_keys
                                        .f
                                        .env(env)
                                        .call(this.commandScopeVariables)
                                        .value())
                        .value());
    }

    public static final Object CONST_class = "Psy\\Context";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object isSpecialVariableName(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.toBool(
                                    function_in_array
                                            .f
                                            .env(env)
                                            .call(
                                                    name,
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Psy
                                                                            .classes
                                                                            .Context
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .specialNames)
                                            .value())
                            || ZVal.toBool(
                                    function_in_array
                                            .f
                                            .env(env)
                                            .call(
                                                    name,
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Psy
                                                                            .classes
                                                                            .Context
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .commandScopeNames)
                                            .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object specialNames = ZVal.arrayFromList("_", "_e", "__out", "__psysh__", "this");

        public Object commandScopeNames =
                ZVal.arrayFromList(
                        "__function",
                        "__method",
                        "__class",
                        "__namespace",
                        "__file",
                        "__line",
                        "__dir");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Context")
                    .setLookup(
                            Context.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "boundClass",
                            "boundObject",
                            "commandScopeVariables",
                            "lastException",
                            "lastStdout",
                            "returnValue",
                            "scopeVariables")
                    .setStaticPropertyNames("commandScopeNames", "specialNames")
                    .setFilename("vendor/psy/psysh/src/Context.php")
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

    private enum SwitchEnumType76 {
        STRING__,
        STRING__e,
        STRING___out,
        STRING_this,
        STRING___function,
        STRING___method,
        STRING___class,
        STRING___namespace,
        STRING___file,
        STRING___line,
        STRING___dir,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
