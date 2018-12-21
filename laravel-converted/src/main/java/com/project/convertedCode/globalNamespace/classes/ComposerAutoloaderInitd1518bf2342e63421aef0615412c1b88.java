package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.classes.ComposerStaticInitd1518bf2342e63421aef0615412c1b88;
import com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.classes.ClassLoader;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_unregister;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.composerRequired1518bf2342e63421aef0615412c1b88;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_register;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/composer/autoload_real.php

*/

public class ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88 extends RuntimeClassBase {

    public ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        public Object loadClassLoader(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope4 scope = new Scope4();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/composer")
                                .setFile("/vendor/composer/autoload_real.php");
                scope._pClass = assignParameter(args, 0, false);
                if (ZVal.strictEqualityCheck(
                        "Composer\\Autoload\\ClassLoader", "===", scope._pClass)) {
                    env.include(
                            toStringR(env.addRootFilesystemPrefix("/vendor/composer"), env)
                                    + "/ClassLoader.php",
                            stack,
                            runtimeConverterFunctionClassConstants,
                            true,
                            false);
                }

                throw new IncludeEventException(null);
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        public Object getLoader(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope9 scope = new Scope9();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/composer")
                                .setFile("/vendor/composer/autoload_real.php");
                scope.useStaticLoader = null;
                scope.path = null;
                scope.classMap = null;
                scope.file = null;
                scope.loader = null;
                scope.fileIdentifier = null;
                scope.namespace = null;
                scope.includeFiles = null;
                scope.map = null;
                if (ZVal.strictNotEqualityCheck(
                        ZVal.getNull(),
                        "!==",
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88
                                                .RequestStaticProperties
                                                .class)
                                .loader)) {
                    throw new IncludeEventException(
                            ZVal.assign(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .classes
                                                            .ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88
                                                            .RequestStaticProperties
                                                            .class)
                                            .loader));
                }

