package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Command.namespaces.Descriptor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArrayInput;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Command.namespaces.Descriptor.classes.DumpDescriptorInterface;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes.SymfonyStyle;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Command/Descriptor/CliDescriptor.php

*/

public class CliDescriptor extends RuntimeClassBase implements DumpDescriptorInterface {

    public Object dumper = null;

    public Object lastIdentifier = null;

    public CliDescriptor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CliDescriptor.class) {
            this.__construct(env, args);
        }
    }

    public CliDescriptor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dumper",
        typeHint = "Symfony\\Component\\VarDumper\\Dumper\\CliDumper"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dumper = assignParameter(args, 0, false);
        this.dumper = dumper;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Data"
    )
    @ConvertedParameter(index = 2, name = "context", typeHint = "array")
    @ConvertedParameter(index = 3, name = "clientId", typeHint = "int")
    public Object describe(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        ReferenceContainer context = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object clientId = assignParameter(args, 3, false);
        Object lastIdentifier = null;
        ReferenceContainer request = new BasicReferenceContainer(null);
        Object controller = null;
        Object io = null;
        Object section = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer source = new BasicReferenceContainer(null);
        ReferenceContainer rows = new BasicReferenceContainer(null);
        Object fileLink = null;
        Object file = null;
        io =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                output,
                                                SymfonyStyle.class,
                                                "Symfony\\Component\\Console\\Style\\SymfonyStyle"))
                                ? output
                                : new SymfonyStyle(
                                        env, new ArrayInput(env, ZVal.newArray()), output));
        env.callMethod(
                this.dumper,
                "setColors",
                CliDescriptor.class,
                env.callMethod(output, "isDecorated", CliDescriptor.class));
        rows.setObject(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "date"),
                                        new ZPair(
                                                1,
                                                function_date
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "r",
                                                                context.arrayGet(env, "timestamp"))
                                                        .value())))));
        lastIdentifier = ZVal.assign(this.lastIdentifier);
        this.lastIdentifier = clientId;
        section = ZVal.assign("Received from client #" + toStringR(clientId, env));
        if (arrayActionR(ArrayAction.ISSET, context, env, "request")) {
            request.setObject(ZVal.assign(context.arrayGet(env, "request")));
            this.lastIdentifier = request.arrayGet(env, "identifier");
            section =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s %s",
                                    request.arrayGet(env, "method"), request.arrayGet(env, "uri"))
                            .value();
            if (ZVal.isTrue(controller = ZVal.assign(request.arrayGet(env, "controller")))) {
                rows.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, "controller"),
                                        new ZPair(
                                                1,
                                                function_rtrim
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        this.dumper,
                                                                        "dump",
                                                                        CliDescriptor.class,
                                                                        controller,
                                                                        true),
                                                                "\n")
                                                        .value())));
            }

        } else if (arrayActionR(ArrayAction.ISSET, context, env, "cli")) {
            this.lastIdentifier = context.arrayGet(env, "cli", "identifier");
            section = "$ " + toStringR(context.arrayGet(env, "cli", "command_line"), env);
        }

        if (ZVal.strictNotEqualityCheck(this.lastIdentifier, "!==", lastIdentifier)) {
            env.callMethod(io, "section", CliDescriptor.class, section);
        }

        if (arrayActionR(ArrayAction.ISSET, context, env, "source")) {
            source.setObject(ZVal.assign(context.arrayGet(env, "source")));
            rows.arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair(0, "source"),
                                    new ZPair(
                                            1,
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "%s on line %d",
                                                            source.arrayGet(env, "name"),
                                                            source.arrayGet(env, "line"))
                                                    .value())));
            file =
                    ZVal.assign(
                            ZVal.isDefined(
                                            ternaryExpressionTemp =
                                                    source.arrayGet(env, "file_relative"))
                                    ? ternaryExpressionTemp
                                    : source.arrayGet(env, "file"));
            rows.arrayAppend(env).set(ZVal.newArray(new ZPair(0, "file"), new ZPair(1, file)));
            fileLink =
                    ZVal.assign(
                            ZVal.isDefined(
                                            ternaryExpressionTemp =
                                                    source.arrayGet(env, "file_link"))
                                    ? ternaryExpressionTemp
                                    : ZVal.getNull());
        }

        env.callMethod(io, "table", CliDescriptor.class, ZVal.newArray(), rows.getObject());
        if (ZVal.isset(fileLink)) {
            env.callMethod(
                    io,
                    "writeln",
                    CliDescriptor.class,
                    ZVal.newArray(
                            new ZPair(0, "<info>Open source in your IDE/browser:</info>"),
                            new ZPair(1, fileLink)));
            env.callMethod(io, "newLine", CliDescriptor.class);
        }

        env.callMethod(this.dumper, "dump", CliDescriptor.class, data);
        env.callMethod(io, "newLine", CliDescriptor.class);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Command\\Descriptor\\CliDescriptor";

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
                    .setName("Symfony\\Component\\VarDumper\\Command\\Descriptor\\CliDescriptor")
                    .setLookup(
                            CliDescriptor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dumper", "lastIdentifier")
                    .setFilename("vendor/symfony/var-dumper/Command/Descriptor/CliDescriptor.php")
                    .addInterface(
                            "Symfony\\Component\\VarDumper\\Command\\Descriptor\\DumpDescriptorInterface")
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
