package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.Terminal;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.StreamOutput;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Output/ConsoleSectionOutput.php

*/

public class ConsoleSectionOutput extends StreamOutput {

    public Object content = ZVal.newArray();

    public Object lines = 0;

    public Object sections = null;

    public Object terminal = null;

    public ConsoleSectionOutput(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsoleSectionOutput.class) {
            this.__construct(env, args);
        }
    }

    public ConsoleSectionOutput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream")
    @ConvertedParameter(index = 1, name = "sections", typeHint = "array")
    @ConvertedParameter(index = 2, name = "verbosity", typeHint = "int")
    @ConvertedParameter(index = 3, name = "decorated", typeHint = "bool")
    @ConvertedParameter(
        index = 4,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface"
    )
    public Object __construct(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object stream = assignParameter(args, 0, false);
        ReferenceContainer sections =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
        Object verbosity = assignParameter(args, 2, false);
        Object decorated = assignParameter(args, 3, false);
        Object formatter = assignParameter(args, 4, false);
        super.__construct(env, stream, verbosity, decorated, formatter);
        function_array_unshift.f.env(env).call(sections.getObject(), this);
        this.sections = sections.getObject();
        this.terminal = new Terminal(env);
        return null;
    }

    public Object __construct(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "lines",
        typeHint = "int",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object clear(RuntimeEnv env, Object... args) {
        Object lines = assignParameter(args, 0, true);
        if (null == lines) {
            lines = ZVal.getNull();
        }
        if (ZVal.toBool(ZVal.isEmpty(this.content))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(this, "isDecorated", ConsoleSectionOutput.class)))) {
            return null;
        }

        if (ZVal.isTrue(lines)) {
            function_array_splice
                    .f
                    .env(env)
                    .call(this.content, ZVal.minusSign(ZVal.multiply(lines, 2)));

        } else {
            lines = ZVal.assign(this.lines);
            this.content = ZVal.newArray();
        }

        this.lines = ZAssignment.subtract("-=", this.lines, lines);
        super.doWrite(env, this.popStreamContentUntilCurrentSection(env, lines), false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object overwrite(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.clear(env);
        env.callMethod(this, "writeln", ConsoleSectionOutput.class, message);
        return null;
    }

    @ConvertedMethod
    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("", this.content).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "newline")
    protected Object doWrite(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object newline = assignParameter(args, 1, false);
        Object ternaryExpressionTemp = null;
        Object erasedContent = null;
        Object lineContent = null;
        if (!ZVal.isTrue(env.callMethod(this, "isDecorated", ConsoleSectionOutput.class))) {
            return ZVal.assign(super.doWrite(env, message, newline));
        }

        erasedContent = this.popStreamContentUntilCurrentSection(env);
        for (ZPair zpairResult1739 :
                ZVal.getIterable(
                        function_explode.f.env(env).call("\n", message).value(), env, true)) {
            lineContent = ZVal.assign(zpairResult1739.getValue());
            this.lines =
                    ZAssignment.add(
                            "+=",
                            this.lines,
                            ZVal.isTrue(
                                            ternaryExpressionTemp =
                                                    NamespaceGlobal.ceil
                                                            .env(env)
                                                            .call(
                                                                    ZVal.divide(
                                                                            this.getDisplayLength(
                                                                                    env,
                                                                                    lineContent),
                                                                            env.callMethod(
                                                                                    this.terminal,
                                                                                    "getWidth",
                                                                                    ConsoleSectionOutput
                                                                                            .class)))
                                                            .value())
                                    ? ternaryExpressionTemp
                                    : 1);
            new ReferenceClassProperty(this, "content", env).arrayAppend(env).set(lineContent);
            new ReferenceClassProperty(this, "content", env).arrayAppend(env).set("\n");
        }

        super.doWrite(env, message, true);
        super.doWrite(env, erasedContent, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "numberOfLinesToClearFromCurrentSection",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    private Object popStreamContentUntilCurrentSection(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object numberOfLinesToClearFromCurrentSection = assignParameter(args, 0, true);
        if (null == numberOfLinesToClearFromCurrentSection) {
            numberOfLinesToClearFromCurrentSection = 0;
        }
        Object section = null;
        ReferenceContainer erasedContent = new BasicReferenceContainer(null);
        Object numberOfLinesToClear = null;
        numberOfLinesToClear = ZVal.assign(numberOfLinesToClearFromCurrentSection);
        erasedContent.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1740 : ZVal.getIterable(this.sections, env, true)) {
            section = ZVal.assign(zpairResult1740.getValue());
            if (ZVal.strictEqualityCheck(section, "===", this)) {
                break;
            }

            numberOfLinesToClear =
                    ZAssignment.add(
                            "+=",
                            numberOfLinesToClear,
                            toObjectR(section).accessProp(this, env).name("lines").value());
            erasedContent
                    .arrayAppend(env)
                    .set(env.callMethod(section, "getContent", ConsoleSectionOutput.class));
        }

        if (ZVal.isGreaterThan(numberOfLinesToClear, '>', 0)) {
            super.doWrite(
                    env,
                    function_sprintf.f.env(env).call("\u001B[%dA", numberOfLinesToClear).value(),
                    false);
            super.doWrite(env, "\u001B[0J", false);
        }

        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                "",
                                function_array_reverse
                                        .f
                                        .env(env)
                                        .call(erasedContent.getObject())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text", typeHint = "string")
    private Object getDisplayLength(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        return ZVal.assign(
                Helper.runtimeStaticObject.strlenWithoutDecoration(
                        env,
                        env.callMethod(this, "getFormatter", ConsoleSectionOutput.class),
                        function_str_replace.f.env(env).call("\t", "        ", text).value()));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Output\\ConsoleSectionOutput";

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
                    .setName("Symfony\\Component\\Console\\Output\\ConsoleSectionOutput")
                    .setLookup(
                            ConsoleSectionOutput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "content",
                            "formatter",
                            "lines",
                            "sections",
                            "stream",
                            "terminal",
                            "verbosity")
                    .setFilename("vendor/symfony/console/Output/ConsoleSectionOutput.php")
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
