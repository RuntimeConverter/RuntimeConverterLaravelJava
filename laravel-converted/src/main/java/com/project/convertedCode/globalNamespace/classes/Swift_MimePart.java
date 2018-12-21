package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_MimePart;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/MimePart.php

*/

public class Swift_MimePart extends Swift_Mime_MimePart {

    public Swift_MimePart(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_MimePart.class) {
            this.__construct(env, args);
        }
    }

    public Swift_MimePart(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "body",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "contentType",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "charset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object body = assignParameter(args, 0, true);
        if (null == body) {
            body = ZVal.getNull();
        }
        Object contentType = assignParameter(args, 1, true);
        if (null == contentType) {
            contentType = ZVal.getNull();
        }
        Object charset = assignParameter(args, 2, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(
                        ZVal.newArray(
                                new ZPair(0, this),
                                new ZPair(1, "Swift_Mime_MimePart::__construct")),
                        env.callMethod(
                                Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                                "createDependenciesFor",
                                Swift_MimePart.class,
                                "mime.part"));
        if (!ZVal.isset(charset)) {
            charset =
                    env.callMethod(
                            Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                            "lookup",
                            Swift_MimePart.class,
                            "properties.charset");
        }

        env.callMethod(this, "setBody", Swift_MimePart.class, body);
        env.callMethod(this, "setCharset", Swift_MimePart.class, charset);
        if (ZVal.isTrue(contentType)) {
            env.callMethod(this, "setContentType", Swift_MimePart.class, contentType);
        }

        return null;
    }

    public static final Object CONST_class = "Swift_MimePart";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Swift_Mime_MimePart.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_MimePart")
                    .setLookup(
                            Swift_MimePart.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "alternativePartOrder",
                            "body",
                            "boundary",
                            "cache",
                            "cacheKey",
                            "children",
                            "compositeRanges",
                            "compoundLevelFilters",
                            "encoder",
                            "headers",
                            "id",
                            "idGenerator",
                            "immediateChildren",
                            "maxLineLength",
                            "nestingLevel",
                            "nestingLevel",
                            "userCharset",
                            "userContentType",
                            "userDelSp",
                            "userFormat")
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift/MimePart.php")
                    .addInterface("Swift_Mime_CharsetObserver")
                    .addInterface("Swift_Mime_EncodingObserver")
                    .addExtendsClass("Swift_Mime_MimePart")
                    .addExtendsClass("Swift_Mime_SimpleMimeEntity")
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
