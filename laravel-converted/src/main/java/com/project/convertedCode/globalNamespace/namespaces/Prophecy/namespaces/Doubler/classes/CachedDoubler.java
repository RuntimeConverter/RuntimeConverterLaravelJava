package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes.Doubler;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/CachedDoubler.php

*/

public class CachedDoubler extends Doubler {

    public Object classes = ZVal.newArray();

    public CachedDoubler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CachedDoubler.class) {
            this.__construct(env, args);
        }
    }

    public CachedDoubler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "patch",
        typeHint = "Prophecy\\Doubler\\ClassPatch\\ClassPatchInterface"
    )
    public Object registerClassPatch(RuntimeEnv env, Object... args) {
        Object patch = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "classes", env).arrayAppend(env).set(ZVal.newArray());
        super.registerClassPatch(env, patch);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "ReflectionClass",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "interfaces", typeHint = "array")
    protected Object createDoubleClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, true);
        if (null == _pClass) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, false);
        Object classId = null;
        classId = this.generateClassId(env, _pClass, interfaces);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "classes", env),
                env,
                classId)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "classes", env).arrayGet(env, classId));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "classes", env)
                        .arrayAccess(env, classId)
                        .set(super.createDoubleClass(env, _pClass, interfaces)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "ReflectionClass",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "interfaces", typeHint = "array")
    private Object generateClassId(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, true);
        if (null == _pClass) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, false);
        ReferenceContainer parts = new BasicReferenceContainer(null);
        Object _pInterface = null;
        parts.setObject(ZVal.newArray());
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pClass)) {
            parts.arrayAppend(env).set(env.callMethod(_pClass, "getName", CachedDoubler.class));
        }

        for (ZPair zpairResult946 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult946.getValue());
            parts.arrayAppend(env).set(env.callMethod(_pInterface, "getName", CachedDoubler.class));
        }

        function_sort.f.env(env).call(parts.getObject());
        return ZVal.assign(
                NamespaceGlobal.md5
                        .env(env)
                        .call(NamespaceGlobal.implode.env(env).call("", parts.getObject()).value())
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\CachedDoubler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Doubler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\CachedDoubler")
                    .setLookup(
                            CachedDoubler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "classes", "creator", "instantiator", "mirror", "namer", "patches")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Doubler/CachedDoubler.php")
                    .addExtendsClass("Prophecy\\Doubler\\Doubler")
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
