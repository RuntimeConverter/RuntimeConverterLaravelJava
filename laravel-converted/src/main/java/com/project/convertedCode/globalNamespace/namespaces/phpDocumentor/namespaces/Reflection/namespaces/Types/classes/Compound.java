package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes.Type;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/Types/Compound.php

*/

public final class Compound extends RuntimeClassBase implements Type, IteratorAggregate {

    public Object types = null;

    public Compound(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Compound.class) {
            this.__construct(env, args);
        }
    }

    public Compound(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "types", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object types = assignParameter(args, 0, false);
        Object type = null;
        for (ZPair zpairResult938 : ZVal.getIterable(types, env, true)) {
            type = ZVal.assign(zpairResult938.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(type, Type.class, "phpDocumentor\\Reflection\\Type"))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "A compound type can only have other types as elements"));
            }
        }

        this.types = types;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index")
    public Object get(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.has(env, index))) {
            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(new ReferenceClassProperty(this, "types", env).arrayGet(env, index));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index")
    public Object has(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "types", env),
                        env,
                        index));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("|", this.types).value());
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayIterator(env, this.types));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Types\\Compound";

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
                    .setName("phpDocumentor\\Reflection\\Types\\Compound")
                    .setLookup(
                            Compound.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("types")
                    .setFilename("vendor/phpdocumentor/type-resolver/src/Types/Compound.php")
                    .addInterface("phpDocumentor\\Reflection\\Type")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
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
