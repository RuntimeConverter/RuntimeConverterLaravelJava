package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Filesystem;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.Local;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.MountManager;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/VendorPublishCommand.php

*/

public class VendorPublishCommand extends Command {

    public Object files = null;

    public Object provider = ZVal.getNull();

    public Object tags = ZVal.newArray();

    public VendorPublishCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature =
                "vendor:publish {--force : Overwrite any existing files.}\n                    {--all : Publish assets for all service providers without prompt.}\n                    {--provider= : The service provider that has assets you want to publish.}\n                    {--tag=* : One or many tags that have assets you want to publish.}";
        this.description = "Publish any publishable assets from vendor packages";
        if (this.getClass() == VendorPublishCommand.class) {
            this.__construct(env, args);
        }
    }

    public VendorPublishCommand(NoConstructor n) {
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
        Object ternaryExpressionTemp = null;
        Object tag = null;
        this.determineWhatShouldBePublished(env);
        for (ZPair zpairResult410 :
                ZVal.getIterable(
                        ZVal.isTrue(ternaryExpressionTemp = this.tags)
                                ? ternaryExpressionTemp
                                : ZVal.newArray(new ZPair(0, ZVal.getNull())),
                        env,
                        true)) {
            tag = ZVal.assign(zpairResult410.getValue());
            this.publishTag(env, tag);
        }

        env.callMethod(this, "info", VendorPublishCommand.class, "Publishing complete.");
        return null;
    }

    @ConvertedMethod
    protected Object determineWhatShouldBePublished(RuntimeEnv env, Object... args) {
        Object runtimeTempArrayResult60 = null;
        if (ZVal.isTrue(env.callMethod(this, "option", VendorPublishCommand.class, "all"))) {
            return null;
        }

        ZVal.list(
                runtimeTempArrayResult60 =
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        env.callMethod(
                                                this,
                                                "option",
                                                VendorPublishCommand.class,
                                                "provider")),
                                new ZPair(
                                        1,
                                        rToArrayCast(
                                                env.callMethod(
                                                        this,
                                                        "option",
                                                        VendorPublishCommand.class,
                                                        "tag")))),
                (this.provider = listGet(runtimeTempArrayResult60, 0, env)),
                (this.tags = listGet(runtimeTempArrayResult60, 1, env)));
        if (ZVal.toBool(!ZVal.isTrue(this.provider)) && ZVal.toBool(!ZVal.isTrue(this.tags))) {
            this.promptForProviderOrTag(env);
        }

        return null;
    }

    @ConvertedMethod
    protected Object promptForProviderOrTag(RuntimeEnv env, Object... args) {
        Object choice = null;
        ReferenceContainer choices = new BasicReferenceContainer(null);
        choice =
                env.callMethod(
                        this,
                        "choice",
                        VendorPublishCommand.class,
                        "Which provider or tag's files would you like to publish?",
                        choices.setObject(this.publishableChoices(env)));
        if (ZVal.toBool(ZVal.equalityCheck(choice, choices.arrayGet(env, 0)))
                || ZVal.toBool(function_is_null.f.env(env).call(choice).value())) {
            return null;
        }

        this.parseChoice(env, choice);
        return null;
    }

    @ConvertedMethod
    protected Object publishableChoices(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(
                                        "<comment>Publish files from all providers and tags listed below</comment>"),
                                NamespaceGlobal.preg_filter
                                        .env(env)
                                        .call(
                                                "/^/",
                                                "<comment>Provider: </comment>",
                                                Arr.runtimeStaticObject.sort(
                                                        env,
                                                        ServiceProvider.runtimeStaticObject
                                                                .publishableProviders(env)))
                                        .value(),
                                NamespaceGlobal.preg_filter
                                        .env(env)
                                        .call(
                                                "/^/",
                                                "<comment>Tag: </comment>",
                                                Arr.runtimeStaticObject.sort(
                                                        env,
                                                        ServiceProvider.runtimeStaticObject
                                                                .publishableGroups(env)))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "choice")
    protected Object parseChoice(RuntimeEnv env, Object... args) {
        Object choice = assignParameter(args, 0, false);
        Object runtimeTempArrayResult61 = null;
        Object type = null;
        Object value = null;
        ZVal.list(
                runtimeTempArrayResult61 =
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        ": ",
                                        NamespaceGlobal.strip_tags.env(env).call(choice).value())
                                .value(),
                (type = listGet(runtimeTempArrayResult61, 0, env)),
                (value = listGet(runtimeTempArrayResult61, 1, env)));
        if (ZVal.equalityCheck(type, "Provider")) {
            this.provider = value;

        } else if (ZVal.equalityCheck(type, "Tag")) {
            this.tags = ZVal.newArray(new ZPair(0, value));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tag")
    protected Object publishTag(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, false);
        Object from = null;
        Object to = null;
        for (ZPair zpairResult411 : ZVal.getIterable(this.pathsToPublish(env, tag), env, false)) {
            from = ZVal.assign(zpairResult411.getKey());
            to = ZVal.assign(zpairResult411.getValue());
            this.publishItem(env, from, to);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tag")
    protected Object pathsToPublish(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, false);
        return ZVal.assign(
                ServiceProvider.runtimeStaticObject.pathsToPublish(env, this.provider, tag));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    protected Object publishItem(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        if (ZVal.isTrue(env.callMethod(this.files, "isFile", VendorPublishCommand.class, from))) {
            return ZVal.assign(this.publishFile(env, from, to));

        } else if (ZVal.isTrue(
                env.callMethod(this.files, "isDirectory", VendorPublishCommand.class, from))) {
            return ZVal.assign(this.publishDirectory(env, from, to));
        }

        env.callMethod(
                this,
                "error",
                VendorPublishCommand.class,
                "Can't locate path: <" + toStringR(from, env) + ">");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    protected Object publishFile(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        this.files, "exists", VendorPublishCommand.class, to)))
                || ZVal.toBool(
                        env.callMethod(this, "option", VendorPublishCommand.class, "force"))) {
            this.createParentDirectory(env, function_dirname.f.env(env).call(to).value());
            env.callMethod(this.files, "copy", VendorPublishCommand.class, from, to);
            this.status(env, from, to, "File");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    protected Object publishDirectory(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        this.moveManagedFiles(
                env,
                new MountManager(
                        env,
                        ZVal.newArray(
                                new ZPair("from", new Filesystem(env, new Local(env, from))),
                                new ZPair("to", new Filesystem(env, new Local(env, to))))));
        this.status(env, from, to, "Directory");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager")
    protected Object moveManagedFiles(RuntimeEnv env, Object... args) {
        Object manager = assignParameter(args, 0, false);
        ReferenceContainer file = new BasicReferenceContainer(null);
        for (ZPair zpairResult412 :
                ZVal.getIterable(
                        env.callMethod(
                                manager,
                                "listContents",
                                VendorPublishCommand.class,
                                "from://",
                                true),
                        env,
                        true)) {
            file.setObject(ZVal.assign(zpairResult412.getValue()));
            if (ZVal.toBool(ZVal.strictEqualityCheck(file.arrayGet(env, "type"), "===", "file"))
                    && ZVal.toBool(
                            ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            manager,
                                                            "has",
                                                            VendorPublishCommand.class,
                                                            "to://"
                                                                    + toStringR(
                                                                            file.arrayGet(
                                                                                    env, "path"),
                                                                            env))))
                                    || ZVal.toBool(
                                            env.callMethod(
                                                    this,
                                                    "option",
                                                    VendorPublishCommand.class,
                                                    "force")))) {
                env.callMethod(
                        manager,
                        "put",
                        VendorPublishCommand.class,
                        "to://" + toStringR(file.arrayGet(env, "path"), env),
                        env.callMethod(
                                manager,
                                "read",
                                VendorPublishCommand.class,
                                "from://" + toStringR(file.arrayGet(env, "path"), env)));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    protected Object createParentDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(this.files, "isDirectory", VendorPublishCommand.class, directory))) {
            env.callMethod(
                    this.files, "makeDirectory", VendorPublishCommand.class, directory, 493, true);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    @ConvertedParameter(index = 2, name = "type")
    protected Object status(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        from =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                base_path.f.env(env).call().value(),
                                "",
                                function_realpath.f.env(env).call(from).value())
                        .value();
        to =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                base_path.f.env(env).call().value(),
                                "",
                                function_realpath.f.env(env).call(to).value())
                        .value();
        env.callMethod(
                this,
                "line",
                VendorPublishCommand.class,
                "<info>Copied "
                        + toStringR(type, env)
                        + "</info> <comment>["
                        + toStringR(from, env)
                        + "]</comment> <info>To</info> <comment>["
                        + toStringR(to, env)
                        + "]</comment>");
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Console\\VendorPublishCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\VendorPublishCommand")
                    .setLookup(
                            VendorPublishCommand.class,
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
                            "provider",
                            "signature",
                            "signature",
                            "synopsis",
                            "tags",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/VendorPublishCommand.php")
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