                function_spl_autoload_register
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(
                                        "ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88",
                                        "loadClassLoader"),
                                true,
                                true);
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88
                                                .RequestStaticProperties
                                                .class)
                                .loader =
                        scope.loader = new ClassLoader(env);
                function_spl_autoload_unregister
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(
                                        "ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88",
                                        "loadClassLoader"));
                scope.useStaticLoader =
                        ZVal.toBool(
                                        ZVal.toBool(ZVal.isGreaterThanOrEqualTo(70211, ">=", 50600))
                                                && ZVal.toBool(
                                                        !function_defined
                                                                .f
                                                                .env(env)
                                                                .call("HHVM_VERSION")
                                                                .getBool()))
                                && ZVal.toBool(
                                        ZVal.toBool(
                                                        !function_function_exists
                                                                .f
                                                                .env(env)
                                                                .call("zend_loader_file_encoded")
                                                                .getBool())
                                                || ZVal.toBool(
                                                        !com.runtimeconverter.runtime.ZVal
                                                                .functionNotFound(
                                                                        "zend_loader_file_encoded")
                                                                .env(env)
                                                                .call()
                                                                .getBool()));
                if (ZVal.isTrue(scope.useStaticLoader)) {
                    env.include(
                            toStringR(env.addRootFilesystemPrefix("/vendor/composer"), env)
                                    + "/autoload_static.php",
                            stack,
                            runtimeConverterFunctionClassConstants,
                            true,
                            true);
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ComposerStaticInitd1518bf2342e63421aef0615412c1b88
                                            .runtimeStaticObject.getInitializer(env, scope.loader));

                } else {
                    scope.map =
                            ZVal.assign(
                                    env.include(
                                            toStringR(
                                                            env.addRootFilesystemPrefix(
                                                                    "/vendor/composer"),
                                                            env)
                                                    + "/autoload_namespaces.php",
                                            stack,
                                            runtimeConverterFunctionClassConstants,
                                            true,
                                            false));
                    for (ZPair zpairResult7 : ZVal.getIterable(scope.map, env, false)) {
                        scope.namespace = ZVal.assign(zpairResult7.getKey());
                        scope.path = ZVal.assign(zpairResult7.getValue());
                        env.callMethod(
                                scope.loader,
                                "set",
                                ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88.class,
                                scope.namespace,
                                scope.path);
                    }

                    scope.map =
                            ZVal.assign(
                                    env.include(
                                            toStringR(
                                                            env.addRootFilesystemPrefix(
                                                                    "/vendor/composer"),
                                                            env)
                                                    + "/autoload_psr4.php",
                                            stack,
                                            runtimeConverterFunctionClassConstants,
                                            true,
                                            false));
                    for (ZPair zpairResult8 : ZVal.getIterable(scope.map, env, false)) {
                        scope.namespace = ZVal.assign(zpairResult8.getKey());
                        scope.path = ZVal.assign(zpairResult8.getValue());
                        env.callMethod(
                                scope.loader,
                                "setPsr4",
                                ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88.class,
                                scope.namespace,
                                scope.path);
                    }

                    scope.classMap =
                            ZVal.assign(
                                    env.include(
                                            toStringR(
                                                            env.addRootFilesystemPrefix(
                                                                    "/vendor/composer"),
                                                            env)
                                                    + "/autoload_classmap.php",
                                            stack,
                                            runtimeConverterFunctionClassConstants,
                                            true,
                                            false));
                    if (ZVal.isTrue(scope.classMap)) {
                        env.callMethod(
                                scope.loader,
                                "addClassMap",
                                ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88.class,
                                scope.classMap);
                    }
                }

                env.callMethod(
                        scope.loader,
                        "register",
                        ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88.class,
                        true);
                if (ZVal.isTrue(scope.useStaticLoader)) {
                    scope.includeFiles =
                            ZVal.assign(
                                    env.getRequestStaticProperties(
                                                    ComposerStaticInitd1518bf2342e63421aef0615412c1b88
                                                            .RequestStaticProperties.class)
                                            .files);

                } else {
                    scope.includeFiles =
                            ZVal.assign(
                                    env.include(
                                            toStringR(
                                                            env.addRootFilesystemPrefix(
                                                                    "/vendor/composer"),
                                                            env)
                                                    + "/autoload_files.php",
                                            stack,
                                            runtimeConverterFunctionClassConstants,
                                            true,
                                            false));
                }

                for (ZPair zpairResult9 : ZVal.getIterable(scope.includeFiles, env, false)) {
                    scope.fileIdentifier = ZVal.assign(zpairResult9.getKey());
                    scope.file = ZVal.assign(zpairResult9.getValue());
                    composerRequired1518bf2342e63421aef0615412c1b88
                            .f
                            .env(env)
                            .call(scope.fileIdentifier, scope.file);
                }

                throw new IncludeEventException(ZVal.assign(scope.loader));
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object loader = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88")
                    .setLookup(
                            ComposerAutoloaderInitd1518bf2342e63421aef0615412c1b88.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("loader")
                    .setFilename("vendor/composer/autoload_real.php")
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

    private static class Scope4 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object _pClass;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("class", this._pClass);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this._pClass = stack.getVariable("class");
        }
    }

    private static class Scope5 implements UpdateRuntimeScopeInterface {

        Object useStaticLoader;
        Object path;
        Object classMap;
        Object file;
        Object loader;
        Object fileIdentifier;
        Object _thisVarAlias;
        Object namespace;
        Object includeFiles;
        Object map;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("useStaticLoader", this.useStaticLoader);
            stack.setVariable("path", this.path);
            stack.setVariable("classMap", this.classMap);
            stack.setVariable("file", this.file);
            stack.setVariable("loader", this.loader);
            stack.setVariable("fileIdentifier", this.fileIdentifier);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("namespace", this.namespace);
            stack.setVariable("includeFiles", this.includeFiles);
            stack.setVariable("map", this.map);
        }

        public void updateScope(RuntimeStack stack) {

            this.useStaticLoader = stack.getVariable("useStaticLoader");
            this.path = stack.getVariable("path");
            this.classMap = stack.getVariable("classMap");
            this.file = stack.getVariable("file");
            this.loader = stack.getVariable("loader");
            this.fileIdentifier = stack.getVariable("fileIdentifier");
            this._thisVarAlias = stack.getVariable("this");
            this.namespace = stack.getVariable("namespace");
            this.includeFiles = stack.getVariable("includeFiles");
            this.map = stack.getVariable("map");
        }
    }

    private static class Scope6 implements UpdateRuntimeScopeInterface {

        Object useStaticLoader;
        Object path;
        Object classMap;
        Object file;
        Object loader;
        Object fileIdentifier;
        Object _thisVarAlias;
        Object namespace;
        Object includeFiles;
        Object map;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("useStaticLoader", this.useStaticLoader);
            stack.setVariable("path", this.path);
            stack.setVariable("classMap", this.classMap);
            stack.setVariable("file", this.file);
            stack.setVariable("loader", this.loader);
            stack.setVariable("fileIdentifier", this.fileIdentifier);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("namespace", this.namespace);
            stack.setVariable("includeFiles", this.includeFiles);
            stack.setVariable("map", this.map);
        }

        public void updateScope(RuntimeStack stack) {

            this.useStaticLoader = stack.getVariable("useStaticLoader");
            this.path = stack.getVariable("path");
            this.classMap = stack.getVariable("classMap");
            this.file = stack.getVariable("file");
            this.loader = stack.getVariable("loader");
            this.fileIdentifier = stack.getVariable("fileIdentifier");
            this._thisVarAlias = stack.getVariable("this");
            this.namespace = stack.getVariable("namespace");
            this.includeFiles = stack.getVariable("includeFiles");
            this.map = stack.getVariable("map");
        }
    }

    private static class Scope7 implements UpdateRuntimeScopeInterface {

        Object useStaticLoader;
        Object path;
        Object classMap;
        Object file;
        Object loader;
        Object fileIdentifier;
        Object _thisVarAlias;
        Object namespace;
        Object includeFiles;
        Object map;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("useStaticLoader", this.useStaticLoader);
            stack.setVariable("path", this.path);
            stack.setVariable("classMap", this.classMap);
            stack.setVariable("file", this.file);
            stack.setVariable("loader", this.loader);
            stack.setVariable("fileIdentifier", this.fileIdentifier);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("namespace", this.namespace);
            stack.setVariable("includeFiles", this.includeFiles);
            stack.setVariable("map", this.map);
        }

        public void updateScope(RuntimeStack stack) {

            this.useStaticLoader = stack.getVariable("useStaticLoader");
            this.path = stack.getVariable("path");
            this.classMap = stack.getVariable("classMap");
            this.file = stack.getVariable("file");
            this.loader = stack.getVariable("loader");
            this.fileIdentifier = stack.getVariable("fileIdentifier");
            this._thisVarAlias = stack.getVariable("this");
            this.namespace = stack.getVariable("namespace");
            this.includeFiles = stack.getVariable("includeFiles");
            this.map = stack.getVariable("map");
        }
    }

    private static class Scope8 implements UpdateRuntimeScopeInterface {

        Object useStaticLoader;
        Object path;
        Object classMap;
        Object file;
        Object loader;
        Object fileIdentifier;
        Object _thisVarAlias;
        Object namespace;
        Object includeFiles;
        Object map;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("useStaticLoader", this.useStaticLoader);
            stack.setVariable("path", this.path);
            stack.setVariable("classMap", this.classMap);
            stack.setVariable("file", this.file);
            stack.setVariable("loader", this.loader);
            stack.setVariable("fileIdentifier", this.fileIdentifier);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("namespace", this.namespace);
            stack.setVariable("includeFiles", this.includeFiles);
            stack.setVariable("map", this.map);
        }

        public void updateScope(RuntimeStack stack) {

            this.useStaticLoader = stack.getVariable("useStaticLoader");
            this.path = stack.getVariable("path");
            this.classMap = stack.getVariable("classMap");
            this.file = stack.getVariable("file");
            this.loader = stack.getVariable("loader");
            this.fileIdentifier = stack.getVariable("fileIdentifier");
            this._thisVarAlias = stack.getVariable("this");
            this.namespace = stack.getVariable("namespace");
            this.includeFiles = stack.getVariable("includeFiles");
            this.map = stack.getVariable("map");
        }
    }

    private static class Scope9 implements UpdateRuntimeScopeInterface {

        Object useStaticLoader;
        Object path;
        Object classMap;
        Object file;
        Object loader;
        Object fileIdentifier;
        Object _thisVarAlias;
        Object namespace;
        Object includeFiles;
        Object map;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("useStaticLoader", this.useStaticLoader);
            stack.setVariable("path", this.path);
            stack.setVariable("classMap", this.classMap);
            stack.setVariable("file", this.file);
            stack.setVariable("loader", this.loader);
            stack.setVariable("fileIdentifier", this.fileIdentifier);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("namespace", this.namespace);
            stack.setVariable("includeFiles", this.includeFiles);
            stack.setVariable("map", this.map);
        }

        public void updateScope(RuntimeStack stack) {

            this.useStaticLoader = stack.getVariable("useStaticLoader");
            this.path = stack.getVariable("path");
            this.classMap = stack.getVariable("classMap");
            this.file = stack.getVariable("file");
            this.loader = stack.getVariable("loader");
            this.fileIdentifier = stack.getVariable("fileIdentifier");
            this._thisVarAlias = stack.getVariable("this");
            this.namespace = stack.getVariable("namespace");
            this.includeFiles = stack.getVariable("includeFiles");
            this.map = stack.getVariable("map");
        }
    }
}
