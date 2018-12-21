package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes.FileDumper;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Dumper/CsvFileDumper.php

*/

public class CsvFileDumper extends FileDumper {

    public Object delimiter = ";";

    public Object enclosure = "\"";

    public CsvFileDumper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CsvFileDumper(NoConstructor n) {
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
        Object handle = null;
        Object source = null;
        Object target = null;
        handle = function_fopen.f.env(env).call("php://memory", "rb+").value();
        for (ZPair zpairResult2116 :
                ZVal.getIterable(
                        env.callMethod(messages, "all", CsvFileDumper.class, domain), env, false)) {
            source = ZVal.assign(zpairResult2116.getKey());
            target = ZVal.assign(zpairResult2116.getValue());
            NamespaceGlobal.fputcsv
                    .env(env)
                    .call(
                            handle,
                            ZVal.newArray(new ZPair(0, source), new ZPair(1, target)),
                            this.delimiter,
                            this.enclosure);
        }

        NamespaceGlobal.rewind.env(env).call(handle);
        output = NamespaceGlobal.stream_get_contents.env(env).call(handle).value();
        function_fclose.f.env(env).call(handle);
        return ZVal.assign(output);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delimiter")
    @ConvertedParameter(index = 1, name = "enclosure")
    public Object setCsvControl(RuntimeEnv env, Object... args) {
        Object delimiter = assignParameter(args, 0, true);
        if (null == delimiter) {
            delimiter = ";";
        }
        Object enclosure = assignParameter(args, 1, true);
        if (null == enclosure) {
            enclosure = "\"";
        }
        this.delimiter = delimiter;
        this.enclosure = enclosure;
        return null;
    }

    @ConvertedMethod
    protected Object getExtension(RuntimeEnv env, Object... args) {
        return "csv";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Dumper\\CsvFileDumper";

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
                    .setName("Symfony\\Component\\Translation\\Dumper\\CsvFileDumper")
                    .setLookup(
                            CsvFileDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("delimiter", "enclosure", "relativePathTemplate")
                    .setFilename("vendor/symfony/translation/Dumper/CsvFileDumper.php")
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
