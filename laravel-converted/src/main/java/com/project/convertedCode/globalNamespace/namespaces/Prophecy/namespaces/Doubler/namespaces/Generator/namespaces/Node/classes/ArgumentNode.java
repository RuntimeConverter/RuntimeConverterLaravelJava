package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/ArgumentNode.php

*/

public class ArgumentNode extends RuntimeClassBase {

    public Object name = null;

    public Object typeHint = null;

    public Object _pDefault = null;

    public Object optional = false;

    public Object byReference = false;

    public Object isVariadic = false;

    public Object isNullable = false;

    public ArgumentNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArgumentNode.class) {
            this.__construct(env, args);
        }
    }

    public ArgumentNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getTypeHint(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.typeHint);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "typeHint",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setTypeHint(RuntimeEnv env, Object... args) {
        Object typeHint = assignParameter(args, 0, true);
        if (null == typeHint) {
            typeHint = ZVal.getNull();
        }
        this.typeHint = typeHint;
        return null;
    }

    @ConvertedMethod
    public Object hasDefault(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(this.isOptional(env))
                        && ZVal.toBool(!ZVal.isTrue(this.isVariadic(env))));
    }

    @ConvertedMethod
    public Object getDefault(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setDefault(RuntimeEnv env, Object... args) {
        Object _pDefault = assignParameter(args, 0, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        this.optional = true;
        this._pDefault = _pDefault;
        return null;
    }

    @ConvertedMethod
    public Object isOptional(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.optional);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "byReference",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setAsPassedByReference(RuntimeEnv env, Object... args) {
        Object byReference = assignParameter(args, 0, true);
        if (null == byReference) {
            byReference = true;
        }
        this.byReference = byReference;
        return null;
    }

    @ConvertedMethod
    public Object isPassedByReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.byReference);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "isVariadic",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setAsVariadic(RuntimeEnv env, Object... args) {
        Object isVariadic = assignParameter(args, 0, true);
        if (null == isVariadic) {
            isVariadic = true;
        }
        this.isVariadic = isVariadic;
        return null;
    }

    @ConvertedMethod
    public Object isVariadic(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isVariadic);
    }

    @ConvertedMethod
    public Object isNullable(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isNullable);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "isNullable",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setAsNullable(RuntimeEnv env, Object... args) {
        Object isNullable = assignParameter(args, 0, true);
        if (null == isNullable) {
            isNullable = true;
        }
        this.isNullable = isNullable;
        return null;
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\Node\\ArgumentNode";

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
                    .setName("Prophecy\\Doubler\\Generator\\Node\\ArgumentNode")
                    .setLookup(
                            ArgumentNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "byReference",
                            "default",
                            "isNullable",
                            "isVariadic",
                            "name",
                            "optional",
                            "typeHint")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/ArgumentNode.php")
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
