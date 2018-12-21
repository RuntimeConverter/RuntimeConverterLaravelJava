package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.classes.VarDumper;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.ConsoleEvents;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/DumpListener.php

*/

public class DumpListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object cloner = null;

    public Object dumper = null;

    public Object connection = null;

    public DumpListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DumpListener.class) {
            this.__construct(env, args);
        }
    }

    public DumpListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cloner",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\ClonerInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "dumper",
        typeHint = "Symfony\\Component\\VarDumper\\Dumper\\DataDumperInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "connection",
        typeHint = "Symfony\\Component\\VarDumper\\Server\\Connection",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object cloner = assignParameter(args, 0, false);
        Object dumper = assignParameter(args, 1, false);
        Object connection = assignParameter(args, 2, true);
        if (null == connection) {
            connection = ZVal.getNull();
        }
        this.cloner = cloner;
        this.dumper = dumper;
        this.connection = connection;
        return null;
    }

    @ConvertedMethod
    public Object configure(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-kernel/EventListener")
                        .setFile("/vendor/symfony/http-kernel/EventListener/DumpListener.php");
        Object cloner = null;
        Object dumper = null;
        Object connection = null;
        cloner = ZVal.assign(this.cloner);
        dumper = ZVal.assign(this.dumper);
        connection = ZVal.assign(this.connection);
        VarDumper.runtimeStaticObject.setHandler(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\HttpKernel\\EventListener",
                        null) {
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
                        Object data = null;
                        Object dumper = null;
                        Object connection = null;
                        cloner = this.contextReferences.getCapturedValue("cloner");
                        dumper = this.contextReferences.getCapturedValue("dumper");
                        connection = this.contextReferences.getCapturedValue("connection");
                        data = env.callMethod(cloner, "cloneVar", DumpListener.class, var);
                        if (ZVal.toBool(!ZVal.isTrue(connection))
                                || ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        connection,
                                                        "write",
                                                        DumpListener.class,
                                                        data)))) {
                            env.callMethod(dumper, "dump", DumpListener.class, data);
                        }

                        return null;
                    }
                }.use("cloner", cloner).use("dumper", dumper).use("connection", connection));
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\DumpListener";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getSubscribedEvents(RuntimeEnv env, Object... args) {
            if (!function_class_exists.f.env(env).call(ConsoleEvents.CONST_class).getBool()) {
                return ZVal.assign(ZVal.newArray());
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    ConsoleEvents.CONST_COMMAND,
                                    ZVal.arrayFromList("configure", 1024))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\EventListener\\DumpListener")
                    .setLookup(
                            DumpListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "connection", "dumper")
                    .setFilename("vendor/symfony/http-kernel/EventListener/DumpListener.php")
                    .addInterface("Symfony\\Component\\EventDispatcher\\EventSubscriberInterface")
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
