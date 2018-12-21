package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Processor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Processor/GitProcessor.php

*/

public class GitProcessor extends RuntimeClassBase {

    public Object level = null;

    public GitProcessor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GitProcessor.class) {
            this.__construct(env, args);
        }
    }

    public GitProcessor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        this.level = Logger.runtimeStaticObject.toMonologLevel(env, level);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object __invoke(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isLessThan(record.arrayGet(env, "level"), '<', this.level)) {
            return ZVal.assign(record.getObject());
        }

        record.arrayAccess(env, "extra", "git").set(runtimeStaticObject.getGitInfo(env));
        return ZVal.assign(record.getObject());
    }

    public static final Object CONST_class = "Monolog\\Processor\\GitProcessor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        private Object getGitInfo(RuntimeEnv env, Object... args) {
            Object branches = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            if (ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .namespaces
                                            .Processor
                                            .classes
                                            .GitProcessor
                                            .RequestStaticProperties
                                            .class)
                            .cache)) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Monolog
                                                .namespaces
                                                .Processor
                                                .classes
                                                .GitProcessor
                                                .RequestStaticProperties
                                                .class)
                                .cache);
            }

            branches =
                    ZVal.assign(NamespaceGlobal.shell_exec.call(env, "git branch -v --no-abbrev"));
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("{^\\* (.+?)\\s+([a-f0-9]{40})(?:\\s|$)}m", branches, matches.getObject())
                    .getBool()) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Monolog
                                                        .namespaces
                                                        .Processor
                                                        .classes
                                                        .GitProcessor
                                                        .RequestStaticProperties
                                                        .class)
                                        .cache =
                                ZVal.newArray(
                                        new ZPair("branch", matches.arrayGet(env, 1)),
                                        new ZPair("commit", matches.arrayGet(env, 2))));
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Monolog
                                                    .namespaces
                                                    .Processor
                                                    .classes
                                                    .GitProcessor
                                                    .RequestStaticProperties
                                                    .class)
                                    .cache =
                            ZVal.newArray());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cache = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Processor\\GitProcessor")
                    .setLookup(
                            GitProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("level")
                    .setStaticPropertyNames("cache")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Processor/GitProcessor.php")
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
