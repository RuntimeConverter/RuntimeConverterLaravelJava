package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes.Driver;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Driver/Xdebug.php

*/

public final class Xdebug extends RuntimeClassBase implements Driver {

    public Object cacheNumLines = ZVal.newArray();

    public Xdebug(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Xdebug.class) {
            this.__construct(env, args);
        }
    }

    public Xdebug(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        if (!function_extension_loaded.f.env(env).call("xdebug").getBool()) {
            throw ZVal.getException(env, new RuntimeException(env, "This driver requires Xdebug"));
        }

        if (!function_ini_get.f.env(env).call("xdebug.coverage_enable").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "xdebug.coverage_enable=On has to be set in php.ini"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "determineUnusedAndDead",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object start(RuntimeEnv env, Object... args) {
        Object determineUnusedAndDead = assignParameter(args, 0, true);
        if (null == determineUnusedAndDead) {
            determineUnusedAndDead = true;
        }
        if (ZVal.isTrue(determineUnusedAndDead)) {
            com.runtimeconverter.runtime.ZVal.functionNotFound(
                            "___error23423346_namespace_function_not_found__(identifier:xdebug_start_code_coverage)_(namespace:\\)(source:xdebug_start_code_coverage)______")
                    .env(env)
                    .call(
                            ZVal.toLong(function_constant.get(env, "XDEBUG_CC_UNUSED"))
                                    | ZVal.toLong(
                                            function_constant.get(env, "XDEBUG_CC_DEAD_CODE")));

        } else {
            com.runtimeconverter.runtime.ZVal.functionNotFound(
                            "___error23423346_namespace_function_not_found__(identifier:xdebug_start_code_coverage)_(namespace:\\)(source:xdebug_start_code_coverage)______")
                    .env(env)
                    .call();
        }

        return null;
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        Object data = null;
        data =
                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                "___error23423346_namespace_function_not_found__(identifier:xdebug_get_code_coverage)_(namespace:\\)(source:xdebug_get_code_coverage)______")
                        .env(env)
                        .call()
                        .value();
        com.runtimeconverter.runtime.ZVal.functionNotFound(
                        "___error23423346_namespace_function_not_found__(identifier:xdebug_stop_code_coverage)_(namespace:\\)(source:xdebug_stop_code_coverage)______")
                .env(env)
                .call();
        return ZVal.assign(this.cleanup(env, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object cleanup(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object file = null;
        Object numLines = null;
        Object line = null;
        for (ZPair zpairResult1012 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(data.getObject()).value(), env, true)) {
            file = ZVal.assign(zpairResult1012.getValue());
            arrayActionR(ArrayAction.UNSET, data, env, file, 0);
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(file, "xdebug://debug-eval")
                                            .value(),
                                    "!==",
                                    0))
                    && ZVal.toBool(function_file_exists.f.env(env).call(file).value())) {
                numLines = this.getNumberOfLinesInFile(env, file);
                for (ZPair zpairResult1013 :
                        ZVal.getIterable(
                                function_array_keys
                                        .f
                                        .env(env)
                                        .call(data.arrayGet(env, file))
                                        .value(),
                                env,
                                true)) {
                    line = ZVal.assign(zpairResult1013.getValue());
                    if (ZVal.isGreaterThan(line, '>', numLines)) {
                        arrayActionR(ArrayAction.UNSET, data, env, file, line);
                    }
                }
            }
        }

        return ZVal.assign(data.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileName", typeHint = "string")
    private Object getNumberOfLinesInFile(RuntimeEnv env, Object... args) {
        Object fileName = assignParameter(args, 0, false);
        Object buffer = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "cacheNumLines", env),
                env,
                fileName)) {
            buffer = function_file_get_contents.f.env(env).call(fileName).value();
            lines.setObject(NamespaceGlobal.substr_count.env(env).call(buffer, "\n").value());
            if (ZVal.strictNotEqualityCheck(
                    function_substr.f.env(env).call(buffer, -1).value(), "!==", "\n")) {
                lines.setObject(ZVal.increment(lines.getObject()));
            }

            new ReferenceClassProperty(this, "cacheNumLines", env)
                    .arrayAccess(env, fileName)
                    .set(lines.getObject());
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "cacheNumLines", env).arrayGet(env, fileName));
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Driver\\Xdebug";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Driver\\Xdebug")
                    .setLookup(
                            Xdebug.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cacheNumLines")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Driver/Xdebug.php")
                    .addInterface("SebastianBergmann\\CodeCoverage\\Driver\\Driver")
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
