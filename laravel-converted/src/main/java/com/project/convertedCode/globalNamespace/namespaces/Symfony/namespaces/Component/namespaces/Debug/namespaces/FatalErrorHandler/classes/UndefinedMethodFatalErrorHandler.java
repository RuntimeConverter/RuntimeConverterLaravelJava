package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.FatalErrorHandler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.UndefinedMethodException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.FatalErrorHandler.classes.FatalErrorHandlerInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/FatalErrorHandler/UndefinedMethodFatalErrorHandler.php

*/

public class UndefinedMethodFatalErrorHandler extends RuntimeClassBase
        implements FatalErrorHandlerInterface {

    public UndefinedMethodFatalErrorHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public UndefinedMethodFatalErrorHandler(NoConstructor n) {
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
        ReferenceContainer candidates = new BasicReferenceContainer(null);
        Object last = null;
        Object methods = null;
        Object methodName = null;
        Object className = null;
        Object message = null;
        Object lev = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object definedMethodName = null;
        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^Call to undefined method (.*)::(.*)\\(\\)$/",
                        error.arrayGet(env, "message"),
                        matches.getObject());
        if (!ZVal.isTrue(matches.getObject())) {
            return null;
        }

        className = ZVal.assign(matches.arrayGet(env, 1));
        methodName = ZVal.assign(matches.arrayGet(env, 2));
        message =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "Attempted to call an undefined method named \"%s\" of class \"%s\".",
                                methodName, className)
                        .value();
        if (ZVal.toBool(!function_class_exists.f.env(env).call(className).getBool())
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(),
                                "===",
                                methods =
                                        NamespaceGlobal.get_class_methods
                                                .env(env)
                                                .call(className)
                                                .value()))) {
            return ZVal.assign(new UndefinedMethodException(env, message, exception));
        }

        candidates.setObject(ZVal.newArray());
        for (ZPair zpairResult1798 : ZVal.getIterable(methods, env, true)) {
            definedMethodName = ZVal.assign(zpairResult1798.getValue());
            lev = NamespaceGlobal.levenshtein.env(env).call(methodName, definedMethodName).value();
            if (ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    lev,
                                    "<=",
                                    ZVal.divide(
                                            function_strlen.f.env(env).call(methodName).value(),
                                            3)))
                    || ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(definedMethodName, methodName)
                                            .value()))) {
                candidates.arrayAppend(env).set(definedMethodName);
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

        return ZVal.assign(new UndefinedMethodException(env, message, exception));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Debug\\FatalErrorHandler\\UndefinedMethodFatalErrorHandler";

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
                            "Symfony\\Component\\Debug\\FatalErrorHandler\\UndefinedMethodFatalErrorHandler")
                    .setLookup(
                            UndefinedMethodFatalErrorHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/debug/FatalErrorHandler/UndefinedMethodFatalErrorHandler.php")
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
