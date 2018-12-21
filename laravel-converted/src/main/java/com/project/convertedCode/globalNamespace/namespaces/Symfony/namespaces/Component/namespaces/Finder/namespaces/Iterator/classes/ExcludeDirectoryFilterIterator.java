package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeInterfaces.RecursiveIterator;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilterIterator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Iterator/ExcludeDirectoryFilterIterator.php

*/

public class ExcludeDirectoryFilterIterator extends FilterIterator implements RecursiveIterator {

    public Object iterator = null;

    public Object isRecursive = null;

    public Object excludedDirs = ZVal.newArray();

    public Object excludedPattern = null;

    public ExcludeDirectoryFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExcludeDirectoryFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public ExcludeDirectoryFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "Iterator")
    @ConvertedParameter(index = 1, name = "directories", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, false);
        Object directories = assignParameter(args, 1, false);
        ReferenceContainer patterns = new BasicReferenceContainer(null);
        Object directory = null;
        this.iterator = iterator;
        this.isRecursive =
                ZVal.checkInstanceType(iterator, RecursiveIterator.class, "RecursiveIterator");
        patterns.setObject(ZVal.newArray());
        for (ZPair zpairResult1835 : ZVal.getIterable(directories, env, true)) {
            directory = ZVal.assign(zpairResult1835.getValue());
            directory = function_rtrim.f.env(env).call(directory, "/").value();
            if (ZVal.toBool(!ZVal.isTrue(this.isRecursive))
                    || ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    function_strpos.f.env(env).call(directory, "/").value()))) {
                patterns.arrayAppend(env)
                        .set(NamespaceGlobal.preg_quote.env(env).call(directory, "#").value());

            } else {
                new ReferenceClassProperty(this, "excludedDirs", env)
                        .arrayAccess(env, directory)
                        .set(true);
            }
        }

        if (ZVal.isTrue(patterns.getObject())) {
            this.excludedPattern =
                    "#(?:^|/)(?:"
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call("|", patterns.getObject())
                                            .value(),
                                    env)
                            + ")(?:/|$)#";
        }

        super.__construct(env, iterator);
        return null;
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object path = null;
        if (ZVal.toBool(
                        ZVal.toBool(this.isRecursive)
                                && ZVal.toBool(
                                        arrayActionR(
                                                ArrayAction.ISSET,
                                                new ReferenceClassProperty(
                                                        this, "excludedDirs", env),
                                                env,
                                                env.callMethod(
                                                        this,
                                                        "getFilename",
                                                        ExcludeDirectoryFilterIterator.class))))
                && ZVal.toBool(
                        env.callMethod(this, "isDir", ExcludeDirectoryFilterIterator.class))) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(this.excludedPattern)) {
            path =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    this,
                                                    "isDir",
                                                    ExcludeDirectoryFilterIterator.class))
                                    ? env.callMethod(
                                            env.callMethod(
                                                    this,
                                                    "current",
                                                    ExcludeDirectoryFilterIterator.class),
                                            "getRelativePathname",
                                            ExcludeDirectoryFilterIterator.class)
                                    : env.callMethod(
                                            env.callMethod(
                                                    this,
                                                    "current",
                                                    ExcludeDirectoryFilterIterator.class),
                                            "getRelativePath",
                                            ExcludeDirectoryFilterIterator.class));
            path = function_str_replace.f.env(env).call("\\", "/", path).value();
            return ZVal.assign(
                    !function_preg_match.f.env(env).call(this.excludedPattern, path).getBool());
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object hasChildren(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(this.isRecursive)
                        && ZVal.toBool(
                                env.callMethod(
                                        this.iterator,
                                        "hasChildren",
                                        ExcludeDirectoryFilterIterator.class)));
    }

    @ConvertedMethod
    public Object getChildren(RuntimeEnv env, Object... args) {
        Object children = null;
        children =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Symfony
                        .namespaces
                        .Component
                        .namespaces
                        .Finder
                        .namespaces
                        .Iterator
                        .classes
                        .ExcludeDirectoryFilterIterator(
                        env,
                        env.callMethod(
                                this.iterator, "getChildren", ExcludeDirectoryFilterIterator.class),
                        ZVal.newArray());
        toObjectR(children).accessProp(this, env).name("excludedDirs").set(this.excludedDirs);
        toObjectR(children).accessProp(this, env).name("excludedPattern").set(this.excludedPattern);
        return ZVal.assign(children);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\ExcludeDirectoryFilterIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FilterIterator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Finder\\Iterator\\ExcludeDirectoryFilterIterator")
                    .setLookup(
                            ExcludeDirectoryFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "excludedDirs", "excludedPattern", "isRecursive", "iterator")
                    .setFilename(
                            "vendor/symfony/finder/Iterator/ExcludeDirectoryFilterIterator.php")
                    .addInterface("RecursiveIterator")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
                    .addInterface("OuterIterator")
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
