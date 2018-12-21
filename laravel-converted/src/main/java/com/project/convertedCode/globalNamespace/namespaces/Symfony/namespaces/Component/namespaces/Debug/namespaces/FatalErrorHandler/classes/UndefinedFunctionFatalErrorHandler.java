package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.FatalErrorHandler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.FatalErrorHandler.classes.FatalErrorHandlerInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_defined_functions;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.UndefinedFunctionException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/FatalErrorHandler/UndefinedFunctionFatalErrorHandler.php

*/

public class UndefinedFunctionFatalErrorHandler extends RuntimeClassBase
        implements FatalErrorHandlerInterface {

    public UndefinedFunctionFatalErrorHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public UndefinedFunctionFatalErrorHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "error", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "exception",
        typeHint = "Symfony\\Component\\Debug\\Exception\\FatalErrorException"
    )
    public Object handleError(RuntimeEnv env, Object... args) {
        ReferenceContainer error = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object exception = assignParameter(args, 1, false);
        Object fullyQualifiedFunctionName = null;
        Object last = null;
        Object functionName = null;
        Object prefix = null;
        Object definedFunctionNameBasename = null;
        Object namespaceSeparatorIndex = null;
        Object definedFunctionName = null;
        Object definedFunctionNames = null;
        Object message = null;
        Object type = null;
        Object namespacePrefix = null;
        ReferenceContainer candidates = new BasicReferenceContainer(null);
        Object notFoundSuffixLen = null;
        Object notFoundSuffix = null;
        Object messageLen = null;
        Object prefixLen = null;
        messageLen = function_strlen.f.env(env).call(error.arrayGet(env, "message")).value();
        notFoundSuffix = "()";
        notFoundSuffixLen = function_strlen.f.env(env).call(notFoundSuffix).value();
        if (ZVal.isGreaterThan(notFoundSuffixLen, '>', messageLen)) {
            return null;
        }

        if (ZVal.strictNotEqualityCheck(
                0,
                "!==",
                NamespaceGlobal.substr_compare
                        .env(env)
                        .call(
                                error.arrayGet(env, "message"),
                                notFoundSuffix,
                                ZVal.minusSign(notFoundSuffixLen))
                        .value())) {
            return null;
        }

        prefix = "Call to undefined function ";
        prefixLen = function_strlen.f.env(env).call(prefix).value();
        if (ZVal.strictNotEqualityCheck(
                0,
                "!==",
                function_strpos.f.env(env).call(error.arrayGet(env, "message"), prefix).value())) {
            return null;
        }

        fullyQualifiedFunctionName =
                function_substr
                        .f
                        .env(env)
                        .call(
                                error.arrayGet(env, "message"),
                                prefixLen,
                                ZVal.minusSign(notFoundSuffixLen))
                        .value();
        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                namespaceSeparatorIndex =
                        NamespaceGlobal.strrpos
                                .env(env)
                                .call(fullyQualifiedFunctionName, "\\")
                                .value())) {
            functionName =
                    function_substr
                            .f
                            .env(env)
                            .call(fullyQualifiedFunctionName, ZVal.add(namespaceSeparatorIndex, 1))
                            .value();
            namespacePrefix =
                    function_substr
                            .f
                            .env(env)
                            .call(fullyQualifiedFunctionName, 0, namespaceSeparatorIndex)
                            .value();
            message =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Attempted to call function \"%s\" from namespace \"%s\".",
                                    functionName, namespacePrefix)
                            .value();

        } else {
            functionName = ZVal.assign(fullyQualifiedFunctionName);
            message =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Attempted to call function \"%s\" from the global namespace.",
                                    functionName)
                            .value();
        }

        candidates.setObject(ZVal.newArray());
        for (ZPair zpairResult1796 :
                ZVal.getIterable(
                        function_get_defined_functions.f.env(env).call().value(), env, false)) {
            type = ZVal.assign(zpairResult1796.getKey());
            definedFunctionNames = ZVal.assign(zpairResult1796.getValue());
            for (ZPair zpairResult1797 : ZVal.getIterable(definedFunctionNames, env, true)) {
                definedFunctionName = ZVal.assign(zpairResult1797.getValue());
                if (ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        namespaceSeparatorIndex =
                                NamespaceGlobal.strrpos
                                        .env(env)
                                        .call(definedFunctionName, "\\")
                                        .value())) {
                    definedFunctionNameBasename =
                            function_substr
                                    .f
                                    .env(env)
                                    .call(definedFunctionName, ZVal.add(namespaceSeparatorIndex, 1))
                                    .value();

                } else {
                    definedFunctionNameBasename = ZVal.assign(definedFunctionName);
                }

                if (ZVal.strictEqualityCheck(definedFunctionNameBasename, "===", functionName)) {
                    candidates.arrayAppend(env).set("\\" + toStringR(definedFunctionName, env));
                }
            }
        }

        if (ZVal.isTrue(candidates.getObject())) {
            function_sort.f.env(env).call(candidates.getObject());
            last =
                    toStringR(
                                    function_array_pop
                                            .f
                                            .env(env)
                                            .call(candidates.getObject())
                                            .value(),
                                    env)
                            + "\"?";
            if (ZVal.isTrue(candidates.getObject())) {
                candidates.setObject(
                        "e.g. \""
                                + toStringR(
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call("\", \"", candidates.getObject())
                                                .value(),
                                        env)
                                + "\" or \""
                                + toStringR(last, env));

            } else {
                candidates.setObject("\"" + toStringR(last, env));
            }

            message =
                    toStringR(message, env)
                            + "\nDid you mean to call "
                            + toStringR(candidates.getObject(), env);
        }

        return ZVal.assign(new UndefinedFunctionException(env, message, exception));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Debug\\FatalErrorHandler\\UndefinedFunctionFatalErrorHandler";

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
                            "Symfony\\Component\\Debug\\FatalErrorHandler\\UndefinedFunctionFatalErrorHandler")
                    .setLookup(
                            UndefinedFunctionFatalErrorHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/debug/FatalErrorHandler/UndefinedFunctionFatalErrorHandler.php")
                    .addInterface(
                            "Symfony\\Component\\Debug\\FatalErrorHandler\\FatalErrorHandlerInterface")
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
