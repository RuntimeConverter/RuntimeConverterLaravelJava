package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.files.SplFileObject;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.NotFoundResourceException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.FileLoader;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/CsvFileLoader.php

*/

public class CsvFileLoader extends FileLoader {

    public Object delimiter = ";";

    public Object enclosure = "\"";

    public Object escape = "\\";

    public CsvFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CsvFileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    protected Object loadResource(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object file = null;
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object e = null;
        ReferenceContainer messages = new BasicReferenceContainer(null);
        messages.setObject(ZVal.newArray());
        try {
            file = new SplFileObject(env, resource, "rb");
        } catch (ConvertedException convertedException308) {
            if (convertedException308.instanceOf(RuntimeException.class, "RuntimeException")) {
                e = convertedException308.getObject();
                throw ZVal.getException(
                        env,
                        new NotFoundResourceException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Error opening file \"%s\".", resource)
                                        .value(),
                                0,
                                e));
            } else {
                throw convertedException308;
            }
        }

        env.callMethod(file, "setFlags", CsvFileLoader.class, ZVal.toLong(8) | ZVal.toLong(4));
        env.callMethod(
                file,
                "setCsvControl",
                CsvFileLoader.class,
                this.delimiter,
                this.enclosure,
                this.escape);
        for (ZPair zpairResult2141 : ZVal.getIterable(file, env, true)) {
            data.setObject(ZVal.assign(zpairResult2141.getValue()));
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    "#",
                                                    "!==",
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(data.arrayGet(env, 0), 0, 1)
                                                            .value()))
                                    && ZVal.toBool(arrayActionR(ArrayAction.ISSET, data, env, 1)))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    2,
                                    "===",
                                    function_count.f.env(env).call(data.getObject()).value()))) {
                messages.arrayAccess(env, data.arrayGet(env, 0)).set(data.arrayGet(env, 1));
            }
        }

        return ZVal.assign(messages.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delimiter")
    @ConvertedParameter(index = 1, name = "enclosure")
    @ConvertedParameter(index = 2, name = "escape")
    public Object setCsvControl(RuntimeEnv env, Object... args) {
        Object delimiter = assignParameter(args, 0, true);
        if (null == delimiter) {
            delimiter = ";";
        }
        Object enclosure = assignParameter(args, 1, true);
        if (null == enclosure) {
            enclosure = "\"";
        }
        Object escape = assignParameter(args, 2, true);
        if (null == escape) {
            escape = "\\";
        }
        this.delimiter = delimiter;
        this.enclosure = enclosure;
        this.escape = escape;
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Loader\\CsvFileLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FileLoader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Loader\\CsvFileLoader")
                    .setLookup(
                            CsvFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("delimiter", "enclosure", "escape")
                    .setFilename("vendor/symfony/translation/Loader/CsvFileLoader.php")
                    .addInterface("Symfony\\Component\\Translation\\Loader\\LoaderInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Loader\\FileLoader")
                    .addExtendsClass("Symfony\\Component\\Translation\\Loader\\ArrayLoader")
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
