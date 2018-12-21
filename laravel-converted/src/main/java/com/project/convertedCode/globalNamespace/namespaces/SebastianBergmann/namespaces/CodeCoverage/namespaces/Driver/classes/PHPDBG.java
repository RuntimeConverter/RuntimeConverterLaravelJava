package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes.Driver;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Driver/PHPDBG.php

*/

public final class PHPDBG extends RuntimeClassBase implements Driver {

    public PHPDBG(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHPDBG.class) {
            this.__construct(env, args);
        }
    }

    public PHPDBG(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck("cli", "!==", "phpdbg")) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "This driver requires the PHPDBG SAPI"));
        }

        if (!function_function_exists.f.env(env).call("phpdbg_start_oplog").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "This build of PHPDBG does not support code coverage"));
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
        com.runtimeconverter.runtime.ZVal.functionNotFound(
                        "___error23423346_namespace_function_not_found__(identifier:phpdbg_start_oplog)_(namespace:\\)(source:phpdbg_start_oplog)______")
                .env(env)
                .call();
        return null;
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        ReferenceContainer fetchedLines = new BasicReferenceContainer(null);
        Object file = null;
        Object lineNo = null;
        Object newFiles = null;
        Object dbgData = null;
        ReferenceContainer sourceLines = new BasicReferenceContainer(null);
        Object numExecuted = null;
        Object lines = null;
        fetchedLines = env.getInlineStatic(19, ZVal.newArray());
        dbgData =
                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                "___error23423346_namespace_function_not_found__(identifier:phpdbg_end_oplog)_(namespace:\\)(source:phpdbg_end_oplog)______")
                        .env(env)
                        .call()
                        .value();
        if (ZVal.equalityCheck(fetchedLines.getObject(), ZVal.newArray())) {
            sourceLines.setObject(
                    com.runtimeconverter.runtime.ZVal.functionNotFound(
                                    "___error23423346_namespace_function_not_found__(identifier:phpdbg_get_executable)_(namespace:\\)(source:phpdbg_get_executable)______")
                            .env(env)
                            .call()
                            .value());

        } else {
            newFiles =
                    function_array_diff
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.get_included_files.env(env).call().value(),
                                    function_array_keys
                                            .f
                                            .env(env)
                                            .call(fetchedLines.getObject())
                                            .value())
                            .value();
            sourceLines.setObject(ZVal.newArray());
            if (ZVal.isTrue(newFiles)) {
                sourceLines.setObject(
                        com.runtimeconverter.runtime.ZVal.functionNotFound("phpdbg_get_executable")
                                .env(env)
                                .call(ZVal.newArray(new ZPair("files", newFiles)))
                                .value());
            }
        }

        for (ZPair zpairResult1008 : ZVal.getIterable(sourceLines.getObject(), env, false)) {
            file = ZVal.assign(zpairResult1008.getKey());
            lines = ZVal.assign(zpairResult1008.getValue());
            for (ZPair zpairResult1009 : ZVal.getIterable(lines, env, false)) {
                lineNo = ZVal.assign(zpairResult1009.getKey());
                numExecuted = ZVal.assign(zpairResult1009.getValue());
                sourceLines.arrayAccess(env, file, lineNo).set(CONST_LINE_NOT_EXECUTED);
            }
        }

        fetchedLines.setObject(
                function_array_merge
                        .f
                        .env(env)
                        .call(fetchedLines.getObject(), sourceLines.getObject())
                        .value());
        return ZVal.assign(this.detectExecutedLines(env, fetchedLines.getObject(), dbgData));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sourceLines", typeHint = "array")
    @ConvertedParameter(index = 1, name = "dbgData", typeHint = "array")
    private Object detectExecutedLines(RuntimeEnv env, Object... args) {
        ReferenceContainer sourceLines =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object dbgData = assignParameter(args, 1, false);
        Object file = null;
        Object lineNo = null;
        Object numExecuted = null;
        Object coveredLines = null;
        for (ZPair zpairResult1010 : ZVal.getIterable(dbgData, env, false)) {
            file = ZVal.assign(zpairResult1010.getKey());
            coveredLines = ZVal.assign(zpairResult1010.getValue());
            for (ZPair zpairResult1011 : ZVal.getIterable(coveredLines, env, false)) {
                lineNo = ZVal.assign(zpairResult1011.getKey());
                numExecuted = ZVal.assign(zpairResult1011.getValue());
                if (arrayActionR(ArrayAction.ISSET, sourceLines, env, file, lineNo)) {
                    sourceLines.arrayAccess(env, file, lineNo).set(CONST_LINE_EXECUTED);
                }
            }
        }

        return ZVal.assign(sourceLines.getObject());
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Driver\\PHPDBG";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Driver\\PHPDBG")
                    .setLookup(
                            PHPDBG.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-code-coverage/src/Driver/PHPDBG.php")
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
