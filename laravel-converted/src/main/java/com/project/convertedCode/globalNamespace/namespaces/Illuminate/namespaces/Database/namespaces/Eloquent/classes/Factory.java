package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.functions.database_path;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.FactoryBuilder;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes.Finder;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Factory.php

*/

public class Factory extends RuntimeClassBase implements ArrayAccess {

    public Object definitions = ZVal.newArray();

    public Object states = ZVal.newArray();

    public Object afterMaking = ZVal.newArray();

    public Object afterCreating = ZVal.newArray();

    public Object faker = null;

    public Factory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Factory.class) {
            this.__construct(env, args);
        }
    }

    public Factory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "faker", typeHint = "Faker\\Generator")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object faker = assignParameter(args, 0, false);
        this.faker = faker;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "attributes", typeHint = "callable")
    public Object defineAs(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object attributes = assignParameter(args, 2, false);
        return ZVal.assign(this.define(env, _pClass, attributes, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "attributes", typeHint = "callable")
    @ConvertedParameter(index = 2, name = "name")
    public Object define(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, false);
        Object name = assignParameter(args, 2, true);
        if (null == name) {
            name = "default";
        }
        new ReferenceClassProperty(this, "definitions", env)
                .arrayAccess(env, _pClass, name)
                .set(attributes);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "state")
    @ConvertedParameter(index = 2, name = "attributes")
    public Object state(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object state = assignParameter(args, 1, false);
        Object attributes = assignParameter(args, 2, false);
        new ReferenceClassProperty(this, "states", env)
                .arrayAccess(env, _pClass, state)
                .set(attributes);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    @ConvertedParameter(index = 2, name = "name")
    public Object afterMaking(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object name = assignParameter(args, 2, true);
        if (null == name) {
            name = "default";
        }
        new ReferenceClassProperty(this, "afterMaking", env)
                .arrayAppend(env, _pClass, name)
                .set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "state")
    @ConvertedParameter(index = 2, name = "callback", typeHint = "callable")
    public Object afterMakingState(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object state = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        return ZVal.assign(this.afterMaking(env, _pClass, callback, state));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    @ConvertedParameter(index = 2, name = "name")
    public Object afterCreating(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object name = assignParameter(args, 2, true);
        if (null == name) {
            name = "default";
        }
        new ReferenceClassProperty(this, "afterCreating", env)
                .arrayAppend(env, _pClass, name)
                .set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "state")
    @ConvertedParameter(index = 2, name = "callback", typeHint = "callable")
    public Object afterCreatingState(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object state = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        return ZVal.assign(this.afterCreating(env, _pClass, callback, state));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.of(env, _pClass), "create", Factory.class, attributes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object createAs(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.of(env, _pClass, name), "create", Factory.class, attributes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object make(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.of(env, _pClass), "make", Factory.class, attributes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object makeAs(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.of(env, _pClass, name), "make", Factory.class, attributes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object rawOf(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(this.raw(env, _pClass, attributes, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "name")
    public Object raw(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object name = assignParameter(args, 2, true);
        if (null == name) {
            name = "default";
        }
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                function_call_user_func
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call(
                                                new ReferenceClassProperty(this, "definitions", env)
                                                        .arrayGet(env, _pClass, name),
                                                this.faker)
                                        .value(),
                                attributes)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    public Object of(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = "default";
        }
        return ZVal.assign(
                new FactoryBuilder(
                        env,
                        _pClass,
                        name,
                        this.definitions,
                        this.states,
                        this.afterMaking,
                        this.afterCreating,
                        this.faker));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object load(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope15 scope = new Scope15();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Factory.php");
            scope.path = assignParameter(args, 0, false);
            scope.factory = null;
            scope.file = null;
            scope.factory = ZVal.assign(scope._thisVarAlias);
            if (function_is_dir.f.env(env).call(scope.path).getBool()) {
                for (ZPair zpairResult284 :
                        ZVal.getIterable(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        Finder.runtimeStaticObject.create(env),
                                                        "files",
                                                        Factory.class),
                                                "name",
                                                Factory.class,
                                                "*.php"),
                                        "in",
                                        Factory.class,
                                        scope.path),
                                env,
                                true)) {
                    scope.file = ZVal.assign(zpairResult284.getValue());
                    env.include(
                            toStringR(
                                    env.callMethod(scope.file, "getRealPath", Factory.class), env),
                            stack,
                            runtimeConverterFunctionClassConstants,
                            true,
                            false);
                }
            }

            throw new IncludeEventException(ZVal.assign(scope.factory));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "definitions", env),
                        env,
                        offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(this.make(env, offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(this.define(env, offset, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "definitions", env),
                env,
                offset);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Factory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "faker", typeHint = "Faker\\Generator")
        @ConvertedParameter(
            index = 1,
            name = "pathToFactories",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object construct(RuntimeEnv env, Object... args) {
            Object faker = assignParameter(args, 0, false);
            Object pathToFactories = assignParameter(args, 1, true);
            if (null == pathToFactories) {
                pathToFactories = ZVal.getNull();
            }
            Object ternaryExpressionTemp = null;
            pathToFactories =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = pathToFactories)
                                    ? ternaryExpressionTemp
                                    : database_path.f.env(env).call("factories").value());
            return ZVal.assign(
                    env.callMethod(
                            env.createNewWithLateStaticBindings(this, faker),
                            "load",
                            Factory.class,
                            pathToFactories));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Factory")
                    .setLookup(
                            Factory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "afterCreating", "afterMaking", "definitions", "faker", "states")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Factory.php")
                    .addInterface("ArrayAccess")
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

    private static class Scope15 implements UpdateRuntimeScopeInterface {

        Object factory;
        Object path;
        Object file;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("factory", this.factory);
            stack.setVariable("path", this.path);
            stack.setVariable("file", this.file);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.factory = stack.getVariable("factory");
            this.path = stack.getVariable("path");
            this.file = stack.getVariable("file");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
