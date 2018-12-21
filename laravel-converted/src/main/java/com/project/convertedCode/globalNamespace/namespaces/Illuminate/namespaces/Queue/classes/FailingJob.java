package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Events.classes.Dispatcher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobFailed;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.ManuallyFailedException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/FailingJob.php

*/

public class FailingJob extends RuntimeClassBase {

    public FailingJob(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FailingJob(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Queue\\FailingJob";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "connectionName")
        @ConvertedParameter(index = 1, name = "job")
        @ConvertedParameter(
            index = 2,
            name = "e",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object handle(RuntimeEnv env, Object... args) {
            Object connectionName = assignParameter(args, 0, false);
            Object job = assignParameter(args, 1, false);
            Object e = assignParameter(args, 2, true);
            if (null == e) {
                e = ZVal.getNull();
            }
            Object ternaryExpressionTemp = null;
            env.callMethod(job, "markAsFailed", FailingJob.class);
            if (ZVal.isTrue(env.callMethod(job, "isDeleted", FailingJob.class))) {
                return null;
            }

            try {
                env.callMethod(job, "delete", FailingJob.class);
                env.callMethod(job, "failed", FailingJob.class, e);
            } catch (ConvertedException convertedException51) {

                throw convertedException51;
            } finally {
                env.callMethod(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, FailingJob.class)
                                .method("events")
                                .call()
                                .value(),
                        "dispatch",
                        FailingJob.class,
                        new JobFailed(
                                env,
                                connectionName,
                                job,
                                ZVal.isTrue(ternaryExpressionTemp = e)
                                        ? ternaryExpressionTemp
                                        : new ManuallyFailedException(env)));
            }

            return null;
        }

        @ConvertedMethod
        protected Object events(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.callMethod(
                            Container.runtimeStaticObject.getInstance(env),
                            "make",
                            FailingJob.class,
                            Dispatcher.CONST_class));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\FailingJob")
                    .setLookup(
                            FailingJob.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/FailingJob.php")
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
