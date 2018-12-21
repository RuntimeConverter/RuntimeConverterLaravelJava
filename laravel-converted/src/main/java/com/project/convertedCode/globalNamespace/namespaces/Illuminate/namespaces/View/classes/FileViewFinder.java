package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes.ViewFinderInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/View/FileViewFinder.php

*/

public class FileViewFinder extends RuntimeClassBase implements ViewFinderInterface {

    public Object files = null;

    public Object paths = null;

    public Object views = ZVal.newArray();

    public Object hints = ZVal.newArray();

    public Object extensions = ZVal.arrayFromList("blade.php", "php", "css");

    public FileViewFinder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileViewFinder.class) {
            this.__construct(env, args);
        }
    }

    public FileViewFinder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    @ConvertedParameter(index = 1, name = "paths", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "extensions",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object paths = assignParameter(args, 1, false);
        Object extensions = assignParameter(args, 2, true);
        if (null == extensions) {
            extensions = ZVal.getNull();
        }
        this.files = files;
        this.paths = paths;
        if (ZVal.isset(extensions)) {
            this.extensions = extensions;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object find(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "views", env), env, name)) {
            return ZVal.assign(new ReferenceClassProperty(this, "views", env).arrayGet(env, name));
        }

        if (ZVal.isTrue(
                this.hasHintInformation(env, name = function_trim.f.env(env).call(name).value()))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "views", env)
                            .arrayAccess(env, name)
                            .set(this.findNamespacedView(env, name)));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "views", env)
                        .arrayAccess(env, name)
                        .set(this.findInPaths(env, name, this.paths)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object findNamespacedView(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object view = null;
        Object runtimeTempArrayResult101 = null;
        Object namespace = null;
        ZVal.list(
                runtimeTempArrayResult101 = this.parseNamespaceSegments(env, name),
                (namespace = listGet(runtimeTempArrayResult101, 0, env)),
                (view = listGet(runtimeTempArrayResult101, 1, env)));
        return ZVal.assign(
                this.findInPaths(
                        env,
                        view,
                        new ReferenceClassProperty(this, "hints", env).arrayGet(env, namespace)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object parseNamespaceSegments(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer segments = new BasicReferenceContainer(null);
        segments.setObject(
                function_explode
                        .f
                        .env(env)
                        .call(
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "HINT_PATH_DELIMITER"),
                                name)
                        .value());
        if (ZVal.strictNotEqualityCheck(
                function_count.f.env(env).call(segments.getObject()).value(), "!==", 2)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "View [" + toStringR(name, env) + "] has an invalid name."));
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "hints", env),
                env,
                segments.arrayGet(env, 0))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "No hint path defined for ["
                                    + toStringR(segments.arrayGet(env, 0), env)
                                    + "]."));
        }

        return ZVal.assign(segments.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "paths")
    protected Object findInPaths(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object paths = assignParameter(args, 1, false);
        Object path = null;
        Object file = null;
        Object viewPath = null;
        for (ZPair zpairResult647 : ZVal.getIterable(rToArrayCast(paths), env, true)) {
            path = ZVal.assign(zpairResult647.getValue());
            for (ZPair zpairResult648 :
                    ZVal.getIterable(this.getPossibleViewFiles(env, name), env, true)) {
                file = ZVal.assign(zpairResult648.getValue());
                if (ZVal.isTrue(
                        env.callMethod(
                                this.files,
                                "exists",
                                FileViewFinder.class,
                                viewPath = toStringR(path, env) + "/" + toStringR(file, env)))) {
                    return ZVal.assign(viewPath);
                }
            }
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env, "View [" + toStringR(name, env) + "] not found."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getPossibleViewFiles(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/FileViewFinder.php");
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\View",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "extension")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object extension = assignParameter(args, 0, false);
                                        Object name = null;
                                        name = this.contextReferences.getCapturedValue("name");
                                        return ZVal.assign(
                                                toStringR(
                                                                function_str_replace
                                                                        .f
                                                                        .env(env)
                                                                        .call(".", "/", name)
                                                                        .value(),
                                                                env)
                                                        + "."
                                                        + toStringR(extension, env));
                                    }
                                }.use("name", name),
                                this.extensions)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "location")
    public Object addLocation(RuntimeEnv env, Object... args) {
        Object location = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "paths", env).arrayAppend(env).set(location);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "location")
    public Object prependLocation(RuntimeEnv env, Object... args) {
        Object location = assignParameter(args, 0, false);
        function_array_unshift.f.env(env).call(this.paths, location);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object addNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object hints = assignParameter(args, 1, false);
        hints = ZVal.assign(rToArrayCast(hints));
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "hints", env),
                env,
                namespace)) {
            hints =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    new ReferenceClassProperty(this, "hints", env)
                                            .arrayGet(env, namespace),
                                    hints)
                            .value();
        }

        new ReferenceClassProperty(this, "hints", env).arrayAccess(env, namespace).set(hints);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object prependNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object hints = assignParameter(args, 1, false);
        hints = ZVal.assign(rToArrayCast(hints));
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "hints", env),
                env,
                namespace)) {
            hints =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    hints,
                                    new ReferenceClassProperty(this, "hints", env)
                                            .arrayGet(env, namespace))
                            .value();
        }

        new ReferenceClassProperty(this, "hints", env).arrayAccess(env, namespace).set(hints);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object replaceNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object hints = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "hints", env)
                .arrayAccess(env, namespace)
                .set(rToArrayCast(hints));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extension")
    public Object addExtension(RuntimeEnv env, Object... args) {
        Object extension = assignParameter(args, 0, false);
        Object index = null;
        if (ZVal.strictNotEqualityCheck(
                index = function_array_search.f.env(env).call(extension, this.extensions).value(),
                "!==",
                false)) {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "extensions", env),
                    env,
                    index);
        }

        function_array_unshift.f.env(env).call(this.extensions, extension);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasHintInformation(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        name,
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "HINT_PATH_DELIMITER"))
                                .value(),
                        '>',
                        0));
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        this.views = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object getFilesystem(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.files);
    }

    @ConvertedMethod
    public Object getPaths(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.paths);
    }

    @ConvertedMethod
    public Object getHints(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hints);
    }

    @ConvertedMethod
    public Object getExtensions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.extensions);
    }

    public static final Object CONST_class = "Illuminate\\View\\FileViewFinder";

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
                    .setName("Illuminate\\View\\FileViewFinder")
                    .setLookup(
                            FileViewFinder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("extensions", "files", "hints", "paths", "views")
                    .setFilename("vendor/laravel/framework/src/Illuminate/View/FileViewFinder.php")
                    .addInterface("Illuminate\\View\\ViewFinderInterface")
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
