package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_register;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift.php

*/

public abstract class Swift extends RuntimeClassBase {

    public Swift(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_VERSION = "6.1.1";

    public static final Object CONST_class = "Swift";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callable")
        public Object init(RuntimeEnv env, Object... args) {
            Object callable = assignParameter(args, 0, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .classes
                                    .Swift
                                    .RequestStaticProperties
                                    .class,
                            "inits")
                    .arrayAppend(env)
                    .set(callable);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        public Object autoload(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope56 scope = new Scope56();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/swiftmailer/swiftmailer/lib/classes")
                                .setFile("/vendor/swiftmailer/swiftmailer/lib/classes/Swift.php");
                scope._pClass = assignParameter(args, 0, false);
                scope.path = null;
                scope.init = null;
                if (ZVal.strictNotEqualityCheck(
                        0,
                        "!==",
                        function_strpos.f.env(env).call(scope._pClass, "Swift_").value())) {
                    throw new IncludeEventException(null);
                }

                scope.path =
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/swiftmailer/swiftmailer/lib/classes"),
                                        env)
                                + "/"
                                + toStringR(
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call("_", "/", scope._pClass)
                                                .value(),
                                        env)
                                + ".php";
                if (!function_file_exists.f.env(env).call(scope.path).getBool()) {
                    throw new IncludeEventException(null);
                }

                env.include(
                        toStringR(scope.path, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        false);
                if (ZVal.toBool(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .classes
                                                        .Swift
                                                        .RequestStaticProperties
                                                        .class)
                                        .inits)
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .classes
                                                                .Swift
                                                                .RequestStaticProperties
                                                                .class)
                                                .initialized))) {
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Swift
                                                    .RequestStaticProperties
                                                    .class)
                                    .initialized =
                            true;
                    for (ZPair zpairResult1488 :
                            ZVal.getIterable(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .classes
                                                            .Swift
                                                            .RequestStaticProperties
                                                            .class)
                                            .inits,
                                    env,
                                    true)) {
                        scope.init = ZVal.assign(zpairResult1488.getValue());
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(scope.init);
                    }
                }

                throw new IncludeEventException(null);
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "callable",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object registerAutoload(RuntimeEnv env, Object... args) {
            Object callable = assignParameter(args, 0, true);
            if (null == callable) {
                callable = ZVal.getNull();
            }
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", callable)) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .classes
                                        .Swift
                                        .RequestStaticProperties
                                        .class,
                                "inits")
                        .arrayAppend(env)
                        .set(callable);
            }

            function_spl_autoload_register.f.env(env).call(ZVal.arrayFromList("Swift", "autoload"));
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object initialized = false;

        public Object inits = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift")
                    .setLookup(
                            Swift.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("initialized", "inits")
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift.php")
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

    private static class Scope56 implements UpdateRuntimeScopeInterface {

        Object path;
        Object init;
        Object _thisVarAlias;
        Object _pClass;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("path", this.path);
            stack.setVariable("init", this.init);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("class", this._pClass);
        }

        public void updateScope(RuntimeStack stack) {

            this.path = stack.getVariable("path");
            this.init = stack.getVariable("init");
            this._thisVarAlias = stack.getVariable("this");
            this._pClass = stack.getVariable("class");
        }
    }
}
