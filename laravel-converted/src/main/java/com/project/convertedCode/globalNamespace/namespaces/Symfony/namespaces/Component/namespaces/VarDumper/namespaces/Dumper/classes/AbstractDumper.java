package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.DumperInterface;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.DataDumperInterface;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Dumper/AbstractDumper.php

*/

public abstract class AbstractDumper extends RuntimeClassBase
        implements DataDumperInterface, DumperInterface {

    public Object line = "";

    public Object lineDumper = null;

    public Object outputStream = null;

    public Object decimalPoint = null;

    public Object indentPad = "  ";

    public Object flags = null;

    public Object charset = null;

    public AbstractDumper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractDumper.class) {
            this.__construct(env, args);
        }
    }

    public AbstractDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "charset",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "flags",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, true);
        if (null == output) {
            output = ZVal.getNull();
        }
        Object charset = assignParameter(args, 1, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        Object flags = assignParameter(args, 2, true);
        if (null == flags) {
            flags = 0;
        }
        Object ternaryExpressionTemp = null;
        this.flags = flags;
        this.setCharset(
                env,
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        ZVal.isTrue(
                                                        ternaryExpressionTemp =
                                                                ZVal.isTrue(
                                                                                ternaryExpressionTemp =
                                                                                        charset)
                                                                        ? ternaryExpressionTemp
                                                                        : function_ini_get
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        "php.output_encoding")
                                                                                .value())
                                                ? ternaryExpressionTemp
                                                : function_ini_get
                                                        .f
                                                        .env(env)
                                                        .call("default_charset")
                                                        .value())
                        ? ternaryExpressionTemp
                        : "UTF-8");
        this.decimalPoint = NamespaceGlobal.localeconv.env(env).call().value();
        this.decimalPoint =
                new ReferenceClassProperty(this, "decimalPoint", env)
                        .arrayGet(env, "decimal_point");
        this.setOutput(
                env,
                ZVal.isTrue(ternaryExpressionTemp = output)
                        ? ternaryExpressionTemp
                        : env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .VarDumper
                                                .namespaces
                                                .Dumper
                                                .classes
                                                .AbstractDumper
                                                .RequestStaticProperties
                                                .class)
                                .defaultOutput);
        if (ZVal.toBool(!ZVal.isTrue(output))
                && ZVal.toBool(
                        function_is_string
                                .f
                                .env(env)
                                .call(
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .VarDumper
                                                                .namespaces
                                                                .Dumper
                                                                .classes
                                                                .AbstractDumper
                                                                .RequestStaticProperties
                                                                .class)
                                                .defaultOutput)
                                .value())) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .VarDumper
                                            .namespaces
                                            .Dumper
                                            .classes
                                            .AbstractDumper
                                            .RequestStaticProperties
                                            .class)
                            .defaultOutput =
                    this.outputStream;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output")
    public Object setOutput(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object prev = null;
        prev =
                ZVal.assign(
                        ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.outputStream)
                                ? this.outputStream
                                : this.lineDumper);
        if (function_is_callable.f.env(env).call(output).getBool()) {
            this.outputStream = ZVal.getNull();
            this.lineDumper = output;

        } else {
            if (function_is_string.f.env(env).call(output).getBool()) {
                output = function_fopen.f.env(env).call(output, "wb").value();
            }

            this.outputStream = output;
            this.lineDumper = ZVal.newArray(new ZPair(0, this), new ZPair(1, "echoLine"));
        }

        return ZVal.assign(prev);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object setCharset(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        Object prev = null;
        prev = ZVal.assign(this.charset);
        charset = NamespaceGlobal.strtoupper.env(env).call(charset).value();
        charset =
                ZVal.assign(
                        ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        ZVal.getNull(),
                                                                        "===",
                                                                        charset))
                                                        || ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        "UTF-8", "===", charset)))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck("UTF8", "===", charset))
                                ? "CP1252"
                                : charset);
        this.charset = charset;
        return ZVal.assign(prev);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pad")
    public Object setIndentPad(RuntimeEnv env, Object... args) {
        Object pad = assignParameter(args, 0, false);
        Object prev = null;
        prev = ZVal.assign(this.indentPad);
        this.indentPad = pad;
        return ZVal.assign(prev);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "data",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Data"
    )
    @ConvertedParameter(
        index = 1,
        name = "output",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object dump(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, true);
        if (null == output) {
            output = ZVal.getNull();
        }
        Object result = null;
        Object prevOutput = null;
        Object returnDump = null;
        Object locale = null;
        this.decimalPoint = NamespaceGlobal.localeconv.env(env).call().value();
        this.decimalPoint =
                new ReferenceClassProperty(this, "decimalPoint", env)
                        .arrayGet(env, "decimal_point");
        if (ZVal.isTrue(
                locale =
                        ZVal.assign(
                                ZVal.isTrue(
                                                ZVal.toLong(this.flags)
                                                        & ZVal.toLong(
                                                                ZVal.toLong(
                                                                                CONST_DUMP_COMMA_SEPARATOR)
                                                                        | ZVal.toLong(
                                                                                CONST_DUMP_TRAILING_COMMA)))
                                        ? NamespaceGlobal.setlocale.env(env).call(1, 0).value()
                                        : ZVal.getNull()))) {
            NamespaceGlobal.setlocale.env(env).call(1, "C");
        }

        if (ZVal.isTrue(returnDump = ZVal.strictEqualityCheck(true, "===", output))) {
            output = function_fopen.f.env(env).call("php://memory", "r+b").value();
        }

        if (ZVal.isTrue(output)) {
            prevOutput = this.setOutput(env, output);
        }

        try {
            env.callMethod(data, "dump", AbstractDumper.class, this);
            this.dumpLine(env, -1);
            if (ZVal.isTrue(returnDump)) {
                result = NamespaceGlobal.stream_get_contents.env(env).call(output, -1, 0).value();
                function_fclose.f.env(env).call(output);
                return ZVal.assign(result);
            }

        } catch (ConvertedException convertedException326) {

            throw convertedException326;
        } finally {
            if (ZVal.isTrue(output)) {
                this.setOutput(env, prevOutput);
            }
            if (ZVal.isTrue(locale)) {
                NamespaceGlobal.setlocale.env(env).call(1, locale);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "depth")
    protected Object dumpLine(RuntimeEnv env, Object... args) {
        Object depth = assignParameter(args, 0, false);
        function_call_user_func
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(this.lineDumper, this.line, depth, this.indentPad);
        this.line = "";
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    @ConvertedParameter(index = 1, name = "depth")
    @ConvertedParameter(index = 2, name = "indentPad")
    protected Object echoLine(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        Object depth = assignParameter(args, 1, false);
        Object indentPad = assignParameter(args, 2, false);
        if (ZVal.strictNotEqualityCheck(-1, "!==", depth)) {
            function_fwrite
                    .f
                    .env(env)
                    .call(
                            this.outputStream,
                            toStringR(
                                            function_str_repeat
                                                    .f
                                                    .env(env)
                                                    .call(indentPad, depth)
                                                    .value(),
                                            env)
                                    + toStringR(line, env)
                                    + "\n");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "s")
    protected Object utf8Encode(RuntimeEnv env, Object... args) {
        Object s = assignParameter(args, 0, false);
        Object c = null;
        if (function_preg_match.f.env(env).call("//u", s).getBool()) {
            return ZVal.assign(s);
        }

        if (!function_function_exists.f.env(env).call("iconv").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Unable to convert a non-UTF-8 string to UTF-8: required function iconv() does not exist. You should install ext-iconv or symfony/polyfill-iconv."));
        }

        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                c = NamespaceGlobal.iconv.env(env).call(this.charset, "UTF-8", s).value())) {
            return ZVal.assign(c);
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck("CP1252", "!==", this.charset))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                c =
                                        NamespaceGlobal.iconv
                                                .env(env)
                                                .call("CP1252", "UTF-8", s)
                                                .value()))) {
            return ZVal.assign(c);
        }

        return ZVal.assign(NamespaceGlobal.iconv.env(env).call("CP850", "UTF-8", s).value());
    }

    public static final Object CONST_DUMP_LIGHT_ARRAY = 1;

    public static final Object CONST_DUMP_STRING_LENGTH = 2;

    public static final Object CONST_DUMP_COMMA_SEPARATOR = 4;

    public static final Object CONST_DUMP_TRAILING_COMMA = 8;

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Dumper\\AbstractDumper";

    @ConvertedMethod()
    public abstract Object dumpScalar(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object dumpString(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object enterHash(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object leaveHash(RuntimeEnv env, Object... args);

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object defaultOutput = "php://output";
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Dumper\\AbstractDumper")
                    .setLookup(
                            AbstractDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "decimalPoint",
                            "flags",
                            "indentPad",
                            "line",
                            "lineDumper",
                            "outputStream")
                    .setStaticPropertyNames("defaultOutput")
                    .setFilename("vendor/symfony/var-dumper/Dumper/AbstractDumper.php")
                    .addInterface("Symfony\\Component\\VarDumper\\Dumper\\DataDumperInterface")
                    .addInterface("Symfony\\Component\\VarDumper\\Cloner\\DumperInterface")
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
