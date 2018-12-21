package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes;

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
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveFilterIterator;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/Filter/Factory.php

*/

public class Factory extends RuntimeClassBase {

    public Object filters = ZVal.newArray();

    public Factory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Factory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filter", typeHint = "ReflectionClass")
    @ConvertedParameter(index = 1, name = "args")
    public Object addFilter(RuntimeEnv env, Object... args) {
        Object filter = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        if (!ZVal.isTrue(
                env.callMethod(filter, "isSubclassOf", Factory.class, "RecursiveFilterIterator"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Class \"%s\" does not extend RecursiveFilterIterator",
                                            toObjectR(filter)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value())
                                    .value()));
        }

        new ReferenceClassProperty(this, "filters", env)
                .arrayAppend(env)
                .set(ZVal.newArray(new ZPair(0, filter), new ZPair(1, ___args)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "Iterator")
    @ConvertedParameter(index = 1, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object factory(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, false);
        Object suite = assignParameter(args, 1, false);
        Object ___args = null;
        Object filter = null;
        Object _pClass = null;
        Object runtimeTempArrayResult142 = null;
        for (ZPair zpairResult1210 : ZVal.getIterable(this.filters, env, true)) {
            filter = ZVal.assign(zpairResult1210.getValue());
            ZVal.list(
                    runtimeTempArrayResult142 = filter,
                    (_pClass = listGet(runtimeTempArrayResult142, 0, env)),
                    (___args = listGet(runtimeTempArrayResult142, 1, env)));
            iterator =
                    env.callMethod(_pClass, "newInstance", Factory.class, iterator, ___args, suite);
        }

        return ZVal.assign(iterator);
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\Filter\\Factory";

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
                    .setName("PHPUnit\\Runner\\Filter\\Factory")
                    .setLookup(
                            Factory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filters")
                    .setFilename("vendor/phpunit/phpunit/src/Runner/Filter/Factory.php")
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
