package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_get_last;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-text-template/src/Template.php

*/

public class Text_Template extends RuntimeClassBase {

    public Object template = "";

    public Object openDelimiter = "{";

    public Object closeDelimiter = "}";

    public Object values = ZVal.newArray();

    public Text_Template(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Text_Template.class) {
            this.__construct(env, args);
        }
    }

    public Text_Template(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "openDelimiter")
    @ConvertedParameter(index = 2, name = "closeDelimiter")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, true);
        if (null == file) {
            file = "";
        }
        Object openDelimiter = assignParameter(args, 1, true);
        if (null == openDelimiter) {
            openDelimiter = "{";
        }
        Object closeDelimiter = assignParameter(args, 2, true);
        if (null == closeDelimiter) {
            closeDelimiter = "}";
        }
        this.setFile(env, file);
        this.openDelimiter = openDelimiter;
        this.closeDelimiter = closeDelimiter;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object setFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object distFile = null;
        distFile = toStringR(file, env) + ".dist";
        if (function_file_exists.f.env(env).call(file).getBool()) {
            this.template = function_file_get_contents.f.env(env).call(file).value();

        } else {
            if (function_file_exists.f.env(env).call(distFile).getBool()) {
                this.template = function_file_get_contents.f.env(env).call(distFile).value();

            } else {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(env, "Template file could not be loaded."));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "merge",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setVar(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object merge = assignParameter(args, 1, true);
        if (null == merge) {
            merge = true;
        }
        if (ZVal.toBool(!ZVal.isTrue(merge)) || ZVal.toBool(ZVal.isEmpty(this.values))) {
            this.values = values;

        } else {
            this.values = function_array_merge.f.env(env).call(this.values, values).value();
        }

        return null;
    }

    @ConvertedMethod
    public Object render(RuntimeEnv env, Object... args) {
        ReferenceContainer keys = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        keys.setObject(ZVal.newArray());
        for (ZPair zpairResult1117 : ZVal.getIterable(this.values, env, false)) {
            key = ZVal.assign(zpairResult1117.getKey());
            value = ZVal.assign(zpairResult1117.getValue());
            keys.arrayAppend(env)
                    .set(
                            toStringR(this.openDelimiter, env)
                                    + toStringR(key, env)
                                    + toStringR(this.closeDelimiter, env));
        }

        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(keys.getObject(), this.values, this.template)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    public Object renderTo(RuntimeEnv env, Object... args) {
        Object target = assignParameter(args, 0, false);
        Object fp = null;
        ReferenceContainer error = new BasicReferenceContainer(null);
        fp = function_fopen.f.env(env).call(target, "wt").value();
        if (ZVal.isTrue(fp)) {
            function_fwrite.f.env(env).call(fp, this.render(env));
            function_fclose.f.env(env).call(fp);

        } else {
            error.setObject(function_error_get_last.f.env(env).call().value());
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Could not write to %s: %s",
                                            target,
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            error.arrayGet(env, "message"),
                                                            ZVal.add(
                                                                    function_strpos
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    error.arrayGet(
                                                                                            env,
                                                                                            "message"),
                                                                                    ":")
                                                                            .value(),
                                                                    2))
                                                    .value())
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class = "Text_Template";

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
                    .setName("Text_Template")
                    .setLookup(
                            Text_Template.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("closeDelimiter", "openDelimiter", "template", "values")
                    .setFilename("vendor/phpunit/php-text-template/src/Template.php")
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
