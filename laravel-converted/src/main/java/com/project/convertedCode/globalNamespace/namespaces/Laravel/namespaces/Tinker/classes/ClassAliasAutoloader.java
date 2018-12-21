package com.project.convertedCode.globalNamespace.namespaces.Laravel.namespaces.Tinker.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_unregister;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_alias;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_register;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.functions.config;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/tinker/src/ClassAliasAutoloader.php

*/

public class ClassAliasAutoloader extends RuntimeClassBase {

    public Object shell = null;

    public Object classes = ZVal.newArray();

    public ClassAliasAutoloader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassAliasAutoloader.class) {
            this.__construct(env, args);
        }
    }

    public ClassAliasAutoloader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    @ConvertedParameter(index = 1, name = "classMapPath")
    public Object __construct(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope32 scope = new Scope32();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/tinker/src")
                            .setFile("/vendor/laravel/tinker/src/ClassAliasAutoloader.php");
            int runtimeConverterContinueCount;
            scope.shell = assignParameter(args, 0, false);
            scope.classMapPath = assignParameter(args, 1, false);
            scope.excludedAliases = null;
            scope.path = null;
            scope.classes = null;
            scope.name = null;
            scope.vendorPath = null;
            scope._pClass = null;
            this.shell = scope.shell;
            scope.vendorPath =
                    function_dirname
                            .f
                            .env(env)
                            .call(function_dirname.f.env(env).call(scope.classMapPath).value())
                            .value();
            scope.classes =
                    ZVal.assign(
                            env.include(
                                    toStringR(scope.classMapPath, env),
                                    stack,
                                    runtimeConverterFunctionClassConstants,
                                    true,
                                    false));
            scope.excludedAliases =
                    collect.f
                            .env(env)
                            .call(
                                    config.f
                                            .env(env)
                                            .call("tinker.dont_alias", ZVal.newArray())
                                            .value())
                            .value();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult651 : ZVal.getIterable(scope.classes, env, false)) {
                scope._pClass = ZVal.assign(zpairResult651.getKey());
                scope.path = ZVal.assign(zpairResult651.getValue());
                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        Str.runtimeStaticObject.contains(env, scope._pClass, "\\")))
                        || ZVal.toBool(
                                Str.runtimeStaticObject.startsWith(
                                        env, scope.path, scope.vendorPath))) {
                    continue;
                }

                if (!ZVal.isTrue(
                        env.callMethod(
                                env.callMethod(
                                        scope.excludedAliases,
                                        "filter",
                                        ClassAliasAutoloader.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Laravel\\Tinker",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "alias")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object alias = assignParameter(args, 0, false);
                                                Object _pClass = null;
                                                _pClass =
                                                        this.contextReferences.getCapturedValue(
                                                                "class");
                                                return ZVal.assign(
                                                        Str.runtimeStaticObject.startsWith(
                                                                env, _pClass, alias));
                                            }
                                        }.use("class", scope._pClass)),
                                "isEmpty",
                                ClassAliasAutoloader.class))) {
                    continue;
                }

                scope.name = class_basename.f.env(env).call(scope._pClass).value();
                if (!arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(scope._thisVarAlias, "classes", env),
                        env,
                        scope.name)) {
                    new ReferenceClassProperty(scope._thisVarAlias, "classes", env)
                            .arrayAccess(env, scope.name)
                            .set(scope._pClass);
                }
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object aliasClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object fullName = null;
        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, _pClass, "\\"))) {
            return null;
        }

        fullName =
                ZVal.assign(
                        arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "classes", env),
                                        env,
                                        _pClass)
                                ? new ReferenceClassProperty(this, "classes", env)
                                        .arrayGet(env, _pClass)
                                : false);
        if (ZVal.isTrue(fullName)) {
            env.callMethod(
                    this.shell,
                    "writeStdout",
                    ClassAliasAutoloader.class,
                    "[!] Aliasing '"
                            + toStringR(_pClass, env)
                            + "' to '"
                            + toStringR(fullName, env)
                            + "' for this Tinker session.\n");
            function_class_alias.f.env(env).call(fullName, _pClass);
        }

        return null;
    }

    @ConvertedMethod
    public Object unregister(RuntimeEnv env, Object... args) {
        function_spl_autoload_unregister
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "aliasClass")));
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        this.unregister(env);
        return null;
    }

    public static final Object CONST_class = "Laravel\\Tinker\\ClassAliasAutoloader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
        @ConvertedParameter(index = 1, name = "classMapPath")
        public Object register(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/tinker/src")
                            .setFile("/vendor/laravel/tinker/src/ClassAliasAutoloader.php");
            Object shell = assignParameter(args, 0, false);
            Object classMapPath = assignParameter(args, 1, false);
            return ZVal.assign(
                    tap.f
                            .env(env)
                            .call(
                                    env.createNewWithLateStaticBindings(this, shell, classMapPath),
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Laravel\\Tinker",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "loader")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object loader = assignParameter(args, 0, false);
                                            function_spl_autoload_register
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            ZVal.newArray(
                                                                    new ZPair(0, loader),
                                                                    new ZPair(1, "aliasClass")));
                                            return null;
                                        }
                                    })
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Laravel\\Tinker\\ClassAliasAutoloader")
                    .setLookup(
                            ClassAliasAutoloader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("classes", "shell")
                    .setFilename("vendor/laravel/tinker/src/ClassAliasAutoloader.php")
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

    private static class Scope32 implements UpdateRuntimeScopeInterface {

        Object excludedAliases;
        Object path;
        Object classMapPath;
        Object shell;
        Object classes;
        Object _thisVarAlias;
        Object name;
        Object vendorPath;
        Object _pClass;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("excludedAliases", this.excludedAliases);
            stack.setVariable("path", this.path);
            stack.setVariable("classMapPath", this.classMapPath);
            stack.setVariable("shell", this.shell);
            stack.setVariable("classes", this.classes);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("name", this.name);
            stack.setVariable("vendorPath", this.vendorPath);
            stack.setVariable("class", this._pClass);
        }

        public void updateScope(RuntimeStack stack) {

            this.excludedAliases = stack.getVariable("excludedAliases");
            this.path = stack.getVariable("path");
            this.classMapPath = stack.getVariable("classMapPath");
            this.shell = stack.getVariable("shell");
            this.classes = stack.getVariable("classes");
            this._thisVarAlias = stack.getVariable("this");
            this.name = stack.getVariable("name");
            this.vendorPath = stack.getVariable("vendorPath");
            this._pClass = stack.getVariable("class");
        }
    }
}
