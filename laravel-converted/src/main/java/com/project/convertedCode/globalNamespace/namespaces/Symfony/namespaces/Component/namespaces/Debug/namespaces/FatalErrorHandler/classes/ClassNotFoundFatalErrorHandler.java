package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.FatalErrorHandler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveDirectoryIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.FatalErrorHandler.classes.FatalErrorHandlerInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.classes.ClassLoader;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes.DebugClassLoader;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.ClassNotFoundException;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/FatalErrorHandler/ClassNotFoundFatalErrorHandler.php

*/

public class ClassNotFoundFatalErrorHandler extends RuntimeClassBase
        implements FatalErrorHandlerInterface {

    public ClassNotFoundFatalErrorHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ClassNotFoundFatalErrorHandler(NoConstructor n) {
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
        int runtimeConverterContinueCount;
        ReferenceContainer error = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object exception = assignParameter(args, 1, false);
        Object prefix = null;
        Object tail = null;
        Object typeName = null;
        Object className = null;
        Object namespaceSeparatorIndex = null;
        Object message = null;
        Object namespacePrefix = null;
        Object candidates = null;
        Object notFoundSuffixLen = null;
        Object notFoundSuffix = null;
        Object fullyQualifiedClassName = null;
        Object messageLen = null;
        Object prefixLen = null;
        messageLen = function_strlen.f.env(env).call(error.arrayGet(env, "message")).value();
        notFoundSuffix = "' not found";
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

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1787 :
                ZVal.getIterable(ZVal.arrayFromList("class", "interface", "trait"), env, true)) {
            typeName = ZVal.assign(zpairResult1787.getValue());
            prefix = toStringR(NamespaceGlobal.ucfirst.env(env).call(typeName).value(), env) + " '";
            prefixLen = function_strlen.f.env(env).call(prefix).value();
            if (ZVal.strictNotEqualityCheck(
                    0,
                    "!==",
                    function_strpos
                            .f
                            .env(env)
                            .call(error.arrayGet(env, "message"), prefix)
                            .value())) {
                continue;
            }

            fullyQualifiedClassName =
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
                                    .call(fullyQualifiedClassName, "\\")
                                    .value())) {
                className =
                        function_substr
                                .f
                                .env(env)
                                .call(fullyQualifiedClassName, ZVal.add(namespaceSeparatorIndex, 1))
                                .value();
                namespacePrefix =
                        function_substr
                                .f
                                .env(env)
                                .call(fullyQualifiedClassName, 0, namespaceSeparatorIndex)
                                .value();
                message =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Attempted to load %s \"%s\" from namespace \"%s\".",
                                        typeName, className, namespacePrefix)
                                .value();
                tail = " for another namespace?";

            } else {
                className = ZVal.assign(fullyQualifiedClassName);
                message =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Attempted to load %s \"%s\" from the global namespace.",
                                        typeName, className)
                                .value();
                tail = "?";
            }

            if (ZVal.isTrue(candidates = this.getClassCandidates(env, className))) {
                tail =
                        toStringR(function_array_pop.f.env(env).call(candidates).value(), env)
                                + "\"?";
                if (ZVal.isTrue(candidates)) {
                    tail =
                            " for e.g. \""
                                    + toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call("\", \"", candidates)
                                                    .value(),
                                            env)
                                    + "\" or \""
                                    + toStringR(tail, env);

                } else {
                    tail = " for \"" + toStringR(tail, env);
                }
            }

            message =
                    toStringR(message, env)
                            + "\nDid you forget a \"use\" statement"
                            + toStringR(tail, env);
            return ZVal.assign(new ClassNotFoundException(env, message, exception));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "string")
    private Object getClassCandidates(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object _pClass = assignParameter(args, 0, false);
        Object path = null;
        Object functions = null;
        Object prefix = null;
        Object paths = null;
        Object classes = null;
        ReferenceContainer function = new BasicReferenceContainer(null);
        if (!function_is_array
                .f
                .env(env)
                .call(functions = NamespaceGlobal.spl_autoload_functions.env(env).call().value())
                .getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        classes = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1788 : ZVal.getIterable(functions, env, true)) {
            function.setObject(ZVal.assign(zpairResult1788.getValue()));
            if (!function_is_array.f.env(env).call(function.getObject()).getBool()) {
                continue;
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            function.arrayGet(env, 0),
                            DebugClassLoader.class,
                            "Symfony\\Component\\Debug\\DebugClassLoader"))) {
                function.setObject(
                        env.callMethod(
                                function.arrayGet(env, 0),
                                "getClassLoader",
                                ClassNotFoundFatalErrorHandler.class));
                if (!function_is_array.f.env(env).call(function.getObject()).getBool()) {
                    continue;
                }
            }

            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    function.arrayGet(env, 0),
                                    ClassLoader.class,
                                    "Composer\\Autoload\\ClassLoader"))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    function.arrayGet(env, 0),
                                    (Class) null,
                                    "SymfonyClassLoader",
                                    env))) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1789 :
                        ZVal.getIterable(
                                env.callMethod(
                                        function.arrayGet(env, 0),
                                        "getPrefixes",
                                        ClassNotFoundFatalErrorHandler.class),
                                env,
                                false)) {
                    prefix = ZVal.assign(zpairResult1789.getKey());
                    paths = ZVal.assign(zpairResult1789.getValue());
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult1790 : ZVal.getIterable(paths, env, true)) {
                        path = ZVal.assign(zpairResult1790.getValue());
                        classes =
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                classes,
                                                this.findClassInPath(env, path, _pClass, prefix))
                                        .value();
                    }
                }
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            function.arrayGet(env, 0),
                            ClassLoader.class,
                            "Composer\\Autoload\\ClassLoader"))) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1791 :
                        ZVal.getIterable(
                                env.callMethod(
                                        function.arrayGet(env, 0),
                                        "getPrefixesPsr4",
                                        ClassNotFoundFatalErrorHandler.class),
                                env,
                                false)) {
                    prefix = ZVal.assign(zpairResult1791.getKey());
                    paths = ZVal.assign(zpairResult1791.getValue());
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult1792 : ZVal.getIterable(paths, env, true)) {
                        path = ZVal.assign(zpairResult1792.getValue());
                        classes =
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                classes,
                                                this.findClassInPath(env, path, _pClass, prefix))
                                        .value();
                    }
                }
            }
        }

        return ZVal.assign(function_array_unique.f.env(env).call(classes).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path", typeHint = "string")
    @ConvertedParameter(index = 1, name = "class", typeHint = "string")
    @ConvertedParameter(index = 2, name = "prefix", typeHint = "string")
    private Object findClassInPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object _pClass = assignParameter(args, 1, false);
        Object prefix = assignParameter(args, 2, false);
        Object filename = null;
        Object file = null;
        ReferenceContainer classes = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(
                path =
                        ZVal.assign(
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        ZVal.isTrue(
                                                                        ternaryExpressionTemp =
                                                                                function_realpath
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                toStringR(
                                                                                                                path,
                                                                                                                env)
                                                                                                        + "/"
                                                                                                        + toStringR(
                                                                                                                NamespaceGlobal
                                                                                                                        .strtr
                                                                                                                        .env(
                                                                                                                                env)
                                                                                                                        .call(
                                                                                                                                prefix,
                                                                                                                                "\\_",
                                                                                                                                "//")
                                                                                                                        .value(),
                                                                                                                env))
                                                                                        .value())
                                                                ? ternaryExpressionTemp
                                                                : function_realpath
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                toStringR(path, env)
                                                                                        + "/"
                                                                                        + toStringR(
                                                                                                function_dirname
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                NamespaceGlobal
                                                                                                                        .strtr
                                                                                                                        .env(
                                                                                                                                env)
                                                                                                                        .call(
                                                                                                                                prefix,
                                                                                                                                "\\_",
                                                                                                                                "//")
                                                                                                                        .value())
                                                                                                        .value(),
                                                                                                env))
                                                                        .value())
                                        ? ternaryExpressionTemp
                                        : function_realpath.f.env(env).call(path).value()))) {
            return ZVal.assign(ZVal.newArray());
        }

        classes.setObject(ZVal.newArray());
        filename = toStringR(_pClass, env) + ".php";
        for (ZPair zpairResult1793 :
                ZVal.getIterable(
                        new RecursiveIteratorIterator(
                                env, new RecursiveDirectoryIterator(env, path, 4096), 0),
                        env,
                        true)) {
            file = ZVal.assign(zpairResult1793.getValue());
            if (ZVal.toBool(
                            ZVal.equalityCheck(
                                    filename,
                                    env.callMethod(
                                            file,
                                            "getFileName",
                                            ClassNotFoundFatalErrorHandler.class)))
                    && ZVal.toBool(
                            _pClass =
                                    this.convertFileToClass(
                                            env,
                                            path,
                                            env.callMethod(
                                                    file,
                                                    "getPathName",
                                                    ClassNotFoundFatalErrorHandler.class),
                                            prefix))) {
                classes.arrayAppend(env).set(_pClass);
            }
        }

        return ZVal.assign(classes.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path", typeHint = "string")
    @ConvertedParameter(index = 1, name = "file", typeHint = "string")
    @ConvertedParameter(index = 2, name = "prefix", typeHint = "string")
    private Object convertFileToClass(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope63 scope = new Scope63();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/debug/FatalErrorHandler")
                            .setFile(
                                    "/vendor/symfony/debug/FatalErrorHandler/ClassNotFoundFatalErrorHandler.php");
            scope.path = assignParameter(args, 0, false);
            scope.file = assignParameter(args, 1, false);
            scope.prefix = assignParameter(args, 2, false);
            scope.candidates = null;
            scope.namespacedClass = null;
            scope.candidate = null;
            scope.candidates =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    scope.namespacedClass =
                                            function_str_replace
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            ZVal.newArray(
                                                                    new ZPair(
                                                                            0,
                                                                            toStringR(
                                                                                            scope.path,
                                                                                            env)
                                                                                    + toStringR(
                                                                                            "/",
                                                                                            env)),
                                                                    new ZPair(1, ".php"),
                                                                    new ZPair(2, "/")),
                                                            ZVal.arrayFromList("", "", "\\"),
                                                            scope.file)
                                                    .value()),
                            new ZPair(
                                    1,
                                    toStringR(scope.prefix, env)
                                            + toStringR(scope.namespacedClass, env)),
                            new ZPair(
                                    2,
                                    toStringR(scope.prefix, env)
                                            + "\\"
                                            + toStringR(scope.namespacedClass, env)),
                            new ZPair(
                                    3,
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("\\", "_", scope.namespacedClass)
                                            .value()),
                            new ZPair(
                                    4,
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "\\",
                                                    "_",
                                                    toStringR(scope.prefix, env)
                                                            + toStringR(scope.namespacedClass, env))
                                            .value()),
                            new ZPair(
                                    5,
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "\\",
                                                    "_",
                                                    toStringR(scope.prefix, env)
                                                            + "\\"
                                                            + toStringR(scope.namespacedClass, env))
                                            .value()));
            if (ZVal.isTrue(scope.prefix)) {
                scope.candidates =
                        function_array_filter
                                .f
                                .env(env)
                                .call(
                                        scope.candidates,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Symfony\\Component\\Debug\\FatalErrorHandler",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "candidate")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object candidate = assignParameter(args, 0, false);
                                                Object prefix = null;
                                                prefix =
                                                        this.contextReferences.getCapturedValue(
                                                                "prefix");
                                                return ZVal.assign(
                                                        ZVal.strictEqualityCheck(
                                                                0,
                                                                "===",
                                                                function_strpos
                                                                        .f
                                                                        .env(env)
                                                                        .call(candidate, prefix)
                                                                        .value()));
                                            }
                                        }.use("prefix", scope.prefix))
                                .value();
            }

            for (ZPair zpairResult1794 : ZVal.getIterable(scope.candidates, env, true)) {
                scope.candidate = ZVal.assign(zpairResult1794.getValue());
                if (ZVal.isTrue(this.classExists(env, scope.candidate))) {
                    throw new IncludeEventException(ZVal.assign(scope.candidate));
                }
            }

            env.include(
                    toStringR(scope.file, env),
                    stack,
                    runtimeConverterFunctionClassConstants,
                    true,
                    true);
            for (ZPair zpairResult1795 : ZVal.getIterable(scope.candidates, env, true)) {
                scope.candidate = ZVal.assign(zpairResult1795.getValue());
                if (ZVal.isTrue(this.classExists(env, scope.candidate))) {
                    throw new IncludeEventException(ZVal.assign(scope.candidate));
                }
            }

            throw new IncludeEventException(ZVal.assign(ZVal.getNull()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "string")
    private Object classExists(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                function_class_exists
                                                        .f
                                                        .env(env)
                                                        .call(_pClass, false)
                                                        .value())
                                        || ZVal.toBool(
                                                NamespaceGlobal.interface_exists
                                                        .env(env)
                                                        .call(_pClass, false)
                                                        .value()))
                        || ZVal.toBool(
                                NamespaceGlobal.trait_exists
                                        .env(env)
                                        .call(_pClass, false)
                                        .value()));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Debug\\FatalErrorHandler\\ClassNotFoundFatalErrorHandler";

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
                            "Symfony\\Component\\Debug\\FatalErrorHandler\\ClassNotFoundFatalErrorHandler")
                    .setLookup(
                            ClassNotFoundFatalErrorHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/debug/FatalErrorHandler/ClassNotFoundFatalErrorHandler.php")
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

    private static class Scope63 implements UpdateRuntimeScopeInterface {

        Object candidates;
        Object path;
        Object namespacedClass;
        Object candidate;
        Object file;
        Object prefix;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("candidates", this.candidates);
            stack.setVariable("path", this.path);
            stack.setVariable("namespacedClass", this.namespacedClass);
            stack.setVariable("candidate", this.candidate);
            stack.setVariable("file", this.file);
            stack.setVariable("prefix", this.prefix);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.candidates = stack.getVariable("candidates");
            this.path = stack.getVariable("path");
            this.namespacedClass = stack.getVariable("namespacedClass");
            this.candidate = stack.getVariable("candidate");
            this.file = stack.getVariable("file");
            this.prefix = stack.getVariable("prefix");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
