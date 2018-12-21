package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.Formatter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Formatter/AlignFormatter.php

*/

public class AlignFormatter extends RuntimeClassBase implements Formatter {

    public Object maxLen = 0;

    public AlignFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AlignFormatter.class) {
            this.__construct(env, args);
        }
    }

    public AlignFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tags", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object tags = assignParameter(args, 0, false);
        Object tag = null;
        for (ZPair zpairResult930 : ZVal.getIterable(tags, env, true)) {
            tag = ZVal.assign(zpairResult930.getValue());
            this.maxLen =
                    NamespaceGlobal.max
                            .env(env)
                            .call(
                                    this.maxLen,
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            tag, "getName", AlignFormatter.class))
                                            .value())
                            .value();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tag",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Tag"
    )
    public Object format(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, false);
        return ZVal.assign(
                "@"
                        + toStringR(env.callMethod(tag, "getName", AlignFormatter.class), env)
                        + toStringR(
                                function_str_repeat
                                        .f
                                        .env(env)
                                        .call(
                                                " ",
                                                ZVal.add(
                                                        ZVal.subtract(
                                                                this.maxLen,
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                env.callMethod(
                                                                                        tag,
                                                                                        "getName",
                                                                                        AlignFormatter
                                                                                                .class))
                                                                        .value()),
                                                        1))
                                        .value(),
                                env)
                        + toStringR(toStringR(tag, env), env));
    }

    public static final Object CONST_class =
            "phpDocumentor\\Reflection\\DocBlock\\Tags\\Formatter\\AlignFormatter";

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
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Formatter\\AlignFormatter")
                    .setLookup(
                            AlignFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("maxLen")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Formatter/AlignFormatter.php")
                    .addInterface("phpDocumentor\\Reflection\\DocBlock\\Tags\\Formatter")
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
