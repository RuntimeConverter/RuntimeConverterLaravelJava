package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Configuration;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ConsoleColorFactory;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes.Formatter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunctionAbstract;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleHighlighter.classes.Highlighter;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Formatter/CodeFormatter.php

*/

public class CodeFormatter extends RuntimeClassBase implements Formatter {

    public CodeFormatter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CodeFormatter(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Psy\\Formatter\\CodeFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
        @ConvertedParameter(
            index = 1,
            name = "colorMode",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object format(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            Object colorMode = assignParameter(args, 1, true);
            if (null == colorMode) {
                colorMode = ZVal.getNull();
            }
            Object factory = null;
            Object fileName = null;
            Object file = null;
            Object highlighter = null;
            Object start = null;
            Object ternaryExpressionTemp = null;
            Object end = null;
            Object colors = null;
            if (!ZVal.isTrue(runtimeStaticObject.isReflectable(env, reflector))) {
                throw ZVal.getException(env, new RuntimeException(env, "Source code unavailable"));
            }

            colorMode =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = colorMode)
                                    ? ternaryExpressionTemp
                                    : Configuration.CONST_COLOR_MODE_AUTO);
            if (ZVal.isTrue(
                    fileName = env.callMethod(reflector, "getFileName", CodeFormatter.class))) {
                if (!function_is_file.f.env(env).call(fileName).getBool()) {
                    throw ZVal.getException(
                            env, new RuntimeException(env, "Source code unavailable"));
                }

                file = function_file_get_contents.f.env(env).call(fileName).value();
                start = env.callMethod(reflector, "getStartLine", CodeFormatter.class);
                end =
                        ZVal.subtract(
                                env.callMethod(reflector, "getEndLine", CodeFormatter.class),
                                start);
                factory = new ConsoleColorFactory(env, colorMode);
                colors = env.callMethod(factory, "getConsoleColor", CodeFormatter.class);
                highlighter = new Highlighter(env, colors);
                return ZVal.assign(
                        env.callMethod(
                                highlighter,
                                "getCodeSnippet",
                                CodeFormatter.class,
                                file,
                                start,
                                0,
                                end));

            } else {
                throw ZVal.getException(env, new RuntimeException(env, "Source code unavailable"));
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
        private Object isReflectable(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            reflector, ReflectionClass.class, "ReflectionClass"))
                            || ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            reflector,
                                            ReflectionFunctionAbstract.class,
                                            "ReflectionFunctionAbstract")));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Formatter\\CodeFormatter")
                    .setLookup(
                            CodeFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/Formatter/CodeFormatter.php")
                    .addInterface("Psy\\Formatter\\Formatter")
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
