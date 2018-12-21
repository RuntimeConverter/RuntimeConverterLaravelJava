package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutput;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.classes.ArgumentFormatter;
import com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.classes.Highlighter;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Writer.php

*/

public class Writer extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .NunoMaduro
                .namespaces
                .Collision
                .namespaces
                .Contracts
                .classes
                .Writer {

    public Object output = null;

    public Object argumentFormatter = null;

    public Object highlighter = null;

    public Object ignore = ZVal.newArray();

    public Object showTrace = true;

    public Object showEditor = true;

    public Writer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Writer.class) {
            this.__construct(env, args);
        }
    }

    public Writer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "argumentFormatter",
        typeHint = "NunoMaduro\\Collision\\Contracts\\ArgumentFormatter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "highlighter",
        typeHint = "NunoMaduro\\Collision\\Contracts\\Highlighter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, true);
        if (null == output) {
            output = ZVal.getNull();
        }
        Object argumentFormatter = assignParameter(args, 1, true);
        if (null == argumentFormatter) {
            argumentFormatter = ZVal.getNull();
        }
        Object highlighter = assignParameter(args, 2, true);
        if (null == highlighter) {
            highlighter = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.output =
                ZVal.isTrue(ternaryExpressionTemp = output)
                        ? ternaryExpressionTemp
                        : new ConsoleOutput(env);
        this.argumentFormatter =
                ZVal.isTrue(ternaryExpressionTemp = argumentFormatter)
                        ? ternaryExpressionTemp
                        : new ArgumentFormatter(env);
        this.highlighter =
                ZVal.isTrue(ternaryExpressionTemp = highlighter)
                        ? ternaryExpressionTemp
                        : new Highlighter(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "inspector", typeHint = "Whoops\\Exception\\Inspector")
    public Object write(RuntimeEnv env, Object... args) {
        Object inspector = assignParameter(args, 0, false);
        Object editorFrame = null;
        Object frames = null;
        this.renderTitle(env, inspector);
        frames = this.getFrames(env, inspector);
        editorFrame = function_array_shift.f.env(env).call(frames).value();
        if (ZVal.toBool(this.showEditor)
                && ZVal.toBool(ZVal.strictNotEqualityCheck(editorFrame, "!==", ZVal.getNull()))) {
            this.renderEditor(env, editorFrame);
        }

        if (ZVal.toBool(this.showTrace) && ZVal.toBool(!ZVal.isEmpty(frames))) {
            this.renderTrace(env, frames);

        } else {
            env.callMethod(this.output, "writeln", Writer.class, "");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ignore", typeHint = "array")
    public Object ignoreFilesIn(RuntimeEnv env, Object... args) {
        Object ignore = assignParameter(args, 0, false);
        this.ignore = ignore;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "show", typeHint = "bool")
    public Object showTrace(RuntimeEnv env, Object... args) {
        Object show = assignParameter(args, 0, false);
        this.showTrace = show;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "show", typeHint = "bool")
    public Object showEditor(RuntimeEnv env, Object... args) {
        Object show = assignParameter(args, 0, false);
        this.showEditor = show;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object setOutput(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        this.output = output;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getOutput(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.output);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "inspector", typeHint = "Whoops\\Exception\\Inspector")
    protected Object getFrames(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nunomaduro/collision/src")
                        .setFile("/vendor/nunomaduro/collision/src/Writer.php");
        Object inspector = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(inspector, "getFrames", Writer.class),
                                "filter",
                                Writer.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "NunoMaduro\\Collision",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "frame")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object frame = assignParameter(args, 0, false);
                                        Object ignore = null;
                                        for (ZPair zpairResult910 :
                                                ZVal.getIterable(Writer.this.ignore, env, true)) {
                                            ignore = ZVal.assign(zpairResult910.getValue());
                                            if (function_preg_match
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            ignore,
                                                            env.callMethod(
                                                                    frame, "getFile", Writer.class))
                                                    .getBool()) {
                                                return ZVal.assign(false);
                                            }
                                        }

                                        return ZVal.assign(true);
                                    }
                                }),
                        "getArray",
                        Writer.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "inspector", typeHint = "Whoops\\Exception\\Inspector")
    protected Object renderTitle(RuntimeEnv env, Object... args) {
        Object inspector = assignParameter(args, 0, false);
        Object exception = null;
        Object message = null;
        Object _pClass = null;
        exception = env.callMethod(inspector, "getException", Writer.class);
        message = env.callMethod(exception, "getMessage", Writer.class);
        _pClass = env.callMethod(inspector, "getExceptionName", Writer.class);
        this.render(
                env,
                "<bg=red;options=bold> "
                        + toStringR(_pClass, env)
                        + " </> : <comment>"
                        + toStringR(message, env)
                        + "</>");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "frame", typeHint = "Whoops\\Exception\\Frame")
    protected Object renderEditor(RuntimeEnv env, Object... args) {
        Object frame = assignParameter(args, 0, false);
        Object content = null;
        this.render(
                env,
                "at <fg=green>"
                        + toStringR(env.callMethod(frame, "getFile", Writer.class), env)
                        + "</>"
                        + ":<fg=green>"
                        + toStringR(env.callMethod(frame, "getLine", Writer.class), env)
                        + "</>");
        content =
                env.callMethod(
                        this.highlighter,
                        "highlight",
                        Writer.class,
                        toStringR(env.callMethod(frame, "getFileContents", Writer.class), env),
                        ZVal.toLong(env.callMethod(frame, "getLine", Writer.class)));
        env.callMethod(this.output, "writeln", Writer.class, content);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "frames", typeHint = "array")
    protected Object renderTrace(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object frames = assignParameter(args, 0, false);
        Object ___args = null;
        Object file = null;
        Object pos = null;
        Object line = null;
        Object function = null;
        Object i = null;
        Object _pClass = null;
        Object frame = null;
        this.render(env, "<comment>Exception trace:</comment>");
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult911 : ZVal.getIterable(frames, env, false)) {
            i = ZVal.assign(zpairResult911.getKey());
            frame = ZVal.assign(zpairResult911.getValue());
            if (ZVal.toBool(
                            ZVal.isGreaterThan(
                                    i,
                                    '>',
                                    ClassConstantUtils.getConstantValueLateStatic(
                                            env, this, "VERBOSITY_NORMAL_FRAMES")))
                    && ZVal.toBool(
                            ZVal.isLessThan(
                                    env.callMethod(this.output, "getVerbosity", Writer.class),
                                    '<',
                                    OutputInterface.CONST_VERBOSITY_VERBOSE))) {
                this.render(
                        env,
                        "<info>Please use the argument <fg=red>-v</> to see more details.</info>");
                break;
            }

            file = env.callMethod(frame, "getFile", Writer.class);
            line = env.callMethod(frame, "getLine", Writer.class);
            _pClass =
                    ZVal.assign(
                            ZVal.isEmpty(env.callMethod(frame, "getClass", Writer.class))
                                    ? ""
                                    : toStringR(
                                                    env.callMethod(frame, "getClass", Writer.class),
                                                    env)
                                            + "::");
            function = env.callMethod(frame, "getFunction", Writer.class);
            ___args =
                    env.callMethod(
                            this.argumentFormatter,
                            "format",
                            Writer.class,
                            env.callMethod(frame, "getArgs", Writer.class));
            pos = NamespaceGlobal.str_pad.env(env).call(ZVal.add(i, 1), 4, " ").value();
            this.render(
                    env,
                    "<comment><fg=cyan>"
                            + toStringR(pos, env)
                            + "</>"
                            + toStringR(_pClass, env)
                            + toStringR(function, env)
                            + "("
                            + toStringR(___args, env)
                            + ")</comment>");
            this.render(
                    env,
                    "    <fg=green>"
                            + toStringR(file, env)
                            + "</>:<fg=green>"
                            + toStringR(line, env)
                            + "</>",
                    false);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "break",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object render(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object _pBreak = assignParameter(args, 1, true);
        if (null == _pBreak) {
            _pBreak = true;
        }
        if (ZVal.isTrue(_pBreak)) {
            env.callMethod(this.output, "writeln", Writer.class, "");
        }

        env.callMethod(this.output, "writeln", Writer.class, "  " + toStringR(message, env));
        return ZVal.assign(this);
    }

    public static final Object CONST_VERBOSITY_NORMAL_FRAMES = 1;

    public static final Object CONST_class = "NunoMaduro\\Collision\\Writer";

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
                    .setName("NunoMaduro\\Collision\\Writer")
                    .setLookup(
                            Writer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "argumentFormatter",
                            "highlighter",
                            "ignore",
                            "output",
                            "showEditor",
                            "showTrace")
                    .setFilename("vendor/nunomaduro/collision/src/Writer.php")
                    .addInterface("NunoMaduro\\Collision\\Contracts\\Writer")
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
