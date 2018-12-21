package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Config;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Util.classes.MimeType;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Util.php

*/

public class Util extends RuntimeClassBase {

    public Util(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Util(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "League\\Flysystem\\Util";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "path")
        public Object pathinfo(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope171 scope = new Scope171();
            stack.pushScope(scope);
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/league/flysystem/src")
                                .setFile("/vendor/league/flysystem/src/Util.php");
                scope.path = assignParameter(args, 0, false);
                scope.dirname = null;
                scope.pathinfo = new BasicReferenceContainer(null);
                scope.pathinfo.setObject(function_compact.f.env(env).call(stack, "path").value());
                if (ZVal.strictNotEqualityCheck(
                        "",
                        "!==",
                        scope.dirname = function_dirname.f.env(env).call(scope.path).value())) {
                    scope.pathinfo
                            .arrayAccess(env, "dirname")
                            .set(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Util.class)
                                            .method("normalizeDirname")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(scope.dirname)
                                            .value());
                }

                scope.pathinfo
                        .arrayAccess(env, "basename")
                        .set(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Util.class)
                                        .method("basename")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call(scope.path)
                                        .value());
                scope.pathinfo.setObject(
                        ZAssignment.add(
                                "+=",
                                scope.pathinfo.getObject(),
                                NamespaceGlobal.pathinfo
                                        .env(env)
                                        .call(scope.pathinfo.arrayGet(env, "basename"))
                                        .value()));
                throw new IncludeEventException(
                        ZVal.assign(
                                ZVal.add(
                                        scope.pathinfo.getObject(),
                                        ZVal.newArray(new ZPair("dirname", "")))));
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dirname")
        public Object normalizeDirname(RuntimeEnv env, Object... args) {
            Object dirname = assignParameter(args, 0, false);
            return ZVal.assign(ZVal.strictEqualityCheck(dirname, "===", ".") ? "" : dirname);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "path")
        public Object dirname(RuntimeEnv env, Object... args) {
            Object path = assignParameter(args, 0, false);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Util.class)
                            .method("normalizeDirname")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(function_dirname.f.env(env).call(path).value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object", typeHint = "array")
        @ConvertedParameter(index = 1, name = "map", typeHint = "array")
        public Object map(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            ReferenceContainer _object =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object map = assignParameter(args, 1, false);
            ReferenceContainer result = new BasicReferenceContainer(null);
            Object from = null;
            Object to = null;
            result.setObject(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult669 : ZVal.getIterable(map, env, false)) {
                from = ZVal.assign(zpairResult669.getKey());
                to = ZVal.assign(zpairResult669.getValue());
                if (!arrayActionR(ArrayAction.ISSET, _object, env, from)) {
                    continue;
                }

                result.arrayAccess(env, to).set(_object.arrayGet(env, from));
            }

            return ZVal.assign(result.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "path")
        public Object normalizePath(RuntimeEnv env, Object... args) {
            Object path = assignParameter(args, 0, false);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Util.class)
                            .method("normalizeRelativePath")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(path)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "path")
        public Object normalizeRelativePath(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object path = assignParameter(args, 0, false);
            Object part = null;
            ReferenceContainer parts = new BasicReferenceContainer(null);
            path = function_str_replace.f.env(env).call("\\", "/", path).value();
            path =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Util.class)
                            .method("removeFunkyWhiteSpace")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(path)
                            .value();
            parts.setObject(ZVal.newArray());
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult670 :
                    ZVal.getIterable(
                            function_explode.f.env(env).call("/", path).value(), env, true)) {
                part = ZVal.assign(zpairResult670.getValue());
                SwitchEnumType34 switchVariable34 =
                        ZVal.getEnum(
                                part,
                                SwitchEnumType34.DEFAULT_CASE,
                                SwitchEnumType34.STRING_,
                                "",
                                SwitchEnumType34.STRING__,
                                ".",
                                SwitchEnumType34.STRING___,
                                "..");
                switch (switchVariable34) {
                    case STRING_:
                    case STRING__:
                        break;
                    case STRING___:
                        if (ZVal.isEmpty(parts.getObject())) {
                            throw ZVal.getException(
                                    env,
                                    new LogicException(
                                            env,
                                            "Path is outside of the defined root, path: ["
                                                    + toStringR(path, env)
                                                    + "]"));
                        }

                        function_array_pop.f.env(env).call(parts.getObject());
                        break;
                    case DEFAULT_CASE:
                        parts.arrayAppend(env).set(part);
                        break;
                }
                ;
            }

