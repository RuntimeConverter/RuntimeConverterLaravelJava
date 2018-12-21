package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_StreamFilters_StringReplacementFilter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_ReplacementFilterFactory;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters/StringReplacementFilterFactory.php

*/

public class Swift_StreamFilters_StringReplacementFilterFactory extends RuntimeClassBase
        implements Swift_ReplacementFilterFactory {

    public Object filters = ZVal.newArray();

    public Swift_StreamFilters_StringReplacementFilterFactory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_StreamFilters_StringReplacementFilterFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "search")
    @ConvertedParameter(index = 1, name = "replace")
    public Object createFilter(RuntimeEnv env, Object... args) {
        Object search = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "filters", env),
                env,
                search,
                replace)) {
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "filters", env),
                    env,
                    search)) {
                new ReferenceClassProperty(this, "filters", env)
                        .arrayAccess(env, search)
                        .set(ZVal.newArray());
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "filters", env),
                    env,
                    search,
                    replace)) {
                new ReferenceClassProperty(this, "filters", env)
                        .arrayAccess(env, search, replace)
                        .set(ZVal.newArray());
            }

            new ReferenceClassProperty(this, "filters", env)
                    .arrayAccess(env, search, replace)
                    .set(new Swift_StreamFilters_StringReplacementFilter(env, search, replace));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "filters", env).arrayGet(env, search, replace));
    }

    public static final Object CONST_class = "Swift_StreamFilters_StringReplacementFilterFactory";

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
                    .setName("Swift_StreamFilters_StringReplacementFilterFactory")
                    .setLookup(
                            Swift_StreamFilters_StringReplacementFilterFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filters")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters/StringReplacementFilterFactory.php")
                    .addInterface("Swift_ReplacementFilterFactory")
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
