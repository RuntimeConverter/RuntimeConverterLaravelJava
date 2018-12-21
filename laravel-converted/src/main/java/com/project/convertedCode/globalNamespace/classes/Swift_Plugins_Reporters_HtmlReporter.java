package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Reporter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Reporters/HtmlReporter.php

*/

public class Swift_Plugins_Reporters_HtmlReporter extends RuntimeClassBase
        implements Swift_Plugins_Reporter {

    public Swift_Plugins_Reporters_HtmlReporter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Plugins_Reporters_HtmlReporter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    @ConvertedParameter(index = 1, name = "address")
    @ConvertedParameter(index = 2, name = "result")
    public Object notify(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object address = assignParameter(args, 1, false);
        Object result = assignParameter(args, 2, false);
        if (ZVal.equalityCheck(CONST_RESULT_PASS, result)) {
            env.echo(
                    "<div style=\"color: #fff; background: #006600; padding: 2px; margin: 2px;\">"
                            + toStringR("\n", env));
            env.echo("PASS " + toStringR(address, env) + toStringR("\n", env));
            env.echo("</div>" + toStringR("\n", env));
            NamespaceGlobal.flush.env(env).call();

        } else {
            env.echo(
                    "<div style=\"color: #fff; background: #880000; padding: 2px; margin: 2px;\">"
                            + toStringR("\n", env));
            env.echo("FAIL " + toStringR(address, env) + toStringR("\n", env));
            env.echo("</div>" + toStringR("\n", env));
            NamespaceGlobal.flush.env(env).call();
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Plugins_Reporters_HtmlReporter";

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
                    .setName("Swift_Plugins_Reporters_HtmlReporter")
                    .setLookup(
                            Swift_Plugins_Reporters_HtmlReporter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Reporters/HtmlReporter.php")
                    .addInterface("Swift_Plugins_Reporter")
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
