package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.OutputPager;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.StreamOutput;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Output/ProcOutputPager.php

*/

public class ProcOutputPager extends StreamOutput implements OutputPager {

    public Object proc = null;

    public Object pipe = null;

    public Object cmd = null;

    public ProcOutputPager(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.stream = null;
        if (this.getClass() == ProcOutputPager.class) {
            this.__construct(env, args);
        }
    }

    public ProcOutputPager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\StreamOutput"
    )
    @ConvertedParameter(index = 1, name = "cmd")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object cmd = assignParameter(args, 1, true);
        if (null == cmd) {
            cmd = "less -R -S -F -X";
        }
        this.stream = env.callMethod(output, "getStream", ProcOutputPager.class);
        this.cmd = cmd;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "newline")
    public Object doWrite(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object newline = assignParameter(args, 1, false);
        Object pipe = null;
        pipe = this.getPipe(env);
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                function_fwrite
                        .f
                        .env(env)
                        .call(
                                pipe,
                                toStringR(message, env)
                                        + toStringR(ZVal.isTrue(newline) ? "\n" : "", env))
                        .value())) {
            throw ZVal.getException(env, new RuntimeException(env, "Unable to write output"));
        }

        NamespaceGlobal.fflush.env(env).call(pipe);
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        Object exit = null;
        if (ZVal.isset(this.pipe)) {
            function_fclose.f.env(env).call(this.pipe);
        }

        if (ZVal.isset(this.proc)) {
            exit = NamespaceGlobal.proc_close.env(env).call(this.proc).value();
            if (ZVal.strictNotEqualityCheck(exit, "!==", 0)) {
                throw ZVal.getException(
                        env, new RuntimeException(env, "Error closing output stream"));
            }
        }

        this.pipe = null;
        this.proc = null;
        return null;
    }

    @ConvertedMethod
    private Object getPipe(RuntimeEnv env, Object... args) {
        ReferenceContainer pipes = new BasicReferenceContainer(null);
        Object desc = null;
        if (ZVal.toBool(!ZVal.isset(this.pipe)) || ZVal.toBool(!ZVal.isset(this.proc))) {
            desc =
                    ZVal.newArray(
                            new ZPair(0, ZVal.arrayFromList("pipe", "r")),
                            new ZPair(1, this.stream),
                            new ZPair(
                                    2,
                                    function_fopen.f.env(env).call("php://stderr", "w").value()));
            this.proc =
                    NamespaceGlobal.proc_open
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                            .call(this.cmd, desc, pipes.getObject())
                            .value();
            if (!function_is_resource.f.env(env).call(this.proc).getBool()) {
                throw ZVal.getException(
                        env, new RuntimeException(env, "Error opening output stream"));
            }

            this.pipe = pipes.arrayGet(env, 0);
        }

        return ZVal.assign(this.pipe);
    }

    public static final Object CONST_class = "Psy\\Output\\ProcOutputPager";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StreamOutput.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Output\\ProcOutputPager")
                    .setLookup(
                            ProcOutputPager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cmd", "formatter", "pipe", "proc", "stream", "stream", "verbosity")
                    .setFilename("vendor/psy/psysh/src/Output/ProcOutputPager.php")
                    .addInterface("Psy\\Output\\OutputPager")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Output\\StreamOutput")
                    .addExtendsClass("Symfony\\Component\\Console\\Output\\Output")
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
