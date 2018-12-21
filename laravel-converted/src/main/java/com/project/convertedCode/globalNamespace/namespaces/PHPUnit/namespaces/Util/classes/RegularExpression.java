package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.ErrorHandler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/RegularExpression.php

*/

public final class RegularExpression extends RuntimeClassBase {

    public RegularExpression(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RegularExpression(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\RegularExpression";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pattern", typeHint = "string")
        @ConvertedParameter(index = 1, name = "subject", typeHint = "string")
        @ConvertedParameter(
            index = 2,
            name = "matches",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "flags",
            typeHint = "int",
            defaultValue = "0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 4,
            name = "offset",
            typeHint = "int",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object safeMatch(RuntimeEnv env, Object... args) {
            Object pattern = assignParameter(args, 0, false);
            Object subject = assignParameter(args, 1, false);
            ReferenceContainer matches =
                    new BasicReferenceContainer(assignParameter(args, 2, true));
            if (null == matches.getObject()) {
                matches.setObject(ZVal.getNull());
            }
            Object flags = assignParameter(args, 3, true);
            if (null == flags) {
                flags = 0;
            }
            Object offset = assignParameter(args, 4, true);
            if (null == offset) {
                offset = 0;
            }
            Object handler_terminator = null;
            Object match = null;
            handler_terminator = ErrorHandler.runtimeStaticObject.handleErrorOnce(env);
            match =
                    function_preg_match
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                            .call(pattern, subject, matches.getObject(), flags, offset)
                            .value();
            env.callFunctionDynamic(handler_terminator, new RuntimeArgsWithReferences());
            return ZVal.assign(match);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\RegularExpression")
                    .setLookup(
                            RegularExpression.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/RegularExpression.php")
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
