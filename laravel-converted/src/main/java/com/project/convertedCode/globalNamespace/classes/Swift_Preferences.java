package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Preferences.php

*/

public class Swift_Preferences extends RuntimeClassBase {

    public Swift_Preferences(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Preferences.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Preferences(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    private Object __construct(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object setCharset(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                        "register",
                        Swift_Preferences.class,
                        "properties.charset"),
                "asValue",
                Swift_Preferences.class,
                charset);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dir")
    public Object setTempDir(RuntimeEnv env, Object... args) {
        Object dir = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                        "register",
                        Swift_Preferences.class,
                        "tempdir"),
                "asValue",
                Swift_Preferences.class,
                dir);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object setCacheType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                        "register",
                        Swift_Preferences.class,
                        "cache"),
                "asAliasOf",
                Swift_Preferences.class,
                function_sprintf.f.env(env).call("cache.%s", type).value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dotEscape")
    public Object setQPDotEscape(RuntimeEnv env, Object... args) {
        Object dotEscape = assignParameter(args, 0, false);
        dotEscape = !ZVal.isEmpty(dotEscape);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        Swift_DependencyContainer.runtimeStaticObject.getInstance(
                                                env),
                                        "register",
                                        Swift_Preferences.class,
                                        "mime.qpcontentencoder"),
                                "asNewInstanceOf",
                                Swift_Preferences.class,
                                "Swift_Mime_ContentEncoder_QpContentEncoder"),
                        "withDependencies",
                        Swift_Preferences.class,
                        ZVal.arrayFromList("mime.charstream", "mime.bytecanonicalizer")),
                "addConstructorValue",
                Swift_Preferences.class,
                dotEscape);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Swift_Preferences";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getInstance(RuntimeEnv env, Object... args) {
            if (!ZVal.isset(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Swift_Preferences
                                            .RequestStaticProperties
                                            .class)
                            .instance)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Swift_Preferences
                                                .RequestStaticProperties
                                                .class)
                                .instance =
                        new com.project.convertedCode.globalNamespace.classes.Swift_Preferences(
                                env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Swift_Preferences
                                            .RequestStaticProperties
                                            .class)
                            .instance);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instance = ZVal.getNull();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Preferences")
                    .setLookup(
                            Swift_Preferences.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("instance")
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift/Preferences.php")
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
