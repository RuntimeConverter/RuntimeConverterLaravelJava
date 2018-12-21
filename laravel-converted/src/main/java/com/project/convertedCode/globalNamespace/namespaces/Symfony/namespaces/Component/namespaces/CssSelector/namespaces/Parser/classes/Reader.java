package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Parser/Reader.php

*/

public class Reader extends RuntimeClassBase {

    public Object source = null;

    public Object length = null;

    public Object position = 0;

    public Reader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Reader.class) {
            this.__construct(env, args);
        }
    }

    public Reader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        this.source = source;
        this.length = function_strlen.f.env(env).call(source).value();
        return null;
    }

    @ConvertedMethod
    public Object isEOF(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isGreaterThanOrEqualTo(this.position, ">=", this.length));
    }

    @ConvertedMethod
    public Object getPosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.position);
    }

    @ConvertedMethod
    public Object getRemainingLength(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.subtract(this.length, this.position));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length", typeHint = "int")
    @ConvertedParameter(
        index = 1,
        name = "offset",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object getSubstring(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        Object offset = assignParameter(args, 1, true);
        if (null == offset) {
            offset = 0;
        }
        return ZVal.assign(
                function_substr
                        .f
                        .env(env)
                        .call(this.source, ZVal.add(this.position, offset), length)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    public Object getOffset(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object position = null;
        position = function_strpos.f.env(env).call(this.source, string, this.position).value();
        return ZVal.assign(
                ZVal.strictEqualityCheck(false, "===", position)
                        ? false
                        : ZVal.subtract(position, this.position));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern", typeHint = "string")
    public Object findPattern(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        Object source = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        source = function_substr.f.env(env).call(this.source, this.position).value();
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(pattern, source, matches.getObject())
                .getBool()) {
            return ZVal.assign(matches.getObject());
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length", typeHint = "int")
    public Object moveForward(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        this.position = ZAssignment.add("+=", this.position, length);
        return null;
    }

    @ConvertedMethod
    public Object moveToEnd(RuntimeEnv env, Object... args) {
        this.position = this.length;
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Parser\\Reader";

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
                    .setName("Symfony\\Component\\CssSelector\\Parser\\Reader")
                    .setLookup(
                            Reader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("length", "position", "source")
                    .setFilename("vendor/symfony/css-selector/Parser/Reader.php")
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
