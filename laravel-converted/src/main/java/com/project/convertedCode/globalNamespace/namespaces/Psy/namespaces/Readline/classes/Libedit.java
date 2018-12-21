package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes.GNUReadline;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Util.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Readline/Libedit.php

*/

public class Libedit extends GNUReadline {

    public Libedit(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Libedit.class) {
            this.__construct(env, args);
        }
    }

    public Libedit(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object listHistory(RuntimeEnv env, Object... args) {
        Object history = null;
        history =
                function_file_get_contents
                        .f
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("historyFile").value())
                        .value();
        if (!ZVal.isTrue(history)) {
            return ZVal.assign(ZVal.newArray());
        }

        history = function_explode.f.env(env).call("\n", history).value();
        if (ZVal.strictNotEqualityCheck(
                function_array_shift.f.env(env).call(history).value(), "!==", "_HiStOrY_V2_")) {
            return ZVal.assign(ZVal.newArray());
        }

        history =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "parseHistoryLine")),
                                history)
                        .value();
        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(function_array_filter.f.env(env).call(history).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    protected Object parseHistoryLine(RuntimeEnv env, Object... args) {
        ReferenceContainer line = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object pos = null;
        if (ZVal.toBool(!ZVal.isTrue(line.getObject()))
                || ZVal.toBool(ZVal.strictEqualityCheck(line.arrayGet(env, 0), "===", "\u0000"))) {
            return null;
        }

        if (ZVal.strictNotEqualityCheck(
                pos = function_strpos.f.env(env).call(line.getObject(), "\u0000").value(),
                "!==",
                false)) {
            line.setObject(function_substr.f.env(env).call(line.getObject(), 0, pos).value());
        }

        return ZVal.assign(
                ZVal.strictNotEqualityCheck(line.getObject(), "!==", "")
                        ? Str.runtimeStaticObject.unvis(env, line.getObject())
                        : ZVal.getNull());
    }

    public static final Object CONST_class = "Psy\\Readline\\Libedit";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends GNUReadline.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object isSupported(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.toBool(function_function_exists.f.env(env).call("readline").value())
                            && ZVal.toBool(
                                    !function_function_exists
                                            .f
                                            .env(env)
                                            .call("readline_list_history")
                                            .getBool()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Readline\\Libedit")
                    .setLookup(
                            Libedit.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("eraseDups", "historyFile", "historySize")
                    .setFilename("vendor/psy/psysh/src/Readline/Libedit.php")
                    .addInterface("Psy\\Readline\\Readline")
                    .addExtendsClass("Psy\\Readline\\GNUReadline")
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
