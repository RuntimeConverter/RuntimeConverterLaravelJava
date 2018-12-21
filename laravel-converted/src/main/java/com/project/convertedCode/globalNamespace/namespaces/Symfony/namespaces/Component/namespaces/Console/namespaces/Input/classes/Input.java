package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputDefinition;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.StreamableInputInterface;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Input/Input.php

*/

public abstract class Input extends RuntimeClassBase
        implements InputInterface, StreamableInputInterface {

    public Object definition = null;

    public Object stream = null;

    public Object options = ZVal.newArray();

    public Object arguments = ZVal.newArray();

    public Object interactive = true;

    public Input(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Input.class) {
            this.__construct(env, args);
        }
    }

    public Input(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "Symfony\\Component\\Console\\Input\\InputDefinition",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object definition = assignParameter(args, 0, true);
        if (null == definition) {
            definition = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", definition)) {
            this.definition = new InputDefinition(env);

        } else {
            this.bind(env, definition);
            this.validate(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "Symfony\\Component\\Console\\Input\\InputDefinition"
    )
    public Object bind(RuntimeEnv env, Object... args) {
        Object definition = assignParameter(args, 0, false);
        this.arguments = ZVal.newArray();
        this.options = ZVal.newArray();
        this.definition = definition;
        env.callMethod(this, "parse", Input.class);
        return null;
    }

    @ConvertedMethod
    public Object validate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Input")
                        .setFile("/vendor/symfony/console/Input/Input.php");
        Object missingArguments = null;
        Object definition = null;
        Object givenArguments = null;
        definition = ZVal.assign(this.definition);
        givenArguments = ZVal.assign(this.arguments);
        missingArguments =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                function_array_keys
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        definition, "getArguments", Input.class))
                                        .value(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Console\\Input",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "argument")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object argument = assignParameter(args, 0, false);
                                        Object givenArguments = null;
                                        Object definition = null;
                                        definition =
                                                this.contextReferences.getCapturedValue(
                                                        "definition");
                                        givenArguments =
                                                this.contextReferences.getCapturedValue(
                                                        "givenArguments");
                                        return ZVal.assign(
                                                ZVal.toBool(
                                                                !function_array_key_exists
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                argument,
                                                                                givenArguments)
                                                                        .getBool())
                                                        && ZVal.toBool(
                                                                env.callMethod(
                                                                        env.callMethod(
                                                                                definition,
                                                                                "getArgument",
                                                                                Input.class,
                                                                                argument),
                                                                        "isRequired",
                                                                        Input.class)));
                                    }
                                }.use("definition", definition)
                                        .use("givenArguments", givenArguments))
                        .value();
        if (ZVal.isGreaterThan(function_count.f.env(env).call(missingArguments).value(), '>', 0)) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Not enough arguments (missing: \"%s\").",
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(", ", missingArguments)
                                                    .value())
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    public Object isInteractive(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.interactive);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interactive")
    public Object setInteractive(RuntimeEnv env, Object... args) {
        Object interactive = assignParameter(args, 0, false);
        this.interactive = ZVal.toBool(interactive);
        return null;
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(this.definition, "getArgumentDefaults", Input.class),
                                this.arguments)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getArgument(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!ZVal.isTrue(env.callMethod(this.definition, "hasArgument", Input.class, name))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"%s\" argument does not exist.", name)
                                    .value()));
        }

        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "arguments", env),
                                env,
                                name)
                        ? new ReferenceClassProperty(this, "arguments", env).arrayGet(env, name)
                        : env.callMethod(
                                env.callMethod(this.definition, "getArgument", Input.class, name),
                                "getDefault",
                                Input.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object setArgument(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (!ZVal.isTrue(env.callMethod(this.definition, "hasArgument", Input.class, name))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"%s\" argument does not exist.", name)
                                    .value()));
        }

        new ReferenceClassProperty(this, "arguments", env).arrayAccess(env, name).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasArgument(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.definition, "hasArgument", Input.class, name));
    }

    @ConvertedMethod
    public Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(this.definition, "getOptionDefaults", Input.class),
                                this.options)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!ZVal.isTrue(env.callMethod(this.definition, "hasOption", Input.class, name))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"%s\" option does not exist.", name)
                                    .value()));
        }

        return ZVal.assign(
                function_array_key_exists.f.env(env).call(name, this.options).getBool()
                        ? new ReferenceClassProperty(this, "options", env).arrayGet(env, name)
                        : env.callMethod(
                                env.callMethod(this.definition, "getOption", Input.class, name),
                                "getDefault",
                                Input.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object setOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (!ZVal.isTrue(env.callMethod(this.definition, "hasOption", Input.class, name))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"%s\" option does not exist.", name)
                                    .value()));
        }

        new ReferenceClassProperty(this, "options", env).arrayAccess(env, name).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.definition, "hasOption", Input.class, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    public Object escapeToken(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        return ZVal.assign(
                function_preg_match.f.env(env).call("{^[\\w-]+$}", token).getBool()
                        ? token
                        : NamespaceGlobal.escapeshellarg.env(env).call(token).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream")
    public Object setStream(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        this.stream = stream;
        return null;
    }

    @ConvertedMethod
    public Object getStream(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.stream);
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Input\\Input";

    @ConvertedMethod()
    public abstract Object getFirstArgument(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object hasParameterOption(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getParameterOption(RuntimeEnv env, Object... args);

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
                    .setName("Symfony\\Component\\Console\\Input\\Input")
                    .setLookup(
                            Input.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments", "definition", "interactive", "options", "stream")
                    .setFilename("vendor/symfony/console/Input/Input.php")
                    .addInterface("Symfony\\Component\\Console\\Input\\InputInterface")
                    .addInterface("Symfony\\Component\\Console\\Input\\StreamableInputInterface")
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
