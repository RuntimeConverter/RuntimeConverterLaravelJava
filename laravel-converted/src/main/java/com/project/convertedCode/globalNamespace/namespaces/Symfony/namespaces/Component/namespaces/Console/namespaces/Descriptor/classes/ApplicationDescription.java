package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.CommandNotFoundException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Descriptor/ApplicationDescription.php

*/

public class ApplicationDescription extends RuntimeClassBase {

    public Object application = null;

    public Object namespace = null;

    public Object showHidden = null;

    public Object namespaces = null;

    public Object commands = null;

    public Object aliases = null;

    public ApplicationDescription(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ApplicationDescription.class) {
            this.__construct(env, args);
        }
    }

    public ApplicationDescription(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "application",
        typeHint = "Symfony\\Component\\Console\\Application"
    )
    @ConvertedParameter(
        index = 1,
        name = "namespace",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "showHidden",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object application = assignParameter(args, 0, false);
        Object namespace = assignParameter(args, 1, true);
        if (null == namespace) {
            namespace = ZVal.getNull();
        }
        Object showHidden = assignParameter(args, 2, true);
        if (null == showHidden) {
            showHidden = false;
        }
        this.application = application;
        this.namespace = namespace;
        this.showHidden = showHidden;
        return null;
    }

    @ConvertedMethod
    public Object getNamespaces(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.namespaces)) {
            this.inspectApplication(env);
        }

        return ZVal.assign(this.namespaces);
    }

    @ConvertedMethod
    public Object getCommands(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.commands)) {
            this.inspectApplication(env);
        }

        return ZVal.assign(this.commands);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getCommand(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "commands", env),
                                env,
                                name))
                && ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "aliases", env),
                                env,
                                name))) {
            throw ZVal.getException(
                    env,
                    new CommandNotFoundException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Command %s does not exist.", name)
                                    .value()));
        }

        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "commands", env),
                                env,
                                name)
                        ? new ReferenceClassProperty(this, "commands", env).arrayGet(env, name)
                        : new ReferenceClassProperty(this, "aliases", env).arrayGet(env, name));
    }

    @ConvertedMethod
    private Object inspectApplication(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object all = null;
        ReferenceContainer names = new BasicReferenceContainer(null);
        Object name = null;
        Object namespace = null;
        Object command = null;
        Object commands = null;
        this.commands = ZVal.newArray();
        this.namespaces = ZVal.newArray();
        all =
                env.callMethod(
                        this.application,
                        "all",
                        ApplicationDescription.class,
                        ZVal.isTrue(this.namespace)
                                ? env.callMethod(
                                        this.application,
                                        "findNamespace",
                                        ApplicationDescription.class,
                                        this.namespace)
                                : ZVal.getNull());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1648 : ZVal.getIterable(this.sortCommands(env, all), env, false)) {
            namespace = ZVal.assign(zpairResult1648.getKey());
            commands = ZVal.assign(zpairResult1648.getValue());
            names.setObject(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1649 : ZVal.getIterable(commands, env, false)) {
                name = ZVal.assign(zpairResult1649.getKey());
                command = ZVal.assign(zpairResult1649.getValue());
                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                command, "getName", ApplicationDescription.class)))
                        || ZVal.toBool(
                                ZVal.toBool(!ZVal.isTrue(this.showHidden))
                                        && ZVal.toBool(
                                                env.callMethod(
                                                        command,
                                                        "isHidden",
                                                        ApplicationDescription.class)))) {
                    continue;
                }

                if (ZVal.strictEqualityCheck(
                        env.callMethod(command, "getName", ApplicationDescription.class),
                        "===",
                        name)) {
                    new ReferenceClassProperty(this, "commands", env)
                            .arrayAccess(env, name)
                            .set(command);

                } else {
                    new ReferenceClassProperty(this, "aliases", env)
                            .arrayAccess(env, name)
                            .set(command);
                }

                names.arrayAppend(env).set(name);
            }

            new ReferenceClassProperty(this, "namespaces", env)
                    .arrayAccess(env, namespace)
                    .set(
                            ZVal.newArray(
                                    new ZPair("id", namespace),
                                    new ZPair("commands", names.getObject())));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commands", typeHint = "array")
    private Object sortCommands(RuntimeEnv env, Object... args) {
        Object commands = assignParameter(args, 0, false);
        ReferenceContainer namespacedCommands = new BasicReferenceContainer(null);
        ReferenceContainer globalCommands = new BasicReferenceContainer(null);
        Object name = null;
        Object key = null;
        Object command = null;
        ReferenceContainer commandsSet = new BasicReferenceContainer(null);
        namespacedCommands.setObject(ZVal.newArray());
        globalCommands.setObject(ZVal.newArray());
        for (ZPair zpairResult1650 : ZVal.getIterable(commands, env, false)) {
            name = ZVal.assign(zpairResult1650.getKey());
            command = ZVal.assign(zpairResult1650.getValue());
            key =
                    env.callMethod(
                            this.application,
                            "extractNamespace",
                            ApplicationDescription.class,
                            name,
                            1);
            if (!ZVal.isTrue(key)) {
                globalCommands.arrayAccess(env, "_global", name).set(command);

            } else {
                namespacedCommands.arrayAccess(env, key, name).set(command);
            }
        }

        function_ksort.f.env(env).call(namespacedCommands.getObject());
        namespacedCommands.setObject(
                function_array_merge
                        .f
                        .env(env)
                        .call(globalCommands.getObject(), namespacedCommands.getObject())
                        .value());
        for (ZPair zpairResult1651 : ZVal.getIterable(namespacedCommands.getObject(), env, true)) {
            commandsSet = zpairResult1651;
            function_ksort.f.env(env).call(commandsSet.getObject());
        }

        commandsSet.setObject(null);
        return ZVal.assign(namespacedCommands.getObject());
    }

    public static final Object CONST_GLOBAL_NAMESPACE = "_global";

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Descriptor\\ApplicationDescription";

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
                    .setName("Symfony\\Component\\Console\\Descriptor\\ApplicationDescription")
                    .setLookup(
                            ApplicationDescription.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "commands",
                            "namespace",
                            "namespaces",
                            "showHidden")
                    .setFilename("vendor/symfony/console/Descriptor/ApplicationDescription.php")
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
