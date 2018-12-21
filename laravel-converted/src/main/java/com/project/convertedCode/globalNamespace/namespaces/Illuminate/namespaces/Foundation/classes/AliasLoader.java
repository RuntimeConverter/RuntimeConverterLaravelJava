package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.functions.storage_path;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_alias;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_register;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/AliasLoader.php

*/

public class AliasLoader extends RuntimeClassBase {

    public Object aliases = null;

    public Object registered = false;

    public AliasLoader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AliasLoader.class) {
            this.__construct(env, args);
        }
    }

    public AliasLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "aliases")
    private Object __construct(RuntimeEnv env, Object... args) {
        Object aliases = assignParameter(args, 0, false);
        this.aliases = aliases;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "alias")
    public Object load(RuntimeEnv env, Object... args) {
        Object alias = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Foundation
                                                .classes
                                                .AliasLoader
                                                .RequestStaticProperties
                                                .class)
                                .facadeNamespace)
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(
                                                alias,
                                                env.getRequestStaticProperties(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Foundation
                                                                        .classes
                                                                        .AliasLoader
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .facadeNamespace)
                                        .value(),
                                "===",
                                0))) {
            this.loadFacade(env, alias);
            return ZVal.assign(true);
        }

        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "aliases", env), env, alias)) {
            return ZVal.assign(
                    function_class_alias
                            .f
                            .env(env)
                            .call(
                                    new ReferenceClassProperty(this, "aliases", env)
                                            .arrayGet(env, alias),
                                    alias)
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "alias")
    protected Object loadFacade(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope18 scope = new Scope18();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/AliasLoader.php");
            scope.alias = assignParameter(args, 0, false);
            env.include(
                    toStringR(this.ensureFacadeExists(env, scope.alias), env),
                    stack,
                    runtimeConverterFunctionClassConstants,
                    true,
                    false);
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "alias")
    protected Object ensureFacadeExists(RuntimeEnv env, Object... args) {
        Object alias = assignParameter(args, 0, false);
        Object path = null;
        if (function_file_exists
                .f
                .env(env)
                .call(
                        path =
                                storage_path
                                        .f
                                        .env(env)
                                        .call(
                                                "framework/cache/facade-"
                                                        + toStringR(
                                                                NamespaceGlobal.sha1
                                                                        .env(env)
                                                                        .call(alias)
                                                                        .value(),
                                                                env)
                                                        + ".php")
                                        .value())
                .getBool()) {
            return ZVal.assign(path);
        }

        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        path,
                        this.formatFacadeStub(
                                env,
                                alias,
                                function_file_get_contents
                                        .f
                                        .env(env)
                                        .call(
                                                toStringR(
                                                                env.addRootFilesystemPrefix(
                                                                        "/vendor/laravel/framework/src/Illuminate/Foundation"),
                                                                env)
                                                        + "/stubs/facade.stub")
                                        .value()));
        return ZVal.assign(path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "alias")
    @ConvertedParameter(index = 1, name = "stub")
    protected Object formatFacadeStub(RuntimeEnv env, Object... args) {
        Object alias = assignParameter(args, 0, false);
        Object stub = assignParameter(args, 1, false);
        Object replacements = null;
        replacements =
                ZVal.newArray(
                        new ZPair(
                                0,
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "/",
                                                "\\",
                                                function_dirname
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                function_str_replace
                                                                        .f
                                                                        .env(env)
                                                                        .call("\\", "/", alias)
                                                                        .value())
                                                        .value())
                                        .value()),
                        new ZPair(1, class_basename.f.env(env).call(alias).value()),
                        new ZPair(
                                2,
                                function_substr
                                        .f
                                        .env(env)
                                        .call(
                                                alias,
                                                function_strlen
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.getRequestStaticProperties(
                                                                                com.project
                                                                                        .convertedCode
                                                                                        .globalNamespace
                                                                                        .namespaces
                                                                                        .Illuminate
                                                                                        .namespaces
                                                                                        .Foundation
                                                                                        .classes
                                                                                        .AliasLoader
                                                                                        .RequestStaticProperties
                                                                                        .class)
                                                                        .facadeNamespace)
                                                        .value())
                                        .value()));
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList("DummyNamespace", "DummyClass", "DummyTarget"),
                                replacements,
                                stub)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "alias")
    public Object alias(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object alias = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "aliases", env).arrayAccess(env, _pClass).set(alias);
        return null;
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.registered)) {
            this.prependToLoaderStack(env);
            this.registered = true;
        }

        return null;
    }

    @ConvertedMethod
    protected Object prependToLoaderStack(RuntimeEnv env, Object... args) {
        function_spl_autoload_register
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "load")), true, true);
        return null;
    }

    @ConvertedMethod
    public Object getAliases(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.aliases);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "aliases", typeHint = "array")
    public Object setAliases(RuntimeEnv env, Object... args) {
        Object aliases = assignParameter(args, 0, false);
        this.aliases = aliases;
        return null;
    }

    @ConvertedMethod
    public Object isRegistered(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.registered);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setRegistered(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.registered = value;
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\AliasLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "aliases",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object getInstance(RuntimeEnv env, Object... args) {
            Object aliases = assignParameter(args, 0, true);
            if (null == aliases) {
                aliases = ZVal.newArray();
            }
            if (function_is_null
                    .f
                    .env(env)
                    .call(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Foundation
                                                    .classes
                                                    .AliasLoader
                                                    .RequestStaticProperties
                                                    .class)
                                    .instance)
                    .getBool()) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Illuminate
                                                        .namespaces
                                                        .Foundation
                                                        .classes
                                                        .AliasLoader
                                                        .RequestStaticProperties
                                                        .class)
                                        .instance =
                                env.createNewWithLateStaticBindings(this, aliases));
            }

            aliases =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Illuminate
                                                                    .namespaces
                                                                    .Foundation
                                                                    .classes
                                                                    .AliasLoader
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .instance,
                                            "getAliases",
                                            AliasLoader.class),
                                    aliases)
                            .value();
            env.callMethod(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Foundation
                                            .classes
                                            .AliasLoader
                                            .RequestStaticProperties
                                            .class)
                            .instance,
                    "setAliases",
                    AliasLoader.class,
                    aliases);
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Foundation
                                            .classes
                                            .AliasLoader
                                            .RequestStaticProperties
                                            .class)
                            .instance);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "namespace")
        public Object setFacadeNamespace(RuntimeEnv env, Object... args) {
            Object namespace = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Foundation
                                            .classes
                                            .AliasLoader
                                            .RequestStaticProperties
                                            .class)
                            .facadeNamespace =
                    toStringR(function_rtrim.f.env(env).call(namespace, "\\").value(), env) + "\\";
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "loader")
        public Object setInstance(RuntimeEnv env, Object... args) {
            Object loader = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Foundation
                                            .classes
                                            .AliasLoader
                                            .RequestStaticProperties
                                            .class)
                            .instance =
                    loader;
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object facadeNamespace = "Facades\\";

        public Object instance = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\AliasLoader")
                    .setLookup(
                            AliasLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("aliases", "registered")
                    .setStaticPropertyNames("facadeNamespace", "instance")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/AliasLoader.php")
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

    private static class Scope18 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object alias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("alias", this.alias);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.alias = stack.getVariable("alias");
        }
    }
}
