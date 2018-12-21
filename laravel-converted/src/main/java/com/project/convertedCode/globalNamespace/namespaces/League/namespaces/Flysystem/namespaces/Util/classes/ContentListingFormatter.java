package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.array.function_usort;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Util/ContentListingFormatter.php

*/

public class ContentListingFormatter extends RuntimeClassBase {

    public Object directory = null;

    public Object recursive = null;

    public ContentListingFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ContentListingFormatter.class) {
            this.__construct(env, args);
        }
    }

    public ContentListingFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(index = 1, name = "recursive")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object recursive = assignParameter(args, 1, false);
        this.directory = directory;
        this.recursive = recursive;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listing", typeHint = "array")
    public Object formatListing(RuntimeEnv env, Object... args) {
        Object listing = assignParameter(args, 0, false);
        listing =
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.newArray(
                                                        new ZPair(0, this),
                                                        new ZPair(1, "addPathInfo")),
                                                function_array_filter
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                listing,
                                                                ZVal.newArray(
                                                                        new ZPair(0, this),
                                                                        new ZPair(
                                                                                1,
                                                                                "isEntryOutOfScope")))
                                                        .value())
                                        .value())
                        .value();
        return ZVal.assign(this.sortListing(env, listing));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entry", typeHint = "array")
    private Object addPathInfo(RuntimeEnv env, Object... args) {
        ReferenceContainer entry = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.add(
                        entry.getObject(),
                        Util.runtimeStaticObject.pathinfo(env, entry.arrayGet(env, "path"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entry", typeHint = "array")
    private Object isEntryOutOfScope(RuntimeEnv env, Object... args) {
        ReferenceContainer entry = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.toBool(arrayActionR(ArrayAction.EMPTY, entry, env, "path"))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(entry.arrayGet(env, "path"), "!==", "0"))) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(this.recursive)) {
            return ZVal.assign(this.residesInDirectory(env, entry.getObject()));
        }

        return ZVal.assign(this.isDirectChild(env, entry.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entry", typeHint = "array")
    private Object residesInDirectory(RuntimeEnv env, Object... args) {
        ReferenceContainer entry = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.strictEqualityCheck(this.directory, "===", "")) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        entry.arrayGet(env, "path"),
                                        toStringR(this.directory, env) + "/")
                                .value(),
                        "===",
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entry", typeHint = "array")
    private Object isDirectChild(RuntimeEnv env, Object... args) {
        ReferenceContainer entry = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        Util.runtimeStaticObject.dirname(env, entry.arrayGet(env, "path")),
                        "===",
                        this.directory));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listing", typeHint = "array")
    private Object sortListing(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/league/flysystem/src/Util")
                        .setFile("/vendor/league/flysystem/src/Util/ContentListingFormatter.php");
        Object listing = assignParameter(args, 0, false);
        function_usort
                .f
                .env(env)
                .call(
                        listing,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "League\\Flysystem\\Util",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "a")
                            @ConvertedParameter(index = 1, name = "b")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer a =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                ReferenceContainer b =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 1, false));
                                return ZVal.assign(
                                        NamespaceGlobal.strcasecmp
                                                .env(env)
                                                .call(
                                                        a.arrayGet(env, "path"),
                                                        b.arrayGet(env, "path"))
                                                .value());
                            }
                        });
        return ZVal.assign(listing);
    }

    public static final Object CONST_class = "League\\Flysystem\\Util\\ContentListingFormatter";

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
                    .setName("League\\Flysystem\\Util\\ContentListingFormatter")
                    .setLookup(
                            ContentListingFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("directory", "recursive")
                    .setFilename("vendor/league/flysystem/src/Util/ContentListingFormatter.php")
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
