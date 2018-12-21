package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes.MultiplePcreFilterIterator;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Iterator/PathFilterIterator.php

*/

public class PathFilterIterator extends MultiplePcreFilterIterator {

    public PathFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PathFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public PathFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object filename = null;
        filename =
                env.callMethod(
                        env.callMethod(this, "current", PathFilterIterator.class),
                        "getRelativePathname",
                        PathFilterIterator.class);
        if (ZVal.strictEqualityCheck("\\", "===", "/")) {
            filename = function_str_replace.f.env(env).call("\\", "/", filename).value();
        }

        return ZVal.assign(env.callMethod(this, "isAccepted", PathFilterIterator.class, filename));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    protected Object toRegex(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "isRegex", PathFilterIterator.class, str))
                        ? str
                        : "/"
                                + toStringR(
                                        NamespaceGlobal.preg_quote.env(env).call(str, "/").value(),
                                        env)
                                + "/");
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\PathFilterIterator";

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
                    .setName("Symfony\\Component\\Finder\\Iterator\\PathFilterIterator")
                    .setLookup(
                            PathFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("matchRegexps", "noMatchRegexps")
                    .setFilename("vendor/symfony/finder/Iterator/PathFilterIterator.php")
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
