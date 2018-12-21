package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Console/ListFailedCommand.php

*/

public class ListFailedCommand extends Command {

    public Object headers = ZVal.arrayFromList("ID", "Connection", "Queue", "Class", "Failed At");

    public ListFailedCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "queue:failed";
        this.description = "List all of the failed queue jobs";
        if (this.getClass() == ListFailedCommand.class) {
            this.__construct(env, args);
        }
    }

    public ListFailedCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object jobs = null;
        if (ZVal.equalityCheck(
                function_count.f.env(env).call(jobs = this.getFailedJobs(env)).value(), 0)) {
            return ZVal.assign(
                    env.callMethod(this, "info", ListFailedCommand.class, "No failed jobs!"));
        }

        this.displayFailedJobs(env, jobs);
        return null;
    }

    @ConvertedMethod
    protected Object getFailedJobs(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/Console/ListFailedCommand.php");
        Object failed = null;
        failed =
                env.callMethod(
                        new ReferenceClassProperty(this, "laravel", env)
                                .arrayGet(env, "queue.failer"),
                        "all",
                        ListFailedCommand.class);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        collect.f.env(env).call(failed).value(),
                                        "map",
                                        ListFailedCommand.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Queue\\Console",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "failed")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                Object failed = assignParameter(args, 0, false);
                                                return ZVal.assign(
                                                        ListFailedCommand.this.parseFailedJob(
                                                                env, rToArrayCast(failed)));
                                            }
                                        }),
                                "filter",
                                ListFailedCommand.class),
                        "all",
                        ListFailedCommand.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "failed", typeHint = "array")
    protected Object parseFailedJob(RuntimeEnv env, Object... args) {
        ReferenceContainer failed = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object row = null;
        row =
                function_array_values
                        .f
                        .env(env)
                        .call(
                                Arr.runtimeStaticObject.except(
                                        env,
                                        failed.getObject(),
                                        ZVal.arrayFromList("payload", "exception")))
                        .value();
        function_array_splice
                .f
                .env(env)
                .call(row, 3, 0, this.extractJobName(env, failed.arrayGet(env, "payload")));
        return ZVal.assign(row);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    private Object extractJobName(RuntimeEnv env, Object... args) {
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        payload.setObject(
                NamespaceGlobal.json_decode.env(env).call(payload.getObject(), true).value());
        if (ZVal.toBool(payload.getObject())
                && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, payload, env, "data", "command"))) {
            return ZVal.assign(
                    ZVal.isDefined(ternaryExpressionTemp = payload.arrayGet(env, "job"))
                            ? ternaryExpressionTemp
                            : ZVal.getNull());

        } else if (ZVal.toBool(payload.getObject())
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, payload, env, "data", "command"))) {
            return ZVal.assign(this.matchJobName(env, payload.getObject()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    protected Object matchJobName(RuntimeEnv env, Object... args) {
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/\"([^\"]+)\"/",
                        payload.arrayGet(env, "data", "command"),
                        matches.getObject());
        if (arrayActionR(ArrayAction.ISSET, matches, env, 1)) {
            return ZVal.assign(matches.arrayGet(env, 1));
        }

        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = payload.arrayGet(env, "job"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "jobs", typeHint = "array")
    protected Object displayFailedJobs(RuntimeEnv env, Object... args) {
        Object jobs = assignParameter(args, 0, false);
        env.callMethod(this, "table", ListFailedCommand.class, this.headers, jobs);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Console\\ListFailedCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\Console\\ListFailedCommand")
                    .setLookup(
                            ListFailedCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "description",
                            "headers",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Console/ListFailedCommand.php")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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
