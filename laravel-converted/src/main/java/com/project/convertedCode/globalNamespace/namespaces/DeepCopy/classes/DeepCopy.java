package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Exception.classes.CloneException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplDoublyLinkedList;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.namespaces.Spl.classes.SplDoublyLinkedListFilter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.namespaces.Date.classes.DateIntervalFilter;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeMatcher.classes.TypeMatcher;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Reflection.classes.ReflectionHelper;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/DeepCopy.php

*/

public class DeepCopy extends RuntimeClassBase {

    public Object hashMap = ZVal.newArray();

    public Object filters = ZVal.newArray();

    public Object typeFilters = ZVal.newArray();

    public Object skipUncloneable = false;

    public Object useCloneMethod = null;

    public DeepCopy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DeepCopy.class) {
            this.__construct(env, args);
        }
    }

    public DeepCopy(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "useCloneMethod",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object useCloneMethod = assignParameter(args, 0, true);
        if (null == useCloneMethod) {
            useCloneMethod = false;
        }
        this.useCloneMethod = useCloneMethod;
        this.addTypeFilter(env, new DateIntervalFilter(env), new TypeMatcher(env, "DateInterval"));
        this.addTypeFilter(
                env,
                new SplDoublyLinkedListFilter(env, this),
                new TypeMatcher(env, "SplDoublyLinkedList"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "skipUncloneable",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object skipUncloneable(RuntimeEnv env, Object... args) {
        Object skipUncloneable = assignParameter(args, 0, true);
        if (null == skipUncloneable) {
            skipUncloneable = true;
        }
        this.skipUncloneable = skipUncloneable;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    public Object copy(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        this.hashMap = ZVal.newArray();
        return ZVal.assign(this.recursiveCopy(env, _object));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filter", typeHint = "DeepCopy\\Filter\\Filter")
    @ConvertedParameter(index = 1, name = "matcher", typeHint = "DeepCopy\\Matcher\\Matcher")
    public Object addFilter(RuntimeEnv env, Object... args) {
        Object filter = assignParameter(args, 0, false);
        Object matcher = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "filters", env)
                .arrayAppend(env)
                .set(ZVal.newArray(new ZPair("matcher", matcher), new ZPair("filter", filter)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filter", typeHint = "DeepCopy\\TypeFilter\\TypeFilter")
    @ConvertedParameter(
        index = 1,
        name = "matcher",
        typeHint = "DeepCopy\\TypeMatcher\\TypeMatcher"
    )
    public Object addTypeFilter(RuntimeEnv env, Object... args) {
        Object filter = assignParameter(args, 0, false);
        Object matcher = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "typeFilters", env)
                .arrayAppend(env)
                .set(ZVal.newArray(new ZPair("matcher", matcher), new ZPair("filter", filter)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var")
    private Object recursiveCopy(RuntimeEnv env, Object... args) {
        Object var = assignParameter(args, 0, false);
        Object filter = null;
        if (ZVal.isTrue(filter = this.getFirstMatchedTypeFilter(env, this.typeFilters, var))) {
            return ZVal.assign(env.callMethod(filter, "apply", DeepCopy.class, var));
        }

        if (function_is_resource.f.env(env).call(var).getBool()) {
            return ZVal.assign(var);
        }

        if (function_is_array.f.env(env).call(var).getBool()) {
            return ZVal.assign(this.copyArray(env, var));
        }

        if (!function_is_object.f.env(env).call(var).getBool()) {
            return ZVal.assign(var);
        }

        return ZVal.assign(this.copyObject(env, var));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    private Object copyArray(RuntimeEnv env, Object... args) {
        ReferenceContainer array = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object value = null;
        Object key = null;
        for (ZPair zpairResult820 : ZVal.getIterable(array.getObject(), env, false)) {
            key = ZVal.assign(zpairResult820.getKey());
            value = ZVal.assign(zpairResult820.getValue());
            array.arrayAccess(env, key).set(this.recursiveCopy(env, value));
        }

        return ZVal.assign(array.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    private Object copyObject(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        Object reflectedObject = null;
        Object isCloneable = null;
        Object newObject = null;
        Object property = null;
        Object objectHash = null;
        objectHash = NamespaceGlobal.spl_object_hash.env(env).call(_object).value();
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "hashMap", env),
                env,
                objectHash)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "hashMap", env).arrayGet(env, objectHash));
        }

        reflectedObject = new ReflectionObject(env, _object);
        isCloneable = env.callMethod(reflectedObject, "isCloneable", DeepCopy.class);
        if (ZVal.strictEqualityCheck(false, "===", isCloneable)) {
            if (ZVal.isTrue(this.skipUncloneable)) {
                new ReferenceClassProperty(this, "hashMap", env)
                        .arrayAccess(env, objectHash)
                        .set(_object);
                return ZVal.assign(_object);
            }

            throw ZVal.getException(
                    env,
                    new CloneException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The class \"%s\" is not cloneable.",
                                            env.callMethod(
                                                    reflectedObject, "getName", DeepCopy.class))
                                    .value()));
        }

        newObject = ZVal.assign(((RuntimeClassInterface) _object).phpClone(env));
        new ReferenceClassProperty(this, "hashMap", env)
                .arrayAccess(env, objectHash)
                .set(newObject);
        if (ZVal.toBool(this.useCloneMethod)
                && ZVal.toBool(
                        env.callMethod(reflectedObject, "hasMethod", DeepCopy.class, "__clone"))) {
            return ZVal.assign(newObject);
        }

        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                newObject, DateTimeInterface.class, "DateTimeInterface"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(newObject, DateTimeZone.class, "DateTimeZone"))) {
            return ZVal.assign(newObject);
        }

        for (ZPair zpairResult821 :
                ZVal.getIterable(
                        ReflectionHelper.runtimeStaticObject.getProperties(env, reflectedObject),
                        env,
                        true)) {
            property = ZVal.assign(zpairResult821.getValue());
            this.copyObjectProperty(env, newObject, property);
        }

        return ZVal.assign(newObject);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    @ConvertedParameter(index = 1, name = "property", typeHint = "ReflectionProperty")
    private Object copyObjectProperty(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/myclabs/deep-copy/src/DeepCopy")
                        .setFile("/vendor/myclabs/deep-copy/src/DeepCopy/DeepCopy.php");
        Object _object = assignParameter(args, 0, false);
        Object property = assignParameter(args, 1, false);
        Object filter = null;
        ReferenceContainer item = new BasicReferenceContainer(null);
        Object propertyValue = null;
        Object matcher = null;
        if (ZVal.isTrue(env.callMethod(property, "isStatic", DeepCopy.class))) {
            return null;
        }

        for (ZPair zpairResult822 : ZVal.getIterable(this.filters, env, true)) {
            item.setObject(ZVal.assign(zpairResult822.getValue()));
            matcher = ZVal.assign(item.arrayGet(env, "matcher"));
            filter = ZVal.assign(item.arrayGet(env, "filter"));
            if (ZVal.isTrue(
                    env.callMethod(
                            matcher,
                            "matches",
                            DeepCopy.class,
                            _object,
                            env.callMethod(property, "getName", DeepCopy.class)))) {
                env.callMethod(
                        filter,
                        "apply",
                        DeepCopy.class,
                        _object,
                        env.callMethod(property, "getName", DeepCopy.class),
                        new Closure(env, runtimeConverterFunctionClassConstants, "DeepCopy", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "object")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object _object = assignParameter(args, 0, false);
                                return ZVal.assign(DeepCopy.this.recursiveCopy(env, _object));
                            }
                        });
                return null;
            }
        }

        env.callMethod(property, "setAccessible", DeepCopy.class, true);
        propertyValue = env.callMethod(property, "getValue", DeepCopy.class, _object);
        env.callMethod(
                property,
                "setValue",
                DeepCopy.class,
                _object,
                this.recursiveCopy(env, propertyValue));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filterRecords", typeHint = "array")
    @ConvertedParameter(index = 1, name = "var")
    private Object getFirstMatchedTypeFilter(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/myclabs/deep-copy/src/DeepCopy")
                        .setFile("/vendor/myclabs/deep-copy/src/DeepCopy/DeepCopy.php");
        Object filterRecords = assignParameter(args, 0, false);
        Object var = assignParameter(args, 1, false);
        ReferenceContainer matched = new BasicReferenceContainer(null);
        matched.setObject(
                this.first(
                        env,
                        filterRecords,
                        new Closure(env, runtimeConverterFunctionClassConstants, "DeepCopy", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "record", typeHint = "array")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer record =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object var = null;
                                Object matcher = null;
                                var = this.contextReferences.getCapturedValue("var");
                                matcher = ZVal.assign(record.arrayGet(env, "matcher"));
                                return ZVal.assign(
                                        env.callMethod(matcher, "matches", DeepCopy.class, var));
                            }
                        }.use("var", var)));
        return ZVal.assign(
                ZVal.isset(matched.getObject()) ? matched.arrayGet(env, "filter") : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elements", typeHint = "array")
    @ConvertedParameter(index = 1, name = "predicate", typeHint = "callable")
    private Object first(RuntimeEnv env, Object... args) {
        Object elements = assignParameter(args, 0, false);
        Object predicate = assignParameter(args, 1, false);
        Object element = null;
        for (ZPair zpairResult823 : ZVal.getIterable(elements, env, true)) {
            element = ZVal.assign(zpairResult823.getValue());
            if (function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(predicate, element)
                    .getBool()) {
                return ZVal.assign(element);
            }
        }

        return ZVal.assign(ZVal.getNull());
    }

    public static final Object CONST_class = "DeepCopy\\DeepCopy";

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
                    .setName("DeepCopy\\DeepCopy")
                    .setLookup(
                            DeepCopy.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "filters",
                            "hashMap",
                            "skipUncloneable",
                            "typeFilters",
                            "useCloneMethod")
                    .setFilename("vendor/myclabs/deep-copy/src/DeepCopy/DeepCopy.php")
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
