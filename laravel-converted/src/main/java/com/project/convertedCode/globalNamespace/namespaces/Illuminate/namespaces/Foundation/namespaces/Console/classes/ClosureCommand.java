package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/ClosureCommand.php

*/

public class ClosureCommand extends Command {

    public Object callback = null;

    public ClosureCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClosureCommand.class) {
            this.__construct(env, args);
        }
    }

    public ClosureCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "signature")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object signature = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        this.callback = callback;
        toObjectR(this).accessProp(this, env).name("signature").set(signature);
        super.__construct(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    protected Object execute(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        ReferenceContainer inputs = new BasicReferenceContainer(null);
        Object parameter = null;
        ReferenceContainer parameters = new BasicReferenceContainer(null);
        inputs.setObject(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(input, "getArguments", ClosureCommand.class),
                                env.callMethod(input, "getOptions", ClosureCommand.class))
                        .value());
        parameters.setObject(ZVal.newArray());
        for (ZPair zpairResult403 :
                ZVal.getIterable(
                        env.callMethod(
                                new ReflectionFunction(env, this.callback),
                                "getParameters",
                                ClosureCommand.class),
                        env,
                        true)) {
            parameter = ZVal.assign(zpairResult403.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    inputs,
                    env,
                    toObjectR(parameter).accessProp(this, env).name("name").value())) {
                parameters
                        .arrayAccess(
                                env,
                                toObjectR(parameter).accessProp(this, env).name("name").value())
                        .set(
                                inputs.arrayGet(
                                        env,
                                        toObjectR(parameter)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value()));
            }
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("laravel").value(),
                        "call",
                        ClosureCommand.class,
                        env.callMethod(this.callback, "bindTo", ClosureCommand.class, this, this),
                        parameters.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description")
    public Object describe(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(this, "setDescription", ClosureCommand.class, description);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\ClosureCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\ClosureCommand")
                    .setLookup(
                            ClosureCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "callback",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
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
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/ClosureCommand.php")
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
