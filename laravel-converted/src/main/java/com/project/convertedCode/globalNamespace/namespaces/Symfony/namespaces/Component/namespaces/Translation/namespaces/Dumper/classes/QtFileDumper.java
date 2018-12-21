package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes.FileDumper;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Dumper/QtFileDumper.php

*/

public class QtFileDumper extends FileDumper {

    public QtFileDumper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public QtFileDumper(NoConstructor n) {
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
        Object dom = null;
        Object context = null;
        Object source = null;
        Object message = null;
        Object ts = null;
        Object target = null;
        dom = new DOMDocument(env, "1.0", "utf-8");
        toObjectR(dom).accessProp(this, env).name("formatOutput").set(true);
        ts =
                env.callMethod(
                        dom,
                        "appendChild",
                        QtFileDumper.class,
                        env.callMethod(dom, "createElement", QtFileDumper.class, "TS"));
        context =
                env.callMethod(
                        ts,
                        "appendChild",
                        QtFileDumper.class,
                        env.callMethod(dom, "createElement", QtFileDumper.class, "context"));
        env.callMethod(
                context,
                "appendChild",
                QtFileDumper.class,
                env.callMethod(dom, "createElement", QtFileDumper.class, "name", domain));
        for (ZPair zpairResult2124 :
                ZVal.getIterable(
                        env.callMethod(messages, "all", QtFileDumper.class, domain), env, false)) {
            source = ZVal.assign(zpairResult2124.getKey());
            target = ZVal.assign(zpairResult2124.getValue());
            message =
                    env.callMethod(
                            context,
                            "appendChild",
                            QtFileDumper.class,
                            env.callMethod(dom, "createElement", QtFileDumper.class, "message"));
            env.callMethod(
                    message,
                    "appendChild",
                    QtFileDumper.class,
                    env.callMethod(dom, "createElement", QtFileDumper.class, "source", source));
            env.callMethod(
                    message,
                    "appendChild",
                    QtFileDumper.class,
                    env.callMethod(
                            dom, "createElement", QtFileDumper.class, "translation", target));
        }

        return ZVal.assign(env.callMethod(dom, "saveXML", QtFileDumper.class));
    }

    @ConvertedMethod
    protected Object getExtension(RuntimeEnv env, Object... args) {
        return "ts";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Dumper\\QtFileDumper";

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
                    .setName("Symfony\\Component\\Translation\\Dumper\\QtFileDumper")
                    .setLookup(
                            QtFileDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("relativePathTemplate")
                    .setFilename("vendor/symfony/translation/Dumper/QtFileDumper.php")
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