            return ZVal.assign(
                    NamespaceGlobal.implode.env(env).call("/", parts.getObject()).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "path")
        protected Object removeFunkyWhiteSpace(RuntimeEnv env, Object... args) {
            Object path = assignParameter(args, 0, false);
            while (function_preg_match.f.env(env).call("#\\p{C}+|^\\./#u", path).getBool()) {
                path = function_preg_replace.f.env(env).call("#\\p{C}+|^\\./#u", "", path).value();
            }

            return ZVal.assign(path);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "prefix")
        @ConvertedParameter(index = 1, name = "separator")
        public Object normalizePrefix(RuntimeEnv env, Object... args) {
            Object prefix = assignParameter(args, 0, false);
            Object separator = assignParameter(args, 1, false);
            return ZVal.assign(
                    toStringR(function_rtrim.f.env(env).call(prefix, separator).value(), env)
                            + toStringR(separator, env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "contents")
        public Object contentSize(RuntimeEnv env, Object... args) {
            Object contents = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_defined.f.env(env).call("MB_OVERLOAD_STRING").getBool()
                            ? NamespaceGlobal.mb_strlen.env(env).call(contents, "8bit").value()
                            : function_strlen.f.env(env).call(contents).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "path")
        @ConvertedParameter(index = 1, name = "content")
        public Object guessMimeType(RuntimeEnv env, Object... args) {
            Object path = assignParameter(args, 0, false);
            Object content = assignParameter(args, 1, false);
            Object mimeType = null;
            mimeType = MimeType.runtimeStaticObject.detectByContent(env, content);
            if (!ZVal.toBool(ZVal.isEmpty(mimeType))
                    || ZVal.toBool(
                            function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            mimeType,
                                            ZVal.arrayFromList(
                                                    "application/x-empty",
                                                    "text/plain",
                                                    "text/x-asm"))
                                    .value())) {
                return ZVal.assign(mimeType);
            }

            return ZVal.assign(MimeType.runtimeStaticObject.detectByFilename(env, path));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "listing", typeHint = "array")
        public Object emulateDirectories(RuntimeEnv env, Object... args) {
            ReferenceContainer listing =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object listedDirectories = null;
            Object runtimeTempArrayResult113 = null;
            Object directories = null;
            Object directory = null;
            Object _object = null;
            directories = ZVal.newArray();
            listedDirectories = ZVal.newArray();
            for (ZPair zpairResult671 : ZVal.getIterable(listing.getObject(), env, true)) {
                _object = ZVal.assign(zpairResult671.getValue());
                ZVal.list(
                        runtimeTempArrayResult113 =
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Util.class)
                                        .method("emulateObjectDirectories")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call(_object, directories, listedDirectories)
                                        .value(),
                        (directories = listGet(runtimeTempArrayResult113, 0, env)),
                        (listedDirectories = listGet(runtimeTempArrayResult113, 1, env)));
            }

            directories =
                    function_array_diff
                            .f
                            .env(env)
                            .call(
                                    function_array_unique.f.env(env).call(directories).value(),
                                    function_array_unique
                                            .f
                                            .env(env)
                                            .call(listedDirectories)
                                            .value())
                            .value();
            for (ZPair zpairResult672 : ZVal.getIterable(directories, env, true)) {
                directory = ZVal.assign(zpairResult672.getValue());
                listing.arrayAppend(env)
                        .set(
                                ZVal.add(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Util.class)
                                                .method("pathinfo")
                                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                                .call(directory)
                                                .value(),
                                        ZVal.newArray(new ZPair("type", "dir"))));
            }

            return ZVal.assign(listing.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "config")
        public Object ensureConfig(RuntimeEnv env, Object... args) {
            Object config = assignParameter(args, 0, false);
            if (ZVal.strictEqualityCheck(config, "===", ZVal.getNull())) {
                return ZVal.assign(new Config(env));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(config, Config.class, "League\\Flysystem\\Config"))) {
                return ZVal.assign(config);
            }

