package com.project.convertedCode.globalNamespace.namespaces.Dotenv.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Dotenv.namespaces.Exception.classes.InvalidPathException;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.project.convertedCode.globalNamespace.namespaces.Dotenv.namespaces.Exception.classes.InvalidFileException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_set;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/vlucas/phpdotenv/src/Loader.php

*/

public class Loader extends RuntimeClassBase {

    public Object filePath = null;

    public Object immutable = null;

    public Object variableNames = ZVal.newArray();

    public Loader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Loader.class) {
            this.__construct(env, args);
        }
    }

    public Loader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filePath")
    @ConvertedParameter(
        index = 1,
        name = "immutable",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object filePath = assignParameter(args, 0, false);
        Object immutable = assignParameter(args, 1, true);
        if (null == immutable) {
            immutable = false;
        }
        this.filePath = filePath;
        this.immutable = immutable;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "immutable",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object setImmutable(RuntimeEnv env, Object... args) {
        Object immutable = assignParameter(args, 0, true);
        if (null == immutable) {
            immutable = false;
        }
        this.immutable = immutable;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getImmutable(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.immutable);
    }

    @ConvertedMethod
    public Object load(RuntimeEnv env, Object... args) {
        Object line = null;
        Object filePath = null;
        Object lines = null;
        this.ensureFileIsReadable(env);
        filePath = ZVal.assign(this.filePath);
        lines = this.readLinesFromFile(env, filePath);
        for (ZPair zpairResult2249 : ZVal.getIterable(lines, env, true)) {
            line = ZVal.assign(zpairResult2249.getValue());
            if (ZVal.toBool(!ZVal.isTrue(this.isComment(env, line)))
                    && ZVal.toBool(this.looksLikeSetter(env, line))) {
                this.setEnvironmentVariable(env, line);
            }
        }

        return ZVal.assign(lines);
    }

    @ConvertedMethod
    protected Object ensureFileIsReadable(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(!NamespaceGlobal.is_readable.env(env).call(this.filePath).getBool())
                || ZVal.toBool(!function_is_file.f.env(env).call(this.filePath).getBool())) {
            throw ZVal.getException(
                    env,
                    new InvalidPathException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unable to read the environment file at %s.",
                                            this.filePath)
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    protected Object normaliseEnvironmentVariable(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object runtimeTempArrayResult220 = null;
        ZVal.list(
                runtimeTempArrayResult220 = this.processFilters(env, name, value),
                (name = listGet(runtimeTempArrayResult220, 0, env)),
                (value = listGet(runtimeTempArrayResult220, 1, env)));
        value = this.resolveNestedVariables(env, value);
        return ZVal.assign(ZVal.newArray(new ZPair(0, name), new ZPair(1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object processFilters(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object runtimeTempArrayResult223 = null;
        Object runtimeTempArrayResult222 = null;
        Object runtimeTempArrayResult221 = null;
        ZVal.list(
                runtimeTempArrayResult221 = this.splitCompoundStringIntoParts(env, name, value),
                (name = listGet(runtimeTempArrayResult221, 0, env)),
                (value = listGet(runtimeTempArrayResult221, 1, env)));
        ZVal.list(
                runtimeTempArrayResult222 = this.sanitiseVariableName(env, name, value),
                (name = listGet(runtimeTempArrayResult222, 0, env)),
                (value = listGet(runtimeTempArrayResult222, 1, env)));
        ZVal.list(
                runtimeTempArrayResult223 = this.sanitiseVariableValue(env, name, value),
                (name = listGet(runtimeTempArrayResult223, 0, env)),
                (value = listGet(runtimeTempArrayResult223, 1, env)));
        return ZVal.assign(ZVal.newArray(new ZPair(0, name), new ZPair(1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filePath")
    protected Object readLinesFromFile(RuntimeEnv env, Object... args) {
        Object filePath = assignParameter(args, 0, false);
        Object autodetect = null;
        Object lines = null;
        autodetect = function_ini_get.f.env(env).call("auto_detect_line_endings").value();
        function_ini_set.f.env(env).call("auto_detect_line_endings", "1");
        lines =
                NamespaceGlobal.file
                        .env(env)
                        .call(filePath, ZVal.toLong(2) | ZVal.toLong(4))
                        .value();
        function_ini_set.f.env(env).call("auto_detect_line_endings", autodetect);
        return ZVal.assign(lines);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    protected Object isComment(RuntimeEnv env, Object... args) {
        ReferenceContainer line = new BasicReferenceContainer(assignParameter(args, 0, false));
        line.setObject(function_ltrim.f.env(env).call(line.getObject()).value());
        return ZVal.assign(
                ZVal.toBool(arrayActionR(ArrayAction.ISSET, line, env, 0))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(line.arrayGet(env, 0), "===", "#")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    protected Object looksLikeSetter(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_strpos.f.env(env).call(line, "=").value(), "!==", false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    protected Object splitCompoundStringIntoParts(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object runtimeTempArrayResult224 = null;
        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(name, "=").value(), "!==", false)) {
            ZVal.list(
                    runtimeTempArrayResult224 =
                            function_array_map
                                    .f
                                    .env(env)
                                    .call(
                                            "trim",
                                            function_explode.f.env(env).call("=", name, 2).value())
                                    .value(),
                    (name = listGet(runtimeTempArrayResult224, 0, env)),
                    (value = listGet(runtimeTempArrayResult224, 1, env)));
        }

        return ZVal.assign(ZVal.newArray(new ZPair(0, name), new ZPair(1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    protected Object sanitiseVariableValue(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object quote = null;
        Object regexPattern = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        value.setObject(function_trim.f.env(env).call(value.getObject()).value());
        if (!ZVal.isTrue(value.getObject())) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, name), new ZPair(1, value.getObject())));
        }

        if (ZVal.isTrue(this.beginsWithAQuote(env, value.getObject()))) {
            quote = ZVal.assign(value.arrayGet(env, 0));
            regexPattern =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "/^\n                %1$s           # match a quote at the start of the value\n                (              # capturing sub-pattern used\n                 (?:           # we do not need to capture this\n                  [^%1$s\\\\]* # any character other than a quote or backslash\n                  |\\\\\\\\    # or two backslashes together\n                  |\\\\%1$s    # or an escaped quote e.g \\\"\n                 )*            # as many characters that match the previous rules\n                )              # end of the capturing sub-pattern\n                %1$s           # and the closing quote\n                .*$            # and discard any string after the closing quote\n                /mx",
                                    quote)
                            .value();
            value.setObject(
                    function_preg_replace
                            .f
                            .env(env)
                            .call(regexPattern, "$1", value.getObject())
                            .value());
            value.setObject(
                    function_str_replace
                            .f
                            .env(env)
                            .call("\\" + toStringR(quote, env), quote, value.getObject())
                            .value());
            value.setObject(
                    function_str_replace.f.env(env).call("\\\\", "\\", value.getObject()).value());

        } else {
            parts.setObject(function_explode.f.env(env).call(" #", value.getObject(), 2).value());
            value.setObject(function_trim.f.env(env).call(parts.arrayGet(env, 0)).value());
            if (ZVal.isGreaterThan(
                    function_preg_match.f.env(env).call("/^#/", value.getObject()).value(),
                    '>',
                    0)) {
                value.setObject("");
            }

            if (ZVal.isGreaterThan(
                    function_preg_match.f.env(env).call("/\\s+/", value.getObject()).value(),
                    '>',
                    0)) {
                throw ZVal.getException(
                        env,
                        new InvalidFileException(
                                env,
                                "Dotenv values containing spaces must be surrounded by quotes."));
            }
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, name),
                        new ZPair(1, function_trim.f.env(env).call(value.getObject()).value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object resolveNestedVariables(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/vlucas/phpdotenv/src")
                        .setFile("/vendor/vlucas/phpdotenv/src/Loader.php");
        Object value = assignParameter(args, 0, false);
        Object loader = null;
        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(value, "$").value(), "!==", false)) {
            loader = ZVal.assign(this);
            value =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/\\${([a-zA-Z0-9_.]+)}/",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Dotenv",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "matchedPatterns")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer matchedPatterns =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            Object nestedVariable = null;
                                            Object loader = null;
                                            loader =
                                                    this.contextReferences.getCapturedValue(
                                                            "loader");
                                            nestedVariable =
                                                    env.callMethod(
                                                            loader,
                                                            "getEnvironmentVariable",
                                                            Loader.class,
                                                            matchedPatterns.arrayGet(env, 1));
                                            if (ZVal.strictEqualityCheck(
                                                    nestedVariable, "===", ZVal.getNull())) {
                                                return ZVal.assign(
                                                        matchedPatterns.arrayGet(env, 0));

                                            } else {
                                                return ZVal.assign(nestedVariable);
                                            }
                                        }
                                    }.use("loader", loader),
                                    value)
                            .value();
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    protected Object sanitiseVariableName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        name =
                function_trim
                        .f
                        .env(env)
                        .call(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(ZVal.arrayFromList("export ", "'", "\""), "", name)
                                        .value())
                        .value();
        return ZVal.assign(ZVal.newArray(new ZPair(0, name), new ZPair(1, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object beginsWithAQuote(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.toBool(arrayActionR(ArrayAction.ISSET, value, env, 0))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        value.arrayGet(env, 0), "===", "\""))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        value.arrayGet(env, 0), "===", "'"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getEnvironmentVariable(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer _ENV = new BasicReferenceContainer(null);
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object value = null;
        SwitchEnumType148 switchVariable148 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType148.DEFAULT_CASE,
                        SwitchEnumType148.DYNAMIC_TYPE_429,
                        function_array_key_exists.f.env(env).call(name, _ENV.getObject()).value(),
                        SwitchEnumType148.DYNAMIC_TYPE_430,
                        function_array_key_exists
                                .f
                                .env(env)
                                .call(name, _SERVER.getObject())
                                .value());
        switch (switchVariable148) {
            case DYNAMIC_TYPE_429:
                return ZVal.assign(_ENV.arrayGet(env, name));
            case DYNAMIC_TYPE_430:
                return ZVal.assign(_SERVER.arrayGet(env, name));
            case DEFAULT_CASE:
                value = NamespaceGlobal.getenv.env(env).call(name).value();
                return ZVal.assign(
                        ZVal.strictEqualityCheck(value, "===", false) ? ZVal.getNull() : value);
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setEnvironmentVariable(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object runtimeTempArrayResult225 = null;
        ReferenceContainer _ENV = new BasicReferenceContainer(null);
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        ZVal.list(
                runtimeTempArrayResult225 = this.normaliseEnvironmentVariable(env, name, value),
                (name = listGet(runtimeTempArrayResult225, 0, env)),
                (value = listGet(runtimeTempArrayResult225, 1, env)));
        new ReferenceClassProperty(this, "variableNames", env).arrayAppend(env).set(name);
        if (ZVal.toBool(this.immutable)
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                this.getEnvironmentVariable(env, name), "!==", ZVal.getNull()))) {
            return null;
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        function_function_exists
                                                .f
                                                .env(env)
                                                .call("apache_getenv")
                                                .value())
                                && ZVal.toBool(
                                        function_function_exists
                                                .f
                                                .env(env)
                                                .call("apache_setenv")
                                                .value()))
                && ZVal.toBool(
                        com.runtimeconverter.runtime.ZVal.functionNotFound("apache_getenv")
                                .env(env)
                                .call(name)
                                .value())) {
            com.runtimeconverter.runtime.ZVal.functionNotFound("apache_setenv")
                    .env(env)
                    .call(name, value);
        }

        if (function_function_exists.f.env(env).call("putenv").getBool()) {
            NamespaceGlobal.putenv
                    .env(env)
                    .call(toStringR(name, env) + "=" + toStringR(value, env));
        }

        _ENV.arrayAccess(env, name).set(value);
        _SERVER.arrayAccess(env, name).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object clearEnvironmentVariable(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer _ENV = new BasicReferenceContainer(null);
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        if (ZVal.isTrue(this.immutable)) {
            return null;
        }

        if (function_function_exists.f.env(env).call("putenv").getBool()) {
            NamespaceGlobal.putenv.env(env).call(name);
        }

        arrayActionR(ArrayAction.UNSET, _ENV, env, name);
        arrayActionR(ArrayAction.UNSET, _SERVER, env, name);
        return null;
    }

    public static final Object CONST_class = "Dotenv\\Loader";

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
                    .setName("Dotenv\\Loader")
                    .setLookup(
                            Loader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filePath", "immutable", "variableNames")
                    .setFilename("vendor/vlucas/phpdotenv/src/Loader.php")
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

    private enum SwitchEnumType148 {
        DYNAMIC_TYPE_429,
        DYNAMIC_TYPE_430,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
