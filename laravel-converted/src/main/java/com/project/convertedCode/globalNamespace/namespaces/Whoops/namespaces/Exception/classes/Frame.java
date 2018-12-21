package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Exception/Frame.php

*/

public class Frame extends RuntimeClassBase implements Serializable {

    public Object frame = null;

    public Object fileContentsCache = null;

    public Object comments = ZVal.newArray();

    public Object application = null;

    public Frame(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Frame.class) {
            this.__construct(env, args);
        }
    }

    public Frame(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "frame", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object frame = assignParameter(args, 0, false);
        this.frame = frame;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "shortened",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getFile(RuntimeEnv env, Object... args) {
        Object shortened = assignParameter(args, 0, true);
        if (null == shortened) {
            shortened = false;
        }
        Object file = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object dirname = null;
        if (arrayActionR(
                ArrayAction.EMPTY, new ReferenceClassProperty(this, "frame", env), env, "file")) {
            return ZVal.assign(ZVal.getNull());
        }

        file = ZVal.assign(new ReferenceClassProperty(this, "frame", env).arrayGet(env, "file"));
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^(.*)\\((\\d+)\\) : (?:eval\\(\\)'d|assert) code$/",
                        file,
                        matches.getObject())
                .getBool()) {
            file =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "frame", env)
                                    .arrayAccess(env, "file")
                                    .set(matches.arrayGet(env, 1)));
            new ReferenceClassProperty(this, "frame", env)
                    .arrayAccess(env, "line")
                    .set(ZVal.toLong(matches.arrayGet(env, 2)));
        }

        if (ZVal.toBool(shortened)
                && ZVal.toBool(function_is_string.f.env(env).call(file).value())) {
            dirname =
                    function_dirname
                            .f
                            .env(env)
                            .call(
                                    function_dirname
                                            .f
                                            .env(env)
                                            .call(
                                                    function_dirname
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    function_dirname
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    function_dirname
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    function_dirname
                                                                                                            .f
                                                                                                            .env(
                                                                                                                    env)
                                                                                                            .call(
                                                                                                                    env
                                                                                                                            .addRootFilesystemPrefix(
                                                                                                                                    "/vendor/filp/whoops/src/Whoops/Exception"))
                                                                                                            .value())
                                                                                            .value())
                                                                            .value())
                                                            .value())
                                            .value())
                            .value();
            if (ZVal.strictNotEqualityCheck(dirname, "!==", "/")) {
                file = function_str_replace.f.env(env).call(dirname, "&hellip;", file).value();
            }

            file = function_str_replace.f.env(env).call("/", "/&shy;", file).value();
        }

        return ZVal.assign(file);
    }

    @ConvertedMethod
    public Object getLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "frame", env),
                                env,
                                "line")
                        ? new ReferenceClassProperty(this, "frame", env).arrayGet(env, "line")
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "frame", env),
                                env,
                                "class")
                        ? new ReferenceClassProperty(this, "frame", env).arrayGet(env, "class")
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getFunction(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "frame", env),
                                env,
                                "function")
                        ? new ReferenceClassProperty(this, "frame", env).arrayGet(env, "function")
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getArgs(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "frame", env),
                                env,
                                "args")
                        ? rToArrayCast(
                                new ReferenceClassProperty(this, "frame", env)
                                        .arrayGet(env, "args"))
                        : ZVal.newArray());
    }

    @ConvertedMethod
    public Object getFileContents(RuntimeEnv env, Object... args) {
        Object filePath = null;
        if (ZVal.toBool(ZVal.strictEqualityCheck(this.fileContentsCache, "===", ZVal.getNull()))
                && ZVal.toBool(filePath = this.getFile(env))) {
            if (ZVal.strictEqualityCheck(filePath, "===", "Unknown")) {
                return ZVal.assign(ZVal.getNull());
            }

            if (!function_is_file.f.env(env).call(filePath).getBool()) {
                return ZVal.assign(ZVal.getNull());
            }

            this.fileContentsCache = function_file_get_contents.f.env(env).call(filePath).value();
        }

        return ZVal.assign(this.fileContentsCache);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "comment")
    @ConvertedParameter(index = 1, name = "context")
    public Object addComment(RuntimeEnv env, Object... args) {
        Object comment = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = "global";
        }
        new ReferenceClassProperty(this, "comments", env)
                .arrayAppend(env)
                .set(ZVal.newArray(new ZPair("comment", comment), new ZPair("context", context)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "filter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getComments(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/filp/whoops/src/Whoops/Exception")
                        .setFile("/vendor/filp/whoops/src/Whoops/Exception/Frame.php");
        Object filter = assignParameter(args, 0, true);
        if (null == filter) {
            filter = ZVal.getNull();
        }
        Object comments = null;
        comments = ZVal.assign(this.comments);
        if (ZVal.strictNotEqualityCheck(filter, "!==", ZVal.getNull())) {
            comments =
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    comments,
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Whoops\\Exception",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "c")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer c =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            Object filter = null;
                                            filter =
                                                    this.contextReferences.getCapturedValue(
                                                            "filter");
                                            return ZVal.assign(
                                                    ZVal.equalityCheck(
                                                            c.arrayGet(env, "context"), filter));
                                        }
                                    }.use("filter", filter))
                            .value();
        }

        return ZVal.assign(comments);
    }

    @ConvertedMethod
    public Object getRawFrame(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.frame);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 1,
        name = "length",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getFileLines(RuntimeEnv env, Object... args) {
        Object start = assignParameter(args, 0, true);
        if (null == start) {
            start = 0;
        }
        Object length = assignParameter(args, 1, true);
        if (null == length) {
            length = ZVal.getNull();
        }
        Object contents = null;
        Object lines = null;
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(), "!==", contents = this.getFileContents(env))) {
            lines = function_explode.f.env(env).call("\n", contents).value();
            if (ZVal.strictNotEqualityCheck(length, "!==", ZVal.getNull())) {
                start = ZVal.assign(ZVal.toLong(start));
                length = ZVal.assign(ZVal.toLong(length));
                if (ZVal.isLessThan(start, '<', 0)) {
                    start = 0;
                }

                if (ZVal.isLessThanOrEqualTo(length, "<=", 0)) {
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env,
                                    "$length("
                                            + toStringR(length, env)
                                            + ") cannot be lower or equal to 0"));
                }

                lines = function_array_slice.f.env(env).call(lines, start, length, true).value();
            }

            return ZVal.assign(lines);
        }

        return null;
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        ReferenceContainer frame = new BasicReferenceContainer(null);
        frame.setObject(ZVal.assign(this.frame));
        if (!ZVal.isEmpty(this.comments)) {
            frame.arrayAccess(env, "_comments").set(this.comments);
        }

        return ZVal.assign(function_serialize.f.env(env).call(frame.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "serializedFrame")
    public Object unserialize(RuntimeEnv env, Object... args) {
        Object serializedFrame = assignParameter(args, 0, false);
        ReferenceContainer frame = new BasicReferenceContainer(null);
        frame.setObject(function_unserialize.f.env(env).call(serializedFrame).value());
        if (!arrayActionR(ArrayAction.EMPTY, frame, env, "_comments")) {
            this.comments = frame.arrayGet(env, "_comments");
            arrayActionR(ArrayAction.UNSET, frame, env, "_comments");
        }

        this.frame = frame.getObject();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "frame", typeHint = "Whoops\\Exception\\Frame")
    public Object equals(RuntimeEnv env, Object... args) {
        Object frame = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.toBool(!ZVal.isTrue(this.getFile(env)))
                                || ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                this.getFile(env), "===", "Unknown")))
                || ZVal.toBool(!ZVal.isTrue(this.getLine(env)))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        env.callMethod(frame, "getFile", Frame.class),
                                        "===",
                                        this.getFile(env)))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        env.callMethod(frame, "getLine", Frame.class),
                                        "===",
                                        this.getLine(env))));
    }

    @ConvertedMethod
    public Object isApplication(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.application);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "application")
    public Object setApplication(RuntimeEnv env, Object... args) {
        Object application = assignParameter(args, 0, false);
        this.application = application;
        return null;
    }

    public static final Object CONST_class = "Whoops\\Exception\\Frame";

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
                    .setName("Whoops\\Exception\\Frame")
                    .setLookup(
                            Frame.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("application", "comments", "fileContentsCache", "frame")
                    .setFilename("vendor/filp/whoops/src/Whoops/Exception/Frame.php")
                    .addInterface("Serializable")
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
