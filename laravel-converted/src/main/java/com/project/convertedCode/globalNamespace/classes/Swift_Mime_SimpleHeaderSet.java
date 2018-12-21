package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_uksort;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_CharsetObserver;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/SimpleHeaderSet.php

*/

public class Swift_Mime_SimpleHeaderSet extends RuntimeClassBase
        implements Swift_Mime_CharsetObserver {

    public Object factory = null;

    public Object headers = ZVal.newArray();

    public Object order = ZVal.newArray();

    public Object required = ZVal.newArray();

    public Object charset = null;

    public Swift_Mime_SimpleHeaderSet(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_SimpleHeaderSet.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_SimpleHeaderSet(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "factory", typeHint = "Swift_Mime_SimpleHeaderFactory")
    @ConvertedParameter(
        index = 1,
        name = "charset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object factory = assignParameter(args, 0, false);
        Object charset = assignParameter(args, 1, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        this.factory = factory;
        if (ZVal.isset(charset)) {
            this.setCharset(env, charset);
        }

        return null;
    }

    @ConvertedMethod
    public Object newInstance(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project.convertedCode.globalNamespace.classes.Swift_Mime_SimpleHeaderSet(
                        env, this.factory));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object setCharset(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.charset = charset;
        env.callMethod(this.factory, "charsetChanged", Swift_Mime_SimpleHeaderSet.class, charset);
        this.notifyHeadersOfCharset(env, charset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "addresses",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addMailboxHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object addresses = assignParameter(args, 1, true);
        if (null == addresses) {
            addresses = ZVal.getNull();
        }
        this.storeHeader(
                env,
                name,
                env.callMethod(
                        this.factory,
                        "createMailboxHeader",
                        Swift_Mime_SimpleHeaderSet.class,
                        name,
                        addresses));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "dateTime",
        typeHint = "DateTimeInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addDateHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object dateTime = assignParameter(args, 1, true);
        if (null == dateTime) {
            dateTime = ZVal.getNull();
        }
        this.storeHeader(
                env,
                name,
                env.callMethod(
                        this.factory,
                        "createDateHeader",
                        Swift_Mime_SimpleHeaderSet.class,
                        name,
                        dateTime));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addTextHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        this.storeHeader(
                env,
                name,
                env.callMethod(
                        this.factory,
                        "createTextHeader",
                        Swift_Mime_SimpleHeaderSet.class,
                        name,
                        value));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "params", defaultValue = "", defaultValueType = "array")
    public Object addParameterizedHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object params = assignParameter(args, 2, true);
        if (null == params) {
            params = ZVal.newArray();
        }
        this.storeHeader(
                env,
                name,
                env.callMethod(
                        this.factory,
                        "createParameterizedHeader",
                        Swift_Mime_SimpleHeaderSet.class,
                        name,
                        value,
                        params));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "ids",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addIdHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ids = assignParameter(args, 1, true);
        if (null == ids) {
            ids = ZVal.getNull();
        }
        this.storeHeader(
                env,
                name,
                env.callMethod(
                        this.factory,
                        "createIdHeader",
                        Swift_Mime_SimpleHeaderSet.class,
                        name,
                        ids));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addPathHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        this.storeHeader(
                env,
                name,
                env.callMethod(
                        this.factory,
                        "createPathHeader",
                        Swift_Mime_SimpleHeaderSet.class,
                        name,
                        path));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "index", defaultValue = "0", defaultValueType = "number")
    public Object has(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object index = assignParameter(args, 1, true);
        if (null == index) {
            index = 0;
        }
        Object lowerName = null;
        lowerName = NamespaceGlobal.strtolower.env(env).call(name).value();
        if (!function_array_key_exists.f.env(env).call(lowerName, this.headers).getBool()) {
            return ZVal.assign(false);
        }

        if (ZVal.isLessThan(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                '<',
                2)) {
            return ZVal.assign(
                    ZVal.toBool(
                            function_count
                                    .f
                                    .env(env)
                                    .call(
                                            new ReferenceClassProperty(this, "headers", env)
                                                    .arrayGet(env, lowerName))
                                    .value()));
        }

        return ZVal.assign(
                function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                index,
                                new ReferenceClassProperty(this, "headers", env)
                                        .arrayGet(env, lowerName))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header", typeHint = "Swift_Mime_Header")
    @ConvertedParameter(index = 1, name = "index", defaultValue = "0", defaultValueType = "number")
    public Object set(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        Object index = assignParameter(args, 1, true);
        if (null == index) {
            index = 0;
        }
        this.storeHeader(
                env,
                env.callMethod(header, "getFieldName", Swift_Mime_SimpleHeaderSet.class),
                header,
                index);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "index", defaultValue = "0", defaultValueType = "number")
    public Object get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object index = assignParameter(args, 1, true);
        if (null == index) {
            index = 0;
        }
        Object values = null;
        name = NamespaceGlobal.strtolower.env(env).call(name).value();
        if (ZVal.isLessThan(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                '<',
                2)) {
            if (ZVal.isTrue(this.has(env, name))) {
                values =
                        function_array_values
                                .f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "headers", env)
                                                .arrayGet(env, name))
                                .value();
                return ZVal.assign(function_array_shift.f.env(env).call(values).value());
            }

        } else {
            if (ZVal.isTrue(this.has(env, name, index))) {
                return ZVal.assign(
                        new ReferenceClassProperty(this, "headers", env)
                                .arrayGet(env, name, index));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getAll(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object headers = null;
        Object lowerName = null;
        Object collection = null;
        if (!ZVal.isset(name)) {
            headers = ZVal.newArray();
            for (ZPair zpairResult1543 : ZVal.getIterable(this.headers, env, true)) {
                collection = ZVal.assign(zpairResult1543.getValue());
                headers = function_array_merge.f.env(env).call(headers, collection).value();
            }

            return ZVal.assign(headers);
        }

        lowerName = NamespaceGlobal.strtolower.env(env).call(name).value();
        if (!function_array_key_exists.f.env(env).call(lowerName, this.headers).getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "headers", env).arrayGet(env, lowerName));
    }

    @ConvertedMethod
    public Object listAll(RuntimeEnv env, Object... args) {
        Object headers = null;
        headers = ZVal.assign(this.headers);
        if (ZVal.isTrue(this.canSort(env))) {
            function_uksort
                    .f
                    .env(env)
                    .call(headers, ZVal.newArray(new ZPair(0, this), new ZPair(1, "sortHeaders")));
        }

        return ZVal.assign(function_array_keys.f.env(env).call(headers).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "index", defaultValue = "0", defaultValueType = "number")
    public Object remove(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object index = assignParameter(args, 1, true);
        if (null == index) {
            index = 0;
        }
        Object lowerName = null;
        lowerName = NamespaceGlobal.strtolower.env(env).call(name).value();
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "headers", env),
                env,
                lowerName,
                index);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object removeAll(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object lowerName = null;
        lowerName = NamespaceGlobal.strtolower.env(env).call(name).value();
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "headers", env),
                env,
                lowerName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sequence", typeHint = "array")
    public Object defineOrdering(RuntimeEnv env, Object... args) {
        Object sequence = assignParameter(args, 0, false);
        this.order =
                function_array_flip
                        .f
                        .env(env)
                        .call(function_array_map.f.env(env).call("strtolower", sequence).value())
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "names", typeHint = "array")
    public Object setAlwaysDisplayed(RuntimeEnv env, Object... args) {
        Object names = assignParameter(args, 0, false);
        this.required =
                function_array_flip
                        .f
                        .env(env)
                        .call(function_array_map.f.env(env).call("strtolower", names).value())
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object charsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.setCharset(env, charset);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object headers = null;
        Object string = null;
        Object header = null;
        Object collection = null;
        string = "";
        headers = ZVal.assign(this.headers);
        if (ZVal.isTrue(this.canSort(env))) {
            function_uksort
                    .f
                    .env(env)
                    .call(headers, ZVal.newArray(new ZPair(0, this), new ZPair(1, "sortHeaders")));
        }

        for (ZPair zpairResult1544 : ZVal.getIterable(headers, env, true)) {
            collection = ZVal.assign(zpairResult1544.getValue());
            for (ZPair zpairResult1545 : ZVal.getIterable(collection, env, true)) {
                header = ZVal.assign(zpairResult1545.getValue());
                if (ZVal.toBool(this.isDisplayed(env, header))
                        || ZVal.toBool(
                                ZVal.notEqualityCheck(
                                        "",
                                        env.callMethod(
                                                header,
                                                "getFieldBody",
                                                Swift_Mime_SimpleHeaderSet.class)))) {
                    string =
                            toStringR(string, env)
                                    + toStringR(
                                            env.callMethod(
                                                    header,
                                                    "toString",
                                                    Swift_Mime_SimpleHeaderSet.class),
                                            env);
                }
            }
        }

        return ZVal.assign(string);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toString(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "header", typeHint = "Swift_Mime_Header")
    @ConvertedParameter(
        index = 2,
        name = "offset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object storeHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object header = assignParameter(args, 1, false);
        Object offset = assignParameter(args, 2, true);
        if (null == offset) {
            offset = ZVal.getNull();
        }
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "headers", env),
                env,
                NamespaceGlobal.strtolower.env(env).call(name).value())) {
            new ReferenceClassProperty(this, "headers", env)
                    .arrayAccess(env, NamespaceGlobal.strtolower.env(env).call(name).value())
                    .set(ZVal.newArray());
        }

        if (!ZVal.isset(offset)) {
            new ReferenceClassProperty(this, "headers", env)
                    .arrayAppend(env, NamespaceGlobal.strtolower.env(env).call(name).value())
                    .set(header);

        } else {
            new ReferenceClassProperty(this, "headers", env)
                    .arrayAccess(
                            env, NamespaceGlobal.strtolower.env(env).call(name).value(), offset)
                    .set(header);
        }

        return null;
    }

    @ConvertedMethod
    private Object canSort(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(function_count.f.env(env).call(this.order).value(), '>', 0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "a")
    @ConvertedParameter(index = 1, name = "b")
    private Object sortHeaders(RuntimeEnv env, Object... args) {
        Object a = assignParameter(args, 0, false);
        Object b = assignParameter(args, 1, false);
        Object lowerB = null;
        Object aPos = null;
        Object lowerA = null;
        Object bPos = null;
        lowerA = NamespaceGlobal.strtolower.env(env).call(a).value();
        lowerB = NamespaceGlobal.strtolower.env(env).call(b).value();
        aPos =
                ZVal.assign(
                        function_array_key_exists.f.env(env).call(lowerA, this.order).getBool()
                                ? new ReferenceClassProperty(this, "order", env)
                                        .arrayGet(env, lowerA)
                                : -1);
        bPos =
                ZVal.assign(
                        function_array_key_exists.f.env(env).call(lowerB, this.order).getBool()
                                ? new ReferenceClassProperty(this, "order", env)
                                        .arrayGet(env, lowerB)
                                : -1);
        if (ZVal.toBool(ZVal.strictEqualityCheck(-1, "===", aPos))
                && ZVal.toBool(ZVal.strictEqualityCheck(-1, "===", bPos))) {
            return ZVal.assign(ZVal.isGreaterThan(a, '>', b) ? -1 : 1);
        }

        if (ZVal.equalityCheck(aPos, -1)) {
            return 1;

        } else if (ZVal.equalityCheck(bPos, -1)) {
            return -1;
        }

        return ZVal.assign(ZVal.isLessThan(aPos, '<', bPos) ? -1 : 1);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header", typeHint = "Swift_Mime_Header")
    private Object isDisplayed(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.strtolower
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        header,
                                                        "getFieldName",
                                                        Swift_Mime_SimpleHeaderSet.class))
                                        .value(),
                                this.required)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    private Object notifyHeadersOfCharset(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        Object headerGroup = null;
        Object header = null;
        for (ZPair zpairResult1546 : ZVal.getIterable(this.headers, env, true)) {
            headerGroup = ZVal.assign(zpairResult1546.getValue());
            for (ZPair zpairResult1547 : ZVal.getIterable(headerGroup, env, true)) {
                header = ZVal.assign(zpairResult1547.getValue());
                env.callMethod(header, "setCharset", Swift_Mime_SimpleHeaderSet.class, charset);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        Object headerGroup = null;
        Object header = null;
        Object groupKey = null;
        Object key = null;
        this.factory = ((RuntimeClassInterface) this.factory).phpClone(env);
        for (ZPair zpairResult1548 : ZVal.getIterable(this.headers, env, false)) {
            groupKey = ZVal.assign(zpairResult1548.getKey());
            headerGroup = ZVal.assign(zpairResult1548.getValue());
            for (ZPair zpairResult1549 : ZVal.getIterable(headerGroup, env, false)) {
                key = ZVal.assign(zpairResult1549.getKey());
                header = ZVal.assign(zpairResult1549.getValue());
                new ReferenceClassProperty(this, "headers", env)
                        .arrayAccess(env, groupKey, key)
                        .set(((RuntimeClassInterface) header).phpClone(env));
            }
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Mime_SimpleHeaderSet";

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
                    .setName("Swift_Mime_SimpleHeaderSet")
                    .setLookup(
                            Swift_Mime_SimpleHeaderSet.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("charset", "factory", "headers", "order", "required")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/SimpleHeaderSet.php")
                    .addInterface("Swift_Mime_CharsetObserver")
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
