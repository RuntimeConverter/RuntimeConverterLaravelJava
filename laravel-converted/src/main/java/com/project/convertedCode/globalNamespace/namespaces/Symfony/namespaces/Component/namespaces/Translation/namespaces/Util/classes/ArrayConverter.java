package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Util/ArrayConverter.php

*/

public class ArrayConverter extends RuntimeClassBase {

    public ArrayConverter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ArrayConverter(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Util\\ArrayConverter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "messages", typeHint = "array")
        public Object expandToTree(RuntimeEnv env, Object... args) {
            Object messages = assignParameter(args, 0, false);
            ReferenceContainer referenceToElement = new BasicReferenceContainer(null);
            ReferenceContainer tree = new BasicReferenceContainer(null);
            Object id = null;
            Object value = null;
            tree.setObject(ZVal.newArray());
            for (ZPair zpairResult2170 : ZVal.getIterable(messages, env, false)) {
                id = ZVal.assign(zpairResult2170.getKey());
                value = ZVal.assign(zpairResult2170.getValue());
                referenceToElement =
                        handleReturnReference(
                                runtimeStaticObject.getElementByPath(
                                        env,
                                        new RuntimeArgsWithReferences().add(0, tree),
                                        tree.getObject(),
                                        function_explode.f.env(env).call(".", id).value()));
                referenceToElement.setObject(ZVal.assign(value));
                referenceToElement.setObject(null);
            }

            return ZVal.assign(tree.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "tree", typeHint = "array")
        @ConvertedParameter(index = 1, name = "parts", typeHint = "array")
        private Object getElementByPath(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            int runtimeConverterBreakCount;
            ReferenceContainer tree =
                    assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            Object parts = assignParameter(args, 1, false);
            ReferenceContainer elem = new BasicReferenceContainer(null);
            ReferenceContainer parentOfElem = new BasicReferenceContainer(null);
            Object part = null;
            Object i = null;
            elem = tree;
            parentOfElem.setObject(ZVal.getNull());
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult2171 : ZVal.getIterable(parts, env, false)) {
                i = ZVal.assign(zpairResult2171.getKey());
                part = ZVal.assign(zpairResult2171.getValue());
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, elem, env, part))
                        && ZVal.toBool(
                                function_is_string
                                        .f
                                        .env(env)
                                        .call(elem.arrayGet(env, part))
                                        .value())) {
                    elem =
                            new ArrayDimensionReference(
                                    elem.getObject(),
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    ".",
                                                    function_array_slice
                                                            .f
                                                            .env(env)
                                                            .call(parts, i)
                                                            .value())
                                            .value());
                    break;
                }

                parentOfElem = elem;
                elem = new ArrayDimensionReference(elem.getObject(), part);
            }

            if (ZVal.toBool(
                            ZVal.toBool(function_is_array.f.env(env).call(elem.getObject()).value())
                                    && ZVal.toBool(
                                            ZVal.isGreaterThan(
                                                    function_count
                                                            .f
                                                            .env(env)
                                                            .call(elem.getObject())
                                                            .value(),
                                                    '>',
                                                    0)))
                    && ZVal.toBool(parentOfElem.getObject())) {
                runtimeStaticObject.cancelExpand(
                        env,
                        new RuntimeArgsWithReferences().add(0, parentOfElem),
                        parentOfElem.getObject(),
                        part,
                        elem.getObject());
            }

            return elem;
        }

        public Object getElementByPath(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "tree", typeHint = "array")
        @ConvertedParameter(index = 1, name = "prefix")
        @ConvertedParameter(index = 2, name = "node", typeHint = "array")
        private Object cancelExpand(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            ReferenceContainer tree =
                    assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            Object prefix = assignParameter(args, 1, false);
            Object node = assignParameter(args, 2, false);
            Object id = null;
            Object value = null;
            prefix = toStringR(prefix, env) + ".";
            for (ZPair zpairResult2172 : ZVal.getIterable(node, env, false)) {
                id = ZVal.assign(zpairResult2172.getKey());
                value = ZVal.assign(zpairResult2172.getValue());
                if (function_is_string.f.env(env).call(value).getBool()) {
                    tree.arrayAccess(env, toStringR(prefix, env) + toStringR(id, env)).set(value);

                } else {
                    runtimeStaticObject.cancelExpand(
                            env,
                            new RuntimeArgsWithReferences().add(0, tree),
                            tree.getObject(),
                            toStringR(prefix, env) + toStringR(id, env),
                            value);
                }
            }

            return null;
        }

        public Object cancelExpand(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Util\\ArrayConverter")
                    .setLookup(
                            ArrayConverter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Util/ArrayConverter.php")
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
