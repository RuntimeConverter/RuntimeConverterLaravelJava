package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.CommandLoader.classes.ContainerCommandLoader;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/DependencyInjection/AddConsoleCommandPass.php

*/

public class AddConsoleCommandPass extends RuntimeClassBase {

    public Object commandLoaderServiceId = null;

    public Object commandTag = null;

    public AddConsoleCommandPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AddConsoleCommandPass.class) {
            this.__construct(env, args);
        }
    }

    public AddConsoleCommandPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commandLoaderServiceId", typeHint = "string")
    @ConvertedParameter(index = 1, name = "commandTag", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object commandLoaderServiceId = assignParameter(args, 0, true);
        if (null == commandLoaderServiceId) {
            commandLoaderServiceId = "console.command_loader";
        }
        Object commandTag = assignParameter(args, 1, true);
        if (null == commandTag) {
            commandTag = "console.command";
        }
        this.commandLoaderServiceId = commandLoaderServiceId;
        this.commandTag = commandTag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object process(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object container = assignParameter(args, 0, false);
        ReferenceContainer lazyCommandMap = new BasicReferenceContainer(null);
        ReferenceContainer aliases = new BasicReferenceContainer(null);
        ReferenceContainer lazyCommandRefs = new BasicReferenceContainer(null);
        Object commandId = null;
        ReferenceContainer tags = new BasicReferenceContainer(null);
        ReferenceContainer serviceIds = new BasicReferenceContainer(null);
        Object commandName = null;
        Object r = null;
        Object definition = null;
        Object commandServices = null;
        Object id = null;
        ReferenceContainer tag = new BasicReferenceContainer(null);
        Object _pClass = null;
        commandServices =
                env.callMethod(
                        container,
                        "findTaggedServiceIds",
                        AddConsoleCommandPass.class,
                        this.commandTag,
                        true);
        lazyCommandMap.setObject(ZVal.newArray());
        lazyCommandRefs.setObject(ZVal.newArray());
        serviceIds.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1646 : ZVal.getIterable(commandServices, env, false)) {
            id = ZVal.assign(zpairResult1646.getKey());
            tags.setObject(ZVal.assign(zpairResult1646.getValue()));
            definition =
                    env.callMethod(container, "getDefinition", AddConsoleCommandPass.class, id);
            _pClass =
                    env.callMethod(
                            env.callMethod(
                                    container, "getParameterBag", AddConsoleCommandPass.class),
                            "resolveValue",
                            AddConsoleCommandPass.class,
                            env.callMethod(definition, "getClass", AddConsoleCommandPass.class));
            if (arrayActionR(ArrayAction.ISSET, tags, env, 0, "command")) {
                commandName = ZVal.assign(tags.arrayGet(env, 0, "command"));

            } else {
                if (!ZVal.isTrue(
                        r =
                                env.callMethod(
                                        container,
                                        "getReflectionClass",
                                        AddConsoleCommandPass.class,
                                        _pClass))) {
                    throw ZVal.getException(
                            env,
                            env.createNew(
                                    ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Class \"%s\" used for service \"%s\" cannot be found.",
                                                    _pClass, id)
                                            .value()));
                }

                if (!ZVal.isTrue(
                        env.callMethod(
                                r,
                                "isSubclassOf",
                                AddConsoleCommandPass.class,
                                Command.CONST_class))) {
                    throw ZVal.getException(
                            env,
                            env.createNew(
                                    ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "The service \"%s\" tagged \"%s\" must be a subclass of \"%s\".",
                                                    id, this.commandTag, Command.CONST_class)
                                            .value()));
                }

                commandName =
                        StaticMethodUtils.getStaticBaseClass(_pClass, env)
                                .callUnknownStaticMethod(env, "getDefaultName");
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", commandName)) {
                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                definition,
                                                "isPublic",
                                                AddConsoleCommandPass.class)))
                        || ZVal.toBool(
                                env.callMethod(
                                        definition, "isPrivate", AddConsoleCommandPass.class))) {
                    commandId = "console.command.public_alias." + toStringR(id, env);
                    env.callMethod(
                            env.callMethod(
                                    container,
                                    "setAlias",
                                    AddConsoleCommandPass.class,
                                    commandId,
                                    id),
                            "setPublic",
                            AddConsoleCommandPass.class,
                            true);
                    id = ZVal.assign(commandId);
                }

                serviceIds.arrayAppend(env).set(id);
                continue;
            }

            arrayActionR(ArrayAction.UNSET, tags, env, 0);
            lazyCommandMap.arrayAccess(env, commandName).set(id);
            lazyCommandRefs
                    .arrayAccess(env, id)
                    .set(env.createNew(ZVal.resolveClassAlias(env, "TypedReference"), id, _pClass));
            aliases.setObject(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1647 : ZVal.getIterable(tags.getObject(), env, true)) {
                tag.setObject(ZVal.assign(zpairResult1647.getValue()));
                if (arrayActionR(ArrayAction.ISSET, tag, env, "command")) {
                    aliases.arrayAppend(env).set(tag.arrayGet(env, "command"));
                    lazyCommandMap.arrayAccess(env, tag.arrayGet(env, "command")).set(id);
                }
            }

            env.callMethod(
                    definition,
                    "addMethodCall",
                    AddConsoleCommandPass.class,
                    "setName",
                    ZVal.newArray(new ZPair(0, commandName)));
            if (ZVal.isTrue(aliases.getObject())) {
                env.callMethod(
                        definition,
                        "addMethodCall",
                        AddConsoleCommandPass.class,
                        "setAliases",
                        ZVal.newArray(new ZPair(0, aliases.getObject())));
            }
        }

        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                container,
                                "register",
                                AddConsoleCommandPass.class,
                                this.commandLoaderServiceId,
                                ContainerCommandLoader.CONST_class),
                        "setPublic",
                        AddConsoleCommandPass.class,
                        true),
                "setArguments",
                AddConsoleCommandPass.class,
                ZVal.newArray(
                        new ZPair(
                                0,
                                StaticMethodUtils.getStaticBaseClass(
                                                ZVal.resolveClassAlias(
                                                        env, "ServiceLocatorTagPass"),
                                                env)
                                        .callUnknownStaticMethod(
                                                env,
                                                "register",
                                                new RuntimeArgsWithReferences(),
                                                container,
                                                lazyCommandRefs.getObject())),
                        new ZPair(1, lazyCommandMap.getObject())));
        env.callMethod(
                container,
                "setParameter",
                AddConsoleCommandPass.class,
                "console.command.ids",
                serviceIds.getObject());
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\DependencyInjection\\AddConsoleCommandPass";

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
                    .setName(
                            "Symfony\\Component\\Console\\DependencyInjection\\AddConsoleCommandPass")
                    .setLookup(
                            AddConsoleCommandPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("commandLoaderServiceId", "commandTag")
                    .setFilename(
                            "vendor/symfony/console/DependencyInjection/AddConsoleCommandPass.php")
                    .addInterface("CompilerPassInterface")
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
