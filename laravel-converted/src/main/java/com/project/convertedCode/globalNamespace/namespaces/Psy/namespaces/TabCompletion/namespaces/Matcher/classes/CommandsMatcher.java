package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/CommandsMatcher.php

*/

public class CommandsMatcher extends AbstractMatcher {

    public Object commands = ZVal.newArray();

    public CommandsMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CommandsMatcher.class) {
            this.__construct(env, args);
        }
    }

    public CommandsMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commands", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object commands = assignParameter(args, 0, false);
        this.setCommands(env, commands);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commands", typeHint = "array")
    public Object setCommands(RuntimeEnv env, Object... args) {
        Object commands = assignParameter(args, 0, false);
        Object names = null;
        Object command = null;
        names = ZVal.newArray();
        for (ZPair zpairResult1421 : ZVal.getIterable(commands, env, true)) {
            command = ZVal.assign(zpairResult1421.getValue());
            names =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    env.callMethod(
                                                            command,
                                                            "getName",
                                                            CommandsMatcher.class))),
                                    names)
                            .value();
            names =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(command, "getAliases", CommandsMatcher.class),
                                    names)
                            .value();
        }

        this.commands = names;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object isCommand(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(function_in_array.f.env(env).call(name, this.commands).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object matchCommand(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object cmd = null;
        for (ZPair zpairResult1422 : ZVal.getIterable(this.commands, env, true)) {
            cmd = ZVal.assign(zpairResult1422.getValue());
            if (ZVal.isTrue(env.callMethod(this, "startsWith", CommandsMatcher.class, name, cmd))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "info",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getMatches(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/TabCompletion/Matcher")
                        .setFile("/vendor/psy/psysh/src/TabCompletion/Matcher/CommandsMatcher.php");
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object input = null;
        input = env.callMethod(this, "getInput", CommandsMatcher.class, tokens);
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                this.commands,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\TabCompletion\\Matcher",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "command")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object command = assignParameter(args, 0, false);
                                        Object input = null;
                                        input = this.contextReferences.getCapturedValue("input");
                                        return ZVal.assign(
                                                AbstractMatcher.runtimeStaticObject.startsWith(
                                                        env, input, command));
                                    }
                                }.use("input", input))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    public Object hasMatched(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        ReferenceContainer command = new BasicReferenceContainer(null);
        function_array_shift.f.env(env).call(tokens);
        command.setObject(function_array_shift.f.env(env).call(tokens).value());
        SwitchEnumType83 switchVariable83 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType83.DEFAULT_CASE,
                        SwitchEnumType83.MINUS_MINUS_null,
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.toBool(
                                                                        runtimeStaticObject.tokenIs(
                                                                                env,
                                                                                command.getObject(),
                                                                                CONST_T_STRING))
                                                                && ZVal.toBool(
                                                                        !ZVal.isTrue(
                                                                                this.isCommand(
                                                                                        env,
                                                                                        command
                                                                                                .arrayGet(
                                                                                                        env,
                                                                                                        1)))))
                                                && ZVal.toBool(
                                                        this.matchCommand(
                                                                env, command.arrayGet(env, 1))))
                                && ZVal.toBool(ZVal.isEmpty(tokens)));
        switch (switchVariable83) {
            case MINUS_MINUS_null:
                return ZVal.assign(true);
        }
        ;
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\CommandsMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\TabCompletion\\Matcher\\CommandsMatcher")
                    .setLookup(
                            CommandsMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("commands")
                    .setFilename("vendor/psy/psysh/src/TabCompletion/Matcher/CommandsMatcher.php")
                    .addExtendsClass("Psy\\TabCompletion\\Matcher\\AbstractMatcher")
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

    private enum SwitchEnumType83 {
        MINUS_MINUS_null,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
