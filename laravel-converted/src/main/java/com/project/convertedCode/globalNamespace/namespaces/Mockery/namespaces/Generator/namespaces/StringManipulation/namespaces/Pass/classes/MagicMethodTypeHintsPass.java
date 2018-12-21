package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.Pass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/MagicMethodTypeHintsPass.php

*/

public class MagicMethodTypeHintsPass extends RuntimeClassBase implements Pass {

    public Object mockMagicMethods =
            ZVal.arrayFromList(
                    "__construct",
                    "__destruct",
                    "__call",
                    "__callStatic",
                    "__get",
                    "__set",
                    "__isset",
                    "__unset",
                    "__sleep",
                    "__wakeup",
                    "__toString",
                    "__invoke",
                    "__set_state",
                    "__clone",
                    "__debugInfo");

    public MagicMethodTypeHintsPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MagicMethodTypeHintsPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(
        index = 1,
        name = "config",
        typeHint = "Mockery\\Generator\\MockConfiguration"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object method = null;
        Object _pInterface = null;
        Object magicMethods = null;
        magicMethods =
                this.getMagicMethods(
                        env,
                        env.callMethod(config, "getTargetClass", MagicMethodTypeHintsPass.class));
        for (ZPair zpairResult714 :
                ZVal.getIterable(
                        env.callMethod(
                                config, "getTargetInterfaces", MagicMethodTypeHintsPass.class),
                        env,
                        true)) {
            _pInterface = ZVal.assign(zpairResult714.getValue());
            magicMethods =
                    function_array_merge
                            .f
                            .env(env)
                            .call(magicMethods, this.getMagicMethods(env, _pInterface))
                            .value();
        }

        for (ZPair zpairResult715 : ZVal.getIterable(magicMethods, env, true)) {
            method = ZVal.assign(zpairResult715.getValue());
            code = this.applyMagicTypeHints(env, code, method);
        }

        return ZVal.assign(code);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "Mockery\\Generator\\TargetClassInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getMagicMethods(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass")
                        .setFile(
                                "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/MagicMethodTypeHintsPass.php");
        Object _pClass = assignParameter(args, 0, true);
        if (null == _pClass) {
            _pClass = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(_pClass).getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        _pClass, "getMethods", MagicMethodTypeHintsPass.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Mockery\\Generator\\StringManipulation\\Pass",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(
                                        index = 0,
                                        name = "method",
                                        typeHint = "Mockery\\Generator\\Method"
                                    )
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object method = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                function_in_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        method,
                                                                        "getName",
                                                                        MagicMethodTypeHintsPass
                                                                                .class),
                                                                MagicMethodTypeHintsPass.this
                                                                        .mockMagicMethods)
                                                        .value());
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "method", typeHint = "Mockery\\Generator\\Method")
    private Object applyMagicTypeHints(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object namedParameters = null;
        if (ZVal.isTrue(this.isMethodWithinCode(env, code, method))) {
            namedParameters = this.getOriginalParameters(env, code, method);
            code =
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    this.getDeclarationRegex(
                                            env,
                                            env.callMethod(
                                                    method,
                                                    "getName",
                                                    MagicMethodTypeHintsPass.class)),
                                    this.getMethodDeclaration(env, method, namedParameters),
                                    code)
                            .value();
        }

        return ZVal.assign(code);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "method", typeHint = "Mockery\\Generator\\Method")
    private Object isMethodWithinCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.equalityCheck(
                        function_preg_match
                                .f
                                .env(env)
                                .call(
                                        this.getDeclarationRegex(
                                                env,
                                                env.callMethod(
                                                        method,
                                                        "getName",
                                                        MagicMethodTypeHintsPass.class)),
                                        code)
                                .value(),
                        1));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "method", typeHint = "Mockery\\Generator\\Method")
    private Object getOriginalParameters(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        ReferenceContainer parameterMatches = new BasicReferenceContainer(null);
        Object parameterNames = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object groupMatches = null;
        matches.setObject(ZVal.newArray());
        parameterMatches.setObject(ZVal.newArray());
        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        this.getDeclarationRegex(
                                env,
                                env.callMethod(method, "getName", MagicMethodTypeHintsPass.class)),
                        code,
                        matches.getObject());
        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(matches.getObject()).value(), '>', 0)) {
            function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, parameterMatches))
                    .call(
                            "/(?<=\\$)(\\w+)+/i",
                            matches.arrayGet(env, 0),
                            parameterMatches.getObject());
        }

        groupMatches = function_end.f.env(env).call(parameterMatches.getObject()).value();
        parameterNames =
                ZVal.assign(
                        function_is_array.f.env(env).call(groupMatches).getBool()
                                ? groupMatches
                                : ZVal.newArray(new ZPair(0, groupMatches)));
        return ZVal.assign(parameterNames);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "Mockery\\Generator\\Method")
    @ConvertedParameter(index = 1, name = "namedParameters", typeHint = "array")
    private Object getMethodDeclaration(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        ReferenceContainer namedParameters =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object parameter = null;
        Object name = null;
        Object index = null;
        Object declaration = null;
        Object returnType = null;
        declaration = "public";
        declaration =
                toStringR(declaration, env)
                        + toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        method,
                                                        "isStatic",
                                                        MagicMethodTypeHintsPass.class))
                                        ? " static"
                                        : "",
                                env);
        declaration =
                toStringR(declaration, env)
                        + " function "
                        + toStringR(
                                env.callMethod(method, "getName", MagicMethodTypeHintsPass.class),
                                env)
                        + "(";
        for (ZPair zpairResult716 :
                ZVal.getIterable(
                        env.callMethod(method, "getParameters", MagicMethodTypeHintsPass.class),
                        env,
                        false)) {
            index = ZVal.assign(zpairResult716.getKey());
            parameter = ZVal.assign(zpairResult716.getValue());
            declaration =
                    toStringR(declaration, env)
                            + toStringR(
                                    env.callMethod(
                                            parameter,
                                            "getTypeHintAsString",
                                            MagicMethodTypeHintsPass.class),
                                    env)
                            + " ";
            name =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, namedParameters, env, index)
                                    ? namedParameters.arrayGet(env, index)
                                    : env.callMethod(
                                            parameter, "getName", MagicMethodTypeHintsPass.class));
            declaration = toStringR(declaration, env) + "$" + toStringR(name, env);
            declaration = toStringR(declaration, env) + ",";
        }

        declaration = function_rtrim.f.env(env).call(declaration, ",").value();
        declaration = toStringR(declaration, env) + ") ";
        returnType = env.callMethod(method, "getReturnType", MagicMethodTypeHintsPass.class);
        if (!ZVal.isEmpty(returnType)) {
            declaration = toStringR(declaration, env) + ": " + toStringR(returnType, env);
        }

        return ZVal.assign(declaration);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    private Object getDeclarationRegex(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, false);
        return ZVal.assign(
                "/public\\s+(?:static\\s+)?function\\s+"
                        + toStringR(methodName, env)
                        + "\\s*\\(.*\\)\\s*(?=\\{)/i");
    }

    public static final Object CONST_class =
            "Mockery\\Generator\\StringManipulation\\Pass\\MagicMethodTypeHintsPass";

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
                    .setName(
                            "Mockery\\Generator\\StringManipulation\\Pass\\MagicMethodTypeHintsPass")
                    .setLookup(
                            MagicMethodTypeHintsPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("mockMagicMethods")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/MagicMethodTypeHintsPass.php")
                    .addInterface("Mockery\\Generator\\StringManipulation\\Pass\\Pass")
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