            if (function_is_array.f.env(env).call(config).getBool()) {
                return ZVal.assign(new Config(env, config));
            }

            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "A config should either be an array or a Flysystem\\Config object."));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "resource")
        public Object rewindStream(RuntimeEnv env, Object... args) {
            Object resource = assignParameter(args, 0, false);
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    NamespaceGlobal.ftell.env(env).call(resource).value(),
                                    "!==",
                                    0))
                    && ZVal.toBool(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Util.class)
                                    .method("isSeekableStream")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(resource)
                                    .value())) {
                NamespaceGlobal.rewind.env(env).call(resource);
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "resource")
        public Object isSeekableStream(RuntimeEnv env, Object... args) {
            Object resource = assignParameter(args, 0, false);
            ReferenceContainer metadata = new BasicReferenceContainer(null);
            metadata.setObject(
                    NamespaceGlobal.stream_get_meta_data.env(env).call(resource).value());
            return ZVal.assign(metadata.arrayGet(env, "seekable"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "resource")
        public Object getStreamSize(RuntimeEnv env, Object... args) {
            Object resource = assignParameter(args, 0, false);
            ReferenceContainer stat = new BasicReferenceContainer(null);
            stat.setObject(NamespaceGlobal.fstat.env(env).call(resource).value());
            return ZVal.assign(stat.arrayGet(env, "size"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object", typeHint = "array")
        @ConvertedParameter(index = 1, name = "directories", typeHint = "array")
        @ConvertedParameter(index = 2, name = "listedDirectories", typeHint = "array")
        protected Object emulateObjectDirectories(RuntimeEnv env, Object... args) {
            ReferenceContainer _object =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer directories =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            ReferenceContainer listedDirectories =
                    new BasicReferenceContainer(assignParameter(args, 2, false));
            Object parent = null;
            if (ZVal.strictEqualityCheck(_object.arrayGet(env, "type"), "===", "dir")) {
                listedDirectories.arrayAppend(env).set(_object.arrayGet(env, "path"));
            }

            if (arrayActionR(ArrayAction.EMPTY, _object, env, "dirname")) {
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, directories.getObject()),
                                new ZPair(1, listedDirectories.getObject())));
            }

            parent = ZVal.assign(_object.arrayGet(env, "dirname"));
            while (ZVal.toBool(!ZVal.isEmpty(parent))
                    && ZVal.toBool(
                            !function_in_array
                                    .f
                                    .env(env)
                                    .call(parent, directories.getObject())
                                    .getBool())) {
                directories.arrayAppend(env).set(parent);
                parent =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Util.class)
                                .method("dirname")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(parent)
                                .value();
            }

            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, _object, env, "type"))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    _object.arrayGet(env, "type"), "===", "dir"))) {
                listedDirectories.arrayAppend(env).set(_object.arrayGet(env, "path"));
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, directories.getObject()),
                                new ZPair(1, listedDirectories.getObject())));
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, directories.getObject()),
                            new ZPair(1, listedDirectories.getObject())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "path")
        private Object basename(RuntimeEnv env, Object... args) {
            Object path = assignParameter(args, 0, false);
            Object basename = null;
            Object separators = null;
            separators = ZVal.assign(ZVal.strictEqualityCheck("/", "===", "/") ? "/" : "\\/");
            path = function_rtrim.f.env(env).call(path, separators).value();
            basename =
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "#.*?([^"
                                            + toStringR(
                                                    NamespaceGlobal.preg_quote
                                                            .env(env)
                                                            .call(separators, "#")
                                                            .value(),
                                                    env)
                                            + "]+$)#",
                                    "$1",
                                    path)
                            .value();
            if (ZVal.strictEqualityCheck("/", "===", "/")) {
                return ZVal.assign(basename);
            }

            while (function_preg_match
                    .f
                    .env(env)
                    .call("#^[a-zA-Z]{1}:[^\\\\/]#", basename)
                    .getBool()) {
                basename = function_substr.f.env(env).call(basename, 2).value();
            }

            if (function_preg_match.f.env(env).call("#^[a-zA-Z]{1}:$#", basename).getBool()) {
                basename = function_rtrim.f.env(env).call(basename, ":").value();
            }

            return ZVal.assign(basename);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Util")
                    .setLookup(
                            Util.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/league/flysystem/src/Util.php")
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

    private static class Scope171 implements UpdateRuntimeScopeInterface {

        Object path;
        Object dirname;
        ReferenceContainer pathinfo;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("path", this.path);
            stack.setVariable("dirname", this.dirname);
            stack.setVariable("pathinfo", this.pathinfo);
        }

        public void updateScope(RuntimeStack stack) {

            this.path = stack.getVariable("path");
            this.dirname = stack.getVariable("dirname");
            this.pathinfo = ZVal.getStackReference(stack.getVariable("pathinfo"));
        }
    }

    private enum SwitchEnumType34 {
        STRING_,
        STRING__,
        STRING___,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
