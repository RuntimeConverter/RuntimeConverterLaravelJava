package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes;

import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Exception.classes.AccessDeniedException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveArrayIterator;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.dir.function_opendir;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.dir.function_closedir;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes.SplFileInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Iterator/RecursiveDirectoryIterator.php

*/

public class RecursiveDirectoryIterator
        extends com.runtimeconverter
                .runtime
                .nativeClasses
                .spl
                .iterators
                .RecursiveDirectoryIterator {

    public Object ignoreUnreadableDirs = null;

    public Object rewindable = null;

    public Object rootPath = null;

    public Object subPath = null;

    public Object directorySeparator = "/";

    public RecursiveDirectoryIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RecursiveDirectoryIterator.class) {
            this.__construct(env, args);
        }
    }

    public RecursiveDirectoryIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path", typeHint = "string")
    @ConvertedParameter(index = 1, name = "flags", typeHint = "int")
    @ConvertedParameter(
        index = 2,
        name = "ignoreUnreadableDirs",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object flags = assignParameter(args, 1, false);
        Object ignoreUnreadableDirs = assignParameter(args, 2, true);
        if (null == ignoreUnreadableDirs) {
            ignoreUnreadableDirs = false;
        }
        if (ZVal.isTrue(
                ZVal.toLong(flags)
                        & ZVal.toLong(
                                ZVal.toLong(CONST_CURRENT_AS_PATHNAME)
                                        | ZVal.toLong(CONST_CURRENT_AS_SELF)))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "This iterator only support returning current as fileinfo."));
        }

        super.__construct(env, path, flags);
        this.ignoreUnreadableDirs = ignoreUnreadableDirs;
        this.rootPath = path;
        if (ZVal.toBool(ZVal.strictNotEqualityCheck("/", "!==", "/"))
                && ZVal.toBool(!ZVal.isTrue(ZVal.toLong(flags) & ZVal.toLong(CONST_UNIX_PATHS)))) {
            this.directorySeparator = "/";
        }

        return null;
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        Object subPathname = null;
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(), "===", subPathname = ZVal.assign(this.subPath))) {
            subPathname =
                    ZVal.assign(
                            this.subPath =
                                    toStringR(
                                            env.callMethod(
                                                    this,
                                                    "getSubPath",
                                                    RecursiveDirectoryIterator.class),
                                            env));
        }

        if (ZVal.strictNotEqualityCheck("", "!==", subPathname)) {
            subPathname = toStringR(subPathname, env) + toStringR(this.directorySeparator, env);
        }

        subPathname =
                toStringR(subPathname, env)
                        + toStringR(
                                env.callMethod(
                                        this, "getFilename", RecursiveDirectoryIterator.class),
                                env);
        return ZVal.assign(
                new SplFileInfo(
                        env,
                        toStringR(this.rootPath, env)
                                + toStringR(this.directorySeparator, env)
                                + toStringR(subPathname, env),
                        this.subPath,
                        subPathname));
    }

    @ConvertedMethod
    public Object getChildren(RuntimeEnv env, Object... args) {
        Object e = null;
        Object children = null;
        try {
            children = super.getChildren(env);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            children,
                            com.project
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
                                    .RecursiveDirectoryIterator
                                    .class,
                            "Symfony\\Component\\Finder\\Iterator\\RecursiveDirectoryIterator"))) {
                toObjectR(children)
                        .accessProp(this, env)
                        .name("ignoreUnreadableDirs")
                        .set(this.ignoreUnreadableDirs);
                toObjectR(children).accessProp(this, env).name("rewindable").set(this.rewindable);
                toObjectR(children).accessProp(this, env).name("rootPath").set(this.rootPath);
            }

            return ZVal.assign(children);
        } catch (ConvertedException convertedException255) {
            if (convertedException255.instanceOf(
                    UnexpectedValueException.class, "UnexpectedValueException")) {
                e = convertedException255.getObject();
                if (ZVal.isTrue(this.ignoreUnreadableDirs)) {
                    return ZVal.assign(new RecursiveArrayIterator(env, ZVal.newArray()));

                } else {
                    throw ZVal.getException(
                            env,
                            new AccessDeniedException(
                                    env,
                                    env.callMethod(
                                            e, "getMessage", RecursiveDirectoryIterator.class),
                                    env.callMethod(e, "getCode", RecursiveDirectoryIterator.class),
                                    e));
                }

            } else {
                throw convertedException255;
            }
        }
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(false, "===", this.isRewindable(env))) {
            return null;
        }

        super.rewind(env);
        return null;
    }

    @ConvertedMethod
    public Object isRewindable(RuntimeEnv env, Object... args) {
        Object stream = null;
        ReferenceContainer infos = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.rewindable)) {
            return ZVal.assign(this.rewindable);
        }

        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                stream =
                        function_opendir
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                this, "getPath", RecursiveDirectoryIterator.class))
                                .value())) {
            infos.setObject(NamespaceGlobal.stream_get_meta_data.env(env).call(stream).value());
            function_closedir.f.env(env).call(stream);
            if (ZVal.isTrue(infos.arrayGet(env, "seekable"))) {
                return ZVal.assign(this.rewindable = true);
            }
        }

        return ZVal.assign(this.rewindable = false);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\RecursiveDirectoryIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.runtimeconverter
                    .runtime
                    .nativeClasses
                    .spl
                    .iterators
                    .RecursiveDirectoryIterator
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Finder\\Iterator\\RecursiveDirectoryIterator")
                    .setLookup(
                            RecursiveDirectoryIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "directorySeparator",
                            "ignoreUnreadableDirs",
                            "rewindable",
                            "rootPath",
                            "subPath")
                    .setFilename("vendor/symfony/finder/Iterator/RecursiveDirectoryIterator.php")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
                    .addInterface("SeekableIterator")
                    .addInterface("RecursiveIterator")
                    .addExtendsClass("RecursiveDirectoryIterator")
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
