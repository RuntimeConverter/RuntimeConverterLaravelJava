package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.namespaces.Configurator.classes.RoutingConfigurator;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes.ProtectedPhpFileLoader;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/PhpFileLoader.php

*/

public class PhpFileLoader extends RuntimeClassBase {

    public PhpFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PhpFileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/routing/Loader")
                        .setFile("/vendor/symfony/routing/Loader/PhpFileLoader.php");
        Object file = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object result = null;
        ReferenceContainer path = new BasicReferenceContainer(null);
        Object load = null;
        Object loader = null;
        Object collection = null;
        path.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("locator").value(),
                        "locate",
                        PhpFileLoader.class,
                        file));
        env.callMethod(
                this,
                "setCurrentDir",
                PhpFileLoader.class,
                function_dirname.f.env(env).call(path.getObject()).value());
        loader = ZVal.assign(this);
        load =
                Closure.runtimeStaticObject.bind(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\Routing\\Loader",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "file")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ContextConstants runtimeConverterFunctionClassConstants =
                                        new ContextConstants()
                                                .setDir("/vendor/symfony/routing/Loader")
                                                .setFile(
                                                        "/vendor/symfony/routing/Loader/PhpFileLoader.php");
                                RuntimeStack stack = new RuntimeStack();
                                stack.setupGlobals(env);
                                Scope70 scope = new Scope70();
                                stack.pushScope(scope);
                                scope._thisVarAlias = this;
                                try {
                                    Object _closureThisVar = this.getClosureThisVar();
                                    scope.file = assignParameter(args, 0, false);
                                    scope.loader = null;
                                    scope.loader =
                                            this.contextReferences.getCapturedValue("loader");
                                    throw new IncludeEventException(
                                            ZVal.assign(
                                                    env.include(
                                                            toStringR(scope.file, env),
                                                            stack,
                                                            runtimeConverterFunctionClassConstants,
                                                            false,
                                                            false)));
                                } catch (IncludeEventException runtimeConverterIncludeException) {
                                    return runtimeConverterIncludeException.returnValue;
                                }
                            }
                        }.use("loader", loader),
                        ZVal.getNull(),
                        ProtectedPhpFileLoader.CONST_class);
        result =
                env.callFunctionDynamic(
                                load,
                                new RuntimeArgsWithReferences().add(0, path),
                                path.getObject())
                        .value();
        if (ZVal.toBool(function_is_object.f.env(env).call(result).value())
                && ZVal.toBool(function_is_callable.f.env(env).call(result).value())) {
            collection = new RouteCollection(env);
            env.callFunctionDynamic(
                    result,
                    new RuntimeArgsWithReferences().add(1, new ReadOnlyReferenceContainer(this)),
                    new RoutingConfigurator(env, collection, this, path.getObject(), file),
                    this);

        } else {
            collection = ZVal.assign(result);
        }

        env.callMethod(
                collection,
                "addResource",
                PhpFileLoader.class,
                env.createNew(ZVal.resolveClassAlias(env, "FileResource"), path.getObject()));
        return ZVal.assign(collection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(function_is_string.f.env(env).call(resource).value())
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "php",
                                                        "===",
                                                        NamespaceGlobal.pathinfo
                                                                .env(env)
                                                                .call(resource, 4)
                                                                .value())))
                        && ZVal.toBool(
                                ZVal.toBool(!ZVal.isTrue(type))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck("php", "===", type))));
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\Loader\\PhpFileLoader";

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
                    .setName("Symfony\\Component\\Routing\\Loader\\PhpFileLoader")
                    .setLookup(
                            PhpFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/routing/Loader/PhpFileLoader.php")
                    .addExtendsClass("Symfony\\Component\\Config\\Loader\\FileLoader")
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

    private static class Scope70 implements UpdateRuntimeScopeInterface {

        Object file;
        Object loader;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
            stack.setVariable("loader", this.loader);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
            this.loader = stack.getVariable("loader");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
