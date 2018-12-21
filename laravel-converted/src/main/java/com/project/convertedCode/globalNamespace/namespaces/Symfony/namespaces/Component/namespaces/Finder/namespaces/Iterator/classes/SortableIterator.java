package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_uasort;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Iterator/SortableIterator.php

*/

public class SortableIterator extends RuntimeClassBase implements IteratorAggregate {

    public Object iterator = null;

    public Object sort = null;

    public SortableIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SortableIterator.class) {
            this.__construct(env, args);
        }
    }

    public SortableIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "Traversable")
    @ConvertedParameter(index = 1, name = "sort")
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/finder/Iterator")
                        .setFile("/vendor/symfony/finder/Iterator/SortableIterator.php");
        Object iterator = assignParameter(args, 0, false);
        Object sort = assignParameter(args, 1, false);
        this.iterator = iterator;
        if (ZVal.strictEqualityCheck(CONST_SORT_BY_NAME, "===", sort)) {
            this.sort =
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Symfony\\Component\\Finder\\Iterator",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "a")
                        @ConvertedParameter(index = 1, name = "b")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object a = assignParameter(args, 0, false);
                            Object b = assignParameter(args, 1, false);
                            Object ternaryExpressionTemp = null;
                            return ZVal.assign(
                                    NamespaceGlobal.strcmp
                                            .env(env)
                                            .call(
                                                    ZVal.isTrue(
                                                                    ternaryExpressionTemp =
                                                                            env.callMethod(
                                                                                    a,
                                                                                    "getRealpath",
                                                                                    SortableIterator
                                                                                            .class))
                                                            ? ternaryExpressionTemp
                                                            : env.callMethod(
                                                                    a,
                                                                    "getPathname",
                                                                    SortableIterator.class),
                                                    ZVal.isTrue(
                                                                    ternaryExpressionTemp =
                                                                            env.callMethod(
                                                                                    b,
                                                                                    "getRealpath",
                                                                                    SortableIterator
                                                                                            .class))
                                                            ? ternaryExpressionTemp
                                                            : env.callMethod(
                                                                    b,
                                                                    "getPathname",
                                                                    SortableIterator.class))
                                            .value());
                        }
                    };

        } else if (ZVal.strictEqualityCheck(CONST_SORT_BY_TYPE, "===", sort)) {
            this.sort =
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Symfony\\Component\\Finder\\Iterator",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "a")
                        @ConvertedParameter(index = 1, name = "b")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object a = assignParameter(args, 0, false);
                            Object b = assignParameter(args, 1, false);
                            Object ternaryExpressionTemp = null;
                            if (ZVal.toBool(env.callMethod(a, "isDir", SortableIterator.class))
                                    && ZVal.toBool(
                                            env.callMethod(b, "isFile", SortableIterator.class))) {
                                return -1;

                            } else if (ZVal.toBool(
                                            env.callMethod(a, "isFile", SortableIterator.class))
                                    && ZVal.toBool(
                                            env.callMethod(b, "isDir", SortableIterator.class))) {
                                return 1;
                            }

                            return ZVal.assign(
                                    NamespaceGlobal.strcmp
                                            .env(env)
                                            .call(
                                                    ZVal.isTrue(
                                                                    ternaryExpressionTemp =
                                                                            env.callMethod(
                                                                                    a,
                                                                                    "getRealpath",
                                                                                    SortableIterator
                                                                                            .class))
                                                            ? ternaryExpressionTemp
                                                            : env.callMethod(
                                                                    a,
                                                                    "getPathname",
                                                                    SortableIterator.class),
                                                    ZVal.isTrue(
                                                                    ternaryExpressionTemp =
                                                                            env.callMethod(
                                                                                    b,
                                                                                    "getRealpath",
                                                                                    SortableIterator
                                                                                            .class))
                                                            ? ternaryExpressionTemp
                                                            : env.callMethod(
                                                                    b,
                                                                    "getPathname",
                                                                    SortableIterator.class))
                                            .value());
                        }
                    };

        } else if (ZVal.strictEqualityCheck(CONST_SORT_BY_ACCESSED_TIME, "===", sort)) {
            this.sort =
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Symfony\\Component\\Finder\\Iterator",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "a")
                        @ConvertedParameter(index = 1, name = "b")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object a = assignParameter(args, 0, false);
                            Object b = assignParameter(args, 1, false);
                            return ZVal.assign(
                                    ZVal.subtract(
                                            env.callMethod(a, "getATime", SortableIterator.class),
                                            env.callMethod(b, "getATime", SortableIterator.class)));
                        }
                    };

        } else if (ZVal.strictEqualityCheck(CONST_SORT_BY_CHANGED_TIME, "===", sort)) {
            this.sort =
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Symfony\\Component\\Finder\\Iterator",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "a")
                        @ConvertedParameter(index = 1, name = "b")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object a = assignParameter(args, 0, false);
                            Object b = assignParameter(args, 1, false);
                            return ZVal.assign(
                                    ZVal.subtract(
                                            env.callMethod(a, "getCTime", SortableIterator.class),
                                            env.callMethod(b, "getCTime", SortableIterator.class)));
                        }
                    };

        } else if (ZVal.strictEqualityCheck(CONST_SORT_BY_MODIFIED_TIME, "===", sort)) {
            this.sort =
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Symfony\\Component\\Finder\\Iterator",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "a")
                        @ConvertedParameter(index = 1, name = "b")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object a = assignParameter(args, 0, false);
                            Object b = assignParameter(args, 1, false);
                            return ZVal.assign(
                                    ZVal.subtract(
                                            env.callMethod(a, "getMTime", SortableIterator.class),
                                            env.callMethod(b, "getMTime", SortableIterator.class)));
                        }
                    };

        } else if (function_is_callable.f.env(env).call(sort).getBool()) {
            this.sort = sort;

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The SortableIterator takes a PHP callable or a valid built-in sort algorithm as an argument."));
        }

        return null;
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        Object array = null;
        array = NamespaceGlobal.iterator_to_array.env(env).call(this.iterator, true).value();
        function_uasort.f.env(env).call(array, this.sort);
        return ZVal.assign(new ArrayIterator(env, array));
    }

    public static final Object CONST_SORT_BY_NAME = 1;

    public static final Object CONST_SORT_BY_TYPE = 2;

    public static final Object CONST_SORT_BY_ACCESSED_TIME = 3;

    public static final Object CONST_SORT_BY_CHANGED_TIME = 4;

    public static final Object CONST_SORT_BY_MODIFIED_TIME = 5;

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\SortableIterator";

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
                    .setName("Symfony\\Component\\Finder\\Iterator\\SortableIterator")
                    .setLookup(
                            SortableIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("iterator", "sort")
                    .setFilename("vendor/symfony/finder/Iterator/SortableIterator.php")
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
