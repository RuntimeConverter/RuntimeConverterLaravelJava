package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.MultiplePcreFilterIterator;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Iterator/FilecontentFilterIterator.php

*/

public class FilecontentFilterIterator extends MultiplePcreFilterIterator {

    public FilecontentFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FilecontentFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public FilecontentFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object fileinfo = null;
        Object content = null;
        if (ZVal.toBool(!toObjectR(this).accessProp(this, env).name("matchRegexps").getBool())
                && ZVal.toBool(
                        !toObjectR(this).accessProp(this, env).name("noMatchRegexps").getBool())) {
            return ZVal.assign(true);
        }

        fileinfo = env.callMethod(this, "current", FilecontentFilterIterator.class);
        if (ZVal.toBool(env.callMethod(fileinfo, "isDir", FilecontentFilterIterator.class))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        fileinfo,
                                        "isReadable",
                                        FilecontentFilterIterator.class)))) {
            return ZVal.assign(false);
        }

        content = env.callMethod(fileinfo, "getContents", FilecontentFilterIterator.class);
        if (!ZVal.isTrue(content)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                env.callMethod(this, "isAccepted", FilecontentFilterIterator.class, content));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    protected Object toRegex(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "isRegex", FilecontentFilterIterator.class, str))
                        ? str
                        : "/"
                                + toStringR(
                                        NamespaceGlobal.preg_quote.env(env).call(str, "/").value(),
                                        env)
                                + "/");
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\FilecontentFilterIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends MultiplePcreFilterIterator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Finder\\Iterator\\FilecontentFilterIterator")
                    .setLookup(
                            FilecontentFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("matchRegexps", "noMatchRegexps")
                    .setFilename("vendor/symfony/finder/Iterator/FilecontentFilterIterator.php")
                    .addInterface("OuterIterator")
                    .addInterface("Traversable")
                    .addInterface("Iterator")
                    .addExtendsClass(
                            "Symfony\\Component\\Finder\\Iterator\\MultiplePcreFilterIterator")
                    .addExtendsClass("FilterIterator")
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
