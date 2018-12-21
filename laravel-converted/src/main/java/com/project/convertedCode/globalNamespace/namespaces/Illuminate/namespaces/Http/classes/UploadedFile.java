package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Filesystem.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Testing.classes.FileFactory;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/UploadedFile.php

*/

public class UploadedFile
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Symfony
                .namespaces
                .Component
                .namespaces
                .HttpFoundation
                .namespaces
                .File
                .classes
                .UploadedFile {

    public Object hashName = ZVal.getNull();

    public UploadedFile(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UploadedFile.class) {
            this.__construct(env, args);
        }
    }

    public UploadedFile(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "options", defaultValue = "", defaultValueType = "array")
    public Object store(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return ZVal.assign(
                this.storeAs(env, path, this.hashName(env), this.parseOptions(env, options)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "options", defaultValue = "", defaultValueType = "array")
    public Object storePublicly(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        options.setObject(this.parseOptions(env, options.getObject()));
        options.arrayAccess(env, "visibility").set("public");
        return ZVal.assign(this.storeAs(env, path, this.hashName(env), options.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "options", defaultValue = "", defaultValueType = "array")
    public Object storePubliclyAs(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        options.setObject(this.parseOptions(env, options.getObject()));
        options.arrayAccess(env, "visibility").set("public");
        return ZVal.assign(this.storeAs(env, path, name, options.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "options", defaultValue = "", defaultValueType = "array")
    public Object storeAs(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object disk = null;
        options.setObject(this.parseOptions(env, options.getObject()));
        disk =
                Arr.runtimeStaticObject.pull(
                        env,
                        new RuntimeArgsWithReferences().add(0, options),
                        options.getObject(),
                        "disk");
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        Container.runtimeStaticObject.getInstance(env),
                                        "make",
                                        UploadedFile.class,
                                        Factory.CONST_class),
                                "disk",
                                UploadedFile.class,
                                disk),
                        "putFileAs",
                        UploadedFile.class,
                        path,
                        this,
                        name,
                        options.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options")
    protected Object parseOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        if (function_is_string.f.env(env).call(options).getBool()) {
            options = ZVal.newArray(new ZPair("disk", options));
        }

        return ZVal.assign(options);
    }

    @ConvertedMethod
    public Object path(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getRealPath", UploadedFile.class));
    }

    @ConvertedMethod
    public Object extension(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "guessExtension", UploadedFile.class));
    }

    @ConvertedMethod
    public Object clientExtension(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "guessClientExtension", UploadedFile.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hashName(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        Object hash = null;
        if (ZVal.isTrue(path)) {
            path = toStringR(function_rtrim.f.env(env).call(path, "/").value(), env) + "/";
        }

        hash =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = this.hashName)
                                ? ternaryExpressionTemp
                                : (this.hashName = Str.runtimeStaticObject.random(env, 40)));
        return ZVal.assign(
                toStringR(path, env)
                        + toStringR(hash, env)
                        + "."
                        + toStringR(
                                env.callMethod(this, "guessExtension", UploadedFile.class), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UploadedFile.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method %s::%s does not exist.",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"),
                                            method.getObject())
                                    .value()));
        }

        macro =
                ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Http
                                                .classes
                                                .UploadedFile
                                                .RequestStaticProperties
                                                .class,
                                        "macros")
                                .arrayGet(env, method.getObject()));
        if (ZVal.isTrue(ZVal.checkInstanceType(macro, Closure.class, "Closure"))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.callMethod(
                                            macro,
                                            "bindTo",
                                            UploadedFile.class,
                                            this,
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class")),
                                    parameters)
                            .value());
        }

        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(macro, parameters)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Http\\UploadedFile";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Symfony
                    .namespaces
                    .Component
                    .namespaces
                    .HttpFoundation
                    .namespaces
                    .File
                    .classes
                    .UploadedFile
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object fake(RuntimeEnv env, Object... args) {
            return ZVal.assign(new FileFactory(env));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "file",
            typeHint = "Symfony\\Component\\HttpFoundation\\File\\UploadedFile"
        )
        @ConvertedParameter(
            index = 1,
            name = "test",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object createFromBase(RuntimeEnv env, Object... args) {
            Object file = assignParameter(args, 0, false);
            Object test = assignParameter(args, 1, true);
            if (null == test) {
                test = false;
            }
            return ZVal.assign(
                    ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            file,
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Http
                                                    .classes
                                                    .UploadedFile
                                                    .class,
                                            "Illuminate\\Http\\UploadedFile"))
                            ? file
                            : env.createNewWithLateStaticBindings(
                                    this,
                                    env.callMethod(file, "getPathname", UploadedFile.class),
                                    env.callMethod(
                                            file, "getClientOriginalName", UploadedFile.class),
                                    env.callMethod(file, "getClientMimeType", UploadedFile.class),
                                    env.callMethod(file, "getClientSize", UploadedFile.class),
                                    env.callMethod(file, "getError", UploadedFile.class),
                                    test));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Http
                                    .classes
                                    .UploadedFile
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            UploadedFile.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2338 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2338.getValue());
                env.callMethod(method, "setAccessible", UploadedFile.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UploadedFile.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", UploadedFile.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Http
                                            .classes
                                            .UploadedFile
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UploadedFile.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Method %s::%s does not exist.",
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                method)
                                        .value()));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Http
                                                    .classes
                                                    .UploadedFile
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Http
                                                                        .classes
                                                                        .UploadedFile
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Http
                                                            .classes
                                                            .UploadedFile
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Http\\UploadedFile")
                    .setLookup(
                            UploadedFile.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("error", "hashName", "mimeType", "originalName", "test")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Http/UploadedFile.php")
                    .addTrait("Illuminate\\Http\\FileHelpers")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\File\\UploadedFile")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\File\\File")
                    .addExtendsClass("SplFileInfo")
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
