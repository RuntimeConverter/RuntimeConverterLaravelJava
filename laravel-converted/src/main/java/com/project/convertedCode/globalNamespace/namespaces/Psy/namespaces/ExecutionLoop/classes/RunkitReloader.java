package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.ExecutionLoop.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.file.function_clearstatcache;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ParseErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ParserFactory;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.ExecutionLoop.classes.AbstractListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/ExecutionLoop/RunkitReloader.php

*/

public class RunkitReloader extends AbstractListener {

    public Object parser = null;

    public Object timestamps = ZVal.newArray();

    public RunkitReloader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RunkitReloader.class) {
            this.__construct(env, args);
        }
    }

    public RunkitReloader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parserFactory = null;
        parserFactory = new ParserFactory(env);
        this.parser = env.callMethod(parserFactory, "createParser", RunkitReloader.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    @ConvertedParameter(index = 1, name = "input")
    public Object onInput(RuntimeEnv env, Object... args) {
        Object shell = assignParameter(args, 0, false);
        Object input = assignParameter(args, 1, false);
        this.reload(env, shell);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    private Object reload(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object shell = assignParameter(args, 0, false);
        Object msg = null;
        Object file = null;
        ReferenceContainer modified = new BasicReferenceContainer(null);
        Object timestamp = null;
        function_clearstatcache.f.env(env).call();
        modified.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1396 :
                ZVal.getIterable(
                        NamespaceGlobal.get_included_files.env(env).call().value(), env, true)) {
            file = ZVal.assign(zpairResult1396.getValue());
            timestamp = NamespaceGlobal.filemtime.env(env).call(file).value();
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "timestamps", env),
                    env,
                    file)) {
                new ReferenceClassProperty(this, "timestamps", env)
                        .arrayAccess(env, file)
                        .set(timestamp);
                continue;
            }

            if (ZVal.strictEqualityCheck(
                    new ReferenceClassProperty(this, "timestamps", env).arrayGet(env, file),
                    "===",
                    timestamp)) {
                continue;
            }

            if (!ZVal.isTrue(this.lintFile(env, file))) {
                msg =
                        function_sprintf
                                .f
                                .env(env)
                                .call("Modified file \"%s\" could not be reloaded", file)
                                .value();
                env.callMethod(
                        shell,
                        "writeException",
                        RunkitReloader.class,
                        new ParseErrorException(env, msg));
                continue;
            }

            modified.arrayAppend(env).set(file);
            new ReferenceClassProperty(this, "timestamps", env)
                    .arrayAccess(env, file)
                    .set(timestamp);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1397 : ZVal.getIterable(modified.getObject(), env, true)) {
            file = ZVal.assign(zpairResult1397.getValue());
            com.runtimeconverter.runtime.ZVal.functionNotFound("runkit_import")
                    .env(env)
                    .call(
                            file,
                            ZVal.toLong(
                                            ZVal.toLong(
                                                            ZVal.toLong(
                                                                            ZVal.toLong(
                                                                                            ZVal
                                                                                                            .toLong(
                                                                                                                    function_constant
                                                                                                                            .get(
                                                                                                                                    env,
                                                                                                                                    "RUNKIT_IMPORT_FUNCTIONS"))
                                                                                                    | ZVal
                                                                                                            .toLong(
                                                                                                                    function_constant
                                                                                                                            .get(
                                                                                                                                    env,
                                                                                                                                    "RUNKIT_IMPORT_CLASSES")))
                                                                                    | ZVal.toLong(
                                                                                            function_constant
                                                                                                    .get(
                                                                                                            env,
                                                                                                            "RUNKIT_IMPORT_CLASS_METHODS")))
                                                                    | ZVal.toLong(
                                                                            function_constant.get(
                                                                                    env,
                                                                                    "RUNKIT_IMPORT_CLASS_CONSTS")))
                                                    | ZVal.toLong(
                                                            function_constant.get(
                                                                    env,
                                                                    "RUNKIT_IMPORT_CLASS_PROPS")))
                                    | ZVal.toLong(
                                            function_constant.get(env, "RUNKIT_IMPORT_OVERRIDE")));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    private Object lintFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object e = null;
        try {
            env.callMethod(
                    this.parser,
                    "parse",
                    RunkitReloader.class,
                    function_file_get_contents.f.env(env).call(file).value());
        } catch (ConvertedException convertedException190) {
            if (convertedException190.instanceOf(PHPException.class, "Exception")) {
                e = convertedException190.getObject();
                return ZVal.assign(false);
            } else {
                throw convertedException190;
            }
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class = "Psy\\ExecutionLoop\\RunkitReloader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractListener.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object isSupported(RuntimeEnv env, Object... args) {
            return ZVal.assign(function_extension_loaded.f.env(env).call("runkit").value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\ExecutionLoop\\RunkitReloader")
                    .setLookup(
                            RunkitReloader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("parser", "timestamps")
                    .setFilename("vendor/psy/psysh/src/ExecutionLoop/RunkitReloader.php")
                    .addInterface("Psy\\ExecutionLoop\\Listener")
                    .addExtendsClass("Psy\\ExecutionLoop\\AbstractListener")
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
