package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes.FileDumper;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Dumper/PoFileDumper.php

*/

public class PoFileDumper extends FileDumper {

    public PoFileDumper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PoFileDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "messages",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 1, name = "domain")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object formatCatalogue(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object output = null;
        Object newLine = null;
        Object source = null;
        Object target = null;
        output = "msgid \"\"" + "\n";
        output = toStringR(output, env) + "msgstr \"\"" + "\n";
        output = toStringR(output, env) + "\"Content-Type: text/plain; charset=UTF-8\\n\"" + "\n";
        output = toStringR(output, env) + "\"Content-Transfer-Encoding: 8bit\\n\"" + "\n";
        output =
                toStringR(output, env)
                        + "\"Language: "
                        + toStringR(env.callMethod(messages, "getLocale", PoFileDumper.class), env)
                        + "\\n\""
                        + "\n";
        output = toStringR(output, env) + "\n";
        newLine = false;
        for (ZPair zpairResult2123 :
                ZVal.getIterable(
                        env.callMethod(messages, "all", PoFileDumper.class, domain), env, false)) {
            source = ZVal.assign(zpairResult2123.getKey());
            target = ZVal.assign(zpairResult2123.getValue());
            if (ZVal.isTrue(newLine)) {
                output = toStringR(output, env) + "\n";

            } else {
                newLine = true;
            }

            output =
                    toStringR(output, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("msgid \"%s\"" + "\n", this.escape(env, source))
                                            .value(),
                                    env);
            output =
                    toStringR(output, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("msgstr \"%s\"", this.escape(env, target))
                                            .value(),
                                    env);
        }

        return ZVal.assign(output);
    }

    @ConvertedMethod
    protected Object getExtension(RuntimeEnv env, Object... args) {
        return "po";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    private Object escape(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.addcslashes.env(env).call(str, "\u0000..\u001F\"\\").value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Dumper\\PoFileDumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FileDumper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Dumper\\PoFileDumper")
                    .setLookup(
                            PoFileDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("relativePathTemplate")
                    .setFilename("vendor/symfony/translation/Dumper/PoFileDumper.php")
                    .addInterface("Symfony\\Component\\Translation\\Dumper\\DumperInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Dumper\\FileDumper")
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
