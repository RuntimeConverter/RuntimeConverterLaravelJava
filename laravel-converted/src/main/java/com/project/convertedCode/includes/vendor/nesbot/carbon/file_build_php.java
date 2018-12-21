package com.project.convertedCode.includes.vendor.nesbot.carbon;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveDirectoryIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeClasses.otherExtensions.ZipArchive;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_chdir;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_usort;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nesbot/carbon/build.php

*/

public class file_build_php implements RuntimeIncludable {

    public static final file_build_php instance = new file_build_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1948 scope = new Scope1948();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1948 scope)
            throws IncludeEventException {
        int runtimeConverterContinueCount;
        function_chdir.f.env(env).call(env.addRootFilesystemPrefix("/vendor/nesbot/carbon"));
        scope.currentBranch = "master";
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, scope.match))
                .call(
                        "/On branch ([^\\n]+)\\n/",
                        NamespaceGlobal.shell_exec.env(env).call("git status").value(),
                        scope.match.getObject())
                .getBool()) {
            scope.currentBranch = ZVal.assign(scope.match.arrayGet(env, 1));
        }

        NamespaceGlobal.shell_exec.env(env).call("git fetch --all --tags --prune");
        scope.remotes.setObject(
                function_explode
                        .f
                        .env(env)
                        .call(
                                "\n",
                                function_trim
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.shell_exec
                                                        .env(env)
                                                        .call("git remote")
                                                        .value())
                                        .value())
                        .value());
        scope.tagsCommand =
                ZVal.assign(
                        function_count.f.env(env).call(scope.remotes.getObject()).getBool()
                                ? "git ls-remote --tags "
                                        + toStringR(
                                                function_in_array
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        "upstream",
                                                                        scope.remotes.getObject())
                                                                .getBool()
                                                        ? "upstream"
                                                        : function_in_array
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                "origin",
                                                                                scope.remotes
                                                                                        .getObject())
                                                                        .getBool()
                                                                ? "origin"
                                                                : scope.remotes.arrayGet(env, 0),
                                                env)
                                : "git tag");
        scope.tags =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env, this.getContextConstants(), "", stack.get("this")) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "ref")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer ref =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        ref.setObject(
                                                function_explode
                                                        .f
                                                        .env(env)
                                                        .call("refs/tags/", ref.getObject())
                                                        .value());
                                        return ZVal.assign(
                                                arrayActionR(ArrayAction.ISSET, ref, env, 1)
                                                        ? ref.arrayGet(env, 1)
                                                        : ref.arrayGet(env, 0));
                                    }
                                },
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                function_explode
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "\n",
                                                                function_trim
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                NamespaceGlobal
                                                                                        .shell_exec
                                                                                        .env(env)
                                                                                        .call(
                                                                                                scope.tagsCommand)
                                                                                        .value())
                                                                        .value())
                                                        .value(),
                                                new Closure(
                                                        env,
                                                        this.getContextConstants(),
                                                        "",
                                                        stack.get("this")) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "ref")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object ref =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                ZVal.strictNotEqualityCheck(
                                                                        function_substr
                                                                                .f
                                                                                .env(env)
                                                                                .call(ref, -3)
                                                                                .value(),
                                                                        "!==",
                                                                        "^{}"));
                                                    }
                                                })
                                        .value())
                        .value();
        function_usort.f.env(env).call(scope.tags, "version_compare");
        scope.tag =
                ZVal.assign(
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, scope.argv, env, 1))
                                        && ZVal.toBool(
                                                !function_in_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                scope.argv.arrayGet(env, 1),
                                                                ZVal.arrayFromList(
                                                                        "last", "latest"))
                                                        .getBool())
                                ? scope.argv.arrayGet(env, 1)
                                : function_end.f.env(env).call(scope.tags).value());
        if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.strtolower.env(env).call(scope.tag).value(), "!==", "all")) {
            if (!function_in_array.f.env(env).call(scope.tag, scope.tags).getBool()) {
                env.echo("Tag must be one of remote tags available:\n");
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult827 : ZVal.getIterable(scope.tags, env, true)) {
                    scope._tag = ZVal.assign(zpairResult827.getValue());
                    env.echo("  - " + toStringR(scope._tag, env) + "\n");
                }

                env.echo("\"" + toStringR(scope.tag, env) + "\" does not match.\n");
                env.exit(1);
            }

            scope.tags = ZVal.newArray(new ZPair(0, scope.tag));
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult828 : ZVal.getIterable(scope.tags, env, true)) {
            scope.tag = ZVal.assign(zpairResult828.getValue());
            scope.archive = ZVal.assign("Carbon-" + toStringR(scope.tag, env) + ".zip");
            if (ZVal.toBool(
                            ZVal.toBool(arrayActionR(ArrayAction.ISSET, scope.argv, env, 2))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    scope.argv.arrayGet(env, 2), "===", "missing")))
                    && ZVal.toBool(function_file_exists.f.env(env).call(scope.archive).value())) {
                continue;
            }

            scope.branch = ZVal.assign("build-" + toStringR(scope.tag, env));
            NamespaceGlobal.shell_exec.env(env).call("git stash");
            NamespaceGlobal.shell_exec
                    .env(env)
                    .call("git branch -d " + toStringR(scope.branch, env));
            NamespaceGlobal.shell_exec
                    .env(env)
                    .call(
                            "git checkout tags/"
                                    + toStringR(scope.tag, env)
                                    + " -b "
                                    + toStringR(scope.branch, env));
            NamespaceGlobal.shell_exec.env(env).call("composer config platform.php 5.3.9");
            NamespaceGlobal.shell_exec
                    .env(env)
                    .call("composer update --no-interaction --no-dev --optimize-autoloader");
            scope.zip = new ZipArchive(env);
            env.callMethod(
                    scope.zip,
                    "open",
                    file_build_php.class,
                    scope.archive,
                    ZVal.toLong(1) | ZVal.toLong(8));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult829 :
                    ZVal.getIterable(ZVal.arrayFromList("src", "vendor", "Carbon"), env, true)) {
                scope.directory = ZVal.assign(zpairResult829.getValue());
                if (function_is_dir.f.env(env).call(scope.directory).getBool()) {
                    scope.directory = function_realpath.f.env(env).call(scope.directory).value();
                    scope.base = function_dirname.f.env(env).call(scope.directory).value();
                    scope.files =
                            new RecursiveIteratorIterator(
                                    env, new RecursiveDirectoryIterator(env, scope.directory), 0);
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult830 : ZVal.getIterable(scope.files, env, false)) {
                        scope.name = ZVal.assign(zpairResult830.getKey());
                        scope.file = ZVal.assign(zpairResult830.getValue());
                        if (!ZVal.isTrue(
                                env.callMethod(scope.file, "isDir", file_build_php.class))) {
                            scope.filePath =
                                    env.callMethod(scope.file, "getRealPath", file_build_php.class);
                            env.callMethod(
                                    scope.zip,
                                    "addFile",
                                    file_build_php.class,
                                    scope.filePath,
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    scope.filePath,
                                                    ZVal.add(
                                                            function_strlen
                                                                    .f
                                                                    .env(env)
                                                                    .call(scope.base)
                                                                    .value(),
                                                            1))
                                            .value());
                        }
                    }
                }
            }

            scope.autoload = "autoload.php";
            NamespaceGlobal.file_put_contents
                    .env(env)
                    .call(
                            scope.autoload,
                            "<?php\n\n/**\n * @version "
                                    + toStringR(scope.tag, env)
                                    + "\n */\n\nrequire __DIR__.'/vendor/autoload.php';\n");
            env.callMethod(
                    scope.zip, "addFile", file_build_php.class, scope.autoload, scope.autoload);
            env.callMethod(scope.zip, "close", file_build_php.class);
            NamespaceGlobal.unlink.env(env).call(scope.autoload);
            NamespaceGlobal.shell_exec.env(env).call("git checkout .");
            NamespaceGlobal.shell_exec
                    .env(env)
                    .call("git checkout " + toStringR(scope.currentBranch, env));
            NamespaceGlobal.shell_exec
                    .env(env)
                    .call("git branch -d " + toStringR(scope.branch, env));
            NamespaceGlobal.shell_exec.env(env).call("git stash pop");
            NamespaceGlobal.shell_exec.env(env).call("composer update --no-interaction");
        }

        env.exit(0);
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nesbot/carbon")
                    .setFile("/vendor/nesbot/carbon/build.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1948 implements UpdateRuntimeScopeInterface {

        Object zip;
        Object filePath;
        ReferenceContainer match;
        Object archive;
        Object currentBranch;
        ReferenceContainer argv;
        Object branch;
        Object directory;
        Object tags;
        Object tagsCommand;
        Object file;
        Object _tag;
        Object name;
        ReferenceContainer remotes;
        Object files;
        Object autoload;
        Object tag;
        Object base;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("zip", this.zip);
            stack.setVariable("filePath", this.filePath);
            stack.setVariable("match", this.match);
            stack.setVariable("archive", this.archive);
            stack.setVariable("currentBranch", this.currentBranch);
            stack.setVariable("argv", this.argv);
            stack.setVariable("branch", this.branch);
            stack.setVariable("directory", this.directory);
            stack.setVariable("tags", this.tags);
            stack.setVariable("tagsCommand", this.tagsCommand);
            stack.setVariable("file", this.file);
            stack.setVariable("_tag", this._tag);
            stack.setVariable("name", this.name);
            stack.setVariable("remotes", this.remotes);
            stack.setVariable("files", this.files);
            stack.setVariable("autoload", this.autoload);
            stack.setVariable("tag", this.tag);
            stack.setVariable("base", this.base);
        }

        public void updateScope(RuntimeStack stack) {

            this.zip = stack.getVariable("zip");
            this.filePath = stack.getVariable("filePath");
            this.match = ZVal.getStackReference(stack.getVariable("match"));
            this.archive = stack.getVariable("archive");
            this.currentBranch = stack.getVariable("currentBranch");
            this.argv = ZVal.getStackReference(stack.getVariable("argv"));
            this.branch = stack.getVariable("branch");
            this.directory = stack.getVariable("directory");
            this.tags = stack.getVariable("tags");
            this.tagsCommand = stack.getVariable("tagsCommand");
            this.file = stack.getVariable("file");
            this._tag = stack.getVariable("_tag");
            this.name = stack.getVariable("name");
            this.remotes = ZVal.getStackReference(stack.getVariable("remotes"));
            this.files = stack.getVariable("files");
            this.autoload = stack.getVariable("autoload");
            this.tag = stack.getVariable("tag");
            this.base = stack.getVariable("base");
        }
    }
}
