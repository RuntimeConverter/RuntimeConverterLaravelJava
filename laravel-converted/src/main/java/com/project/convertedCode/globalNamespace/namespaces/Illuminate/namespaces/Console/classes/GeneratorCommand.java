package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.functions.config;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/GeneratorCommand.php

*/

public abstract class GeneratorCommand extends Command {

    public Object files = null;

    public Object type = null;

    public GeneratorCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GeneratorCommand.class) {
            this.__construct(env, args);
        }
    }

    public GeneratorCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        super.__construct(env);
        this.files = files;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object path = null;
        Object name = null;
        name = this.qualifyClass(env, this.getNameInput(env));
        path = this.getPath(env, name);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        this,
                                                        "hasOption",
                                                        GeneratorCommand.class,
                                                        "force")))
                                || ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        this,
                                                        "option",
                                                        GeneratorCommand.class,
                                                        "force"))))
                && ZVal.toBool(this.alreadyExists(env, this.getNameInput(env)))) {
            env.callMethod(
                    this,
                    "error",
                    GeneratorCommand.class,
                    toStringR(this.type, env) + " already exists!");
            return ZVal.assign(false);
        }

        this.makeDirectory(env, path);
        env.callMethod(this.files, "put", GeneratorCommand.class, path, this.buildClass(env, name));
        env.callMethod(
                this,
                "info",
                GeneratorCommand.class,
                toStringR(this.type, env) + " created successfully.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object qualifyClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object rootNamespace = null;
        name = function_ltrim.f.env(env).call(name, "\\/").value();
        rootNamespace = this.rootNamespace(env);
        if (ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, name, rootNamespace))) {
            return ZVal.assign(name);
        }

        name = function_str_replace.f.env(env).call("/", "\\", name).value();
        return ZVal.assign(
                this.qualifyClass(
                        env,
                        toStringR(
                                        this.getDefaultNamespace(
                                                env,
                                                function_trim
                                                        .f
                                                        .env(env)
                                                        .call(rootNamespace, "\\")
                                                        .value()),
                                        env)
                                + "\\"
                                + toStringR(name, env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    protected Object getDefaultNamespace(RuntimeEnv env, Object... args) {
        Object rootNamespace = assignParameter(args, 0, false);
        return ZVal.assign(rootNamespace);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rawName")
    protected Object alreadyExists(RuntimeEnv env, Object... args) {
        Object rawName = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.files,
                        "exists",
                        GeneratorCommand.class,
                        this.getPath(env, this.qualifyClass(env, rawName))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getPath(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        name = Str.runtimeStaticObject.replaceFirst(env, this.rootNamespace(env), "", name);
        return ZVal.assign(
                toStringR(
                                new ReferenceClassProperty(this, "laravel", env)
                                        .arrayGet(env, "path"),
                                env)
                        + "/"
                        + toStringR(
                                function_str_replace.f.env(env).call("\\", "/", name).value(), env)
                        + ".php");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object makeDirectory(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        this.files,
                        "isDirectory",
                        GeneratorCommand.class,
                        function_dirname.f.env(env).call(path).value()))) {
            env.callMethod(
                    this.files,
                    "makeDirectory",
                    GeneratorCommand.class,
                    function_dirname.f.env(env).call(path).value(),
                    511,
                    true,
                    true);
        }

        return ZVal.assign(path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object buildClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer stub = new BasicReferenceContainer(null);
        stub.setObject(
                env.callMethod(
                        this.files,
                        "get",
                        GeneratorCommand.class,
                        env.callMethod(this, "getStub", GeneratorCommand.class)));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this,
                                new RuntimeArgsWithReferences().add(0, stub),
                                "replaceNamespace",
                                GeneratorCommand.class,
                                stub.getObject(),
                                name),
                        "replaceClass",
                        GeneratorCommand.class,
                        stub.getObject(),
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stub")
    @ConvertedParameter(index = 1, name = "name")
    protected Object replaceNamespace(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer stub = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object name = assignParameter(args, 1, false);
        stub.setObject(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(
                                        "DummyNamespace",
                                        "DummyRootNamespace",
                                        "NamespacedDummyUserModel"),
                                ZVal.newArray(
                                        new ZPair(0, this.getNamespace(env, name)),
                                        new ZPair(1, this.rootNamespace(env)),
                                        new ZPair(
                                                2,
                                                config.f
                                                        .env(env)
                                                        .call("auth.providers.users.model")
                                                        .value())),
                                stub.getObject())
                        .value());
        return ZVal.assign(this);
    }

    public Object replaceNamespace(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getNamespace(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "\\",
                                                function_array_slice
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                function_explode
                                                                        .f
                                                                        .env(env)
                                                                        .call("\\", name)
                                                                        .value(),
                                                                0,
                                                                -1)
                                                        .value())
                                        .value(),
                                "\\")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stub")
    @ConvertedParameter(index = 1, name = "name")
    protected Object replaceClass(RuntimeEnv env, Object... args) {
        Object stub = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object _pClass = null;
        _pClass =
                function_str_replace
                        .f
                        .env(env)
                        .call(toStringR(this.getNamespace(env, name), env) + "\\", "", name)
                        .value();
        return ZVal.assign(
                function_str_replace.f.env(env).call("DummyClass", _pClass, stub).value());
    }

    @ConvertedMethod
    protected Object getNameInput(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(env.callMethod(this, "argument", GeneratorCommand.class, "name"))
                        .value());
    }

    @ConvertedMethod
    protected Object rootNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("laravel").value(),
                        "getNamespace",
                        GeneratorCommand.class));
    }

    @ConvertedMethod
    protected Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "name"),
                                        new ZPair(1, InputArgument.CONST_REQUIRED),
                                        new ZPair(2, "The name of the class")))));
    }

    public static final Object CONST_class = "Illuminate\\Console\\GeneratorCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Console\\GeneratorCommand")
                    .setLookup(
                            GeneratorCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "files",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "synopsis",
                            "type",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/GeneratorCommand.php")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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
