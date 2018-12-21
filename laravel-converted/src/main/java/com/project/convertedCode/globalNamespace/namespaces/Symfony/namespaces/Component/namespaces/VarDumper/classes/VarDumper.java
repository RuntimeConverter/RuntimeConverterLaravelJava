package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.CliDumper;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.VarCloner;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.HtmlDumper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/VarDumper.php

*/

public class VarDumper extends RuntimeClassBase {

    public VarDumper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public VarDumper(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\VarDumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "var")
        public Object dump(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/var-dumper")
                            .setFile("/vendor/symfony/var-dumper/VarDumper.php");
            Object var = assignParameter(args, 0, false);
            Object cloner = null;
            Object dumper = null;
            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(),
                    "===",
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .VarDumper
                                            .classes
                                            .VarDumper
                                            .RequestStaticProperties
                                            .class)
                            .handler)) {
                cloner = new VarCloner(env);
                dumper =
                        ZVal.assign(
                                function_in_array
                                                .f
                                                .env(env)
                                                .call(
                                                        "cli",
                                                        ZVal.arrayFromList("cli", "phpdbg"),
                                                        true)
                                                .getBool()
                                        ? new CliDumper(env)
                                        : new HtmlDumper(env));
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .VarDumper
                                                .classes
                                                .VarDumper
                                                .RequestStaticProperties
                                                .class)
                                .handler =
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\VarDumper",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "var")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object var = assignParameter(args, 0, false);
                                Object cloner = null;
                                Object dumper = null;
                                cloner = this.contextReferences.getCapturedValue("cloner");
                                dumper = this.contextReferences.getCapturedValue("dumper");
                                env.callMethod(
                                        dumper,
                                        "dump",
                                        VarDumper.class,
                                        env.callMethod(cloner, "cloneVar", VarDumper.class, var));
                                return null;
                            }
                        }.use("cloner", cloner).use("dumper", dumper);
            }

            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .VarDumper
                                                            .classes
                                                            .VarDumper
                                                            .RequestStaticProperties
                                                            .class)
                                            .handler,
                                    var)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "callable",
            typeHint = "callable",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object setHandler(RuntimeEnv env, Object... args) {
            Object callable = assignParameter(args, 0, true);
            if (null == callable) {
                callable = ZVal.getNull();
            }
            Object prevHandler = null;
            prevHandler =
                    ZVal.assign(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .VarDumper
                                                    .classes
                                                    .VarDumper
                                                    .RequestStaticProperties
                                                    .class)
                                    .handler);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .VarDumper
                                            .classes
                                            .VarDumper
                                            .RequestStaticProperties
                                            .class)
                            .handler =
                    callable;
            return ZVal.assign(prevHandler);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object handler = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\VarDumper")
                    .setLookup(
                            VarDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("handler")
                    .setFilename("vendor/symfony/var-dumper/VarDumper.php")
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
